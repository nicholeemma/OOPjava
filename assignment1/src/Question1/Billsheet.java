/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *  Write a program that inputs the name, quantity, 
 * and price of three items. The name  may contain spaces. 
 * Output a bill with a tax rate of 5.25%. 
 * All prices should be output to two decimal  places. 
 * The bill should be formatted in columns with 30 characters for the name, 
 * 10 characters for  the quantity, 10 characters for the price, 
 * and 10 characters for the total. Sample input and output is  shown..
 *
 * @author 汪无证 parameter array names store items' names array quantity store
 * items' quantity perspectively array price store each item's price array total
 * store items' price perspectively subtotal store all iterms' price
 */
public class Billsheet {

    /**
     * parameter array names store items' names array quantity store items'
     * quantity perspectively array price store each item's price array total
     * store items' price perspectively subtotal store all iterms' price
     *
     * @param args
     */
    public static void main(String[] args) {   //initiate variables
        String[] names = new String[3];
        int[] quantity = new int[3];
        float[] price = new float[3];
        float[] total = new float[3];
        float subtotal = 0;
        // Flag to judgment all input is correct format
        boolean Flag = true;
        //read items' names,prices,..
        for (int i = 0; i <= 2; i++) {
            //set j as a variable to display item's serial number
            int j = i + 1;
            System.out.println("Input name of item" + j);
            Scanner name = new Scanner(System.in);//how to close "name"
            //judge input is String
            if (name.hasNextLine() == true) {
                names[i] = name.nextLine();
                System.out.println("Input quantity of item" + j);
                Scanner q = new Scanner(System.in);
                //judge input is Int
                if (q.hasNextInt() == true) {
                    quantity[i] = q.nextInt();
                    System.out.println("Input price of item" + j);
                    Scanner p = new Scanner(System.in);
                    //judge input is float
                    if (p.hasNextFloat() == true) {
                        price[i] = p.nextFloat();
                        //calculate each item's cost
                        total[i] = price[i] * quantity[i];
                        //calculate the total cost
                        subtotal = subtotal + total[i];
                    } else {
                        System.out.println("you should print float");
                        Flag = false;
                        break;

                    }
                } else {
                    System.out.println("you should print int");
                    Flag = false;
                    break;
                }
            } else {
                System.out.println("you should print string");
                Flag = false;
                break;
            }
        }
        //all input is correct format then
        if (Flag == true) {
            //initialize taxRate
             // cast to float
            float taxRate = (float) 0.0625;
            float tax = subtotal * taxRate;
            float Total = tax + subtotal;
            // print out the outcome
            System.out.printf("%-30s%-10s%-10s%-10s", "Item", "Quantity", "Price", "Total");
            System.out.println();
            for (int i = 0; i <= 2; i++) {
                System.out.printf("%-30s%-10d%-10.2f%-10.2f", names[i], quantity[i], price[i], total[i]);
                // .2 control the decimal
                System.out.println();
            }
            System.out.printf("%-50s%-10.2f", "Subtotal", subtotal);
            System.out.println();
            // use getPercentInstance to get a format for displaying percentages
            NumberFormat tr = NumberFormat.getPercentInstance();
            // control the decimal
            tr.setMinimumFractionDigits(2);
            System.out.printf("%-50s%-10.2f", tr.format(taxRate) + "sales tax", tax);
            System.out.println();
            System.out.printf("%-50s%-10.2f", "Total", Total);
        }
    }
}
