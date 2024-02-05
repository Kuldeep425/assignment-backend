package com.backend.assign.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.assign.Model.Interviewee;
import com.backend.assign.repository.IntervieweeRepo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class IntervieweeService {
    @Autowired IntervieweeRepo intervieweeRepo;
    
    // method to get all interviews
    public List<Interviewee> InterviweeList(){
        ArrayList<Interviewee>users=new ArrayList();
        users=(ArrayList<Interviewee>) intervieweeRepo.findAll();
        return users;
    }

    // list of interviews on a specific date
    public List<Interviewee>getAllInterviewOnSpecificDate(Date date){
         return intervieweeRepo.findListOfInterviewOnDate(date);
    }


    // method to add interview 
    public String addInterview(Interviewee interviewee){
        intervieweeRepo.save(interviewee);
        return "Interview added successfully";
    }

    

}
