package lottoPractice;

import java.util.Scanner;

public class LottoMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("구입금액을 입력해 주세요.");
        LottoCount count = new LottoCount(scanner.nextInt());
        System.out.println(count.count() + "개를 구매했습니다.");


        for (int i = 0; i < count.count(); i++) {
            LottoNumber randomNumber = new LottoNumber();
            System.out.println(randomNumber.getNumList());
        }



    }
}
