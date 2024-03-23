package jp.falsystack.section01.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

Input
Computercooler
c

Output
2
*/
public class Q01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = getInputString(br);
        String target = getInputString(br);
        br.close();

        int result = countOccurrences(line, target);
        System.out.println(result);
    }

    public static String getInputString(BufferedReader br) {
        try {
            return br.readLine().toLowerCase();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int countOccurrences(String line, String target) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (Character.toString(c).equals(target)) {
                count++;
            }
        }
        return count;
    }
}
