package subway.view;

import subway.domain.line.Line;
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
    private static final String EMPTY_LINES_ERROR_MESSAGE = "[ERROR] 등록된 노선이 없습니다.";
    private static final String STATION_LIST_MESSAGE = "## 역 목록";
    private static final String LINE_LIST_MESSAGE = "## 노선 목록";
    private static final String LINE_DELETED_MESSAGE = "[INFO] 지하철 노선이 삭제되었습니다.";

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

        System.out.println(STATION_LIST_MESSAGE);
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

    public static void printLines(List<Line> lines) {
        System.out.println();
        if (lines.isEmpty()) {
            System.out.println(EMPTY_LINES_ERROR_MESSAGE + "\n");
            return;
        }

        System.out.println(LINE_LIST_MESSAGE);
        lines.forEach(line -> System.out.println("[INFO] " + line.getName()));
        System.out.println();
    }

    public static void printLineDeletedMessage() {
        System.out.println("\n" + LINE_DELETED_MESSAGE + "\n");
    }
}
