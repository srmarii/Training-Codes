class Maior{
    public int theBigger(int[] num){
        int tam = num.length, maior = num[0];

        for(int i = 0; i<tam; i++){
            if(num[i] > maior){
                maior = num[i];
            }
        }

        return maior;
    }


     public static void main(String[] args) {
        Maior m = new Maior();

        int[] num = {0, 8, 7, 1, 4, 6, 2, 2, 9, 8};

        System.out.println(m.theBigger(num));
    
     }
}