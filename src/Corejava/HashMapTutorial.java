package Corejava;

import java.util.HashMap;

public class HashMapTutorial {

    int id;
    String name;
    Double salary;

    HashMapTutorial(int id, String name, Double salary){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();

        HashMapTutorial obj1 = new HashMapTutorial(10, "Hiren", 100.00);
        HashMapTutorial obj2 = new HashMapTutorial(10, "Hiren", 100.00);

        map.put(obj1, 10);
        map.put(obj2, 20);
        map.put(obj1, 30);

        System.out.println(map);
        System.out.println("Map size is : "+map.size());

        System.out.println(obj1.equals(obj2));
    }
}
