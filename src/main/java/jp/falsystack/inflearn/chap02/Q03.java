package jp.falsystack.inflearn.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다. 가위, 바위,
 * 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 */
public class Q03 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    int[] aInfos = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] bInfos = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    for (int i = 0; i < count; i++) {
      if (aInfos[i] == bInfos[i]) {
        System.out.println("D");
        continue;
      }
      if (aInfos[i] == 1 && bInfos[i] == 3) {
        System.out.println("A");
        continue;
      }
      if (aInfos[i] == 2 && bInfos[i] == 1) {
        System.out.println("A");
        continue;
      }
      if (aInfos[i] == 3 && bInfos[i] == 2) {
        System.out.println("A");
        continue;
      }
      System.out.println("B");
    }

  }
}
