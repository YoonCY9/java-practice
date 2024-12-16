package yooncy.java_practice.lottoPractice;

import lottoPractice.LottoCount;
import lottoPractice.LottoNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import java.util.*;


import static org.assertj.core.api.Assertions.assertThat;

public class LottoPracticeTest {

    @Test
    void name() {

        LottoCount a = new LottoCount(10000);
        assertThat(a.count()).isEqualTo(10);

    }

    @Test
    void 랜덤넘버테스트() {
        LottoNumber lottoNumber = new LottoNumber();
        System.out.println(lottoNumber.getNumList());
    }
}
