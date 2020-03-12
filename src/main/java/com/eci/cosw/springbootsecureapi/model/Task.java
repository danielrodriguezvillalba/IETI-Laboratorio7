/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.model;

/**
 *
 * @author danie
 */
public class Task {
    private String taskId;
    private String description;
    private String status;
    private String dueDate;
    private User responsable;

    public Task(String taskId, String description, String status, String dueDate, User responsable) {
        this.taskId = taskId;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.responsable = responsable;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public User getResponsable() {
        return responsable;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setResponsable(User responsable) {
        this.responsable = responsable;
    }
    
    
}
