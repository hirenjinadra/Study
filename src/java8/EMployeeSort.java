package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EMployeeSort {
    int empNo;
    String name;

    EMployeeSort(int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
    }

    public String toString() {
        return empNo+" : "+name;
    }
}

class Demo {
    public static void main(String[] args) {
        List<EMployeeSort> list = new ArrayList<>();

        list.add(new EMployeeSort(1,"Hiren"));
        list.add(new EMployeeSort(2,"Riddhi"));
        list.add(new EMployeeSort(3,"Pathik"));
        list.add(new EMployeeSort(4,"Adit"));

        System.out.println(list);

        // Sort based on descending order of Employee id
        Collections.sort(list, (e1,e2) -> (e1.empNo < e2.empNo)?1: (e1.empNo > e2.empNo)?-1 : 0);
        System.out.println(list);

        // Sort based on alphabetical order ef Emp name
        Collections.sort(list, (e1,e2) -> e1.name.compareTo(e2.name));
        System.out.println(list);
    }
}
