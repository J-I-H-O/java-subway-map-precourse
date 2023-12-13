package subway.controller;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.domain.menu.StationManageMenus;
import subway.view.InputView;
import subway.view.OutputView;

public class StationController {
    public void run() {
        OutputView.printStationManageMenus();
        String input = InputView.inputStationManageMenu();
        doActionByCommand(input);
    }

    private void doActionByCommand(String command) {
        if (command.equals(StationManageMenus.ADD_STATION.getCommand())) {
            String name = InputView.inputNewStationName();
            Station station = new Station(name);
            StationRepository.addStation(station);
            OutputView.printStationCreatedMessage();
        }
        if (command.equals(StationManageMenus.REMOVE_STATION.getCommand())) {

        }
        if (command.equals(StationManageMenus.PRINT_STATIONS.getCommand())) {

        }
        if (command.equals(StationManageMenus.MOVE_BACK.getCommand())) {
            return;
        }
    }
}
