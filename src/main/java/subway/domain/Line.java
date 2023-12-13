package subway.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private String name;
    private List<Station> stations = new ArrayList<>();

    public Line(String name) {
        validateName(name);
        fillStations();
        this.name = name;
    }

    // TODO: 구현, 상행 종점역과 하행 종점역 사이의 역들을 stations에 추가
    private void fillStations() {
        
    }

    // TODO: 구현
    private void validateName(String name) {

    }

    // TODO: 구현
    private void validateBoundStations(Station upboundStation, Station downboundStation) {
        
    }

    public String getName() {
        return name;
    }
}
