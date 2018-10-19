/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;

/**
 * program prints the number of milliseconds the user took to type the sentence. 
 *  check to see if the user typed the sentence correctly, 
 * and print a message if the user input 
 * is incorrect. Correct case is important (use the String class). 
 *
 * record current time when typing first enter, record time when second enter
 * result should be the discrepency of the two time
 *
 * parameter skt is actually the first enter should be "" skt2 is the sentence
 * which should be typed
 *
 * @author 汪无证
 */
public class TypeFast {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(
                "Your job is to type the sentence \"I type very quickly\" as fast as you can.\n When you are ready, press enter, type the sentence, and press enter again.\nNow press enter...");
        Scanner str = new Scanner(System.in);
        String skt = str.nextLine();
        //check whether string equals sth use .equal this method 
        if (skt.equals("")) {
            Long time2 = System.currentTimeMillis();
            String skt2 = str.nextLine();
            if (skt2.equals("I type very quickly")) {
                Long time = System.currentTimeMillis();
                System.out.println(time - time2);
            } else {
                System.out.println("you typed the wrong sentences");
            }
        } else {
            System.out.println("you should enter enter");
        }

    }
}
