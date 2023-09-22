package lotto;

import lotto.model.GenerateLottoNumber;
import lotto.model.validator.InputMoneyValidator;
import lotto.model.validator.WinNumValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    // 아래에 추가 테스트 작성 가능
    @DisplayName("로또 번호가 구입금액 / 1000 만큼 생성된다.")
    @Test
    void lottoNumberGenerateTest() {
        assertThat(new GenerateLottoNumber(10000).getGeneratedLotto().size()).isEqualTo(10);
    }
    @DisplayName("구입금액에 숫자가 아닌 문제가 포함되어 있다면 예외가 발생한다.")
    @Test
    void inputMoneyTypeTest() {
        assertThatThrownBy(() -> new InputMoneyValidator().validateMoney("1000l"))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @DisplayName("구입금액이 1000보다 작다면 예외가 발생한다.")
    @Test
    void inputMoneyRangeTest() {
        assertThatThrownBy(() -> new InputMoneyValidator().validateMoney("100"))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @DisplayName("구입금액이 1000으로 나누어 떨어지지 않으면 예외가 발생한다.")
    @Test
    void inputMoneyUnitTest() {
        assertThatThrownBy(() -> new InputMoneyValidator().validateMoney("12345"))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @DisplayName("당첨번호에 숫자가 아닌값이 입력되면 예외가 발생한다.")
    @Test
    void inputWinNumTypeTest() {
        assertThatThrownBy(() -> new WinNumValidator().validateWinNum("1,e,3,4,5,6".split(",")))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @DisplayName("당첨번호의 범위를 넘어가는 숫자가 있으면 예외가 발생한다.")
    @Test
    void inputWinNumRangeTest() {
        assertThatThrownBy(() -> new WinNumValidator().validateWinNum("1,2,3,4,5,78".split(",")))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @DisplayName("중복된 숫자가 있으면 예외가 발생한다")
    @Test
    void inputWinNumDuplicateTest() {
        assertThatThrownBy(() -> new WinNumValidator().validateWinNum("1,2,3,4,5,5".split(",")))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
