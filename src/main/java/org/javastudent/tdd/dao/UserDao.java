package org.javastudent.tdd.dao;

import org.javastudent.tdd.entity.User;

public class UserDao {

    public boolean update(User user){
        try {
            System.out.println("Update User");
            return true;

        }catch(RuntimeException exp){

            return false;
        }

    }
}
