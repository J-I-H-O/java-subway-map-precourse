package subway.service;

import subway.domain.line.Line;
import subway.domain.line.LineName;
import subway.domain.line.LineRepository;
import subway.domain.line.Section;
import subway.domain.station.Station;
import subway.domain.station.StationRepository;
import subway.view.InputView;
import subway.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class LineService {
    private static final String NO_SUCH_STATION_ERROR_MESSAGE = "[ERROR] 해당 역이 존재하지 않습니다.";
    private static final String NO_SUCH_LINE_ERROR_MESSAGE = "[ERROR] 해당 노선이 존재하지 않습니다.";

    public void addLine() {
        String name = InputView.inputNewLineName();
        LineName lineName = new LineName(name);

        String upboundStationName = InputView.inputUpboundStation();
        Station upboundStation = StationRepository.findByName(upboundStationName)
                .orElseThrow(() -> new IllegalArgumentException(NO_SUCH_STATION_ERROR_MESSAGE));

        String downboundStationName = InputView.inputDownboundStation();
        Station downBoundStation = StationRepository.findByName(downboundStationName)
                .orElseThrow(() -> new IllegalArgumentException(NO_SUCH_STATION_ERROR_MESSAGE));

        Line line = new Line(lineName, upboundStation, downBoundStation);
        LineRepository.addLine(line);
    }

    public void deleteLine() {
        String name = InputView.inputLineNameToDelete();

        if (LineRepository.hasLine(name)) {
            LineRepository.deleteLineByName(name);
            return;
        }

        throw new IllegalArgumentException(NO_SUCH_LINE_ERROR_MESSAGE);
    }

    public void printLines() {
        List<Line> lines = LineRepository.lines();
        OutputView.printLines(lines);
    }

    public void printTotalLineInfos() {
        List<Line> lines = LineRepository.lines();
        OutputView.printTotalLineInfos(lines);
    }
}
