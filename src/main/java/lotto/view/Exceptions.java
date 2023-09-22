package lotto.view;

public class Exceptions {
    private final String ERROR_MESSAGE = "[ERROR]";
    private final String TYPE_EXCEPTION = "숫자를 입력해주세요.";
    private final String RANGE_EXCEPTION = "범위 내의 숫자를 입력해주세요.";
    private final String DUPLICATE_EXCEPTION = "중복된 숫자가 존재합니다";
    private final String UNIT_EXCEPTION = "1000원 단위로 나누어 떨어지는 금액을 입력해주세요.";
    //숫자가 아닌 문자가 포함
    public void inputType() {
        throw new IllegalArgumentException(ERROR_MESSAGE + TYPE_EXCEPTION);
    }
    //금액에 숫자가 1000보다 작을 때
    public void moneyRange() {
        throw new IllegalArgumentException(ERROR_MESSAGE + RANGE_EXCEPTION + " num >= 1000");
    }
    //금액이 1000원 단위로 나누어떨어지는 수가 아닐 때
    public void moneyUnit() {
        throw new IllegalArgumentException(ERROR_MESSAGE + UNIT_EXCEPTION);
    }
    //당첨번호가 1보다 작거나 45보다 클 때
    public void winNumRange() {
        throw new IllegalArgumentException(ERROR_MESSAGE + RANGE_EXCEPTION + "range = 1 ~ 45");
    }
    //당첨번호가 중복 되었을 때
    public void duplicateWinNum() {
        throw new IllegalArgumentException(ERROR_MESSAGE + DUPLICATE_EXCEPTION);
    }
}
