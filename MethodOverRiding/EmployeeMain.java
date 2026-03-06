package com.linkcode.MethodOverriding;

public class EmployeeMain {


    public static void main(String[] args) {
        Employee employee = new Employee(1 , "parth",40000,"jm road pune");
        Object obj = employee;
        System.out.println(obj.toString());
        System.out.println(employee.hashCode());
        System.out.println(employee.toString());
        Employee employee1 = new Employee(2 , "ritesh",47000,"fc road pune");
        System.out.println(employee1.toString());
        System.out.println(employee1.hashCode());
        System.out.println(employee.equals(employee1));
    }
}
