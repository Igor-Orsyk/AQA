package hw_4_students;

import java.util.ArrayList;

public class Student {

    String name;
    int rate;
    static ArrayList<Student> students;

    public static void main(String[] args) {

        Student the_first = new Student("Pedro", 5);
        Student the_second = new Student("Almodovar", 4);
        Student the_third = new Student("Caballero", 3);

        System.out.println("Avarage rate of the students is " + (the_first.rate + the_second.rate + the_third.rate) / 3);

        changeRating(the_first, 8);

        System.out.println("Avarage rate of the students is " + (the_first.rate + the_second.rate + the_third.rate) / 3);

    }

    public Student(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Student() {
    }



    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public static boolean betterStudent(Student first, Student second){
        if (first.rate > second.rate){
            System.out.println("First student is better");
            return true;
        } else if (first.rate < second.rate){
            System.out.println("Second student is better");
            return false;
        } else {
            System.out.println("Students rate is the same, but first is first");
            return true;
        }
    }

    public String toString(Student student){
        return "Student name is " + student.name + ", and his rate is " + student.rate;
    }

    public static void changeRating(Student student, int new_rate){
        student.setRate(new_rate);

    }




}
