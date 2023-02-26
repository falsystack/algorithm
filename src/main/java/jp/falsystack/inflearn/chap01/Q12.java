package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12 {

  public static final int WORD_LENGTH = 7;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int len = Integer.parseInt(br.readLine());
    String str = br.readLine();
    StringBuilder sb = new StringBuilder();

    int start = 0;
    int finish = WORD_LENGTH;
    for (int i = 0; i < len; i++) {
      String result = str.substring(start, finish).replace('#', '1').replace('*',
          '0');
      Character aChar = (char) Integer.parseInt(result, 2);
      sb.append(aChar);

      start += WORD_LENGTH;
      finish += WORD_LENGTH;
    }
    System.out.println(sb);
  }

}
