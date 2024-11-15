package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Mytest2 {
    @Test
    void addTest() {
        assertThat(add(3, 4)).isEqualTo(7);
        assertThat(add(10, -5)).isEqualTo(5);

    }
    int add(int a, int b){
        return a + b;
    }
}
