package lotto.model.lottoNumber;

import java.util.Collections;
import java.util.List;

public class LottoNumber {
    private final List<Integer> numbers;

    public LottoNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    // Getter 및 Setter 메서드

    public List<Integer> getNumbers() {
        Collections.sort(numbers);
        return numbers;
    }

}
