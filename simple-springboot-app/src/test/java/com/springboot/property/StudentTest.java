package com.springboot.property;

import com.springboot.model.Student;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentTest {

    private Student student;

    @BeforeMethod
    public void setUp() {
        // Test öncesi her testten önce yeni bir Student nesnesi oluşturmalıyız
        student = new Student("1", "John", "Doe", 20);
    }

    @Test
    public void testGetId() {
        Assert.assertEquals(student.getId(), "1");
    }

    @Test
    public void testGetFirstName() {
        Assert.assertEquals(student.getFirstName(), "John");
    }

    @Test
    public void testGetLastName() {
        Assert.assertEquals(student.getLastName(), "Doe");
    }

    @Test
    public void testGetAge() {
        Assert.assertEquals(student.getAge(), 20);
    }

    @Test
    public void testSetId() {
        student.setId("2");
        Assert.assertEquals(student.getId(), "2");
    }

    @Test
    public void testSetFirstName() {
        student.setFirstName("Jane");
        Assert.assertEquals(student.getFirstName(), "Jane");
    }

    @Test
    public void testSetLastName() {
        student.setLastName("Smith");
        Assert.assertEquals(student.getLastName(), "Smith");
    }

    @Test
    public void testSetAge() {
        student.setAge(25);
        Assert.assertEquals(student.getAge(), 25);
    }

    @Test
    public void testToString() {
        String expected = "Student{id='1', firstName='John', lastName='Doe', age=20}";
        Assert.assertEquals(student.toString(), expected);
    }
}
