package org.example;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StudentTest {

    ArrayList<Student> list_student;
    Student student_A;

    @BeforeAll
    public void initClass(){
        list_student = new ArrayList<>();
    }

    @AfterAll
    public void cleanClass(){
        list_student.clear();
    }

    @BeforeEach
    public void beforeEach(){
        student_A = new Student("SomeoneA", 20);
        student_A.enrollCourse("PPPL");
        list_student.add(student_A);
    }

    @AfterEach
    public void afterEach(){
        list_student.clear();
    }

    @Test
    void testDataCreation() {
        Assertions.assertEquals(list_student.get(0).getName(), student_A.getName());
        Assertions.assertEquals(list_student.get(0).getAge(), student_A.getAge());
    }


    @Test
    void testEnrollCourse() {
        list_student.get(0).enrollCourse("PAD2");
        Assertions.assertEquals(List.of("PPPL", "PAD2"), list_student.get(0).getEnrolledCourses());
    }

    @Test
    void testSetGrade() {
        list_student.get(0).setGrade("PPPL", "A");
        list_student.get(0).setGrade("PPPL", "B");
        Assertions.assertEquals("B", list_student.get(0).getGrade("PPPL"));
    }

}