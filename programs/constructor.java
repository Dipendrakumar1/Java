import java.util.*;
public class constructor {
    constructor() // --> default constructor
    {
        System.out.println("I am default constructor");
    }
    constructor(String name) // -->parameterized constructor
    {
        System.out.println("I am parameterized "+name);
    }
    constructor(String namef,String namel) // -->constructor overloading
    {
        System.out.println("I am "+namef+" "+namel);
    }
    public static void main(String[] args) {
        constructor ob=new constructor("Constructor");
        constructor ob1=new constructor("Dipendra","Yadav");
        constructor ob2=new constructor();
        new constructor();
    }

}
