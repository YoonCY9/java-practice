package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class HashMapTest {

    @Test
    void 영한오타수정Test() {
        Map<String, String> englishKorean = new HashMap<>();
        englishKorean.put("book", "책");
        englishKorean.put("apple", "사가ㅗ"); // 이 코드를 수정하지 마세요
        englishKorean.put("car", "자동차");

// 아래에 코드 한 줄 추가
        englishKorean.put("apple", "사과");


// 아래 테스트를 통과해야 합니다
        assertThat(englishKorean).containsEntry("apple", "사과");
    }

    @Test
    void studentAgeMap() {
        HashMap<String, Integer> studentAge = new HashMap<>();
        studentAge.put("윤", 17);
        studentAge.put("찬", 18);
        studentAge.put("영", 15);
        System.out.println(studentAge.get("윤"));
    }

    @Test
    void 상품재고감소Test() {
        Map<String, Integer> productStock = new HashMap<>();
        productStock.put("갤럭시 S24", 8);
        productStock.put("삼다수 2L", 20);
        productStock.put("칙촉 오리지널 6+2입 120g", 10);
        productStock.put("M4 맥북 프로", 5);

        productStock.put("갤럭시 S24", productStock.get("갤럭시 S24") - 1);
        productStock.put("M4 맥북 프로", productStock.get("M4 맥북 프로") - 1);


        // 아래 테스트를 통과해야 합니다
        assertThat(productStock.get("갤럭시 S24")).isEqualTo(7);
        assertThat(productStock.get("M4 맥북 프로")).isEqualTo(4);
    }

    @Test
    void 동명이인Test() {
        HashMap<String, Integer> students = new HashMap<>();

        List<String> nameList = List.of(
                "권상윤",
                "김민성",
                "추민영",
                "김성락",
                "황승혁",
                "문성희",
                "문인혁",
                "박현지",
                "윤찬영",
                "윤태우",
                "권상윤",
                "이채현",
                "황효진",
                "권상윤",
                "황승혁",
                "박현지",
                "이호연",
                "전지예",
                "정해준",
                "문인혁",
                "김성락",
                "추민영",
                "허재",
                "황승혁",
                "황효진"
        );
// 아래에 코드 추가

        for (int i = 0; i < nameList.size(); i++) {

            if (students.containsKey(nameList.get(i))/*권상윤 */) {
                students.put(nameList.get(i), students.get(nameList.get(i))+1);
            }
            else {
                students.put(nameList.get(i), 1);
            }
        }

        assertThat(students).containsEntry("추민영", 2)
                .containsEntry("문성희", 1)
                .containsEntry("전지예", 1)
                .containsEntry("정해준", 1)
                .containsEntry("김성락", 2)
                .containsEntry("이호연", 1)
                .containsEntry("권상윤", 3)
                .containsEntry("황승혁", 3)
                .containsEntry("박현지", 2)
                .containsEntry("김민성", 1)
                .containsEntry("이채현", 1)
                .containsEntry("문인혁", 2)
                .containsEntry("황효진", 2)
                .containsEntry("윤찬영", 1)
                .containsEntry("윤태우", 1)
                .containsEntry("허재", 1);

    }

    @Test
    void 맵요소순회Test() {
        HashMap<String, Integer> fruitList = new HashMap<>();
        fruitList.put("사과", 1000);
        fruitList.put("배", 1200);
        fruitList.put("수박", 5000);
        fruitList.put("토마토", 100);
        for (Map.Entry<String, Integer> stringIntegerEntry : fruitList.entrySet()) {
            String name = stringIntegerEntry.getKey();
            Integer price = stringIntegerEntry.getValue();
            System.out.println(name + price);
        }
        fruitList.put("사과", 1500);

        for (Map.Entry<String, Integer> amount : fruitList.entrySet()) {
            String name = amount.getKey();
            if (amount.getValue() >= 1500) {
                System.out.println(name);
            }
        }
    }

    @Test
    void 교집합찾기() {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(2);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < numbers1.size(); i++) {
            if (numbers2.contains(numbers1.get(i))) {
                intersection.add(numbers1.get(i));
            }
        }
        assertThat(intersection.get(0)).isEqualTo(2);
        assertThat(intersection.get(1)).isEqualTo(4);
    }

    @Test
    void 요소들이map인상황() {

        HashMap<Integer, List<String>> goodsList = new HashMap<>();
        goodsList.put(1,List.of("상품명:칙촉","가격:2000원","카테고리:식품"));
        goodsList.put(2,List.of("상품명:세탁 건조 일체형 워시콤보","가격:400만원","카테고리:가전"));


    }

    @Test
    void 나라별도시Map() {

        HashMap<String, List<String>> counties = new HashMap<>();

        counties.put("한국",List.of("제주", "강릉", "부여"));
        counties.put("미국",List.of("뉴욕", "LA", "디트로이트"));

        for (Map.Entry<String, List<String>> entry : counties.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(key + value);
        }

    }


}
