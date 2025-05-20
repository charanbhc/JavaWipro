package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.sp.main.entity.Student;
import in.sp.main.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/register")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "student_register";  // Loads the form
    }

    @PostMapping("/register")
    public String registerStudent(@ModelAttribute("student") Student student) {
        studentService.registerStudent(student);
        return "redirect:/submitted";  // Redirect to final submission page
    }

    @GetMapping("/submitted")
    public String finalPage() {
        return "submitted";
    }
}
