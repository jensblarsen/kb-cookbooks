package com.michaelhoffmantech.gradle.todoapp.repository;

import java.util.List;

import com.michaelhoffmantech.gradle.todoapp.model.ToDoItem;

public interface ToDoRepository {
   List<ToDoItem> findAll();

   ToDoItem findById(Long id);

   Long insert(ToDoItem toDoItem);

   void update(ToDoItem toDoItem);

   void delete(ToDoItem toDoItem);
}
