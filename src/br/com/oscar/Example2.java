package br.com.oscar;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        String variableOne = "Adhara";
        String variableTwo = "Oscar";
        String variableThree = "Daniela";
        String variableFour = "Liz";

        ArrayList<String> namesArray = new ArrayList<>();
        namesArray.add(variableTwo);
        namesArray.add(variableOne);
        namesArray.add(variableFour);
        namesArray.add(variableThree);

        System.out.println(namesArray);

//        for (int i = 0; i < namesArray.size(); i++) {
//              System.out.println(namesArray.get(i));
//        }

//        for (String classEach: namesArray ) {
//            System.out.println(classEach);
//        }

        namesArray.forEach(itera -> {
            System.out.println(itera);
        });
    }
}
