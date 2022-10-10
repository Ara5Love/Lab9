package giezz;

import giezz.entity.Cat;
import giezz.entity.Dog;
import giezz.framework.Session;
import giezz.framework.TableBuilder;

public class Lab9Main {
    public static void main(String[] args) {
        TableBuilder.buildTable(Cat.class);
        Session.persist(new Cat(1, "Барсик", 10));
        TableBuilder.buildTable(Dog.class);
        Session.persist(new Dog(1, "Чихуа-Хуа", "Черный", 10, "Никита"));
    }
}