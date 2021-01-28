package numerosordenados;

public class NumerosOrdenadosMain {

	public static void main(String[] args) {
		NumerosOrdenados nums=new NumerosOrdenados(23, 45, 44);

		if(nums.EstanOrdenados()==true) {
			System.out.println("Los n�meros " + nums.getNum1() + ", " + nums.getNum2() + " y " + nums.getNum3() + " est�n ordenados");
		}
		else {
			System.out.println("Los n�meros " + nums.getNum1() + ", " + nums.getNum2() + " y " + nums.getNum3() + " no est�n ordenados");
		}
		
		if(nums.SonConsecutivos()==true) {
			System.out.println("Los n�meros " + nums.getNum1() + ", " + nums.getNum2() + " y " + nums.getNum3() + " son consecutivos");
		}
		else {
			System.out.println("Los n�meros " + nums.getNum1() + ", " + nums.getNum2() + " y " + nums.getNum3() + " no son consecutivos");
		}
	}

}
