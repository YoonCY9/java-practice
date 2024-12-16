package lottoPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumber {

        private List<Integer> numList;

    public LottoNumber() {
        randomNumber();
    }

    private void randomNumber() {
            numList = new ArrayList<>();
            for (int i = 1; i <= 45; i++) {
                numList.add(i);
            }
            Collections.shuffle(numList);
            numList = numList.subList(0,6);
    }

    // 로또번호 출력용 함수
    public List<Integer> getNumList() {
        return numList;
    }
}
