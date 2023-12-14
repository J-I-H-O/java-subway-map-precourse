package subway.controller;

import subway.domain.menu.MainMenus;
import subway.service.LineService;
import subway.view.InputView;
import subway.view.OutputView;

public class MainController {
    private final StationController stationController = new StationController();
    private final LineController lineController = new LineController();
    private final SectionController sectionController = new SectionController();
    private final LineService lineService = new LineService();

    public void run() {
        String input;
        do {
            OutputView.printMainMenus();
            input = InputView.inputMainMenu();

            callControllerByCommand(input);
        } while (!isQuit(input));
    }

    private void callControllerByCommand(String command) {
        if (command.equals(MainMenus.MANAGE_STATION.getCommand())) {
            stationController.run();
        }
        if (command.equals(MainMenus.MANAGE_LINE.getCommand())) {
            lineController.run();
        }
        if (command.equals(MainMenus.MANAGE_SECTION.getCommand())) {
            sectionController.run();
        }
        if (command.equals(MainMenus.PRINT_TOTAL_INFORMS.getCommand())) {
            lineService.printTotalLineInfos();
        }
    }

    private boolean isQuit(String input) {
        return input.equals(MainMenus.QUIT.getCommand());
    }
}
