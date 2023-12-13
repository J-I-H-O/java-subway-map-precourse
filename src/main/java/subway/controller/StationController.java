package subway.controller;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.domain.menu.StationManageMenus;
import subway.service.StationService;
import subway.view.InputView;
import subway.view.OutputView;

public class StationController {
    private final StationService stationService = new StationService();

    public void run() {
        try {
            OutputView.printStationManageMenus();
            String input = InputView.inputStationManageMenu();
            doActionByCommand(input);
        } catch (IllegalArgumentException e) {
            run();
        }
    }

    private void doActionByCommand(String command) {
        if (command.equals(StationManageMenus.ADD_STATION.getCommand())) {
            stationService.addStation();
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
