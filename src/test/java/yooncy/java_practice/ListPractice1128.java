package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListPractice1128 {

    @Test
    void 도시들() {
        ArrayList<String> 한국도시들 = new ArrayList<>();
        한국도시들.add("제주");
        한국도시들.add("강릉");
        한국도시들.add("울산");
        ArrayList<String> 미국도시들 = new ArrayList<>();
        미국도시들.add("디트로이트");
        미국도시들.add("스프링필드");
        미국도시들.add("볼티모어");
        ArrayList<String> 독일도시들 = new ArrayList<>();
        독일도시들.add("프랑크푸르트");
        독일도시들.add("함부르크");
        독일도시들.add("브레멘");

        ArrayList<List<String>> 여러도시들 = new ArrayList<>();
        여러도시들.add(한국도시들);
        여러도시들.add(미국도시들);
        여러도시들.add(독일도시들);
//        for (List<String> s : 여러도시들) {
//            System.out.println(s);
//        }
        // 키에 나라이름을 넣고 밸류에 해당 나라 리스트 추가
        HashMap<String, List<String>> 여러도시들2 = new HashMap<>();
        여러도시들2.put("한국", 한국도시들);
        여러도시들2.put("미국", 미국도시들);
        여러도시들2.put("독일", 독일도시들);

        HashMap<String, String> 여러도시들이모지 = new HashMap<>();
        여러도시들이모지.put("한국","❤");
        여러도시들이모지.put("미국","✌");
        여러도시들이모지.put("독일","✔");

        for (Map.Entry<String, List<String>> entry : 여러도시들2.entrySet()) {
            String key = entry.getKey();
            List<String> cityList = entry.getValue();
            String 이모지 = 여러도시들이모지.get(key);
            System.out.println(이모지 + key + cityList);
        }

        for (String 나라이름 : 여러도시들2.keySet()) {
            List<String> 도시들 = 여러도시들2.get(나라이름);
            String 이모지 = 여러도시들이모지.get(나라이름);
            System.out.println(이모지 + 나라이름 + " " + 도시들);
        }


//        //hashmap으로 표현
//        HashMap<String, String> cities1 = new HashMap<>();
//        // 도시1의 정보들을 추가
//        cities1.put("도시이름", "제주");
//        cities1.put("특산품", "귤");
//        cities1.put("특징", "비많이옴");
//        // 도시2의 정보들을 추가
//        HashMap<String, String> cities2 = new HashMap<>();
//        cities2.put("도시이름", "강릉");
//        cities2.put("특산품", "커피빵");
//        cities2.put("특징", "산많음");
//        // 도시2의 도시이름 출력
//        System.out.println(cities2.get("도시이름"));
//        // 도시1과 도시2의 정보들을 하나의 리스트로 묶기
//        ArrayList<HashMap<String, String>> citiesInformation = new ArrayList<>();
//        citiesInformation.add(cities1);
//        citiesInformation.add(cities2);
//
//        System.out.println(citiesInformation.get(0));
//        System.out.println(citiesInformation.get(1));
//

//        for (Map.Entry<String, Integer> entry : 한국도시들인구수.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + value);
//        }
    }

}
