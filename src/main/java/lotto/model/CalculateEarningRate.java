package lotto.model;


public class CalculateEarningRate {
    public double calc(int consume, Long revenue) {
        return  ((double) revenue / (double) consume);
    }
}
