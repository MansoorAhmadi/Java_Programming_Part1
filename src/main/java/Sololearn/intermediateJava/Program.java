package Sololearn.intermediateJava;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);




        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);

        int ageLimit = 25;

        for (Integer age : ages.values()) {
            System.out.println(age);
//            if(ageLimit > age && ageLimit == ages.values()) {
//                System.out.println();
//            }
        }


    }
}
