package lotto.controller;

import lotto.model.CalculateEarningRate;
import lotto.model.CompareLottoNumbers;
import lotto.model.ExchangeWinLotto;
import lotto.model.lottoNumber.LottoNumber;
import lotto.view.PrintResult;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompareLotto {
    CompareLottoNumbers compareNumbers = new CompareLottoNumbers();
    ExchangeWinLotto exchangeWinLotto = new ExchangeWinLotto();
    public void compare(List<LottoNumber> lottoNumbers, List<Integer> winNum, String bonus) {
        final List<Integer> result = checkWinNumber(lottoNumbers, winNum, bonus);
        Long revenue = exchange(result);
        CalculateEarningRate calculateEarningRate = new CalculateEarningRate();
        double earningRate = calculateEarningRate.calc(lottoNumbers.size()*10, revenue);
        PrintResult printResult = new PrintResult();
        printResult.print(exchangeWinLotto.getLottoResult(), new BigDecimal(earningRate));
    }


    private List<Integer> checkWinNumber(List<LottoNumber> lottoNumbers, List<Integer> winNum, String bonus) {
        final List<Integer> result = new ArrayList<>();
        int win;
        for (int i = 0; i < lottoNumbers.size(); i++) {
            LottoNumber lottoNumber = lottoNumbers.get(i);
            win = checkNumber(lottoNumber.getNumbers(), winNum);
            if (win == 5) {
                win += checkSecond(lottoNumber.getNumbers(), bonus);
            }
            result.add(win);
        }
        return result;
    }

    private int checkSecond(List<Integer> numbers, String bonus) {
        return compareNumbers.compareBonusNumber(numbers, bonus);
    }

    private int checkNumber(List<Integer> numbers, List<Integer> winNum) {
        return compareNumbers.compareLottoNumbers(numbers, winNum);
    }

    private Long exchange(List<Integer> result) {
        return exchangeWinLotto.exchange(result);
    }
}
