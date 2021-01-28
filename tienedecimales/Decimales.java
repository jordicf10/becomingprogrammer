package tienedecimales;

public class Decimales {

	private double num;
	
	public Decimales(double num) {
		this.num=num;
	}
	
	public double getNum() {
		return num;
	}
	
	public void setNum(double num) {
		this.num=num;
	}
	
	public boolean TieneDecimales() {
		boolean decimales=false;
		if(num==Math.round(num)) {
			return decimales=false;
		}
		else {
			return decimales=true;
		}
	}
}
