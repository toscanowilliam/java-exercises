package org.launchcode.java.studios;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class count_chars {
    public static void main(String[] args)
    {
        HashMap<Character, Integer> charactersInString = new HashMap<>();
        String myString = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        myString = in.nextLine();


        for (Character c : myString.toCharArray()) { //for each character in myString thats passed into a char array
            if (charactersInString.containsKey(c)) { //if c is included in the hasmap

                charactersInString.put(c, charactersInString.get(c) + 1); // raise the value of key by 1
            }
            else // goes directly to else unless letter already mentioned
            {
                charactersInString.put(c, 1); // starts the key value at 1
            }

        }
            System.out.println(charactersInString); //prints all keys with their values
    }
}
