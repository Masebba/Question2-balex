/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balex;

import java.util.Scanner;
/**
 *
 * @author maste
 */

public class courses {
    String courseID;
    String courseName;
    int tuition;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter CourseID (or 'X' to quit): ");
            String courseID = scanner.nextLine().toUpperCase(); 
            if (courseID.equals("X")) {
                System.out.println("Exiting Balex. Good day!");
                break;
            }
            getCourseDetails(courseID);
        }
        scanner.close();
    }
    
    public static void getCourseDetails(String courseID) {
        String courseName;
        int tuition;

        switch (courseID) {
            case "BSE":
                courseName = "Software Engineering";
                tuition = 900000;
                break;
            case "BIT":
                courseName = "Information Technology";
                tuition = 750000;
                break;
            case "BCS":
                courseName = "Computer Science";
                tuition = 800000;
                break;
            case "BCE":
                courseName = "Computer Engineering";
                tuition = 950000;
                break;
            default:
                System.out.println("Wrong CourselD details");
                return;
        }
        
        System.out.println("Course Name: " + courseName);
        System.out.println("Tuition Fee: " + tuition);
    }   
}
