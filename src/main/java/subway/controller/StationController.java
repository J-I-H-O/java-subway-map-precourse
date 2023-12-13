package subway.controller;

import subway.domain.menu.StationManageMenus;
import subway.service.StationService;
import subway.view.InputView;
import subway.view.OutputView;

public class StationController {

    StationService stationService = new StationService();

    public void run() {
        OutputView.printStationManageMenus();
        String input = InputView.inputStationManageMenu();
        doActionByCommand(input);
    }

    private void doActionByCommand(String command) {
        if (command.equals(StationManageMenus.ADD_STATION.getCommand())) {

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
