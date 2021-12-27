package org.ebay.scala.org.ebay;

public class TestDynamicBind {

    public static void main(String[] args) {
        Worker worker = new Worker("mary");
        System.out.println(worker.name);
        worker.hello();
        worker.hi();

        System.out.println("--------------------");
        //
        Person person = new Worker("alice");
        System.out.println(person.name);// static bind
        person.hello();

        Person p = new Person("john");
        System.out.println(p);
    }

}
class Person {

    private Job job = new Job();

    public Person(String name) {
        this.name = name;
    }

    String name = null;

    public void hello() {
        System.out.println("hello person");
    }
}

class Job {
    public Job() {
        System.out.println("----");
    }
}

class Worker extends Person{

    String name = "worker";

    public Worker(String name) {
        super(name);
    }

    public void hello() {
        System.out.println("hello worker");
    }

    public void hi(){
        System.out.println("hi worker");
    }
}