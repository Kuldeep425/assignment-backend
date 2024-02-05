package com.backend.assign.Model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Interviewee {
    @Id
    public String id;
    String name;
    String role;
    Date date;
    String time;

    public Interviewee(String name,String role,Date date,String time){
        this.name=name;
        this.role=role;
        this.date=date;
        this.time=time;
    }


    
}
