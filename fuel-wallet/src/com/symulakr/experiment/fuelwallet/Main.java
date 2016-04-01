package com.symulakr.experiment.fuelwallet;

import java.util.Scanner;

public class Main
{

   public static void main(String[] args)
   {
      Wallet wallet = new Wallet();
      Scanner scanner = new Scanner(System.in);

      while (true)
      {
         System.out.println("Enter value: ");
         float value = scanner.nextFloat();
         if (value > 0.0f)
         {
            System.out.println("Enter price: ");
            float price = scanner.nextFloat();
            System.out.println(wallet.add(value, price));
         }
         else if (value < 0.0f)
         {
            System.out.println(wallet.take(-value));
            System.out.println("Money: " + -value*wallet.check().getPrice());
         }
         else
         {
            System.out.println(wallet.check());
            break;
         }

      }

   }
}
