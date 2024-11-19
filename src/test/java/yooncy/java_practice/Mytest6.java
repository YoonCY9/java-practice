package yooncy.java_practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Mytest6 {
    @Test
    void 절댓값test() {
        assertThat(abs(3)).isEqualTo(3);
        assertThat(abs(-3)).isEqualTo(3);
        assertThat(abs(0)).isEqualTo(0);
    }

    @Test
    void 빈문자열판단test() {
        assertThat(isEmpty("")).isTrue();
        assertThat(isEmpty("a")).isFalse();
        assertThat(isEmpty("    ")).isFalse();
    }
    @Test
    void 문자열이어붙이기(){
        assertThat(concat("hello","world").equals("helloworld"));

    }
    @Test
    void typeTest(){
        String a = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println(a.length()); // length(); 는 문자열이 몇개의 문자인지 알려주는 함수
    }
    @Test
    void isEmptyTest(){
        String a = "";
        String b = "b";
        System.out.println(a.isEmpty());
        System.out.println(b.isEmpty());
        assertThat(a.isEmpty()).isTrue();
        assertThat(b.isEmpty()).isFalse();  // isEmpty() 는 문자열이 빈문자열이면 true,아니면 false반환
    }
    @Test
    void 문자열같은지Test(){
        String a = "aaa";
        System.out.println(a.equals("aaa")); // equals()는 두 문자열이 같은문자열인지 확인하는 함수
    }
    @Test
    void charAt(){
        String a = "Hello";
        assertThat(a.charAt(0)).isEqualTo('H');
        // charAt() 는 해당 문자열 자릿수를 반환해주는 함수
    }
    @Test
    void 대소문자Test(){
        String a = "aaa";
        String b = "AAA";
        assertThat(a.toUpperCase()).isEqualTo("AAA");
        assertThat(b.toLowerCase()).isEqualTo("aaa");
        // toUpperCase(),toLowerCase() 는 대문자,소문자로 변환해주는 함수
    }
    @Test
    void containsTest(){
        String a = "Hello";
        assertThat(a.contains("e")).isTrue();
        // contains()는 문자열에 해당 문자가 들어있는지 확인하는 함수
    }
    @Test
    void withTest(){
        String a = "HelloJava";
        assertThat(a.startsWith("H")).isTrue();
        assertThat(a.endsWith("a")).isTrue();
        // startsWith()는 문자가 해당 문자열로 시작하는지 / endsWith()는 문자가 해당 문자열로 끝나는지
    }
    @Test
    void repeatTest(){
        String a = "Java";
        System.out.println(a.repeat(5));
        // repeat는 해당 문자를 지정 횟수만큼 반복해주는 함수
    }
    @Test
    void indexOfTest(){
        String a = "HelloWorld";
        System.out.println(a.indexOf("W"));
        System.out.println(a.indexOf("o",5));
        // indexOf()는 해당 문자열의 문자가 몇번째인지 찾아주는 함수, 몇번째 자리부터 찾을지 지정 가능
    }
    @Test
    void concatTest(){
        String a = "Java";
        String b = "Class";
        System.out.println(concat(a, b));
        assertThat(concat(a,b)).isEqualTo("JavaClass");
        // concat()은 문자열을 합쳐주는 함수
    }
    @Test
    void maxMin(){
        System.out.println(minMax(130));
        System.out.println(minMax(-100));
        System.out.println(minMax(50));
        System.out.println(minMax(70));
        assertThat(minMax(130)).isEqualTo(100);
        assertThat(minMax(-100)).isEqualTo(0);

    }

    @Test
    void subStringTest() {
        String url = "www.naver.com";
        System.out.println(url.substring(4, 9));
    }

    @Test
    void StringTest(){
        System.out.println("Hi".concat("ㅋ").concat("ㅋ").length());
    }

    int abs(int a) {
        if (a > 0) {
            return a;
        } else {
            return -(a);
        }
    }

    @Test
    void trimTest() {
        String a = "            a    ";
        assertThat(a.trim()).isEqualTo("a");
    }

    @Test
    void joinTest() {
        String[] abc = {"a","b","c"};
        System.out.println(String.join(",", abc));
        System.out.println(String.join("|", abc));
    }

    boolean isEmpty(String a) {
        if (a == ""){
            return true;
        }return false;
    }
    String concat(String a, String b){
        String c = a + b;
        return c;
    }

    int minMax(int score){
        return Math.max(Math.min(score, 100),0);
    }
}