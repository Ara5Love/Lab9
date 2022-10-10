package giezz.entity;

import giezz.framework.annotation.Column;
import giezz.framework.annotation.Table;

@Table("dogs")
public class Dog {
    @Column
    private int id;
    @Column
    private String paroda;
    @Column
    private String color;
    @Column
    private int age;

    private String name;



    public Dog() {
    }

    public Dog(int id, String paroda, String color, int age, String name) {
        this.id = id;
        this.paroda = paroda;
        this.color = color;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParoda() {
        return paroda;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
