package lotto.view;

public class SystemOutput {
    private enum SystemEnum{
        MESSAGE_MONEY_INPUT("구입금액을 입력해 주세요."),
        MESSAGE_PURCHASED("개를 구매했습니다."),
        MESSAGE_WIN_NUM("당첨 번호를 입력해 주세요."),
        MESSAGE_INPUT_BONUS("보너스 번호를 입력해 주세요.");
        private final String value;

        SystemEnum(String value) {
            this.value = value;
        }
        public String value() {
            return value;
        }
    }
    public void MoneyInputMessage() {
        System.out.println(SystemEnum.MESSAGE_MONEY_INPUT.value);
    }
    public void purchaseMessage(int i) {
        System.out.println(i + SystemEnum.MESSAGE_PURCHASED.value);
    }
    public void inputWinNumMassage() {
        System.out.println(SystemEnum.MESSAGE_WIN_NUM.value);
    }
    public void inputBonusNumMassage() {
        System.out.println(SystemEnum.MESSAGE_INPUT_BONUS.value);
    }
}
