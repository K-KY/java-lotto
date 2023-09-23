package lotto.model;

import java.util.HashMap;
import java.util.List;

public class ExchangeWinLotto {
    private enum Rank {
        FIRST(6) {
            Long win() {
                return 200000000L;
            }
        },
        SECOND(7) {
            Long win() {
                return 30000000L;
            }

        },
        THIRD(5) {
            Long win() {
                return 1500000L;
            }

        },
        FOURTH(4) {
            Long win() {
                return 50000L;
            }

        },
        FIFTH(3) {
            Long win() {
                return 5000L;
            }

        };
        private final int rank;

         Rank(int rank) {
            this.rank = rank;
        }

        abstract Long win();
    }
    HashMap<String, Integer> lottoResult = new HashMap<>();
    public HashMap<String, Integer> getLottoResult() {
        return lottoResult;
    }
    public Long exchange(List<Integer> result) {
        Long revenue = 0L;
        List<Rank> ranks = List.of(Rank.values());
        for (int i = 0; i < result.size(); i++) {
            revenue += checkRank(ranks, result.get(i));
        }
        return revenue;
    }
    private Long checkRank(List<Rank> ranks, int result) {
        for (int i = 0; i < ranks.size(); i++) {
            if(ranks.get(i).rank == result) {
                Rank r = ranks.get(i);
                lottoResult.put(r.toString(), lottoResult.getOrDefault(r.toString(), 0)+ 1);
                return ranks.get(i).win();
            }
        }
        return 0L;
    }
}
