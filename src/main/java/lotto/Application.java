package lotto;

import lotto.controller.LottoStart;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            LottoStart lottoStart = new LottoStart();
            lottoStart.start();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
