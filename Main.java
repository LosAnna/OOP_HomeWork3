// Описать неизменяемый класс (Неизменяемость должна сохранятся при любых обстоятельствах)
//Проделать код ревью своих работ. Продумать, какие компоненты можно и нужно переписать.
//Исправлено: решение через HashMap
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat("Пушок", "Британец",
            Map.of("Ключ", "Значение"));

        Map<String, String> map = new HashMap<>();
        map.put("good key", "value");

        // Мы не можем изменять состояние объекта
        // через добавление элементов в полученную map
        System.out.println("Result after modifying the map after we get it from the object");
        myCat.getMyMap().put("bad key", "another value");
        myCat.getMyMap().keySet().forEach(System.out::println);

        System.out.println("Result of the object's map after modifying the initial map");
        map.put("bad key", "another value");
        myCat.getMyMap().keySet().forEach(System.out::println);

    }
}