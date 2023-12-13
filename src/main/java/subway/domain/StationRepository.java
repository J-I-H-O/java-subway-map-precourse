package subway.domain;

import subway.view.OutputView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station) {
        stations.add(station);
        OutputView.printStationCreatedMessage();
    }

    public static boolean deleteStation(String name) {
        boolean isDeleted = stations.removeIf(station -> Objects.equals(station.getName(), name));
        OutputView.printStationDeletedMessage();
        return isDeleted;
    }

    public static boolean hasStation(String name) {
        return stations()
                .stream()
                .anyMatch(station -> station.getName().equals(name));
    }
}
