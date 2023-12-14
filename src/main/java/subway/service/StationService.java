package subway.service;

import subway.domain.station.Station;
import subway.domain.station.StationRepository;
import subway.view.InputView;
import subway.view.OutputView;

import java.util.List;

public class StationService {
    private static final String NO_SUCH_STATION_ERROR_MESSAGE = "[ERROR] 해당 역이 존재하지 않습니다.";
    private static final String DUPLICATE_STATION_ERROR_MESSAGE = "[ERROR] 이미 등록된 역 이름입니다.";

    public void addStation() {
        String name = InputView.inputNewStationName();

        if (StationRepository.hasStation(name)) {
            throw new IllegalArgumentException(DUPLICATE_STATION_ERROR_MESSAGE);
        }

        Station station = new Station(name);
        StationRepository.addStation(station);
    }

    public void deleteStation() {
        String name = InputView.inputStationNameToDelete();

        if (StationRepository.hasStation(name)) {
            StationRepository.deleteStation(name);
            return;
        }
        throw new IllegalArgumentException(NO_SUCH_STATION_ERROR_MESSAGE);
    }

    public void printStations() {
        List<Station> stations = StationRepository.stations();
        OutputView.printStations(stations);
    }
}
