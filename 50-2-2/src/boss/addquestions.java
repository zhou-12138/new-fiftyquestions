package boss;

class addquestions extends Fiftyquestions_2{
	addquestions(){
		generatebinaryoperation('+');
	}
	public boolean checkingcalcultion(int aninteger) {
		return aninteger <= UPPER;
	}
	int calculate (int left,int right) {
		return left+right;
	}
	String push(int left, int right, char op) {
		return left+""+"+"+right;
	}
	@Override
	boolean checkingcalculation(int aninteger) {
		// TODO 自动生成的方法存根
		return aninteger>100;
	}
}