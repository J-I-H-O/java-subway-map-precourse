package subway.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private LineName name;
    private Station upboundStation;
    private Station downboundStation;

    public Line(LineName name, Station upboundStation, Station downboundStation) {
        validateBoundStations(upboundStation, downboundStation);
        this.name = name;
    }

    // TODO: 구현
    private void validateBoundStations(Station upboundStation, Station downboundStation) {
        // 상행 종점역의 index는 하행 종점역의 index보다 작아야 함
    }

    public String getName() {
        return name.getName();
    }

    public Station getUpboundStation() {
        return upboundStation;
    }

    public Station getDownboundStation() {
        return downboundStation;
    }
}
