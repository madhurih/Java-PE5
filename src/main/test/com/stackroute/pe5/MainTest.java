package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest
{
    public static StudentSorter ss;

    @BeforeClass
    public static void setup()
    {
        //arrange
        ss = new StudentSorter();
    }

    @AfterClass
    public static void tearDown()
    {
        //arrange
        ss = null;
    }

    @Test
    public void Student_idNameAgeGiven_shouldreturnsortedlist()
    {
        Student s1 = new Student(1,"Monjo",23);
        Student s2= new Student(2, "Gonjo", 25);
        Student s3= new Student(3, "Ponjo", 28);
        Student s4= new Student(4, "Morjo", 25);
        Student s5= new Student(5, "Monjo", 30);

        List<Student> al=new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);

         System.out.println("Unsorted");
        for (int i=0; i<al.size(); i++)
            System.out.println(al.get(i));

        Collections.sort(al, ss);

        System.out.println("\nSorted list");
        for (int i=0; i<al.size(); i++)
            System.out.println(al.get(i));
    }
}