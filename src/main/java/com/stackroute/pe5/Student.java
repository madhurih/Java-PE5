package com.stackroute.pe5;

import java.lang.String;
import java.util.Comparator;

public class Student
{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public String toString()
    {
        return this.id + " " + this.name + " " + this.age;
    }
}

class StudentSorter implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
        //if age is equal
        if(o1.getAge()!=o2.getAge())
            return o2.getAge()-o1.getAge();
            //if no compare using name
        else if(o1.getName().equals(o2.getName()))
            return o2.getName().compareTo(o1.getName());
            //if both cases fail then compare using id
        else
            return o2.getId()-o1.getId();
    }
}