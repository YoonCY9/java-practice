package yooncy.java_practice;

import org.junit.jupiter.api.Test;

public class calculateTest {

    @Test
    void calculateTest() {
        System.out.println(calculateArea(4));
        System.out.println(calculateArea(10));
        System.out.println(calculateArea(4, 6));
        System.out.println(calculateArea(10, 8));
        System.out.println(calculateArea(4, true));
        System.out.println(calculateArea(4, false));
    }

    double calculateArea(double side) {
        // TODO: 정사각형 면적 계산 로직을 구현하세요.
        return side * side;
    }
    double calculateArea(double length, double width) {
        // TODO: 직사각형 면적 계산 로직을 구현하세요.
        return length * width;
    }
    double calculateArea(double radius, boolean isCircle) {
        // TODO: 원의 면적 계산 로직을 구현하세요. isCircle 매개변수는 오버로딩을 위해 사용됩니다.

        if(isCircle){
            return radius * radius * Math.PI;
        }
        return 0;
    }
}
