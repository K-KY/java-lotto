package lotto.model.validator;

import lotto.view.Exceptions;

public class BonusNumValidator {
    Exceptions exceptions = new Exceptions();
    private void validateType(String bonus) {
        if(!bonus.matches("[0-9]")) {
            exceptions.inputType();
        }
    }
}
