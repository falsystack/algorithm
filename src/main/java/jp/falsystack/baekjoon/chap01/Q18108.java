package jp.falsystack.baekjoon.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18108 {

  public static final int GAP = 543;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int buddistEra = Integer.parseInt(br.readLine());
    System.out.println(buddistEra - GAP);
  }

}
