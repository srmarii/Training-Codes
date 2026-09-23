public class PalindromoInt {
    public Boolean isPalindromo(int num){
        int aux = num, newNum = 0;

        while(aux > 0){
            newNum = (newNum * 10) + (aux % 10);
            aux = aux / 10;
        }

        return newNum == num;
    }

    public static void main(String[] args) {
        PalindromoInt p = new PalindromoInt();

        int num = 123;

        System.out.println(p.isPalindromo(num));
    }
}
