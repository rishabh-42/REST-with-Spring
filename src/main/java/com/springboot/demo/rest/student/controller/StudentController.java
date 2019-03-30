package com.springboot.demo.rest.student.controller;

import com.springboot.demo.rest.student.Student;
import com.springboot.demo.rest.student.exception.DuplicateStudentFoundException;
import com.springboot.demo.rest.student.exception.StudentNotFoundException;
import com.springboot.demo.rest.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    MessageSource messageSource;

    //forQuestion4
    @GetMapping("/")
    public String greet()
    {
        return messageSource.getMessage("greeting.message",null, LocaleContextHolder.getLocale());
    }

    @GetMapping("/students/getList")
    public List<Student> getStudentsList() {
        return studentService.getStudentsList();
    }

    @GetMapping("/students/getStudent/{id}")
    public Student getStudent(@PathVariable Long id) {
        Student student=studentService.getStudentById(id);
        if(student==null)
            throw new StudentNotFoundException("Student with id: "+id+" doesn't exist");
        return student;
    }

    //    Added @Valid for question3
//Added produces for question5
    @PostMapping(value = "/students/postStudent",produces = "application/xml")
    public Student addStudent(@Valid @RequestBody Student student) {
        Student studentToBeSaved=studentService.getStudentByName(student.getName());
        if(!(studentToBeSaved==null))
            throw new DuplicateStudentFoundException("Student with this name already exists");
        return studentService.addStudent(student);
    }

    @PutMapping("/students/putStudent/{id}")
    public Student updateStudent(@PathVariable Long id) {
        Student studentToBeUpdated = studentService.getStudentById(id);
        if (studentToBeUpdated == null)
            throw new StudentNotFoundException("User with id " + id + " not found ");
        studentToBeUpdated.setName("vagish");
        return studentService.addStudent(studentToBeUpdated);
    }

    @DeleteMapping("/students/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Long id) {
        Student studentToBeDeleted = studentService.getStudentById(id);
        if (studentToBeDeleted == null)
            throw new StudentNotFoundException("User with id " + id + " not found ");
        studentService.deleteStudent(studentToBeDeleted);

    }
}
