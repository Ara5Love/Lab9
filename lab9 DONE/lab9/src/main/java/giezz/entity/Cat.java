package giezz.entity;

import giezz.framework.annotation.Column;
import giezz.framework.annotation.Table;

@Table("cats")
public class Cat {
    @Column(name = "id")
    private int id;
    @Column
    private String name;
    @Column
    private int age;

//    @Column
//    private Enum<Age> age;

    public Cat(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

//    public enum Age {
//        OLD, YOUNG
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
