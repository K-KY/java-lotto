package lotto.model;

import java.util.List;

public class CompareLottoNumbers {
    public int compareLottoNumbers(List<Integer> lottoNumber, List<Integer> winNum) {
        int count = 0;
        for (int i = 0; i < lottoNumber.size(); i++) {
            if(winNum.contains(lottoNumber.get(i))) {
                count++;
            }
        }
        return count;
    }
    public int compareBonusNumber(List<Integer> lottoNumbers, String bonus) {
        if (lottoNumbers.contains(Integer.parseInt(bonus))) {
            return 2;
        }
        return 0;
    }
}
