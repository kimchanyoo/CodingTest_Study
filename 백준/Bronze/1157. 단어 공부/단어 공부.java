import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. 패턴 후보: 고정
2. 핵심 조건: 대/소문자 구분 없음(대문자로 변환해서 동일 취급), 길이 <= 1000000, O(N)
3. 불변식/전이: counts[i] = 'A' + i 문자 등장 빈도, 최빈값 탐색 시 -> 최대 빈도 maxCnt 유지, 동률 발생시 tie 플래그 갱신
4. 자료구조: int[26] counts, char ans, boolean tie
5. 검증/점화
s = input.toUpperCase();
for(c in s) counts[c-'A']++;
maxCnt = -1, ans = '?'; tie = false
6. 복잡도/엣지
복잡도: O(N+26) ≈ O(N), 공간 O(1)
엣지: 단일 문자, 모든 문자가 동일, 최빈 동률('?' 출력)
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'A']++;
        }

        int maxCnt = -1;
        char ans = '?';
        boolean tie = false;

        for (int i = 0; i < 26; i++) {
            if (counts[i] > maxCnt) {
                maxCnt = counts[i];
                ans = (char) ('A' + i);
                tie = false;
            } else if (counts[i] == maxCnt) {
                tie = true;
            }
        }

        System.out.println(tie ? '?' : ans);
    }
}
