package lotto.view;

import lotto.model.LottoNumber;

import java.util.List;

public class LottoOutput {
    public void printLotto(List<LottoNumber> lottoNumbers) {
        for (int i = 0; i < lottoNumbers.size(); i++) {
            System.out.println(lottoNumbers.get(i).getNumbers());
        }
    }
}
