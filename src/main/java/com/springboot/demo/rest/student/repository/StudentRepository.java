package rest.student.repository;

import com.springboot.demo.rest.student.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    Optional<Student> findById(Long id);

    Student findByName(String name);
}
