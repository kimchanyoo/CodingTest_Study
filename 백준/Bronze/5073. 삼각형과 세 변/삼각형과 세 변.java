import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == b && b == c && a == 0){
                break;
            }

            int[] list = new int[3];
            list[0] = a;
            list[1] = b;
            list[2] = c;
            Arrays.sort(list);
            
            if(list[2] >= list[0] + list[1]) {
                sb.append("Invalid").append('\n');
                continue;
            }
            
            Set<Integer> set = new HashSet<>();
            set.add(a);
            set.add(b);
            set.add(c);

            if(set.size() == 1){
                sb.append("Equilateral");
            }else if(set.size() == 2){
                sb.append("Isosceles");
            }else{
                sb.append("Scalene");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
