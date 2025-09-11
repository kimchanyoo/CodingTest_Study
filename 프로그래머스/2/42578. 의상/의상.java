import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 1) + 1);
        }

        for (String cloth : map.keySet()) {
            answer *= map.get(cloth);
        }

        return answer - 1;
    }
}