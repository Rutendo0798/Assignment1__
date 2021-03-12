package Models;
import java.util.ArrayList;
import javafx.scene.image.Image;

public class Student {
     private String first_name;
     private String last_name;
     private long stu_id;
     private ArrayList<String> activities = new ArrayList<String>();
    private Image Stu_image;



     public Student(String first_name, String last_name, long stu_id) {
         setFirst(first_name);
         setLast(last_name);
         setID(stu_id);
         setActivities(activities);
         setStu();

     }



     /*
     Getter method to get first name
      */

    public void setStu() {
        String filePath = String.format("../../image/IMG_0369.png");
        System.out.println(filePath);
        Stu_image = new Image(filePath);
    }

    public Image getStu() {
        return Stu_image;
    }

    public String getFirst_name() {
         return first_name;
     }

     /*
     The method changes the first letter of your first name and also checks if it is longer than two letters
      */
     public void setFirst(String first_name) {
        /*
        Change the first letter into a capital letter
         */
         String firstLetter = first_name.substring(0, 1).toUpperCase();

         String remainingLetters = first_name.substring(1, first_name.length());
        /*
        Combine the first letter with the remaining letters
         */
         String FirstName = firstLetter + remainingLetters;

         if (FirstName.length() <= 2) {
             throw new IllegalArgumentException("Your name should be longer than two letters");

         } else {
         }
         this.first_name = FirstName;

     }


     public String getLast_name() {
         return last_name;
     }

     /*
     The method changes the first letter of your last name and also checks if it is more than two letters
      */
     public void setLast(String last_name) {
        /*
        Change the first letter of your last name into a capital letter
         */
         String firstLetter = last_name.substring(0, 1).toUpperCase();
         String remainingLetters = last_name.substring(1, last_name.length());

        /*
        Combine the Capital letter with the remaining letters into one
         */
         String LastName = firstLetter + remainingLetters;

         if (LastName.length() <= 2) {
             throw new IllegalArgumentException("Your last name should be longer than two letters");

         }

         this.last_name = LastName;
     }
/*
This method checks whether your student ID is valid, if not a illegalArgumentException is thrown
 */

     public void setID(long stu_id) {

         if (stu_id > 100000000 & stu_id < 999999999) {
         } else {
             throw new IllegalArgumentException("Please enter a valid student ID!");
         }

         this.stu_id = stu_id;
     }

     public long getStu_id() {
         return stu_id;
     }

    /*
    Creating the getter and setters
     */

     public ArrayList<String> getActivities() {
         return activities;
     }

     public void setActivities(ArrayList<String> activities) {
         this.activities = activities;
         activities.add("Swim");
         activities.add("Hiking");
         activities.add("Shopping");
         activities.add("Drawing");
         activities.add("Music");

     }
     /*
     Creating the add method, that will add activities
      */
     public void addActivity(String activity) {

         this.activities.add(activity);

         }


     }







