package subway.controller;

import subway.domain.menu.LineManageMenus;
import subway.domain.menu.StationManageMenus;
import subway.service.LineService;
import subway.view.InputView;
import subway.view.OutputView;

public class LineController {
    private final LineService lineService = new LineService();

    public void run() {
        try {
            OutputView.printLineManageMenus();
            String input = InputView.inputLineManageMenu();
            doActionByCommand(input);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
            run();
        }
    }

    private void doActionByCommand(String command) {
        if (command.equals(LineManageMenus.ADD_LINE.getCommand())) {
            lineService.addLine();
        }
        if (command.equals(LineManageMenus.REMOVE_LINE.getCommand())) {
            lineService.deleteLine();
        }
        if (command.equals(LineManageMenus.PRINT_LINES.getCommand())) {
            lineService.printLines();
        }
        if (command.equals(StationManageMenus.MOVE_BACK.getCommand())) {
            System.out.println();
        }
    }
}