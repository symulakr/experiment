package com.symulakr.experiment.fuelwallet;

public class Card
{

   private float value;
   private float price;

   public float getValue()
   {
      return value;
   }

   public void setValue(float value)
   {
      this.value = value;
   }

   public float getPrice()
   {
      return price;
   }

   public void setPrice(float price)
   {
      this.price = price;
   }

   @Override public String toString()
   {
      return "Card{" +
            "value=" + value +
            ", price=" + price +
            '}';
   }
}
