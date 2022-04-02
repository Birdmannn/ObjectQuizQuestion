
public class SubtractionQuestion implements IntQuestion {
	private int a, b;
	
	public SubtractionQuestion() {
		a = (int)(50*Math.random()) + 1;
		b = (int)(50*Math.random());	
	}
	
	public String getQuestion() {
		if (a >= b)
			return "What is " + a + " - " + b + "? ";
		else
			return "What is " + b + " - " + a + "? ";
	}
	 public int getCorrectAnswer() {
		 if (a >= b)
			 return a - b;
		 else
			 return b - a;
	 }

}
