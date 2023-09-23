package lotto.controller;

import lotto.model.DataTypeChange;
import lotto.model.lottoNumber.GenerateLottoNumber;
import lotto.model.lottoNumber.LottoNumber;
import lotto.model.input.UserInput;
import lotto.model.validator.BonusNumValidator;
import lotto.model.validator.InputMoneyValidator;
import lotto.model.validator.WinNumValidator;
import lotto.view.LottoOutput;
import lotto.view.SystemOutput;

import java.util.List;

public class LottoStart {
    UserInput userInput = new UserInput();
    public void start() {
        int money = inputMoney();
        new SystemOutput().purchaseMessage(money / 1000);
        CompareLotto compareLotto = new CompareLotto();
        List<LottoNumber> lottoNumbers = purchaseLotto(money);
        printGeneratedLotto(lottoNumbers);
        List<String> winNum = inputWinNum();
        String bonusNum = bonusNum(winNum);
        compareLotto.compare(lottoNumbers, typeChange(winNum), bonusNum);
    }
    private int inputMoney() {
        InputMoneyValidator validator = new InputMoneyValidator();
        String input = userInput.inputMoney();
        System.out.println();
        return validator.validateMoney(input);
    }
    private List<LottoNumber> purchaseLotto(int money) {
        GenerateLottoNumber generateLottoNumber = new GenerateLottoNumber(money);
        return generateLottoNumber.getGeneratedLotto();
    }

    private void printGeneratedLotto(List<LottoNumber> generatedLotto) {
        LottoOutput lottoOutput = new LottoOutput();
        lottoOutput.printLotto(generatedLotto);
    }
    private List<String> inputWinNum() {
        String winNum = userInput.inputWinNum();
        System.out.println();
        WinNumValidator winNumValidator = new WinNumValidator();
        return winNumValidator.validateWinNum(winNum.split(","));
    }
    private String bonusNum(List<String> winNum) {
        String bonusNum = userInput.inputBonusNum();
        System.out.println();
        BonusNumValidator bonusNumValidator = new BonusNumValidator(winNum);
        return bonusNumValidator.validateBonusNum(bonusNum);
    }
    private List<Integer> typeChange(List<String> winNum) {
        DataTypeChange dataTypeChange = new DataTypeChange();
        return dataTypeChange.stringToInteger(winNum);
    }

}
