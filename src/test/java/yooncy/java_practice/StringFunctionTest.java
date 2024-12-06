package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class StringFunctionTest {
    @Test
    void 이메일판별test() {
        assertThat(isValidEmail("doraemon@gmail.com")).isTrue();
        assertThat(isValidEmail("doraemon")).isFalse();
    }

    @Test
    void 성별판별test() {
        assertThat(isFemale("1234567")).isFalse();
        assertThat(isFemale("2345678")).isTrue();
        assertThat(isFemale("3456789")).isFalse();
        assertThat(isFemale("4567890")).isTrue();
    }

    @Test
    void 유효한주민번호판별() {
        assertThat(isValidIdNumber("1234567")).isTrue();
        assertThat(isValidIdNumber("1abcd67")).isFalse();

    }

    @Test
    void camelCaseTest() {

        assertThat(toCameCase("snake_case")).isEqualTo("snakeCase");
        assertThat(toCameCase("product_name")).isEqualTo("productName");
        assertThat(toCameCase("created_at")).isEqualTo("createdAt");
    }

    @Test
    void 휴대폰번호test() {
        assertThat(isValidPhoneNumber("01012345678")).isTrue();
        assertThat(isValidPhoneNumber("010123456789")).isFalse();
        assertThat(isValidPhoneNumber("00012345678")).isFalse();
        assertThat(isValidPhoneNumber("010xxxx5678")).isFalse();
    }

    @Test
    void 도메인추출test() {

        assertThat(extractDomain("https://git-scm.com/book/en/v2")).isEqualTo("git-scm.com");
        assertThat(extractDomain("https://www.google.com/search?q=java")).isEqualTo("www.google.com");
        assertThat(extractDomain("https://www.op.gg/modes/aram/teemo/build?region=global&tier=all")).isEqualTo("www.op.gg");
    }


    @Test
    void 비번test() {

        System.out.println(password("aaaaaaaaaaaa1A"));
        System.out.println(password("aaaaaaaaaaaa1"));
        System.out.println(password("AAAAAAAAAAAAAAAAA1"));

    }

    boolean password(String a) {

        if (a.length() <= 8) {
            return false;
        }
        boolean upTrue = false;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                upTrue = true;
            }
        }
        if (!upTrue) {
            return false;
        }

        boolean lowTrue = false;
        for (int i = 0; i < a.length(); i++) {
            if (!Character.isLowerCase(a.charAt(i))) {
                lowTrue = true;
            }
        }
        if (!lowTrue) {
            return false;
        }

        return true;
    }
    int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return answer;
    }

    @Test
    void 솔류션테스트() {

        int 결과1 = solution(10);
        assertThat(결과1).isEqualTo(3);

        int 결과2 = solution(12);
        assertThat(결과2).isEqualTo(11);
    }

    String extractDomain(String a) {
        String httpDelete = a.substring(8);
        return httpDelete.substring(0, httpDelete.indexOf('/'));
    }

    boolean isValidPhoneNumber(String a) {

        if (a.length() == 11 && a.startsWith("010") && isValidIdNumber(a)) {
            return true;
        }
        return false;
    }


    boolean isValidEmail(String email) {
        return email.contains("@");
    }

    boolean isFemale(String num) {
        return num.charAt(0) == '2' || num.charAt(0) == '4';
    }

    boolean isValidIdNumber(String num) {

        for (int i = 0; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    String toCameCase(String a) {

        String first = a.substring(0, a.indexOf('_'));
        String second = a.substring(a.indexOf('_') + 1);

        String second2 = second.substring(0, 1);
        String second3 = second.substring(1);
        return first.concat(second2.toUpperCase())
                .concat(second3);
    }

    String notCompleted(String[] participant, String[] completion) {
        participant[0] = "leo";
        participant[1] = "kiki";
        participant[2] = "eden";

        completion[0] = "eden";
        completion[1] = "kiki";
        String answer = "";
        HashMap<String, Integer> allCount = new HashMap<>();

        for (String name : participant) {
            allCount.put(name, allCount.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            allCount.put(name, allCount.get(name) - 1);
        }
        for (Map.Entry<String, Integer> entry : allCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > 0 ) {
                return key;
            }
        }

        return answer;
    }


}