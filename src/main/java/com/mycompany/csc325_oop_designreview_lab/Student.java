/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
	// ToDo 1: Make this class a child of Human
	// ToDo 2: Fix the resulting errors
	// ToDo 3: Add a field for GPA and create a setter and a getter	
	// ToDo 4: Add comments to your code

public class Student extends Human {
    protected double gpa;  // Field for GPA
    protected int credits; // Field for credits

    // Constructor that takes name, age, and credits
    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge() + ", credits=" + credits + ", gpa=" + gpa + "}";
    }
}