package org.ebay;

public class TestDynamicBind {

    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println(worker.name);
        worker.hello();
        worker.hi();

        System.out.println("--------------------");
        //
        Person person = new Worker();
        System.out.println(person.name);// static bind
        person.hello();
    }

}
class Person {

    String name = "person";

    public void hello() {
        System.out.println("hello person");
    }
}

class Worker extends Person{

    String name = "worker";

    public void hello() {
        System.out.println("hello worker");
    }

    public void hi(){
        System.out.println("hi worker");
    }
}