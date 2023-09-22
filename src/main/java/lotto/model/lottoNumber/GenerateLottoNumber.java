package lotto.model.lottoNumber;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class GenerateLottoNumber {
    private final List<LottoNumber> generatedLotto = new ArrayList<>();
    public GenerateLottoNumber(int money) {
        generateLotto(money);
    }
    private void generateLotto(int money) {
        for (int i = 0; i < money / 1000; i++) {
            LottoNumber lottoNumber = new LottoNumber(Randoms.pickUniqueNumbersInRange(1, 45, 6));
            generatedLotto.add(lottoNumber);
        }
    }

    public List<LottoNumber> getGeneratedLotto() {
        return generatedLotto;
    }
}
