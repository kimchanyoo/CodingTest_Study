package Lv1.Day32;

public class BundleOfCards {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
		int cardsNumber1 = 0;
		int cardsNumber2 = 0;

		for(int i = 0; i < goal.length; i++){
			if(cardsNumber1 < cards1.length && cardsNumber2 < cards2.length){
				if(goal[i].equals(cards1[cardsNumber1])){
					cardsNumber1++;
				}else if(goal[i].equals(cards2[cardsNumber2])){
					cardsNumber2++;
				}else{
					answer = "No";
					return answer;
				}
			}else if(cardsNumber1 < cards1.length){
				if(goal[i].equals(cards1[cardsNumber1])){
					cardsNumber1++;
				}else{
					answer = "No";
					return answer;
				}
			}else if(cardsNumber2 < cards2.length){
				if(goal[i].equals(cards2[cardsNumber2])){
					cardsNumber2++;
				}else{
					answer = "No";
					return answer;
				}
			}
		}

		return answer;
	}
}
