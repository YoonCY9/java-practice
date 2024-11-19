package yooncy.java_practice;

import org.junit.jupiter.api.Test;

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

        System.out.println(specialchars("!@#$%^&*()"));
        System.out.println(specialchars("!@&*()"));
        System.out.println(specialchars("!@&*3333333333()"));


    }

    boolean specialchars(String a){

        if (a.length() <= 8){
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            Character.toUpperCase(a.charAt(i));
        }
        return true;
    }





    String extractDomain(String a){
        String httpDelete = a.substring(8);
        return httpDelete.substring(0,httpDelete.indexOf('/'));
    }

    boolean isValidPhoneNumber(String a){

        if (a.length() == 11 && a.startsWith("010") && isValidIdNumber(a)){
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

        String first = a.substring(0,a.indexOf('_'));
        String second = a.substring(a.indexOf('_')+1);

        String second2 = second.substring(0,1);
        String second3 = second.substring(1);
        return first.concat(second2.toUpperCase())
                .concat(second3);
    }
}