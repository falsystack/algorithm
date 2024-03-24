package jp.falsystack.section01.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

Input
StuDY

Output
sTUdy

*/
public class Q02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = getCharArray(br);
        br.close();

        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (Character.isLowerCase(aChar)) {
                sb.append(Character.toUpperCase(aChar));
                continue;
            }
            sb.append(Character.toLowerCase(aChar));
        }
        System.out.println(sb);
    }

    private static char[] getCharArray(BufferedReader br) {
        try (br) {
            return br.readLine().toCharArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
