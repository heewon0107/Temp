package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FlyEliminate  {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 1; i <= testCase; i++) {
            int N,range;
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            range = Integer.parseInt(st.nextToken());
            String[][] flyArray = new String[N][N];
            for (int j = 0; j < N; j++) {
                String line = br.readLine();
                flyArray[j] = line.split(" ");
            }
            

        }

    }
}
