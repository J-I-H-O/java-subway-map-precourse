package subway.controller;

import subway.view.InputView;
import subway.view.OutputView;

public class LineController {
    public void run() {
        try {
            OutputView.printLineManageMenus();
            String input = InputView.inputLineManageMenu();
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
            run();
        }
    }
}
