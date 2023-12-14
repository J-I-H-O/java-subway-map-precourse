package subway.domain;

public class LineName {
    private static final int MIN_NAME_LENGTH = 2;
    private static final String LENGTH_ERROR_MESSAGE = "[ERROR] 역 이름은 최소 2글자 이상이어야 합니다.";

    private String name;

    public LineName(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() < MIN_NAME_LENGTH) {
            throw new IllegalArgumentException(LENGTH_ERROR_MESSAGE);
        }
    }

    public String getName() {
        return name;
    }
}
