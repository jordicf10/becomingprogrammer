package numerosordenados;

public class NumerosOrdenados {

	private int num1;
	private int num2;
	private int num3;
	
	public NumerosOrdenados(int num1, int num2, int num3) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1=num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2=num2;
	}
	
	public int getNum3() {
		return num3;
	}
	
	public void setNum3(int num3) {
		this.num3=num3;
	}
	
	public boolean EstanOrdenados() {
		boolean ordenados= false;
		if(num1<num2 && num1<num3 && num2<num3) {
			return ordenados=true;
		}
		else {
			return ordenados=false;
		}
	}
	
	public boolean SonConsecutivos() {
		boolean consecutivos=false;
		if(num2==num1+1 && num3==num2+1) {
			return consecutivos=true;
		}
		else {
			return consecutivos=false;
		}
	}
	
	
}
	
	
	

