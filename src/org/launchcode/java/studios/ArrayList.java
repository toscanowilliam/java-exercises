package org.launchcode.java.studios;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class ArrayList {
    public static void main(String[] args)
    {
        int numbers[] =  {5,6,4,2,6,7,12,15,10,8};
        int sum = 0;
        for(int i : numbers) {
            if((i%2)==0){
                sum = i + sum;
            }
            else{
                continue;
            }
        }
        System.out.print(sum);
    }
}
