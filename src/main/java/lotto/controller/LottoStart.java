package lotto.controller;

import lotto.model.input.UserInput;
import lotto.model.validator.InputMoneyValidator;

public class LottoStart {
    UserInput userInput = new UserInput();
    private int inputMoney() {
        InputMoneyValidator validator = new InputMoneyValidator();
        String input = userInput.inputMoney();
        return validator.validateMoney(input);
    }

}
