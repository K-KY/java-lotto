package lotto.model.validator;

import lotto.model.DataTypeChange;
import lotto.view.Exceptions;

import java.util.ArrayList;
import java.util.List;

public class WinNumValidator {
    Exceptions exception = new Exceptions();

    public List<Integer> validateWinNum(String[] winNum) {
        List<String> list = new ArrayList<>();
        try {
            list = winNumType(winNum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new DataTypeChange().stringToInteger(list);
    }

    private List<String> winNumType(String[] winNum) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < winNum.length; i++) {
            if (!winNum[i].matches("(.*)[0-9](.*)")) {
                exception.inputType();
            }
            list.add(winNum[i].trim());
        }
        return list;
    }
}
