package study;
/*
caixa eletronico

pedir 100 reais, retornar uma nota de 100
1,2,5,10,20,50,100
150 - 100, 50 
*/
public class NotasDinheiroMelhorado {
    public static void main(String[] args) {
      NotasDinheiroMelhorado notasDinheiroMelhorado = new NotasDinheiroMelhorado();
      notasDinheiroMelhorado.retornaNotas(137);
    }

    public void retornaNotas(int quantidade){
      int[] notas = {100, 50, 20, 10, 5, 2, 1};
  
          for (int nota : notas) {
              int contador = quantidade / nota;
              quantidade -= contador * nota;
              System.out.println("Nota " + nota + ": " + contador);
          }
      
    }
}