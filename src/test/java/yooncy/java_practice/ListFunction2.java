package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListFunction2 {

    @Test
    void 순위계산Test() {
        assertThat(calculateRanks(List.of(80, 90, 70, 85))).isEqualTo(List.of(3, 1, 4, 2));
        assertThat(calculateRanks(List.of(100, 100, 80))).isEqualTo(List.of(1, 1, 3));
        assertThat(calculateRanks(List.of())).isEqualTo(List.of());
    }
    List<Integer> calculateRanks(List<Integer> numbers) {
        ArrayList<Integer> ranks = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int count = 1;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    count++;
                }
            }
            ranks.add(count);
        }

        return ranks;
    }

}
