package lotto.model.validator;

import lotto.view.Exceptions;

import java.util.List;

public class BonusNumValidator {
    private final Exceptions exceptions = new Exceptions();
    private final List<String> winNum;
    public BonusNumValidator(List<String> winNum) {
        this.winNum = winNum;
    }
    public String validateBonusNum(String bonus) {
        validateType(bonus);
        validateRange(bonus);
        validateDuplicate(bonus);
        return bonus;
    }
    private void validateType(String bonus) {
        if(!bonus.matches("(.*)[0-9](.*)")) {
            exceptions.inputType();
        }
    }
    private void validateRange(String bonus) {
        if (Integer.parseInt(bonus) < 1 || Integer.parseInt(bonus) > 45) {
            exceptions.numRange();
        }
    }

    private void validateDuplicate(String bonus) {
        if (winNum.contains(bonus)) {
            exceptions.duplicateNum();
        }
    }

}
