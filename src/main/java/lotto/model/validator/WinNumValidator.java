package lotto.model.validator;

import lotto.view.Exceptions;

import java.util.Arrays;
import java.util.List;

public class WinNumValidator {
    Exceptions exception = new Exceptions();

    public List<String> validateWinNum(String[] winNum) {
        winNumType(winNum);
        winNumRange(winNum);
        winNumDuplicate(winNum);
        return Arrays.asList(winNum);
    }
    private void winNumType(String[] winNum) {
        for (int i = 0; i < winNum.length; i++) {
            if(!winNum[i].matches("(.*)[0-9](.*)")) {
                exception.inputType();
            }
        }
    }
    private void winNumRange(String[] winNum) {
        for (int i = 0; i < winNum.length; i++) {
            int n = Integer.parseInt(winNum[i]);
            if (n > 45 || n < 1) {
                exception.winNumRange();
            }
        }
    }
    private void winNumDuplicate(String[] winNum) {
        if (Arrays.stream(winNum).distinct().count() != winNum.length) {
            exception.duplicateWinNum();
        }
    }
}
