import java.util.Scanner;
public class Student {
	Scanner scanner = new Scanner(System.in);
	float totalScore = 0;
	float numQuiz = 0;
	
	public String getName(){
		String name = scanner.next();
		return name;
	}
	
	public float addQuiz(){
		float score = scanner.nextFloat();
		totalScore = totalScore + score;
		numQuiz = numQuiz + 1;
		return score;
	}
	public float getTotalScore(){
		return totalScore;
	}
	
	public float getAverageScore(){
		float averageScore = totalScore/numQuiz;
		return averageScore;
	}
}
