package jp.falsystack.section01.q03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.StreamSupport;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 * Input
 * it is time to study
 *
 * Output
 * study
 */
public class Q03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = getInputString(br);
        br.close();

        String[] strings = StreamSupport.stream(Arrays.stream(inputString.split(" ")).spliterator(), false).toArray(String[]::new);

        var index = 0;
        var sum = 0;

        for (int i = 0; i < strings.length; i++) {
            String aWord = strings[i];
            if (aWord.length() > sum) {
                sum = aWord.length();
                index = i;
            }
        }
        System.out.println(strings[index]);
    }

    private static String getInputString(BufferedReader br) {
        try (br) {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
