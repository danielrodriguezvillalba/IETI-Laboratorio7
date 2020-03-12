/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author danie
 */
 @Service
 public interface TaskService {
        List<Task> getAll();
        
        Task getById(String id);
        
        List<Task> getByUserId(long userId);
        
        Task assignTaskToUser(String taskId, User user);

        void remove(String taskId);
        
        Task update(Task task);
    }