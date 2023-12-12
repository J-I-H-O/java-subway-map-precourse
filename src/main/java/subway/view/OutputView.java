package subway.view;

import subway.domain.menu.MainMenus;

public class OutputView {
    private static final String MAIN_MENU_MESSAGE = "## 메인 화면";

    public static void printMainMenus() {
        System.out.println(MAIN_MENU_MESSAGE);
        System.out.println(MainMenus.printMainMenus());
    }
}
