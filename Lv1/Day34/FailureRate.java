package Lv1.Day34;

import java.util.*;

public class FailureRate {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] stages = new int[order.size()];
		for(int i = 0; i < stages.length; i++){
			stages[i] = order.get(i);
		}

		int[] result = solution(n, stages);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int N, int[] stages) {
		// 런타임 에러남 -> 정렬하는 과정에서 생기는 것으로 보임
		Arrays.sort(stages);
		int length = stages.length;
		HashMap<Integer, String> failureRate = new HashMap<>();
		int[] result = new int[N];
		int[] answer = new int[N];
		List<Integer> list = Arrays.stream(stages)
				.boxed()
				.toList();

		for(int i = 0; i < N; i++){
			int cnt = Collections.frequency(list, i + 1);
			failureRate.put(i + 1, String.valueOf((float) cnt / length));
			length -= cnt;
		}

		List<Integer> keySet = new ArrayList<>(failureRate.keySet());
		// hashmap을 value기준으로 내림차순 정렬
		keySet.sort(((o1, o2) -> failureRate.get(o2).compareTo(failureRate.get(o1))));

		for(int i = 0; i < N; i++){
			result[i] = keySet.get(i);
		}

		return result;
		/*
		아래 다른 사람이 푼 방식으로 풀면 이런 방식( 39 ~ 47번 라인을 다음과 같이 수정 )
		List<Map.Entry<Integer, String>> list_entries = new ArrayList<Map.Entry<Integer, String>>(failureRate.entrySet());

		Collections.sort(list_entries, new Comparator<Map.Entry<Integer, String>>() {

			public int compare(Map.Entry<Integer, String> obj1, Map.Entry<Integer, String> obj2) {

				return obj2.getValue().compareTo(obj1.getValue());
			}
		});

		int c=0;
		for(Map.Entry<Integer, String> entry : list_entries) {
			answer[c]=entry.getKey(); c++;
		}
		return answer;
		 */
	}
	/*
	다른 사람 풀이
        int[] answer = new int[N];
        int noclear=0;
        int player=stages.length;
        Map<Integer, Double> stagefail = new HashMap<Integer, Double>();

        for(int i=1; i<=N;i++){
            for(int s : stages){
                if(s==i) noclear++;
            }
            if(player==0) stagefail.put(i,0.0);
            else{
                stagefail.put(i,(double)noclear/player);
                player -= noclear;
                noclear=0;
            }
        }

        List<Map.Entry<Integer, Double>> list_entries = new ArrayList<Map.Entry<Integer, Double>>(stagefail.entrySet());

        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Double>>() {

            public int compare(Map.Entry<Integer, Double> obj1, Map.Entry<Integer, Double> obj2) {

                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        int c=0;
        for(Map.Entry<Integer, Double> entry : list_entries) {
            answer[c]=entry.getKey(); c++;
        }
        return answer;
	 */
}
