package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class ListFunction {

    @Test
    void sumTest() {
        assertThat(getSum(List.of(1, 2, 3, 4))).isEqualTo(10);
        assertThat(getSum(List.of(7))).isEqualTo(7);
        assertThat(getSum(List.of())).isEqualTo(0); // 빈 리스트가 주어질 경우 0을 return
    }

    @Test
    void averagerTest() {
        assertThat(getAverage(List.of(1, 2, 3, 4))).isEqualTo(2.5);
        assertThat(getAverage(List.of(7))).isEqualTo(7.0);
        assertThat(getAverage(List.of())).isEqualTo(0.0); // 빈 리스트가 주어질 경우 0 return
    }

    @Test
    void maxTest() {
        assertThat(findMax(List.of(3, 10, 5, 4, 7))).isEqualTo(10);
        assertThat(findMax(List.of(7))).isEqualTo(7);
    }

    @Test
    void minTest() {
        assertThat(findMin(List.of(3, 10, 5, 4, 7))).isEqualTo(3);
        assertThat(findMin(List.of(7))).isEqualTo(7);
        assertThat(findMin(List.of(13, 4, 5, 7, 2))).isEqualTo(2);


    }

    @Test
    void passTest() {

//        assertThat(isPass(List.of(60, 60))).isTrue();
//        assertThat(isPass(List.of(40, 80))).isTrue();
        assertThat(isPass(List.of(39, 100, 100))).isFalse();
        assertThat(isPass(List.of(100, 0, 100))).isFalse();

    }

    @Test
    void returnTest() {
        assertThat(getIntegersBetween(1, 5)).isEqualTo(List.of(1, 2, 3, 4, 5));
        assertThat(getIntegersBetween(-3, 1)).isEqualTo(List.of(-3, -2, -1, 0, 1));
        assertThat(getIntegersBetween(3, 3)).isEqualTo(List.of(3));
        assertThat(getIntegersBetween(5, 1)).containsExactlyInAnyOrder(5, 4, 3, 2, 1);
    }

    @Test
    void 양수Test() {
        assertThat(filterPositive(List.of(-1, 2, -3, 4, 0))).isEqualTo(List.of(2, 4));
        assertThat(filterPositive(List.of(-1, -2, -3))).isEqualTo(List.of());
        assertThat(filterPositive(List.of())).isEqualTo(List.of());
    }

    @Test
    void 합격생Test() {
        assertThat(findPassedStudents(List.of(70, 85, 90, 75, 80))).isEqualTo(List.of(85, 90, 80));
        assertThat(findPassedStudents(List.of(70, 75, 79))).isEqualTo(List.of());
        assertThat(findPassedStudents(List.of(80, 85, 90))).isEqualTo(List.of(80, 85, 90));
    }

    @Test
    void 중복제거Test() {
        assertThat(removeDuplicates(List.of(1, 2, 2, 3, 4, 4, 5))).isEqualTo(List.of(1, 2, 3, 4, 5));
        assertThat(removeDuplicates(List.of(1, 1, 1, 1))).isEqualTo(List.of(1));
        assertThat(removeDuplicates(List.of())).isEqualTo(List.of());
    }

    @Test
    void 순위계산Test() {
        assertThat(calculateRanks(List.of(80, 90, 70, 85))).isEqualTo(List.of(3, 1, 4, 2));
        assertThat(calculateRanks(List.of(100, 100, 80))).isEqualTo(List.of(1, 1, 3));
        assertThat(calculateRanks(List.of())).isEqualTo(List.of());
    }

    static int getSum(List<Integer> numbers) {
        // numbers 이름의 리스트 생성
        int sum = 0;
        // numbers 리스트의 갯수만큼 numbers안의 값을 더하고 sum에 누적
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        return sum;
    }

    double getAverage(List<Integer> numbers) {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            average = (double) sum / numbers.size();
        }
        return average;
    }

    int findMax(List<Integer> numbers) {
        int max = numbers.get(0); // 일단 max에 0번을 저장
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    int findMin(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (min > numbers.get(i)) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    boolean isPass(List<Integer> numbers) {
        int sum = 0;
        boolean average = false;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if (sum / numbers.size() >= 60) {
                average = true;
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (!(numbers.get(i) >= 40 && average)) {
                return false;
            }
        }
        return true;
    }

    List<Integer> getIntegersBetween(int number1, int number2) {
        // 리스트에 1 과 5가 있을때 5까지 1++
        ArrayList<Integer> between = new ArrayList<>();
        int a = number1;
        int b = number2;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                between.add(i);
            }
        }
        if (a > b) {
            for (int i = a; i >= b; i--) {
                between.add(i);
            }
        }
        if (a == b) {
            between.add(a);
        }
        return between;

    }

    List<Integer> filterPositive(List<Integer> numbers) {
        ArrayList<Integer> filter = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) {
                filter.add(numbers.get(i));
            }
        }
        return filter;
    }

    List<Integer> findPassedStudents(List<Integer> numbers) {
        ArrayList<Integer> pass = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= 80) {
                pass.add(numbers.get(i));
            }
        }
        return pass;
    }

    List<Integer> removeDuplicates(List<Integer> numbers) {
        ArrayList<Integer> removeList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            removeList.add(numbers.get(i));
        }
        Set<Integer> removeList2 = new HashSet<>(removeList);

        return new ArrayList<>(removeList2);
    }
    List<Integer> calculateRanks(List<Integer> numbers) {
        ArrayList<Integer> ranking = new ArrayList<>();

    }



}
