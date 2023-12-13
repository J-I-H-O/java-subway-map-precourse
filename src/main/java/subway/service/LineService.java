package subway.service;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.InputView;

public class LineService {

    private static final String NO_SUCH_STATION_ERROR_MESSAGE = "[ERROR] 해당 역이 존재하지 않습니다.";

    public void addLine() {
        String name = InputView.inputNewLineName();
        Line line = new Line(name);

        String upboundStationName = InputView.inputUpboundStation();
        Station upboundStation = StationRepository.findByName(upboundStationName)
                .orElseThrow(() -> new IllegalArgumentException(NO_SUCH_STATION_ERROR_MESSAGE));

        String downboundStationName = InputView.inputDownboundStation();
        Station downBoundStation = StationRepository.findByName(downboundStationName)
                .orElseThrow(() -> new IllegalArgumentException(NO_SUCH_STATION_ERROR_MESSAGE));

        LineRepository.addLine(line);
    }
}
