package org.linus;

public class Dev {
    private int age;
    private Computer com;
    public Dev(){
        System.out.println("constructor");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
//    public void setDesktop(Computer lap1) {
//        this.lap1 = lap1;
//    }

    //    public Dev(laptop desktop){
//        this.desktop = desktop;
//        System.out.println("this is laptop constructor");
//    }
//    public Dev(int age){
//        this.age = age;
//        System.out.println("this is age constructor");
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
//
//    public void setLaptop(org.linus.laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){
        System.out.println("working on spring");
    }
}