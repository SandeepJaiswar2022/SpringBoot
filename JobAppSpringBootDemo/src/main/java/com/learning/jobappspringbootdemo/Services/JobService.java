package com.learning.jobappspringbootdemo.Services;

import com.learning.jobappspringbootdemo.Model.JobPost;
import com.learning.jobappspringbootdemo.Repositories.JobRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private JobRepo repo;

    @Autowired
    public void setRepo(JobRepo repo) {
        this.repo = repo;
    }

    public void addJobPost(JobPost jobPost)
    {
        repo.addJobPost(jobPost);
    }
    public List<JobPost> getAllJobPosts()
    {
        return repo.getAllJobPosts();
    }
}
