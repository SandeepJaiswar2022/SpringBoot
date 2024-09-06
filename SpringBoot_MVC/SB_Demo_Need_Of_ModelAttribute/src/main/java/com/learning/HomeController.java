package com.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    //    @RequestMapping("loginServlet")
//    public ModelAndView login(@RequestParam("studentId") int studentId,@RequestParam("studentName") String studentName, ModelAndView mv)
//    {
//        Student student = new Student();
//        student.setStudentId(studentId);
//        student.setStudentName(studentName);
//        mv.addObject("student", student);
//        mv.setViewName("afterLogin");
//        return mv;
//    }
    @RequestMapping("loginServlet")
    public String login(@ModelAttribute("studentObject") Student student) {
        return "afterLogin";
    }

    @ModelAttribute("course")
    public String getStudentCourse()
    {
        return "Java";
    }

}
