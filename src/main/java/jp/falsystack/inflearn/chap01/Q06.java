package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * indexOf를 이용한 중복문자 식별
 */
public class Q06 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (i == str.indexOf(str.charAt(i))) {

        sb.append(str.charAt(i));
      }
    }
    System.out.println(sb);


    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
    String str2 = br2.readLine();
    Set<String> set = new HashSet<>();
    for (int i = 0; i < str2.length(); i++) {
      set.add(String.valueOf(str.charAt(i)));
    }
    System.out.println(set);

  }

}
