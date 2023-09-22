package lotto.controller;

import lotto.model.GenerateLottoNumber;
import lotto.model.LottoNumber;
import lotto.model.input.UserInput;
import lotto.model.validator.InputMoneyValidator;

import java.util.List;

public class LottoStart {
    UserInput userInput = new UserInput();
    private int inputMoney() {
        InputMoneyValidator validator = new InputMoneyValidator();
        String input = userInput.inputMoney();
        return validator.validateMoney(input);
    }
    private List<LottoNumber> purchaseLotto(int money) {
        GenerateLottoNumber generateLottoNumber = new GenerateLottoNumber(money);
        return generateLottoNumber.getGeneratedLotto();
    }

}
