package com.avm.javapractice.oopsConcepts;

public class Inheritance {
    public static void main(String[] args) { 
        Person e1 = new Employee("Dev","5.20","vinay","25");
        System.out.println(e1);
        
    }
}

class Person{
    String name;
    String age;
}

class Employee extends Person{
    String role;
    String salary;
    public Employee(String role, String salary,String name,String age) {
        super();
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [role=" + role + ", salary=" + salary +", name=" +name+", age="+age+"]";
    }
    
    
}