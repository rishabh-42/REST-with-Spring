package event;


import com.springboot.demo.entity.Student;
import com.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;
//
//@Component
public class Bootstrap {

//    @Autowired
//    private StudentService studentService;
//
//    @EventListener(ContextRefreshedEvent.class)
//    public void init(){
//
//        Iterator<Student> studentIterator=studentService.findAll().iterator();
//        if(!(studentIterator.hasNext()))
//        {
//            for(int i=0;i<5;i++)
//            {
//                Student student=new Student(i+1,"Student"+i);
//                studentService.save(student);
//                System.out.println("student"+i+" created");
//            }
//        }
//
//    }
}
