/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.persistence.TaskConsume;
import com.eci.cosw.springbootsecureapi.service.TaskService;
import com.eci.cosw.springbootsecureapi.service.UserService;
import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author danie
 */
public class TaskServiceImpl implements TaskService{
    
    @Autowired
    TaskConsume taskConsume = null;

    @Override
    public List<Task> getAll() {
        return taskConsume.getAll();
    }

    @Override
    public Task getById(String id) {
        return taskConsume.getById(id);
    }

    @Override
    public List<Task> getByUserId(long userId) {
        return taskConsume.getByUserId(userId);
    }

    @Override
    public Task assignTaskToUser(String taskId, User user) {
        return taskConsume.assignTaskToUser(taskId, user);
    }

    @Override
    public void remove(String taskId) {
        taskConsume.remove(taskId);
    }

    @Override
    public Task update(Task task) {
        return taskConsume.update(task);
    }
    
}
