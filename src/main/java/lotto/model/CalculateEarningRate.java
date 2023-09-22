package lotto.model;


public class CalculateEarningRate {
    public double calc(int consume, int revenue) {
        return (double) (revenue / consume) * 100;
    }
}
