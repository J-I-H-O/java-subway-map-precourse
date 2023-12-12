package subway.view;

import subway.domain.menu.MainMenus;
import subway.domain.menu.StationManageMenus;

public class OutputView {
    private static final String MAIN_MENU_MESSAGE = "## 메인 화면";
    private static final String STATION_MANAGE_MENU_MESSAGE = "## 역 관리 화면";

    public static void printMainMenus() {
        System.out.println(MAIN_MENU_MESSAGE);
        System.out.println(MainMenus.printMainMenus());
    }

    public static void printStationManageMenus() {
        System.out.println("\n" + STATION_MANAGE_MENU_MESSAGE);
        System.out.println(StationManageMenus.printStationManageMenus());
    }
}
