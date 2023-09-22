package lotto.model.validator;

public class InputMoneyValidator {
    Exception exception = new Exception();
// 숫자인지 확인
// 1000원 단위인지 확인
    private void validateType(String money) {
        String[] moneyArr = money.split("");
        for (int i = 0; i < moneyArr.length; i++) {
            if (!moneyArr[i].matches("(.*)[0-1](.*)")) {
                exception.inputType();
            }
        }
    }
    private void validateRange(String money) {
        int range = Integer.parseInt(money);
        if (range < 1000) {
            exception.moneyRange();
        }
    }
}
