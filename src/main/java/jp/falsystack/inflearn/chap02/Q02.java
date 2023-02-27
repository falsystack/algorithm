package jp.falsystack.inflearn.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 */
public class Q02 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int memberNumbers = Integer.parseInt(br.readLine());

    int result = 1;
    String[] lengths = br.readLine().split(" ");

    int pointer = Integer.parseInt(lengths[0]);

    for (int i = 1; i < memberNumbers; i++) {
      if (pointer < Integer.parseInt(lengths[i])) {
        pointer = Integer.parseInt(lengths[i]);
        result++;
      }
    }
    System.out.println(result);

  }
}
