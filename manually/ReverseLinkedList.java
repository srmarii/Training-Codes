import java.util.Arrays;

public class ReverseLinkedList {
    public int[] reverseTheList(int list[]){
        int tam = list.length, newList[] = new int[tam], k=0;

        for(int i = tam -1; i >= 0; i--){
            newList[i] = list[k];
            k++;
        }

        return newList;
    }

    public static void main(String[] args) {
        ReverseLinkedList r = new ReverseLinkedList();
        int list[] = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(r.reverseTheList(list)));
    }
}
