package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class DataTypeChange {
    public List<Integer> stringToInteger(List<String> num) {
        List<Integer> number = new ArrayList<>();
        num.forEach(v -> {
            number.add(Integer.parseInt(v));
        });
        return number;
    }
}
