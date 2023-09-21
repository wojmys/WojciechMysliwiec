package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MentorTasksTestSuite {

    @Test
    void shouldReturnExpectedNumberOfNotifications() {
        //given
        StudentTasks course1 = new JavaCourse();
        StudentTasks course2 = new JavaScriptCourse();
        Mentor mentor1 = new Mentor("Jan Nowak");
        course1.registerObserver(mentor1);
        Mentor mentor2 = new Mentor("Stefan Kodilla");
        course1.registerObserver(mentor2);
        course2.registerObserver(mentor2);

        //when
        course1.addTask(new Task("Grzegorz Gorz", "Moduł 5, zadanie 2"));
        course1.addTask(new Task("Jolanta Anta", "Moduł 4, zadanie 6"));
        course2.addTask(new Task("Teodor Odor", "Moduł 2, zadanie 2"));
        course2.addTask(new Task("Marcin Cin", "Moduł 2, zadanie 3"));
        course2.addTask(new Task("Aleksandra Andra", "Moduł 2, zadanie 4"));

        //then
        assertEquals(2, mentor1.getTasksCounter());
        assertEquals(5, mentor2.getTasksCounter());
    }
}
