package subway.service;

import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.station.Station;
import subway.domain.station.StationRepository;
import subway.view.InputView;

public class SectionService {
    private static final String NO_SUCH_STATION_ERROR_MESSAGE = "[ERROR] 해당 역이 존재하지 않습니다.";
    private static final String NO_SUCH_LINE_ERROR_MESSAGE = "[ERROR] 해당 노선이 존재하지 않습니다.";

    public void addSection() {
        String lineName = InputView.inputSectionLineName();
        Line line = LineRepository.findByName(lineName)
                .orElseThrow(() -> new IllegalArgumentException(NO_SUCH_LINE_ERROR_MESSAGE));

        String stationName = InputView.inputSectionStationName();
        Station station = StationRepository.findByName(stationName)
                .orElseThrow(() -> new IllegalArgumentException(NO_SUCH_STATION_ERROR_MESSAGE));

        String index = InputView.inputSectionIndex();
        line.getSection().addStationWithIndex(station, index);
    }
}
