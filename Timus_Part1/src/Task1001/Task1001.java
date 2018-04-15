package Task1001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Katerina on 15.04.2018.
 */
public class Task1001 {
    public static void main(String[] args) {
        Scanner scIn = new Scanner(System.in);
        List<Double> list = new ArrayList<Double>();
        while (scIn.hasNext()){
            list.add(scIn.nextDouble());
        }

        for (int i = list.size() - 1; i >= 0; i--){
            System.out.println(String.format("%.4f",Math.sqrt(list.get(i))));
        }
    }
}
