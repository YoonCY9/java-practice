package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Mytest4 {
    @Test
    void 년도test() {
        assertThat(calculateBirthYear(1)).isEqualTo(2024);
        assertThat(calculateBirthYear(2)).isEqualTo(2023);
        assertThat(calculateBirthYear(20)).isEqualTo(2005);
    }
    int calculateBirthYear(int age){
        return  2025 - age;
    }
}
