package lottoPractice;

import java.io.IOException;

public class LottoCount {

    private int amount;

    public LottoCount(int amount) {
        if (amount % 1000 != 0) {
            throw new IllegalArgumentException("1000의 배수만 입력해주세요.");
        }
        this.amount = amount;
    }

    public int count() {
        return this.amount / 1000;
    }
}
