package p2;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); /* первый вариант создания   ArrayList,
        переменная names может ссылаться только на объект ArrayList
       List<String> names2 = new ArrayList<>(); // второй вариант предпочтителен_ создаем ссылку на интерфейс Лист, в () можно задать параметры конструктора*/
        List<String> names2 = new ArrayList<>(Arrays.asList("Alex", "Ivan"));  // можно добавить элементы при создании сразу
// можно использовать специальный метод для указания параметров
        names.ensureCapacity(100);

        // можно добавить в коллекцию большое количество элементов, просто их перечисляя  с помощью метода addAll
        Collections.addAll(names, " Sasha", "Katya", "Elena");

        // как добавить элементы:
        names.add("Alex");  // для добавления элементов метод add
        names.add("Masha");
        names.add("Igor");
        //можно указать индекс, в который мы добавим элемент:
        names.add(1, "Tanya");
        // Что бы посмотреть элементы: с помощью цикла
        for (String name : names) {
            System.out.println(name);
        }
        // получить объект по его индексу(индексация с 0 ) с помощью get
        System.out.println(names.get(3));

        names.set(3, "Vlad");  // заменить
        System.out.println(names.size()); // размер нашей коллекции

        // содержится ли какое то значение в нашей коллекции с помощью contains:
        if (names.contains("Masha")){
        System.out.println("Yes");
         }else {
            System.out.println("No");
        }
        // для удаления из коллекции метод remove по индексу или имени
        names.remove("Masha");
        names.remove(0);
        // что осталось в коллекции после удаления. пройти по всем элементам
        for (String name: names){
            System.out.println(name);
        }
        // объекты можно трансформировать в массив Object  и с помощью for их распечатать
        Object[] nameArray = names.toArray();
        for (Object name: nameArray)
        {
            System.out.println(name);
        }

        // либо распечатать наш массив
        System.out.println(nameArray); // выпадет ошибка [Ljava.lang.Object;@3feba861
        // System.out.println((String[]) nameArray); //опять ошибка .ClassCastException потому что Object


    }

}
