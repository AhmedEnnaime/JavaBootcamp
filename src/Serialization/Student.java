package Serialization;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String address;

    // Will not be serialized (which means it will not be forwarded to another app or a server)
    transient int x;


    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setX(int x){
        this.x = x;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public int getX(){
        return x;
    }

    @Override
    public String toString(){
        return ("Student name is " + this.getName() + ", age is " + this.getAge() + ", address is " + this.getAddress());
    }
}
