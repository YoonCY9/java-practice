package yooncy.java_practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

public class StreamApiTest1202 {


    @Test
    void 필터_테스트_40보다_작은_수() {
        List<Integer> scores = List.of(100, 60, 35, 70, 38, 80);

        List<Integer> scoresBelow40 = scores.stream()
                .filter((n) -> n < 40)
                .toList();

        assertThat(scoresBelow40).isEqualTo(List.of(35, 38));
    }
    @Test
    void 필터_테스트_짝수() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream().filter((n) -> n % 2 == 0).toList();
        assertThat(evenNumbers).isEqualTo(List.of(2, 4, 6, 8, 10));
    }

    @Test
    void 필터_테스트_길이_3_아닌_이름() {
        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");

        List<String> filteredNames = names.stream().filter((n) -> n.length() != 3).toList();

        assertThat(filteredNames).isEqualTo(List.of("왕건", "박새로이", "이도"));
    }

    @Test
    void 필터_테스트_이씨_이름() {
        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");

        List<String> filteredNames = names.stream().filter((n) -> n.startsWith("이")).toList();

                assertThat(filteredNames).isEqualTo(List.of("이성계", "이방원", "이도"));
    }

    @Test
    void 필터_테스트_두_글자_이씨_이름() {
        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");

        List<String> filteredNames = names.stream().filter((n) -> n.length() == 2)
                .filter((n) -> n.startsWith("이")).toList();

                assertThat(filteredNames).isEqualTo(List.of("이도"));
    }

    @Test
    void 맵_테스트_제곱() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream()
                .map((n) -> n * n)
                .toList();

        assertThat(squaredNumbers).isEqualTo(List.of(1, 4, 9, 16, 25));
    }

    @Test
    void 맵_테스트_할인_적용() {
        List<Integer> 장바구니상품들가격 = List.of(100, 200, 300, 400, 500);

        List<Double> 할인적용된금액목록 = 장바구니상품들가격.stream()
                .map((n) ->  (n - (n * 0.1)))
                .toList();

        assertThat(할인적용된금액목록).isEqualTo(List.of(90.0, 180.0, 270.0, 360.0, 450.0));
    }

    @Test
    void 맵_테스트_대문자화() {
        List<String> companies = List.of("google", "apple", "netflix");
        List<String> upperCasedCompanies = companies.stream().map(String::toUpperCase).toList();

                assertThat(upperCasedCompanies).isEqualTo(List.of("GOOGLE", "APPLE", "NETFLIX"));
    }

    @Test
    void 맵_테스트_짝수_홀수() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<String> evenOddNumbers = numbers.stream()
                .map(n -> {
                   if (n % 2 == 0) {
                       return "짝수";
                   } else {
                       return "홀수";
                   }
                }).toList();

        assertThat(evenOddNumbers).isEqualTo(List.of("홀수", "짝수", "홀수", "짝수", "홀수"));
    }

    @Test
    void 필터_맵_테스트1() {
        // given
        List<Integer> prices = Arrays.asList(1000, 25000, 30000, 15000, 5000, 40000);

        // when
        List<Double> discountedPrices = prices.stream().filter((n) -> n >= 20000)
                .map((n) -> n - n * 0.1).toList();


        // then
        assertThat(discountedPrices).hasSize(3);
        assertThat(discountedPrices).isEqualTo(List.of(22500.0, 27000.0, 36000.0));
    }

    @Test
    void 필터_맵_테스트2() {
        // given
        List<String> names = Arrays.asList("Kim", "Park", "Lee", "Choi", "Jung", "Kang");

        // when
        List<String> upperCasedNames = names.stream().filter((n) -> n.length() >= 4)
                .map((n) -> n.toUpperCase()).toList();
        // .map(String::toUpperCase) 로도 표현가능

        // then
        assertThat(upperCasedNames).hasSize(4);
        assertThat(upperCasedNames).isEqualTo(List.of("PARK", "CHOI", "JUNG", "KANG"));

    }

    @Test
    void StreamApi활용() {
        HashMap<ArrayList<String>, String> MemberPassword = new HashMap<>();

        ArrayList<String> MemberInformation = new ArrayList<>();

        MemberInformation.add("ID : yoon");
        MemberInformation.add("닉네임: 윤");
        MemberInformation.add("비밀번호: 1234");
        // 회원정보에 각종 정보 추가

        MemberPassword.put(MemberInformation, MemberInformation.get(2));
        // 회원정보가 담긴 리스트를 key값, 비밀번호가 담긴 배열의 번호를 value값

        HashMap<ArrayList<String>, String> MemberPassword2 = new HashMap<>();

    }
}
