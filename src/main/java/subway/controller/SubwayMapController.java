package subway.controller;

import subway.view.InputView;
import subway.view.OutputView;

public class SubwayMapController {
    public void run() {
        OutputView.printMainMenus();
        InputView.inputMainMenu();

        OutputView.printStationManageMenus();
    }
}
