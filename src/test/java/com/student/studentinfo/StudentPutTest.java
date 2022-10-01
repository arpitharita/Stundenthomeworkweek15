package com.student.studentinfo;


import com.student.model.StudentPojo;
import com.student.testbase.TestBase;
import org.junit.Test;

public class StudentPutTest extends TestBase {

    @Test
    public void put()
    {
        StudentPojo studentPojo =new StudentPojo();
        studentPojo.setFirstName("Harita");
        studentPojo.setEmail("Pitter@12gmail.com");
        studentPojo.setProgramme("api testing");

    }



}
