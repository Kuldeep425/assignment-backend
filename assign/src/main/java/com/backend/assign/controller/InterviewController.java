package com.backend.assign.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.assign.Model.Interviewee;
import com.backend.assign.service.IntervieweeService;


@RestController
@RequestMapping("/api/interviews")
public class InterviewController {

    @Autowired IntervieweeService userService;
    

    // to find all upcoming interviews
    @GetMapping("/upcoming")
    public List<Interviewee> getInterviewSchedule(){
         return userService.InterviweeList();
    }

    // to find all upcoming interviews on a specific date
    @GetMapping("/upcoming/{date}")
    public List<Interviewee> getAllInterviewOnSpecific(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date){
       // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return userService.getAllInterviewOnSpecificDate(date);
    }

    // to create an interview 
    @PostMapping("/create")
    public String addAnInterview(@RequestBody Interviewee interviewee){
        return userService.addInterview(interviewee);
    }

}
