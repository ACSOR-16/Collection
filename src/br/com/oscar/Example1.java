package br.com.oscar;

import java.util.ArrayList;

public class Example1 {
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

        namesArray.remove(3);

        System.out.println(namesArray);

        namesArray.set(2, "altered name");

        System.out.println(namesArray);
        System.out.println(namesArray.size());
    }
}
