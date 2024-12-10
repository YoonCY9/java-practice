package yooncy.java_practice;

import BankAccount1206.*;

import ClassPractice.book1.Author;
import moneyTest.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class Mytest {

//    @Test
//    void 생성테스트() {
//        BankAccount one = new BankAccount("111-1111-1111", new Money(0), "이효리");
//
//        Money money = new Money(1000);
//
//        Assertions.assertThat(one.accountNumber).isEqualTo("111-1111-1111");
//        Assertions.assertThat(one.balance).isEqualTo(new Money(0));
//        Assertions.assertThat(one.owner).isEqualTo("이효리");
//        one.deposit(money);
//        one.deposit(money);
//        one.deposit(money);
//        Assertions.assertThat(one.balance).isEqualTo(new Money(3000));
//
//    }

//    @Test
//    void name() {
//        assertThat(solution("()()")).isTrue();
//        assertThat(solution("(())()")).isTrue();
//        assertThat(solution(")()(")).isFalse();
//        assertThat(solution("(()(")).isFalse();
//        assertThat(solution("(())))")).isFalse();
//    }

//    boolean solution(String s) {
//
//        boolean answer = false;
//
//        if (s.startsWith(")")) {
//            return false;
//        }
//        if (s.endsWith("(")) {
//            return false;
//        }
//        if (s.length() % 2 != 0){
//            return false;
//        }
//
//        int left = 0;
//        int right = 0;
//
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='(') {
//                left++;
//            } else right++;
//        }
//
//        if (left != right) {
//            return false;
//        }
//
//        return true;
//    }

//    @Test
//    void stack() {
//        Stack<Integer> stack1 = new Stack<>();
//        for (int i = 1; i <= 3; i++) {
//            stack1.push(i);
//        }
//
//        // 가장 최근에 넣은 수가 3이 맞는지?
//
//        assertThat(stack1.peek()).isEqualTo(3);
//
//        // 가장 최근에 뺀 수 가 3이 맞는지?
//        assertThat(stack1.pop()).isEqualTo(3);
//
//        stack1.pop();
//        stack1.pop();
//
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 1; i <= 3; i++) {
//            queue.offer(i);
//        }
//
//        assertThat(queue.peek()).isEqualTo(1);
//        assertThat(queue.poll()).isEqualTo(1);
//        assertThat(queue.peek()).isEqualTo(2);
//    }

//    class Solution {
//        public String solution(String my_string, int n) {
//            String answer2 = "";
//            for (int i = 0; i < my_string.length(); i++) {
//                for (int j = 0; j < n; j++) {
//                    answer2 += my_string.charAt(i);
//                }
//            }
//            return answer2;
//        }
//    }
//
//    @Test
//    void 문자반복테스트() {
//        int n = 3;
//        String answer = "hello";
//        ArrayList<Character> answers = new ArrayList<>();
//        // h , e , l , l , o
//        for (int i = 0; i < answer.length(); i++) {
//            answers.add(answer.charAt(i));
//        }
//        String answer2 = "";
//        for (int i = 0; i < answers.size(); i++) {
//            for (int j = 0; j < n; j++) {
//                answer2 += String.valueOf(answers.get(i));
//            }
//        }
//        System.out.println(answer2);
//    }


    @Test
    void name() {
        Author author = new Author("yoon", "19980425");

    }
}

