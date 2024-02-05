package com.backend.assign.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.backend.assign.Model.Interviewee;

public interface IntervieweeRepo extends MongoRepository<Interviewee,String>{
    
    // query to find the list of interviews on a specific date
    @Query("{'date' : ?0}")
    List<Interviewee> findListOfInterviewOnDate(Date date);
    
}
