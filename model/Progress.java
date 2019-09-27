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
public class Progress {
    private ClassM classm;
    private double progress;
    private Date date;

    public ClassM getClassm() {
        return classm;
    }

    public void setClassm(ClassM classm) {
        this.classm = classm;
    }

    /**
     * @return the progress
     */
    public double getProgress() {
        return progress;
    }

    /**
     * @param progress the progress to set
     */
    public void setProgress(double progress) {
        this.progress = progress;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
