package ch02;

import java.util.Objects;

public class Student implements Cloneable {

    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    @Override
    public String toString() {
        return studentNum + ", " + studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student std = (Student) o;
            if (studentNum == std.studentNum) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
