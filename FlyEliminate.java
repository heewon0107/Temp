package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FlyEliminate  {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] counter = new int[123];
        for (int i = 0; i < line.length(); i++) {
            counter[line.charAt(i)]++;
        }
        char maxChar = '';
        int maxCount = 0;
        int maxIndex = 0;
        for (int i = 0; i < counter.length; i++) {
            // 최빈 값 == 맥스 인덱스 변경
            if (counter[i] > maxCount) {
                maxCount = counter[i];
                maxIndex = i;
            }
            // 동일 값이면 ?로 변경
            else if (counter[i] == maxCount && counter[i] > 0) {
                maxChar = '?';
            }
        }
        if (maxChar != '?') {
            maxChar = (char) maxIndex;
        }
        System.out.println(maxChar);


    }
}
