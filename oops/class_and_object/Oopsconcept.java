package oops.class_and_object;

class Employee{   // class for employee
    int id;
    String name;
    String post;
    public void printDetails(){   // method for printing employee details
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
        System.out.println("My post is "+post);
    }
    public int getId() {  // function
        return id;
    }
}

public class Oopsconcept {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        Employee E2 = new Employee(); // instantiating a new Employee object

        // setting Attributes
        E1.id = 2;
        E1.name = "shubham sharma";
        E1.post = "Qa tester";

        E2.id = 3;
        E2.name = "rishabh sortha";
        E2.post = "Qa tester";

        // printing Attributes
        E1.printDetails();
        E2.printDetails();
        int getid = E1.getId();
        System.out.println(getid);
    }
}