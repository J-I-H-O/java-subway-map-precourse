package subway.service;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.OutputView;

import java.util.List;

public class StationService {
    private static final String NO_SUCH_STATION_ERROR_MESSAGE = "[ERROR] 해당 역이 존재하지 않습니다.";

    public void addStation(String name) {
        Station station = new Station(name);
        StationRepository.addStation(station);
    }

    public void deleteStation(String name) {
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
