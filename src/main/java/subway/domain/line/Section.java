package subway.domain.line;

import subway.domain.station.Station;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private List<Station> section = new ArrayList<>();

    public Section(Station upboundStation, Station downboundStation) {
        section.add(upboundStation);
        section.add(downboundStation);
    }

    public void addStationWithIndex(Station station, String index) {
        validateIndex(index);
        section.add(Integer.parseInt(index), station);
    }

    private void validateIndex(String index) {
        // TODO: 음수 불가능, 현재 section List에 포함된 station 사이에 들어가야 함
        // 숫자인지 판별해야 함
    }
}
