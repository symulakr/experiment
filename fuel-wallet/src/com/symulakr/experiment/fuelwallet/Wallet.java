package com.symulakr.experiment.fuelwallet;

public class Wallet
{

   private Card card;

   public Wallet()
   {
      this.card = new Card();
   }

   public Card add(float value, float price)
   {
      updateAveragePrice(value, price);
      card.setValue(card.getValue() + value);
      return card;
   }

   public Card take(float value)
   {
      card.setValue(Math.max(0.0f, card.getValue() - value));
      return card;
   }

   public Card check()
   {
      return card;
   }

   private void updateAveragePrice(float value, float price)
   {
      card.setPrice((card.getValue() * card.getPrice() + value * price) / (value + card.getValue()));
   }
}
