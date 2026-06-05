package com.example.demo.controller;
import com.example.demo.model.Task;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.service.TaskService;

import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService)
    {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getTasks();
       
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id){
    Task task = taskService.getTaskById(id);
    if (task == null)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found.");
        }
        return task; 
    }

    @PostMapping()
    public Task createTask(@RequestBody Task task)
    {
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task)
    {
        Task updatedTask =  taskService.updateTask(id, task);
        if (updatedTask == null)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Task not found for update.");
        }
        return updatedTask;

    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id)
    {
        boolean deleted = taskService.deleteTask(id);
        if (!deleted)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found for deletion");
        }
    }


}