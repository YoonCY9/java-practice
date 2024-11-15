package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Mytest6 {
    @Test
    void 절댓값test() {
        assertThat(abs(3)).isEqualTo(3);
        assertThat(abs(-3)).isEqualTo(3);
        assertThat(abs(0)).isEqualTo(0);
    }
    int abs(int a){
        if(a > 0){
            return a;
        }else {
            return -(a);
        }
    }
}
