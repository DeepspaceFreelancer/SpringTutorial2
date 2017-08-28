package com.tutorialspoint5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans5.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        System.out.println("------Records Creation--------");
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);

        System.out.println("------Listing Multiple Records--------");
        List<Student> students = studentJDBCTemplate.listStudents();

        for (Student record : students) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----");
        studentJDBCTemplate.update(2, 20);

        System.out.println("----Listing Record with ID = 2 -----");
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId());
        System.out.print(", Name : " + student.getName());
        System.out.println(", Age : " + student.getAge());

        System.out.println("----Listing Record with ID = 2 -----");
        Student student2 = studentJDBCTemplate.getStudent2(2);
        System.out.print("ID : " + student2.getId());
        System.out.print(", Name : " + student2.getName());
        System.out.println(", Age : " + student2.getAge());

        StudentJDBCTemplate2 studentJDBCTemplate2 =
                (StudentJDBCTemplate2) context.getBean("studentJDBCTemplate2");

        System.out.println("------Records creation--------");
        studentJDBCTemplate2.create("Zara", 11, 99, 2010);
        studentJDBCTemplate2.create("Nuha", 20, 97, 2010);
        studentJDBCTemplate2.create("Ayan", 25, 100, 2011);

        System.out.println("------Listing all the records--------");
        List<StudentMarks> studentMarks = studentJDBCTemplate2.listStudents();

        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }
}