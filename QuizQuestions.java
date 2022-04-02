
import textio.TextIO;
public class QuizQuestions {
	private static IntQuestion[] quizQuestion = new IntQuestion [10];
	private static int[] answer = new int [10];
	private static int bigAnswer;
	private static IntQuestion bigQuestion = new IntQuestion() {
		public String getQuestion() {
			return "How old is Kate Winslet? ";
		}
		public int getCorrectAnswer() {
			return 46;
		}
	};
	
	public static void main(String[] args) {
		administerQuiz();
		gradeQuiz();
	}
	
	static void administerQuiz() {                        //I'm not sure if I should've used a nested for loop for each loop statement to
		for (int i = 0; i < 5; i++) {                     //randomize both addition and subtraction questions (I should be sure though), but it still 
			quizQuestion[i] = new AdditionQuestion();     //works this way.
		}
		
		for (int i = 5; i < 10; i++) {
			quizQuestion[i] = new SubtractionQuestion();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Question %2d. ", i + 1);
			System.out.print(quizQuestion[i].getQuestion());
			answer[i] = TextIO.getlnInt();
		}
		System.out.print("Question 11. " + bigQuestion.getQuestion());
		bigAnswer = TextIO.getlnInt();
		System.out.println();
	}
	
	static void gradeQuiz() {
		int points = 0;
		int count = 0;
		System.out.println("This is the result: ");
		
		for (int i = 0; i < 10; i++) {
			if (answer[i] == quizQuestion[i].getCorrectAnswer()) {
				System.out.printf("For Question %2d. You were correct.", i + 1);
				points += 10;	
				count++;
			}
			else {
				System.out.printf("For Question %2d. You were wrong! You said %2d. The correct answer is: %2d", i + 1, answer[i], quizQuestion[i].getCorrectAnswer());
			}
			System.out.println();
		}
		if (bigAnswer == 46) {
			System.out.println("For Question 11. You were very correct.");
			points += 10;
			count++;
		}
		else {
			System.out.printf("For Question 11. You were wrong. You said %2d. The correct answer is: %2d", bigAnswer, bigQuestion.getCorrectAnswer());
			System.out.println();
		}
		System.out.println();
		System.out.println("You got " + count + " questions correct.");
		System.out.println("Your total points is: " + points);
		
		if (points > 59)
			System.out.println("Congratulations. You passed.");
		else
			System.out.println("You failed.");
	}

}
