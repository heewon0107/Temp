import java.util.*;
import java.io.*;

public class RoofTopGarden {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result = 0;
        LinkedList<Integer> highTop = new LinkedList<>();
        // 높이 값 받으면서 바로 비교해주기
        for (int i = 0; i < N; i++) {
            // curHeight = 현재 옥상 높이
            int curHeight = Integer.parseInt(br.readLine());
            if (curHeight == 1) { // 1이면 비교할 수 없다.
                continue;
            }
            if (highTop.isEmpty()) { // 비교대상이 없다.
                highTop.add(curHeight);
                continue;
            } else {
                // 비교대상들 순회
                int len = highTop.size();
                int minusIdx = 0;
                for (int heightIdx = 0; heightIdx < len; heightIdx++) {
                    // 현재 옥상을 못 보는 대상들
                    // heightIdx = highTop 순회 idx, minusIdx = remove 했을 때 줄어든 만큼 뒤로
                    if (highTop.get(heightIdx-minusIdx) <= curHeight) {
                        highTop.remove(heightIdx-minusIdx);
                        minusIdx++;
                    }
                }
                result += highTop.size(); // 옥상 관찰 가능 횟수 추가
                highTop.add(curHeight);
            }

        }
        System.out.println(result);

    }
}
