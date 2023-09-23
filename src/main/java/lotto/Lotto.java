package lotto;

import lotto.model.DataTypeChange;
import lotto.view.Exceptions;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        validateWinNum(new DataTypeChange().integerToString(numbers));
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현

    Exceptions exception = new Exceptions();

    public void validateWinNum(List<String> winNum) {
        try {
            winNumLength(winNum);
            winNumRange(winNum);
            winNumDuplicate(winNum);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void winNumLength(List<String> winNum) {
        if (winNum.size() != 6) {
            exception.winNumLength();
        }
    }

    private void winNumRange(List<String> winNum) {
        for (int i = 0; i < winNum.size(); i++) {
            int n = Integer.parseInt(winNum.get(i));
            if (n > 45 || n < 1) {
                exception.numRange();
            }
        }
    }

    private void winNumDuplicate(List<String> winNum) {
        if (winNum.stream().distinct().count() != winNum.size()) {
            exception.duplicateNum();
        }
    }

}
