package service;

import com.springboot.demo.entity.Student;
import com.springboot.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired private StudentRepository studentRepository;

  @Override
  public List<Student> getAllStudents() {
    return Arrays.asList(
        new Student(1, "vagish"), new Student(2, "Dixit"), new Student(3, "Gagan"));
  }

  @Override
  public Iterable<Student> findAll() {
    return studentRepository.findAll();
  }

  @Override
  public void save(Student student) {
    studentRepository.save(student);
  }
}
