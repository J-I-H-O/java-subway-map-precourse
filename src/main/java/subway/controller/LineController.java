package subway.controller;

import subway.view.InputView;
import subway.view.OutputView;

public class LineController {
    public void run() {
        try {

        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
            run();
        }
    }
}
