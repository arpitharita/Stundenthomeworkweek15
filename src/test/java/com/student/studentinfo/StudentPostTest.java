package com.student.studentinfo;

import com.student.model.StudentPojo;
import com.student.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;


public class StudentPostTest extends TestBase {

    @Test
    public void createStudent() {

        List<String> courses = new ArrayList<>();
        courses.add("M.com");
        courses.add("Bca");
        courses.add("Bsc.chemistry");


        StudentPojo studentPojo =new StudentPojo();
        studentPojo.setFirstName("Pitter");
        studentPojo.setLastName("Jhon");
        studentPojo.setEmail("Pitter123@gmail.com");
        studentPojo.setProgramme("Financial Analysis");
        studentPojo.setCourses(courses);

       Response response = given()
                .header("Content-Type","application/json")
                .body(studentPojo)
                .when()
                .post();
       response.then().statusCode(500);
       response.prettyPrint();

    }
}
