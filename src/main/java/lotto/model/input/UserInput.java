package lotto.model.input;

import camp.nextstep.edu.missionutils.Console;
import lotto.view.SystemOutput;

public class UserInput {
    SystemOutput systemOutput = new SystemOutput();
    public String inputMoney() {
        systemOutput.MoneyInputMessage();
        return Console.readLine();
    }
    public String inputWinNum() {
        systemOutput.inputWinNumMassage();
        return Console.readLine();
    }
    public String inputBonusNum() {
        systemOutput.inputBonusNumMassage();
        return Console.readLine();
    }
}
