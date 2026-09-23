public class Fatorial {
    public int fatora(int x){
        int numFatorado = 1;

        for(int i=x; i>1; i--){
            numFatorado = numFatorado * i;
        }

        return numFatorado;
    }

    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        int x = 5;

        System.out.println(f.fatora(x));
    }
}
