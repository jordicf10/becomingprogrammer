package precedenciaOperadoresCurso;

public class precedenciaOperadoresCurso {

	public static void main(String[] args) {
		System.out.println("Primer Ejemplo Procedencia Operadores");
        int x = 5;
        int y = 10;
        int z = ++x * y--;  // 6 * 10 = 60
        

        System.out.println("x = " + x);  //6
        System.out.println("y = " + y);  //9
        System.out.println("z = " + z);  //7 * 9= 63

        System.out.println("Ejemplo Evaluacion");
        System.out.println(4 + 5 * 6 / 3);   //14
        System.out.println((4 + 5) * (6 / 3));  //27

        System.out.println("Otro Ejemplo Evaluacion");
        System.out.println(1 + 2 - 3 * 4 / 5);  //1
        System.out.println(1 + 2 - (3 * (4 / 5)));    //3

        System.out.println("\nOtro ejemplo");
        //Si detecta una cadena, lo demas lo convierte en cadana
        System.out.println("1 + 2 = " + 1 + 2);  //12
        //Los parentesis rompen esta regla, ya que tiene la mayor prioridad
        System.out.println("(1 + 2) = " + (1 + 2));  //3

        System.out.println("\nOtro ejemplo");
        //El operador + es asociativo a la izquierda
        System.out.println(1 + 2 + "abc");//Detecta una operacion primero  //12abc
        System.out.println("abc" + 1 + 2);//Detecta una cadena primero    //abc12


	}

}
