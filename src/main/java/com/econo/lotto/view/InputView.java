package com.econo.lotto.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String readExpenditure() throws IOException {
        System.out.println("구입금액을 입력해 주세요.");

        return bufferedReader.readLine();
}

}
