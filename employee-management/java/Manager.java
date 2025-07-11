public class Manager implements Displayable {
    @Override
    public void displayDetails(Person p) {
        if(p instanceof Employee e) {
            // Employee e = (Employee ) p;
            System.out.println("Employee ID: " + e.getEmployeeId());
            System.out.println("Name: " + e.getName());
            System.out.println("Age: " + e.getAge());
            System.out.println("Department: " + e.getDepartment());
        }
    }
}

