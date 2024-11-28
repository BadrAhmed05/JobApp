package com.start.jopapp.service;

import com.start.jopapp.model.JobPost;
import com.start.jopapp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//DTO data transfer objects
@Service
public class JobService {

    @Autowired
    private JobRepo service;
    public void addjob(JobPost jobPost)
    {
        service.addJob(jobPost);
    }
    public List<JobPost> getAllJobs()
    {
        return service.getAllJobs();
    }
}
