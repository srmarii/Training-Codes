/*
Write a function that, given a page number and a page size, returns the first index that should be read from a list (or database)

- o page number é o numero da pagina que eu quero que retorne o primeiro indice da lista para aquele page size

O que isso significa na prática:

Imagina que você tem essa lista no banco:

índice 0  → usuário Ana
índice 1  → usuário Bruno
índice 2  → usuário Carlos
índice 3  → usuário Diana
índice 4  → usuário Eduardo
índice 5  → usuário Fernanda
índice 6  → usuário Gabriel
índice 7  → usuário Heitor
índice 8  → usuário Isabela
índice 9  → usuário João
índice 10 → usuário Karen
índice 11 → usuário Lucas
...

Com pageSize = 5:

Página 1 → começa no índice 0  → Ana, Bruno, Carlos, Diana, Eduardo
Página 2 → começa no índice 5  → Fernanda, Gabriel, Heitor, Isabela, João
Página 3 → começa no índice 10 → Karen, Lucas...

---
O que a função faz:

Ela recebe page e pageSize e te diz de qual índice começar a buscar.

firstIndex(1, 5) → 0   // página 1 começa no índice 0
firstIndex(2, 5) → 5   // página 2 começa no índice 5
firstIndex(3, 5) → 10  // página 3 começa no índice 10
*/
public class Pagination {
    public int firstIndex(int pageNumber, int pageSize) {
        //A página 1 começa no índice 0, não no 1 — por isso o -1
        // Cada página tem pageSize elementos, então você multiplica para saber onde a próxima começa
        return (pageNumber - 1) * pageSize;
    }

    public static void main(String[] args) {
        Pagination p = new Pagination();

        System.out.println(p.firstIndex(1, 10)); // 0
        System.out.println(p.firstIndex(2, 10)); // 10
        System.out.println(p.firstIndex(3, 10)); // 20
        System.out.println(p.firstIndex(2, 5));  // 5
    }
    
}
