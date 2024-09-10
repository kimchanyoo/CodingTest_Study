import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[3];

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        list[0] = a;
        list[1] = b;
        list[2] = c;
        Arrays.sort(list);

        if(list[2] >= list[0] + list[1]){
            int sum = list[0] + list[1];
            System.out.println(sum + sum - 1);
        }else{
            System.out.println(a + b + c);
        }
    }
}
