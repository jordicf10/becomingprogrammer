package useArrayList;

import java.util.ArrayList;

public class CochesArrayList {

    public static void main(String[]args){

        ArrayList<String>cars=new ArrayList<String>();
        cars.add("Peugeot");
        cars.add("Volskwagen");
        cars.add("Seat");
        cars.add("Renault");

        for(int x=0;x<cars.size();x++){
            System.out.println(cars.indexOf(cars.get(x)) + " " + cars.get(x).toUpperCase());

        }
    }
}
