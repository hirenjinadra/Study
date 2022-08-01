package java8;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5);

        //Using normal for loop
        /*for(int i=0; i<values.size(); i++) {
            System.out.println(values.get(i));
        }*/

        //Using Enhanced for loop
        /*for(int i : values) {
            System.out.println(i);
        }*/

        //Using ForEach
        values.forEach(i -> System.out.println(i));  // This is Consumer interface
    }
}
