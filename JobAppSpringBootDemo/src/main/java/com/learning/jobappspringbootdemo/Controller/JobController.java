package com.learning.jobappspringbootdemo.Controller;

import com.learning.jobappspringbootdemo.Model.JobPost;
import com.learning.jobappspringbootdemo.Services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    private JobService jobService;

    @Autowired
    public void setJobService(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping({"/","home"})
    public String homeHandler()
    {
        return "home";
    }

    @GetMapping("addjob")
    public String addJobHandler()
    {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String formHandler(@ModelAttribute("jobPost") JobPost job)
    {
        jobService.addJobPost(job);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobsHandler(Model model)
    {
        model.addAttribute("jobPosts", jobService.getAllJobPosts());
        return "viewalljobs";
    }
}
