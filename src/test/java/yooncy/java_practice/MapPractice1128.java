package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MapPractice1128 {

    @Test
    void 상품데이터() {
        HashMap<String, String> product1 = new HashMap<>();
        product1.put("상품명", "코멧 니트릴장갑 화이트");
        product1.put("상품가격", "6540");
        product1.put("카테고리", "주방용품");
        HashMap<String, String> product2 = new HashMap<>();
        product2.put("상품명", "라운드랩 1025 독도 로션, 400ml, 1개");
        product2.put("상품가격", "16910");
        product2.put("카테고리", "뷰티");
        HashMap<String, String> product3 = new HashMap<>();
        product3.put("상품명", "삼양 불닭볶음면 큰컵 105g, 16개");
        product3.put("상품가격", "17110");
        product3.put("카테고리", "식품");
    }

    @Test
    void 사람데이터() {
        HashMap<String, String> 사람1 = new HashMap<>();
//        사람데이터.put("사람1", List.of("이름:박효신", "생년월일:810901", "국적:대한민국"));
//        사람데이터.put("사람2", List.of("이름:마동석", "생년월일:710301", "국적:미국"));
        사람1.put("이름","박효신");
        사람1.put("생년월일","810901");
        사람1.put("국적","대한민국");

        HashMap<String, String> 사람2 = new HashMap<>();
        사람2.put("이름","마동석");
        사람2.put("생년월일","710301");
        사람2.put("국적","미국");

    }

    @Test
    void 영화데이터() {
        HashMap<String, List<String>> 영화데이터 = new HashMap<>();
        영화데이터.put("영화1", Arrays.asList("제목:범죄도시", "감독:강윤성", "개봉일:2017-10-03"));
        영화데이터.put("영화2", Arrays.asList("제목:다크나이트", "감독:놀란", "개봉일:2008-08-06"));
    }

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

//    @Test
//    void getCommonElementsTest() {
//        List<Integer> firstList = List.of(1, 2, 3);
//        List<Integer> secondList = List.of(2, 3, 4);
//
//        List<Integer> commonElements = getCommonElements(firstList, secondList);
//
//        assertThat(commonElements).containsExactlyInAnyOrder(2, 3);
//    }

    boolean myContains(List<String> names, String name) {
        for (int i = 0; i < names.size(); i++) {
            if (names.contains(name)){
                return true;
            }
        }
        return false;
    }

}
