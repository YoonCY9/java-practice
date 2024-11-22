package yooncy.java_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListLoop {

    public static void main(String[] args) {

        ArrayList<Integer> score = new ArrayList<>();
        score.add(80);
        score.add(60);
        score.add(70);
        score.add(100);
        score.add(90);
        // 합인 총점
        int totalScore = 0;
        for (int i = 0; i < score.size(); i++) {
            totalScore += score.get(i);
        }
        System.out.println(totalScore);

        // 평균 점수
        int average = totalScore / score.size();
        System.out.println("평균 = " + average);

        // 배열 0번과 1번을 비교 0번이 큰점수면 배열 0번에 저장 .... 0번 출력
        int best = 0;

        for (int i = 0; i < score.size(); i++) {
            if (best < score.get(i)) {
                best = score.get(i);
            }
        }
        System.out.println("1등: " + best);

        // 최저점수
        int worst = score.get(0);

        for (int i = 0; i < score.size(); i++) {
            if (worst > score.get(i)) {
                worst = score.get(i);
            }
        }
        System.out.println("꼴등: " + worst);
        System.out.println("-----------------------");

        // lower의 리스트 생성
        ArrayList<Integer> lower = new ArrayList<>();


        for (int i = 0; i < score.size(); i++) { //0번 부터 score사이즈 만큼 반복
            if (average > score.get(i)){  // 만약 평균보다 score의 i번의 점수가 낮으면
                lower.add(score.get(i));  // lower에 count번째에 점수 하나 추가
                  // 추가하면 count++
            }
        }
        for (Integer i : lower) {
            System.out.println(i);
        }
        System.out.println("-----------------");

        ArrayList<Integer> top = new ArrayList<>();

        for (int i = 0; i < score.size(); i++) { //0번 부터 score사이즈 만큼 반복
            if (average < score.get(i)){  // 만약 평균보다 score의 i번의 점수가 낮으면
                top.add(score.get(i));  // lower에 count번째에 점수 하나 추가
            }
        }
        for (Integer i : top) {
            System.out.println(i);
        }
        System.out.println("--------------------------");
        ArrayList<Integer> ascending = new ArrayList<>();
        for (int i = 0; i < score.size(); i++) {
            ascending.add(score.get(i));
        }
        System.out.println("오름차순 정렬");
        Collections.sort(ascending);
        for (Integer i : ascending) {
            System.out.println(i);
        }
        System.out.println("--------------------");

        ArrayList<Integer> median = new ArrayList<>();
        System.out.println("중앙값 출력");
        for (int i = 0; i < ascending.size(); i++) {
            median.add(ascending.get(i));
            // <60, 70, 80, 90, 100>
        }

        // 리스트의 사이즈가 짝수이면 두번째와 세번째를 더해서 나누기 2 , 홀수이면 3번째 출력
        if (median.size() % 2 == 0){
            int a = median.get((median.size() / 2) - 1) + median.get((median.size() / 2 )) / 2;
            System.out.println(a);
        } else {
            int b = median.get(median.size()/ 2);
            System.out.println(b);
        }


    }
}
