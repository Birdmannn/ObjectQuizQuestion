
import textio.TextIO;
public class TestAdditionQuiz {
	private static AdditionQuestion[] additionQuestion = new AdditionQuestion[10];
	private static int[] answer = new int [10];
	
	public static void main(String[] args) {
		administerQuiz();
		gradeQuiz();
		
		
	}
	
	
	static void administerQuiz() {
		for (int i = 0; i < 10; i++) {
			additionQuestion[i] = new AdditionQuestion();
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("Question %2d. ", i + 1);
			System.out.print(additionQuestion[i].getQuestion());
			answer[i] = TextIO.getlnInt();
		}
		System.out.println();
	}
	
	static void gradeQuiz() {
		int points = 0;
		int count = 0;
		System.out.println("This is the result: ");
		
		for (int i = 0; i < 10; i++) {
			if (answer[i] == additionQuestion[i].getCorrectAnswer()) {
				System.out.printf("For Question %2d. You were correct.", i + 1);
				points += 10;	
				count++;
			}
			else {
				System.out.printf("For Question %2d. You were wrong! You said %2d. The correct answer is: %2d", i + 1, answer[i], additionQuestion[i].getCorrectAnswer());
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("You got " + count + " questions correct.");
		System.out.println("Your total points is: " + points);
		
		if (points > 49)
			System.out.println("Congratulations. You passed.");
		else
			System.out.println("You failed.");
	}

}
