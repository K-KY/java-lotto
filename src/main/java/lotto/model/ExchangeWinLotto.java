package lotto.model;

import java.util.List;

public class ExchangeWinLotto {
    private enum Rank {
        FIRST(6) {
            Long win(int rank) {
                return 2000000000L;
            }
        },
        SECOND(7) {
            Long win(int rank) {
                return 30000000L;
            }

        },
        THIRD(5) {
            Long win(int rank) {
                return 1500000L;
            }

        },
        FOURTH(4) {
            Long win(int rank) {
                return 50000L;
            }

        },
        FIFTH(3) {
            Long win(int rank) {
                return 5000L;
            }

        };
        private final int rank;

         Rank(int rank) {
            this.rank = rank;
        }

        abstract Long win(int rank);
    }

    public void exchange(List<Integer> result) {

    }
}
