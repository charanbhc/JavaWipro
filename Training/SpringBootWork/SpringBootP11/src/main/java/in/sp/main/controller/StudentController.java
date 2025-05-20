package in.sp.main.controller;

import in.sp.main.entities.Student;
import in.sp.main.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")  // Base URL for endpoints
public class StudentController 
{
    @Autowired
    private StudentService studentService;    // created bean studentservice of StudentService class

    @GetMapping
    public List<Student> getAllStudents() 
    {
        return studentService.getAllStdDetails();    // here we are accessing methods of StudentService class
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable long id) 
    {
        return studentService.getStdDetails(id);
    }

    @PostMapping
    public boolean addStudent(@RequestBody Student student) 
    {
        return studentService.addStudentDetails(student);
    }

    @PutMapping("/{id}")
    public boolean updateStudent(@PathVariable long id,@RequestBody Student student) 
    {
        return studentService.updateStdDetails(id, student.getMarks());
    }

    @DeleteMapping("/{id}")
    public boolean deleteStudent(@PathVariable long id) 
    {
        return studentService.deleteStdDetails(id);
    }
}


//The controller is responsible for handling HTTP requests and returning HTTP responses.
//It acts as an intermediary between the client (e.g., browser, Postman) and the backend service (e.g., your business logic in the service layer).

