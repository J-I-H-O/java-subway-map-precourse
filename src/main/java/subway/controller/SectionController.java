package subway.controller;

import subway.domain.menu.SectionManageMenus;
import subway.view.InputView;
import subway.view.OutputView;

public class SectionController {
    public void run() {
        try {
            OutputView.printSectionManageMenus();
            String input = InputView.inputSectionManageMenu();
            doActionByCommand(input);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
            run();
        }
    }

    private void doActionByCommand(String command) {
        if (command.equals(SectionManageMenus.ADD_SECTION.getCommand())) {

        }
        if (command.equals(SectionManageMenus.REMOVE_SECTION.getCommand())) {

        }
        if (command.equals(SectionManageMenus.MOVE_BACK.getCommand())) {
            System.out.println();
        }
    }
}
