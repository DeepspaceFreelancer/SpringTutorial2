package com.tutorialspoint8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans8.xml");

        StudentDAO studentJDBCTemplate = (StudentDAO) context.getBean("studentJDBCTemplate");

        System.out.println("------Records creation--------");
        try {
            studentJDBCTemplate.create("Zara", 11, 99, 2010);
            studentJDBCTemplate.create("Nuha", 20, 97, 2010);
            studentJDBCTemplate.create("Ayan", 25, 100, 2011);
        } catch (Exception e) {
            System.out.println("Eating exception!");
        }

        System.out.println("------Listing all the records--------");
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();

        System.out.printf("list of Students: %d%n", studentMarks.size());

        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }
}
