/*
caixa eletronico

pedir 100 reais, retornar uma nota de 100
1,2,5,10,20,50,100
150 - 100, 50 
*/

import study.NotasDinheiroMelhorado;

public class NotasDinheiro {
    public static void main(String[] args) {
      NotasDinheiroMelhorado bankNotes = new NotasDinheiroMelhorado();
      bankNotes.retornaNotas(137);
    }

    public void retornaNotas(int quantidade){
      int cont1=0, cont2=0, cont5=0, cont10=0, cont20=0, cont50=0, cont100=0;
      
      //250
      if(quantidade >= 100){
        cont100 = quantidade / 100;
        quantidade -= (cont100 * 100);
      } 
      //50
      if(quantidade >= 50){
        cont50 = quantidade / 50;
        quantidade -= (cont50 * 50);
      }
      if(quantidade >= 20){
        cont20 = quantidade / 20;
        quantidade -= (cont20 * 20);
      }
      if(quantidade >= 10){
        cont10 = quantidade / 10;
        quantidade -= (cont10 * 10);
      }
      if(quantidade >= 5){
        cont5 = quantidade / 5;
        quantidade -= (cont5 * 5);
      }
      if(quantidade >= 2){
        cont2 = quantidade / 2;
        quantidade -= (cont2 * 2);
      }
      if(quantidade >= 1){
        cont1 = quantidade / 1;
        quantidade -= (cont1 * 1);
      }

      System.out.println(cont100);
      System.out.println(cont50);
      System.out.println(cont20);
      System.out.println(cont10);
      System.out.println(cont5);
      System.out.println(cont2);
      System.out.println(cont1);
    }
}