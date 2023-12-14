package subway.domain.line;

import subway.domain.station.Station;

public class Line {
    private LineName name;
    private Section section;

    public Line(LineName name, Station upboundStation, Station downboundStation) {
        validateBoundStations(upboundStation, downboundStation);

        this.name = name;
        section = new Section(upboundStation, downboundStation);
    }

    // TODO: 구현
    private void validateBoundStations(Station upboundStation, Station downboundStation) {
        // 상행 종점역의 index는 하행 종점역의 index보다 작아야 함
    }

    public String getName() {
        return name.getName();
    }

    public Section getSection() {
        return section;
    }
}
