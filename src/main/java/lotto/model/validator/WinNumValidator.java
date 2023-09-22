package lotto.model.validator;

import lotto.view.Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WinNumValidator {
    Exceptions exception = new Exceptions();

    public List<String> validateWinNum(String[] winNum) {
        List<String> list = winNumType(winNum);
        winNumLength(winNum);
        winNumRange(winNum);
        winNumDuplicate(winNum);
        return list;
    }
    private List<String> winNumType(String[] winNum) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < winNum.length; i++) {
            if(!winNum[i].matches("(.*)[0-9](.*)")) {
                exception.inputType();
            }
            list.add(winNum[i].trim());
        }
        return list;
    }
    private void winNumLength(String[] winNum) {
        if (winNum.length != 6) {
            exception.winNumLength();
        }
    }
    private void winNumRange(String[] winNum) {
        for (int i = 0; i < winNum.length; i++) {
            int n = Integer.parseInt(winNum[i]);
            if (n > 45 || n < 1) {
                exception.numRange();
            }
        }
    }
    private void winNumDuplicate(String[] winNum) {
        if (Arrays.stream(winNum).distinct().count() != winNum.length) {
            exception.duplicateNum();
        }
    }
}
