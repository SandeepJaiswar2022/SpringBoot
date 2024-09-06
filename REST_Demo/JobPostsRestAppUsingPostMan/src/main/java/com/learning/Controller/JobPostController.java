package com.learning.Controller;

import com.learning.Model.JobPost;
import com.learning.Service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobPostController {
    private JobPostService jobPostService;
    @Autowired
    public void setJobPostService(JobPostService jobPostService) {
        this.jobPostService = jobPostService;
    }

    @GetMapping("jobposts")
//    @ResponseBody //means it will return data not Jsp pages it is option since we have written annotation @RestController
    public List<JobPost> getAllJobPost() {
        return jobPostService.getAllJobPosts();
    }

    //Get the jobPost by a keyword
    @GetMapping("jobposts/keyword/{keyword}")
    public List<JobPost> getJobPostByKeyword(@PathVariable String keyword) {
        return jobPostService.getJobPostsByKeyword(keyword);
    }
    @GetMapping("jobpost/{postId}")
    public JobPost getJobPostById(@PathVariable("postId") int postId) {
        return jobPostService.getJobPostById(postId);
    }

    @PostMapping("jobpost")
    public JobPost addJobPost(@RequestBody JobPost jobPost) {
        jobPostService.addJobPost(jobPost);
        return jobPostService.getJobPostById(jobPost.getJobId());
    }

    @PutMapping("jobpost")
    public JobPost updateJobPost(@RequestBody JobPost jobPost) {
        jobPostService.updateJobPost(jobPost);
        return jobPostService.getJobPostById(jobPost.getJobId());
    }

    @DeleteMapping("jobpost/{postId}")
    public String deleteJobPost(@PathVariable int postId) {
        jobPostService.deleteJobPost(postId);
        return "JobPost deleted successfully";
    }
}
