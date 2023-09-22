package lotto.model.validator;

import lotto.view.Exceptions;

import java.util.Arrays;

public class WinNumValidator {
    Exceptions exception = new Exceptions();

    private void winNumDuplicate(String[] winNum) {
        if (Arrays.stream(winNum).distinct().count() != winNum.length) {
            exception.duplicateWinNum();
        }
    }
}
