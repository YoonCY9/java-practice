package yooncy.java_practice;

public class codingTest {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        System.out.println(solution(ints));

    }
    public static double solution(int[] arr) {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = (double) sum / arr.length;
        return average;
    }

}
