package lotto.model.lottoNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumber {
    private List<Integer> numbers;

    public LottoNumber(List<Integer> numbers) {
        this.numbers = new ArrayList<>(numbers); // 새로운 수정 가능한 리스트로 복사
    }

    public List<Integer> getNumbers() {
        List<Integer> sortedNumbers = new ArrayList<>(numbers); // 새로운 수정 가능한 리스트 생성
        Collections.sort(sortedNumbers); // 정렬 작업 수행
        return Collections.unmodifiableList(sortedNumbers); // 수정 불가능한 리스트 반환
    }
}
