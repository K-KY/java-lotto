package lotto.model.validator;

public class InputMoneyValidator {
    Exception exception = new Exception();
// 숫자인지 확인
// 1000원 단위인지 확인
    public void validateMoney(String money) {
        int m = validateType(money);
        validateRange(m);
        validateUnit(m);

    }
    private int validateType(String money) {
        String[] moneyArr = money.split("");
        for (int i = 0; i < moneyArr.length; i++) {
            if (!moneyArr[i].matches("(.*)[0-1](.*)")) {
                exception.inputType();
            }
        }
        return Integer.parseInt(money);
    }
    private void validateRange(int money) {
        if (money < 1000) {
            exception.moneyRange();
        }
    }
    private void validateUnit(int money) {
        if (money % 1000 != 0) {
            exception.moneyUnit();
        }
    }
}
