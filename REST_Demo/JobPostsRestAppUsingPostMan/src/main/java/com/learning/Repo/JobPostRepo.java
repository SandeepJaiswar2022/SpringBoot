package com.learning.Repo;

import com.learning.Model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobPostRepo  extends JpaRepository<JobPost, Integer> {
    List<JobPost> findByJobProfileContainingOrJobDescriptionContaining(String jobProfile, String jobDescription);
}
