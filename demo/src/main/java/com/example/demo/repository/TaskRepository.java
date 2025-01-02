package com.example.demo.repository;

import com.example.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Дополнительные методы для поиска (если нужно)

    // Пример: Найти задачи по статусу
    List<Task> findByStatus(String status);
}
