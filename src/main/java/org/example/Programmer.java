package org.example;

public class Programmer {
    private int age;
    private Laptop laptop;
    public void comp(){
        laptop.runCode();
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public Programmer() {

    }
}
