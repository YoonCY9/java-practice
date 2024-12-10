package yooncy.java_practice.lottoPractice;

import lottoPractice.LottoCount;
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
}
