package lotto.view;

import java.util.List;

public class LottoOutput {
    public void printLotto(List<List<Integer>> lottoNumbers) {
        for (int i = 0; i < lottoNumbers.size(); i++) {
            System.out.println(lottoNumbers.get(i));
        }
    }
}
