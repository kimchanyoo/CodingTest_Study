import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String[][] list = new String[n][2];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            list[i][0] = st.nextToken();
            list[i][1] = st.nextToken();
        }

        Arrays.sort(list, (o1, o2) -> {
           if(Integer.parseInt(o1[0]) > Integer.parseInt(o2[0])){
               return 1;
           }else if(Integer.parseInt(o1[0]) < Integer.parseInt(o2[0])){
               return -1;
           }
            return 0;
        });

        for(int i = 0; i < n; i++){
            System.out.print(list[i][0] + " " + list[i][1]);
            System.out.println();
        }
    }
}
