
public class AdditionQuestion implements IntQuestion {
	private int a, b;
	
	public AdditionQuestion() {
		a = (int)(50*Math.random())+1;
		b = (int)(50*Math.random());
	}
	
	public String getQuestion() {
		return "What is " + a + " + " + b + "? ";
	}
	
	public int getCorrectAnswer() {
		return a + b;
	}

}
