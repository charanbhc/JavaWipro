package in.sp.main.service;


import org.springframework.stereotype.Service;
import in.sp.main.entity.Student;
import in.sp.main.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) 
    {
        this.studentRepository = studentRepository;
    }

    public Student registerStudent(Student student) 
    {
        return studentRepository.save(student);    // Save student in MySQL
    }
}

