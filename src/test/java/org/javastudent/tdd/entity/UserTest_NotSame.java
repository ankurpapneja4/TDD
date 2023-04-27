package org.javastudent.tdd.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest_NotSame {

    @Test
    @DisplayName("Test - UserBuilder")
    public void testUserObjectCreation(){

        //Setup

        //Execute
        User user1 = new User.UserBuilder()
                .email("rose@javacommunity.org")
                .build();
        User user2 = new User.UserBuilder()
                .email("rose@javacommunity.org")
                .build();

        //Test
        Assertions.assertNotSame(user1,user2, "User object created by Builder are same");
    }
}
