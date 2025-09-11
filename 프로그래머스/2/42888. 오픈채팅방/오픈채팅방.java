import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String[]> log = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");

            if (!info[0].equals("Leave")) {
                map.put(info[1], info[2]);
            }

            if (!info[0].equals("Change")) {
                log.add(new String[]{info[0], info[1]});
            }
        }

        String[] answer = new String[log.size()];
        for (int i = 0; i < log.size(); i++) {
            String cmd = log.get(i)[0];
            String uid = log.get(i)[1];
            String nick = map.get(uid);

            answer[i] = "Enter".equals(cmd)
                    ? nick + "님이 들어왔습니다."
                    : nick + "님이 나갔습니다.";
        }
        return answer;
    }
}