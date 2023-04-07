package EstruturaSequencial_Exercicio_12;
import java.util.Scanner; 

public class PesoIdeal {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Me diga sua altura:");
        double answerOneInput;
        try {
		   answerOneInput = userInput.nextDouble();
        } catch (Exception e){
            answerOneInput = Double.parseDouble(userInput.next());
        }
		System.out.println(((int)(72.7*answerOneInput) - 58)+"kg");
		userInput.close();
		System.exit(0);
	}	
}
