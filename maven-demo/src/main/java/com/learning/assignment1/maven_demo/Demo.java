//Qingliang Yin 13101588
package com.learning.assignment1.maven_demo;

import java.util.ArrayList;
import com.learning.assignment1.maven_student.*;
import org.joda.time.*;

public class Demo 
{
    public static void main( String[] args )
    {
    	//set students
    	Student s1,s2,s3;
    	s1 = new Student("S1","22","19940101","S0001");
    	s2 = new Student("S2","22","19940202","S0002");
    	s3 = new Student("S3","22","19940303","S0003");
    	
    	//set Modules
    	Module m1,m2,m3;
    	m1 = new Module("M1","M01");
    	m2 = new Module("M2","M02");
    	m3 = new Module("M3","M03");
    	m1.addStudent(s2);
    	m2.addStudent(s3);
    	m3.addStudent(s1);
    	
    	//prepare course data
    	ArrayList<Module> m =new ArrayList<Module>();
    	m.add(m3);
    	m.add(m1);
    	DateTime start	= new DateTime(2016,9,1,0,0);
    	DateTime end	= new DateTime(2017,6,1,0,0);
    	
    	//set Course
    	Course c1,c2;
    	ArrayList<Course> c = new ArrayList<Course>();
    	c1 = new Course("C1","C01",m,start,end);
    	c.add(c1);
    	c2 = new Course("C2","C02",start,end);
    	c2.addModule(m2);
    	c.add(c2);
    	
    	//output
    	System.out.println("Student\tModule\tCourse");
    	for(int i=0;i<c.size();i++){
    		ArrayList<Module> tempM=c.get(i).getModules();
    		for(int j=0;j<tempM.size();j++){
    			ArrayList<Student> tempS=tempM.get(j).getStudents();
    			for(int k=0;k<tempS.size();k++){
    				System.out.println(tempS.get(k).getName()+"\t"+
    						tempM.get(j).getMname()+"\t"+
    						c.get(i).getName());
    			}
    		}
    	}
    	
    }
}
