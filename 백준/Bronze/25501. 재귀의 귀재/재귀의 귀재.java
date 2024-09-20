import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            char[] s = br.readLine().toCharArray();
            sb.append(isPalindrome(s)).append(" ").append(count).append('\n');
        }

        System.out.println(sb);
    }
    public static int recursive(char[] s, int l, int r){
        count++;
        if(l >= r){
            return 1;
        }else if(s[l] != s[r]){
            return 0;
        }else{
            return recursive(s, l + 1, r - 1);
        }
    }
    public static int isPalindrome(char[] s){
        count = 0;
        return recursive(s, 0, s.length - 1);
    }
}
