package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Mytest5 {
    @Test
    void name() {
        assertThat(isNegative(3)).isEqualTo(false);
        assertThat(isNegative(9)).isFalse();
        assertThat(isNegative(0)).isFalse();
        assertThat(isNegative(-5)).isTrue();
    }

    @Test
    void 더큰수test() {
        assertThat(getBigger(3, 7)).isEqualTo(7);
        assertThat(getBigger(7, 3)).isEqualTo(7);
        assertThat(getBigger(-9, -1)).isEqualTo(-1);
    }

    @Test
    void 더큰수세개test() {
        assertThat(getBiggest(1, 2, 3)).isEqualTo(3);
        assertThat(getBiggest(3, 2, 1)).isEqualTo(3);
        assertThat(getBiggest(-3, -2, -1)).isEqualTo(-1);
        assertThat(getBiggest(-1, -2, -3)).isEqualTo(-1);
    }

    @Test
    void 더작은수세개test() {
        assertThat(min(1, 2, 3)).isEqualTo(1);
        assertThat(min(3, 2, 1)).isEqualTo(1);
        assertThat(min(-3, -2, -1)).isEqualTo(-3);
        assertThat(min(-1, -2, -3)).isEqualTo(-3);
    }

    boolean isNegative(int a){
        return a < 0;
    }
    int getBigger(int a, int b){
        if (a > b){
            return a;
        }
        return b;
    }
    int getBiggest(int a, int b , int c){
        // int d = Math.max(a, b);
        // return Math.max(d, c);
        // ---
        // int d = getBigger(a, b);

        int d = getBigger(a,b);
        if (d > c){
            return d;
        }
        return c;
    }
    int min(int a, int b, int c){
        if(a < b){
            return a;
        }else if (a < c){
            return a;
        }else if (a > c){
            return c;
        }
        return b;


    }
}
