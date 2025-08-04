package pl.coderslab.cykl_zycia;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    Task task;

    @BeforeEach
    void setUp() {
        task = new Task(1, "Test Task", "This is a test task.", "To Do");
    }

    @Test
    void changeStatus() {
        task.changeStatus("in progress");
        assertEquals("in progress", task.getStatus());
    }
    @Test
    void completeTask() {
        task.completeTask();
        assertEquals("completed", task.getStatus());
    }

    @AfterEach
    void tearDown() {
        task=null;
    }

}