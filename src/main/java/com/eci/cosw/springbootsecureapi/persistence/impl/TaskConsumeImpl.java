/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.persistence.impl;

import com.eci.cosw.springbootsecureapi.persistence.TaskConsume;
import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author danie
 */
public class TaskConsumeImpl implements TaskConsume{
    
    private HashMap<String,Task> tareas = new HashMap<>();

    @Override
    public List<Task> getAll() {
        ArrayList<Task>res = new ArrayList<>();
        for (Map.Entry<String, Task> entrySet : tareas.entrySet()) {
            Task value = entrySet.getValue();
            res.add(value);
        }
        return res;
    }

    @Override
    public Task getById(String id) {
       return tareas.get(id);
    }

    @Override
    public List<Task> getByUserId(long userId) {
       ArrayList<Task>res = new ArrayList<>();
        for (Map.Entry<String, Task> entrySet : tareas.entrySet()) {
            Task value = entrySet.getValue();
            if(value.getResponsable().getId() == (userId)){
                res.add(value);
            }
            
        }
        return res;
    }

    @Override
    public Task assignTaskToUser(String taskId, User user) {
        Task ts = tareas.get(taskId);
        ts.setResponsable(user);
        return ts;
    }

    @Override
    public void remove(String taskId) {
        if (tareas.get(taskId) != null){
            tareas.remove(taskId);
        }
    }

    @Override
    public Task update(Task task) {
        if(tareas.get(task.getTaskId())!= null){
            tareas.replace(task.getTaskId(), task);
        }
        return task;
    }
    
}
