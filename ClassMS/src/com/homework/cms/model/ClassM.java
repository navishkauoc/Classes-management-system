/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.homework.cms.model;

import java.util.Date;

/**
 *
 * @author acer
 */
public class ClassM {
    private int id;
    private String name;
    private int students;
    private Date startDate;
    private boolean status;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the students
     */
    public int getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(int students) {
        if(students>0){
            this.students = students; //Data validation
        }
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    @Override
    public String toString(){
        return getName()+" "+getStudents();
    }
    
}
