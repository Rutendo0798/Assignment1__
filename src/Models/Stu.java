package Models;

import Models.Student;

public class Stu {
public static void main(String[] args){
    Student student = new Student("rutendo", "mauto",   200468527);
    String First = student.getFirst_name();
    String Last = student.getLast_name();
    System.out.println("Your name is : " + First);
    System.out.println("Your last name is: " + Last);
    System.out.println("Your student ID is : " + student.getStu_id());

    student.addActivity("Hockey");
    student.addActivity("Dancing");


    int i;
    for (i = 0; i < student.getActivities().size(); i++) {
        System.out.println(student.getActivities().get(i));
    }

    student.getStu();

}
}
