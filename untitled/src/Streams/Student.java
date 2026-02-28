package Streams;

import java.io.Serializable;

public class Student implements Serializable {
    public int roll;
    public String name;
    public int marks;
    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "{roll: " + this.roll + ", name: " + this.name + ", marks: " + this.marks + "}";
    }

//    public int Roll(){
//        return this.roll;
//    }


}