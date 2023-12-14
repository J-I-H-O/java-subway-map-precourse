package subway.domain.line;

import subway.view.OutputView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<>();

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        lines.add(line);
        OutputView.printLineCreatedMessage();
    }

    public static boolean hasLine(String name) {
        return lines()
                .stream()
                .anyMatch(line -> line.getName().equals(name));
    }

    public static void deleteLineByName(String name) {
        lines.removeIf(line -> Objects.equals(line.getName(), name));
        OutputView.printLineDeletedMessage();
    }
}
