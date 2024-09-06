package com.learning.Service;

import com.learning.Model.JobPost;
import com.learning.Repo.JobPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobPostService {
    @Autowired
    private JobPostRepo jobPostRepo;

    public List<JobPost> getAllJobPosts() {
        return jobPostRepo.findAll();
    }

    public JobPost getJobPostById(int postId) {
        Optional<JobPost> jobPost = jobPostRepo.findById(postId);
        return jobPost.orElse(new JobPost());
    }

    public void addJobPost(JobPost jobPost) {
        jobPostRepo.save(jobPost);
    }

    public void updateJobPost(JobPost jobPost) {
        jobPostRepo.save(jobPost);
    }

    public void deleteJobPost(int postId) {
        jobPostRepo.deleteById(postId);
    }

    public List<JobPost> getJobPostsByKeyword(String keyword) {
        return jobPostRepo.findByJobProfileContainingOrJobDescriptionContaining(keyword,keyword);
    }
}
