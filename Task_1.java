package Home_Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_1 {

    public static void main(String[] args) {
        
        //1. Создать новы список, добавить несколько строк и вывести на экран

        List<String> lst = new ArrayList();

        lst.add("Это");
        lst.add("домашняя");
        lst.add("работа");
        lst.add("по");
        lst.add("спискам");

        System.out.println(lst);
        
        //2. Итерация всех элеменов списка и добавления к каждому символа !

        for (int i = 0; i < lst.size(); i++) {

            String a = lst.get(i);
            a = a + "!";
            lst.set(i, a);
            
        }
        
        System.out.println(lst);

        //3. Вставить элемент в список в первой позиции.
        
        lst.add(0,"Элемент");

        System.out.println(lst);

        //4. Извлечь элемент по индексу из списка

        String i = lst.get(1);

        System.out.println(i);

        //5. Обновить определенный элемент списка по заданному индексу.

        lst.set(4, "ПО");

        System.out.println(lst);

        //6. Удалить третий элемент из списка.

        lst.remove(3);

        System.out.println(lst);

        //7. Поиска элемента в списке по строке.

        int x = lst.indexOf("Это!");

        System.out.println(x);

       //8.Создать новый список и добавить в него несколько елементов первого списка.

       List <String> lst1 = new ArrayList();

       lst1.add(lst.get(0));
       lst1.add("Второй");
       lst1.add(lst.get(3));
       lst1.add("Список");

       System.out.println(lst1);

       //9. Удалить из первого списка все элементы отсутствующие во втором списке.

       lst.retainAll(lst1);

       System.out.println(lst);

       //10. Сортировка списка.

       Collections.sort(lst1);

       System.out.println(lst1);





    }
    
}
