package com.business.springbootexample1.model;

public class Course {

    private long id;
    private String courseName;

    private String author;

    public Course(long id, String courseName, String author) {
        this.id = id;
        this.courseName = courseName;
        this.author = author;
    }

    public long getId() {
        return id;
    }


    public String getCourseName() {
        return courseName;
    }


    public String getAuthor() {
        return author;
    }
    
    // The toString() method returns the String representation of the object.
    /*
     *If you print any object, Java compiler internally invokes the toString() method on the object.
     * So overriding the toString() method, returns the desired output,
     * it can be the state of an object etc. depending on your implementation.
     */
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
