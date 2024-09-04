import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] basket;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        basket = new int[n];
        for(int i = 0; i < n; i++){
            basket[i] = i + 1;
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            swap(start - 1, end - 1);
            for(int j = 1; j <= (end - start) / 2; j++){
                swap(start + j - 1, end - j - 1);
            }
        }

        for(int i = 0; i < n; i++){
            sb.append(basket[i] + " ");
        }
        System.out.println(sb);
    }
    public static void swap(int a, int b){
        int temp = basket[a];
        basket[a] = basket[b];
        basket[b] = temp;
    }
}
