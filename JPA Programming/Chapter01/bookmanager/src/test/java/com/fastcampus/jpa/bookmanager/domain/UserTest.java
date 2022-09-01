package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void test() {
        User user = new User();
        user.setEmail("aaa@fastcampus.com");
        user.setName("minji");

        User user2 = new User("bb", "bb@bb.com");

        System.out.println(">>> " + user);
    }

}