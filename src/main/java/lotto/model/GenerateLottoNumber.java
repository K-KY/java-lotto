package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class GenerateLottoNumber {
    private final List<List<Integer>> generatedLotto = new ArrayList<>();
    public void generateLotto(int money) {
        for (int i = 0; i < money / 1000; i++) {
            generatedLotto.add(Randoms.pickUniqueNumbersInRange(1,45,6));
        }
    }
}
