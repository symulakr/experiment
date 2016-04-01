package com.symulakr.experiment.core;

import java.util.function.Function;

public class ReverseSentence {

   private static final String EXAMPLE = "private static final String EXAMPLE";

   public static void main(String[] args){
      ReverseSentence reverseSentence = new ReverseSentence();
      System.out.println(EXAMPLE);
      System.out.println(reverseSentence.reverse(EXAMPLE));
   }

   private String[] split(String sentence, String regex){
      return sentence.split(regex);
   }

   private static class Reverter implements Function<StringBuilder, StringBuilder> {
      @Override
      public StringBuilder apply(StringBuilder stringBuilder){
         return stringBuilder.reverse();
      }
   }

   private String reverse(String str){
      final String spl = " ";
      String[] ss = str.split(spl);
      String sep = "";
      StringBuilder result = new StringBuilder();
      for (String s : ss) {
         result.append(sep).append(new StringBuffer(s).reverse());
         sep = spl;
      }
      return result.toString();
   }

}
