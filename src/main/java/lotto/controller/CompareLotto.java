package lotto.controller;

import lotto.model.CompareLottoNumbers;
import lotto.model.ExchangeWinLotto;
import lotto.model.lottoNumber.LottoNumber;

import java.util.ArrayList;
import java.util.List;

public class CompareLotto {
    private final List<Integer> result = new ArrayList<>();
    CompareLottoNumbers compareNumbers = new CompareLottoNumbers();

    public void compare(List<LottoNumber> lottoNumbers, List<Integer> winNum, String bonus) {
        checkWinNumber(lottoNumbers, winNum, bonus);
        exchange(result);
    }

    private void checkWinNumber(List<LottoNumber> lottoNumbers, List<Integer> winNum, String bonus) {
        int win;
        for (int i = 0; i < lottoNumbers.size(); i++) {
            LottoNumber lottoNumber = lottoNumbers.get(i);
            win = checkNumber(lottoNumber.getNumbers(), winNum);
            if (win == 5) {
                win += checkSecond(lottoNumber.getNumbers(), bonus);
            }
            result.add(win);
        }
    }

    private int checkSecond(List<Integer> numbers, String bonus) {
        return compareNumbers.compareBonusNumber(numbers, bonus);
    }

    private int checkNumber(List<Integer> numbers, List<Integer> winNum) {
        return compareNumbers.compareLottoNumbers(numbers, winNum);
    }

    private Long exchange(List<Integer> result) {
        ExchangeWinLotto exchangeWinLotto = new ExchangeWinLotto();
        return exchangeWinLotto.exchange(result);
    }
}
