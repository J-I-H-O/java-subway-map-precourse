package subway.domain.line;

import subway.domain.station.Station;
import subway.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private static final String NUMBER_FORMAT_ERROR_MESSAGE = "[ERROR] 올바르지 않은 값을 입력할 수 없습니다.";
    private static final String INDEX_BOUND_ERROR_MESSAGE = "[ERROR] 상행 종점역과 하행 종점역 사이에만 구간을 추가할 수 있습니다";
    private static final String DUPLICATE_STATION_ERROR_MESSAGE = "[ERROR] 이미 등록된 역 이름입니다.";

    private List<Station> section = new ArrayList<>();

    public Section(Station upboundStation, Station downboundStation) {
        section.add(upboundStation);
        section.add(downboundStation);
    }

    public void addStationWithIndex(Station station, String indexInput) {
        validateNumberFormat(indexInput);

        int index = Integer.parseInt(indexInput);

        validateBound(index - 1);
        validateDuplicate(station);

        section.add(index - 1, station);
        OutputView.printSectionAddedMessage();
    }

    private void validateNumberFormat(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NUMBER_FORMAT_ERROR_MESSAGE);
        }
    }

    private void validateBound(int index) {
        // 상행, 하행 종착역 사이에만 구간 추가 가능
        if (0 >= index || section.size() <= index) {
            throw new IllegalArgumentException(INDEX_BOUND_ERROR_MESSAGE);
        }
    }

    private void validateDuplicate(Station station) {
        String newStationName = station.getName();

        boolean isDuplicate = section.stream()
                .anyMatch(stationInLine -> stationInLine.getName().equals(newStationName));

        if (isDuplicate) {
            throw new IllegalArgumentException(DUPLICATE_STATION_ERROR_MESSAGE);
        }
    }
}
