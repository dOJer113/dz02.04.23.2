package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person("Alex","Popov",12);
    @Test
    void getName() {
        String result = "Alex";
        String name = person.getName();
        Assertions.assertEquals(name,result);
    }

    @Test
    void getSurName() {
        String result  = "Popov";
        String surname = person.getSurName();
        Assertions.assertEquals(surname,result);

    }

    @Test
    void getAge() {
        int result = 12;
        int age = person.getAge();
        Assertions.assertEquals(result,age);
    }
}