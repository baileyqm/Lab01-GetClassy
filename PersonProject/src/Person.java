import java.util.*;
public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;


    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    //Getters, Setters, and ToString:
    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }


    //Unique methods:
    public String getFullName(){
        return this.firstName +" "+ this.lastName;
    }

    public String getFormalName(){
        return this.title + " " + this.firstName + " " + this.lastName;
    }

    public String toCSVDataRecord(){
        return this.ID + ", " + this.firstName + ", " + this.lastName + ", " + this.title + ", " + YOB;
    }

    public String getAge(){
        Calendar calendar = Calendar.getInstance();
            return "Their age is currently: " + (calendar.get(Calendar.YEAR) - YOB);
    }
    public String getAge(int YOB){
        Calendar calendar = Calendar.getInstance();
        if (this.YOB <= YOB)
        {
            return "Their age is " + (YOB - this.YOB) + " in the year " + YOB;
        } else
        {
            return "They were not born before then!";
        }

    }
}
