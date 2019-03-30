package service;

import com.springboot.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();

    Iterable<Student> findAll();

    void save(Student student);
}
