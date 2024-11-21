package yooncy.java_practice;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> 광역시목록 = new ArrayList<>();

        광역시목록.add("대전");
        광역시목록.add("일산");
        광역시목록.add("광주");
        광역시목록.add("울산");

        System.out.println(광역시목록.size());
        System.out.println("광역시목록 2번 출력: " + 광역시목록.get(1));

        for (String s : 광역시목록) {
            System.out.println(s);
        }
        System.out.println("------------------");

        광역시목록.set(2,"전라도광주");
        광역시목록.remove("일산");
        System.out.println("광역시목록 3번 출력: " + 광역시목록.get(2));
        for (String s : 광역시목록) {
            System.out.println(s);
        }
        System.out.println("-----------------------");

        ArrayList<String> 광역시목록2 = new ArrayList<>();

        for (int i = 0; i < 광역시목록.size(); i++) {
            광역시목록2.add(광역시목록.get(i) + "광역시");
            // 광역시목록.get(0) = 대전
            // 광역시 목록2.add(광역시목록.get(0)) : 광역시목록2 0번에  광역시목록.get(0) 를 추가
        }

        for (String s : 광역시목록2) {
            System.out.println(s);
        }


    }

}
