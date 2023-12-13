package subway.service;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.InputView;

public class StationService {
    public void addStation() {
        String name = InputView.inputNewStationName();
        Station station = new Station(name);
        StationRepository.addStation(station);
    }
}
