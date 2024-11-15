package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Mytest3 {
    @Test
    void averageTest() {
        assertThat(getAverage(100, 100, 70)).isEqualTo(90);
        assertThat(getAverage(0, 100, 50)).isEqualTo(50);

    }

    @Test
    void 큰지아닌지test() {
        assertThat(isPositive(3)).isEqualTo(true);
        assertThat(isPositive(9)).isTrue();
        assertThat(isPositive(0)).isFalse();
        assertThat(isPositive(-5)).isFalse();
    }

    int getAverage(int a, int b, int c){
        return (a + b + c) / 3;
    }

    boolean isPositive(int a){
        return a > 0;
    }
}
