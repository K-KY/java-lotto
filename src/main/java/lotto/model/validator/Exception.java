package lotto.model.validator;

public class Exception {
    private final String TYPE_EXCEPTION = "숫자를 입력해주세요.";
    private final String RANGE_EXCEPTION = "범위 내의 숫자를 입력해주세요.";
    private final String DUPLICATE_EXCEPTION = "중복된 숫자가 존재합니다";
    //숫자가 아닌 문자가 포함
    public void inputType() {
        throw new IllegalArgumentException(TYPE_EXCEPTION);
    }
    //금액에 숫자가 1000보다 작을 때
    public void moneyRange() {
        throw new IllegalArgumentException(RANGE_EXCEPTION + " num >= 1000");
    }
    //당첨 번호에 숫자가 아닌 문자가 포함
    public void winNumType() {
        throw new IllegalArgumentException(TYPE_EXCEPTION);
    }
    //당첨번호가 1보다 작거나 45보다 클 때
    public void winNumRange() {
        throw new IllegalArgumentException(RANGE_EXCEPTION + " 1 ~ 45");
    }
    //당첨번호가 중복 되었을 때
    public void duplicateWinNum() {
        throw new IllegalArgumentException(DUPLICATE_EXCEPTION);
    }
}
