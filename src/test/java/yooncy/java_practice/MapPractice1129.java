package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class MapPractice1129 {
    @Test
    void myContainsTest() {
        ArrayList<String> names = new ArrayList<>();
        names.add("박효신");
        names.add("이지은");
        names.add("하현우");

        boolean 하현우존재여부 = myContains(names, "하현우");
        boolean 잔나비존재여부 = myContains(names, "잔나비");

        assertThat(하현우존재여부).isTrue();
        assertThat(잔나비존재여부).isFalse();
    }

    boolean myContains(ArrayList<String> names, String name) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i) == name) {
                return true;
            }
        }
        return false;
    }

    @Test
    void getCommonElementsTest() {
        List<Integer> firstList = List.of(1, 2, 3);
        List<Integer> secondList = List.of(2, 3, 4);

        List<Integer> commonElements = getCommonElements(firstList, secondList);

        assertThat(commonElements).containsExactlyInAnyOrder(2, 3);
    }
    
    List<Integer> getCommonElements(List<Integer> numbers1 , List<Integer> numbers2) {
        ArrayList<Integer> intersection = new ArrayList<>();
//        for (int i = 0; i < numbers1.size(); i++) {
//            for (int j = 0; j < numbers2.size(); j++) {
//                if (Objects.equals(numbers1.get(i), numbers2.get(j)) && !intersection.contains(numbers1.get(i))){
//                    intersection.add(numbers1.get(i));
//                }
//            }
//        }

//        for (int i = 0; i < numbers1.size(); i++) {
//            for (int j = 0; j < numbers2.size(); j++) {
//                if (Objects.equals(numbers1.get(i), numbers2.get(j)) && !intersection.contains(numbers1.get(i))) {
//                    intersection.add(numbers1.get(i));
//                }
//            }
//        }

//        for (int i = 0; i < numbers1.size(); i++) {
//            for (int j = 0; j < numbers2.size(); j++) {
//                if (Objects.equals(numbers1.get(i),numbers2.get(j)) && ! intersection.contains(numbers1.get(i)) ) {
//                    intersection.add(numbers1.get(i));
//                }
//            }
//        }

//        for (int i = 0; i < numbers1.size(); i++) {
//            for (int j = 0; j < numbers1.size(); j++) {
//                if (Objects.equals(numbers1.get(i),numbers2.get(j)) && ! intersection.contains(numbers1.get(i))) {
//                    intersection.add(numbers1.get(i));
//                }
//            }
//        }
        for (Integer i : numbers1) {
            if (numbers2.contains(i)) {
                intersection.add(i);
            }
        }
        for (Integer i : numbers1) {
            if (numbers2.contains(i)) {
                intersection.add(i);
            }
        }
        for (Integer i : numbers1) {
            if (numbers2.contains(i)) {
                intersection.add(i);

            }
        }
        for (Integer i : numbers1) {
            if (numbers2.contains(i)) {
                intersection.add(i);

            }
        }

        return intersection;
    }
    @Test
    void myFrequencyTest() {
        ArrayList<String> names = new ArrayList<>();
        names.add("박효신");
        names.add("이지은");
        names.add("이지은");
        names.add("하현우");
        names.add("하현우");
        names.add("하현우");

        int 박효신Count = myFrequency(names, "박효신");
        int 이지은Count = myFrequency(names, "이지은");
        int 하현우Count = myFrequency(names, "하현우");

        assertThat(박효신Count).isEqualTo(1);
        assertThat(이지은Count).isEqualTo(2);
        assertThat(하현우Count).isEqualTo(3);
    }
    int myFrequency(List<String> names, String name) {
        HashMap<String, Integer> nameCount = new HashMap<>();
    }

}
