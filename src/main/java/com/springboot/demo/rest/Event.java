package com.springboot.demo.rest;

import com.springboot.demo.rest.student.Student;
import com.springboot.demo.rest.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Event {

        @Autowired
        StudentService studentService;

        @EventListener(ContextRefreshedEvent.class)
        public void insertStudentData()
        {
            List<Student> studentList​=studentService.getStudentsList();
            if(((List) studentList​).isEmpty())
            {
                System.out.println("In Event");
                List<Student> studentListToBeSaved = Arrays.asList(new Student("Rishabh", 23)
                        , new Student("Gagan", 29), new Student("Yukti", 25));
                studentService.saveAll(studentListToBeSaved);
            }

        }
    }

