package subway.view;

import subway.domain.menu.LineManageMenus;
import subway.domain.menu.MainMenus;
import subway.domain.menu.StationManageMenus;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_MENU_MESSAGE = "## 원하는 기능을 선택하세요.";
    private static final String INPUT_NEW_STATION_NAME_MESSAGE = "## 등록할 역 이름을 입력하세요.";
    private static final String INPUT_STATION_NAME_TO_DELETE_MESSAGE = "## 삭제할 역 이름을 입력하세요.";

    static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static String inputMainMenu() {
        String input = null;

        try {
            System.out.println(INPUT_MENU_MESSAGE);
            input = scanner.nextLine();
            MainMenus.validateCommand(input);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
            inputMainMenu();
        }

        return input;
    }

    public static String inputStationManageMenu() {
        String input = null;

        try {
            System.out.println(INPUT_MENU_MESSAGE);
            input = scanner.nextLine();
            StationManageMenus.validateCommand(input);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
            inputStationManageMenu();
        }

        return input;
    }

    public static String inputNewStationName() {
        String input = null;

        try {
            System.out.println("\n" + INPUT_NEW_STATION_NAME_MESSAGE);
            input = scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
            inputNewStationName();
        }

        return input;
    }

    public static String inputStationNameToDelete() {
        String input = null;

        try {
            System.out.println("\n" + INPUT_STATION_NAME_TO_DELETE_MESSAGE);
            input = scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
            inputStationNameToDelete();
        }

        return input;
    }

    public static String inputLineManageMenu() {
        String input = null;

        try {
            System.out.println(INPUT_MENU_MESSAGE);
            input = scanner.nextLine();
            LineManageMenus.validateCommand(input);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
            inputLineManageMenu();
        }

        return input;
    }
}
