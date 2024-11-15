package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Mytest {

    @Test
    void maxText() {
        assertThat(square(4)).isEqualTo(16);
        assertThat(square(-4)).isEqualTo(16);


    }
    int square(int num){
        return num * num;
    }
}
