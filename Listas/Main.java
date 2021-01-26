package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[]args){
        System.out.println("Arraylist");
        ArrayList<Integer> numeros= new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);
        //numeros.add(0,9); //para añadir en el índice que seleccionemos el valor que queramos
        System.out.println("La lista tiene un tamaño de: " + numeros.size());
        // numeros.add(10,10); Daría error porque le estamos que inserte en una posición superior al tamaño de la lista
        numeros.add(0,0); //Con esto insertamos un valor cero a la primera posición
        numeros.set(2,10);  //Con .set modificamos el valor en la posición indicada
        numeros.remove(2);  //Para eliminar una posición determinada
        /* int largo= numeros.size();
       for(int i=0;i<largo;i++){
            System.out.println(numeros.get(i));

        }
        */

        //EL Iterator tiene que ser del miso tipo que el arraylist. En este caso, de Integer.
       Iterator<Integer> iterator= numeros.iterator();
       while(iterator.hasNext()){   //Mientras iterator tenga un valor siguiente, hasNext
           System.out.println(iterator.next());   //Con next devolvemos el último elemento
       }

        System.out.println("LinkedList");
       LinkedList<Integer> lnumero= new LinkedList<>();
       lnumero.add(2);
       lnumero.addLast(3);
       lnumero.addFirst(1);
       lnumero.addFirst(5);
       lnumero.add(3,5);
        System.out.println("Bucle for");
       for(int i=0;i<lnumero.size();i++){
           System.out.println(lnumero.get(i));
       }
        System.out.println("Iterator");
       Iterator iteratorLinkedList = lnumero.iterator();
       while(iteratorLinkedList.hasNext()){
           System.out.println(iteratorLinkedList.next());
       }

       //SI TENEMOS QUE AÑADIR VALORES ENTRE MEDIO DE UNA LISTA, ES MEJOR USAR LINKEDLIST CON ITERATOR QUE NO ARRAYLIST
    }
}
