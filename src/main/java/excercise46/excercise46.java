/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brice Berwanger
 */
package excercise46;
import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {

        Scanner file=new Scanner(new File("exercise46_input.txt"));
        Map<String,Integer> hm=new TreeMap<String,Integer>();


        while(file.hasNext()) {
            String str=file.next();
            if(hm.containsKey(str))
                hm.put(str,hm.get(str)+1);
            else
                hm.put(str,1);
        }


        for(String key:hm.keySet()) {
            System.out.printf("%-10s",key+":");
            for(int i=hm.get(key);i>0;i--)
                System.out.print("*");
            System.out.println();
        }

    }
}