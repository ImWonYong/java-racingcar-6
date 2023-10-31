package racingcar.domain;

public class InputValidator {

    public static boolean checkCarNameLength(String name) {
        if (name.length() >= 6 || name.isEmpty()) {
            throw new IllegalArgumentException("이름은 1-5글자 사이로 입력해야 합니다.");
        }

        return true;
    }

}