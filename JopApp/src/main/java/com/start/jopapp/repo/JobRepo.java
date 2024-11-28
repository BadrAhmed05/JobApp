package com.start.jopapp.repo;

import com.start.jopapp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost>jobs=new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Dev", "must be good", 1, List.of("ASSSS", "eeeee"))));
    public List<JobPost> getAllJobs()
    {
            return jobs;
    }
    public void addJob(JobPost job)
    {
        jobs.add(job);
        System.out.println(jobs);
    }
}
