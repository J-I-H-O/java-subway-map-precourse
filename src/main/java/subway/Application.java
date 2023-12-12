package subway;

import subway.controller.SubwayMapController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        SubwayMapController subwayMapController = new SubwayMapController();
        subwayMapController.run();
    }
}
