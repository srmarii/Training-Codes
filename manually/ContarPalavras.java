public class ContarPalavras {
    public int contaPalavras(String frase){
        int tam = frase.length(), cont=1;

        if(frase.isEmpty()){
            cont=0;
        } else{
            for(int i = 0; i<tam-1; i++){
                if(frase.charAt(i) == ' '){
                    cont++;
                }
            }
        }

        return cont;
    }

    public static void main(String[] args) {
        ContarPalavras cp = new ContarPalavras();
        String frase = "Oi meu nome é mariana  ";

        System.out.println(cp.contaPalavras(frase));
    }
}
