package org.javastudent.tdd.dao;

import org.javastudent.tdd.entity.User;
import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
public class UserDaoTest_TrueFalse {

    private UserDao userDao;

    @BeforeEach
    public void setup(){
        userDao = new UserDao();
    }

    @Test
    public void testUserUpdate(){
        //Setup test data
        User user = new User.UserBuilder()
                        .email("rose@javacommunity.com")
                        .build();

        //Execute and test
        Assertions.assertTrue(userDao.update(user));
    }
}
