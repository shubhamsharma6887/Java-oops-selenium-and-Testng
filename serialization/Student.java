package serialization;

import java.io.Serializable;

public class Student implements Serializable {
    int rollnumber;
    String name;
    Student (int rollnumber, String name){
        this.name=name;
        this.rollnumber=rollnumber;
    }

}
