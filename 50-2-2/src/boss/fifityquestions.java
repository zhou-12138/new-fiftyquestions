package boss;

import java.util.Random;

 abstract class Fiftyquestions_2 {
	static final int UPPER = 100;
	static final int LOWER = 0;
	public String generatebinaryoperation (char anoperator) {
		int left,right,result;
		Random random = new Random();
		left = random.nextInt(UPPER+1);
		do {
			right = random.nextInt(UPPER+1);
			result = calculate(left,right);
		}while(!checkingcalculation(result));
		return push( left, right, anoperator);
	}
 
	abstract boolean checkingcalculation(int aninteger);
	abstract int calculate(int left, int right);
	abstract String push(int letf, int right ,char op);
 }
