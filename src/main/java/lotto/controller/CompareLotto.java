package lotto.controller;

import lotto.model.CompareLottoNumbers;
import lotto.model.ExchangeWinLotto;
import lotto.model.lottoNumber.LottoNumber;

import java.util.ArrayList;
import java.util.List;

public class CompareLotto {
    private final List<Integer> result = new ArrayList<>();
    public void compare(List<LottoNumber> lottoNumbers, List<Integer> winNum, String bonus) {
        CompareLottoNumbers compareNumbers = new CompareLottoNumbers();
        int win = 0;
        for (int i = 0; i < lottoNumbers.size(); i++) {
            LottoNumber lottoNumber =lottoNumbers.get(i);
            win = compareNumbers.compareLottoNumbers(lottoNumber.getNumbers(), winNum);
            if(win == 5) {
                win += checkSecond(lottoNumber.getNumbers(), bonus);
            }
            result.add(win);
        }
        exchange(result);
    }
    private int checkSecond(List<Integer> numbers, String bonus) {
        CompareLottoNumbers compareNumbers = new CompareLottoNumbers();
        return compareNumbers.compareBonusNumber(numbers, bonus);
    }
    private Long exchange(List<Integer> result) {
        ExchangeWinLotto exchangeWinLotto = new ExchangeWinLotto();
        return exchangeWinLotto.exchange(result);
    }
}
