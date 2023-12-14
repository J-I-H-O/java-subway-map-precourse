package subway.view;

import subway.domain.station.Station;
import subway.domain.menu.LineManageMenus;
import subway.domain.menu.MainMenus;
import subway.domain.menu.StationManageMenus;

import java.util.List;

public class OutputView {
    private static final String MAIN_MENU_MESSAGE = "## 메인 화면";
    private static final String STATION_MANAGE_MENU_MESSAGE = "## 역 관리 화면";
    private static final String LINE_MANAGE_MENU_MESSAGE = "## 노선 관리 화면";
    private static final String STATION_CREATED_MESSAGE = "[INFO] 지하철 역이 등록되었습니다.";
    private static final String STATION_DELETED_MESSAGE = "[INFO] 지하철 역이 삭제되었습니다.";
    private static final String EMPTY_STATIONS_ERROR_MESSAGE = "[ERROR] 등록된 역이 없습니다.";
    private static final String LINE_CREATED_MESSAGE = "[INFO] 지하철 노선이 등록되었습니다.";

    public static void printMainMenus() {
        System.out.println(MAIN_MENU_MESSAGE);
        System.out.println(MainMenus.printMenus());
    }

    public static void printStationManageMenus() {
        System.out.println("\n" + STATION_MANAGE_MENU_MESSAGE);
        System.out.println(StationManageMenus.printMenus());
    }

    public static void printStationCreatedMessage() {
        System.out.println("\n" + STATION_CREATED_MESSAGE + "\n");
    }

    public static void printStationDeletedMessage() {
        System.out.println("\n" + STATION_DELETED_MESSAGE + "\n");
    }

    public static void printStations(List<Station> stations) {
        System.out.println();
        if (stations.isEmpty()) {
            System.out.println(EMPTY_STATIONS_ERROR_MESSAGE + "\n");
            return;
        }

        stations.forEach(station -> System.out.println("[INFO] " + station.getName()));
        System.out.println();
    }

    public static void printLineManageMenus() {
        System.out.println("\n" + LINE_MANAGE_MENU_MESSAGE);
        System.out.println(LineManageMenus.printMenus());
    }

    public static void printLineCreatedMessage() {
        System.out.println("\n" + LINE_CREATED_MESSAGE + "\n");
    }
}
