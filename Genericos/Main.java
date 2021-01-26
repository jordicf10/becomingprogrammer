package Genericos;

public class Main {
    public static void main(String[]args){

        Caja<String> caja= new Caja<>();
        caja.setObjeto("Cuadro");
        System.out.println(caja.toString());
    }


    private static <X> void printData(X data){
        System.out.println(data);
    }
}
