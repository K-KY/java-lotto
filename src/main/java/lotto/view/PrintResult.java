package lotto.view;

import java.math.BigDecimal;
import java.util.HashMap;

public class PrintResult {
    private enum win {
        FIFTH {
            String resultString() {
                return "3개 일치 (5,000원) - ";
            }
        },
        FOURTH {
            String resultString() {
                return "4개 일치 (50,000원) - ";
            }
        },
        THIRD {
            String resultString() {
                return "5개 일치 (1,500,000원) - ";
            }
        },
        SECOND {
            String resultString() {
                return "5개 일치, 보너스 볼 일치 (30,000,000원) - ";
            }
        },
        FIRST {
            String resultString() {
                return "6개 일치 (2,000,000,000원) - ";
            }
        };

        abstract String resultString();
    }

    public void print(HashMap<String, Integer> result, BigDecimal earningRate) {
        win[] wins = win.values();
        System.out.println("---");
        System.out.println("당첨 통계");
        for (int i = 0; i < wins.length; i++) {
            System.out.println(wins[i].resultString() + result.getOrDefault(wins[i].toString(), 0) + "개");
        }
        System.out.println("총 수익률은 " + earningRate+"%입니다.");
    }
}