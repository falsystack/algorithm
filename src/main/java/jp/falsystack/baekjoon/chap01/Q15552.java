package jp.falsystack.baekjoon.chap01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    for (int i = 0; i < count; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int numA = Integer.parseInt(st.nextToken());
      int numB = Integer.parseInt(st.nextToken());
      bw.write(numA + numB + "\n");
    }
    bw.flush();
  }

}
