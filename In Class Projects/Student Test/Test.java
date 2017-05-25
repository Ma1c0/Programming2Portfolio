
public class Test {
	public static void main(String[] args){
		Student student = new Student();
		System.out.println("What is your name");
		String name = student.getName();
		System.out.println("What score did you get " + name);
		float quiz = student.addQuiz();
		
		System.out.println("What score did you get on second quiz " + name);
		quiz = student.addQuiz();
		
		System.out.println("What score did you get on third quiz " + name);
		quiz = student.addQuiz();
		
		System.out.print("Your total score is ");
		float total = student.getTotalScore();
		System.out.println(total);
		
		System.out.print("Your average score is ");
		float average = student.getAverageScore();
		System.out.println(average);
		
	}
}

/*

*/