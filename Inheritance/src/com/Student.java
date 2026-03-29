package com;

public class Student extends Teacher {
    int rollNo;
    String dep;

    public Student(int rollNo,String dep , String n,int id,String s)
    {
        super(n,id,s);
        this.rollNo=rollNo;
        this.dep=dep;

    }

    public void result(int score)
    {
        if(score>=90)
        {
            System.out.println("O");
        }
        else if(score>=80 && score<90)
        {
            System.out.println("A");
        }
    }



}
