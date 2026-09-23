class ParOuImpar{
    public String isImparOrPar(int x){
        String par = "Par", impar = "Impar";

        if(x % 2 == 0){
            return par;
        } else{
            return impar;
        }
    }

    public static void main(String[] args) {
        ParOuImpar m = new ParOuImpar();
        System.out.println(m.isImparOrPar(10));
     }
}