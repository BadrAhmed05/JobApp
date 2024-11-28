package com.start.jopapp;

import com.start.jopapp.model.JobPost;
import com.start.jopapp.service.JobService;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class JopController {
    @Autowired
    private JobService service;

    @GetMapping({"/","home"})
    public String home ()
    {
        return "home";
    }



    @GetMapping("addjob")
    public String addjop()
    {
        return "addjob";
    }



    @PostMapping("handleForm")
    public String handleform(JobPost jobPost)
    {
        return "success";
    }


    @GetMapping("viewalljobs")
    public String viewalljobs(Model m)
    {
        List<JobPost> job=service.getAllJobs();
        m.addAttribute("jobPosts",job);
        return "viewalljobs";
    }
}
