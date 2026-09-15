package pagination;

import java.util.ArrayList;

/*
{0,1,2,3,4, - 1
5,6,7,8,9, - 2
10,11,12,13,14} - 3

(pageNumber - 1) * pageSize

Items from multiple pages
Given a list, return the items from pages 2 and 3 concatenated into a single list.
*/
public class ItemsFromMultiplePages {
    public ArrayList<Integer> returnItems(int list[], int pageNumber1, int pageNumber2){
        int pageSize = list.length / pageNumber2;
        int firstIndex = (pageNumber1 - 1) * pageSize;

        ArrayList<Integer> items = new ArrayList<>();

        for(int i = firstIndex; i<list.length; i++){
            items.add(list[i]);
        }

        return items;
    }

    public static void main(String[] args) {
        ItemsFromMultiplePages itemsFromMultiplePages = new ItemsFromMultiplePages();
        int list[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        //[5,6,7,8,9,10,11,12,13,14]
        System.out.println(itemsFromMultiplePages.returnItems(list, 2, 3));
    }
}
