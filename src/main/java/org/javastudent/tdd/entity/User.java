package org.javastudent.tdd.entity;

public class User {

    private String email;

    private User(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public static class UserBuilder{

        private String emailId;
        public UserBuilder email(String emailId){
            this.emailId = emailId;
            return this;
        }

        public User build(){
            return
                    new User(emailId);
        }
    }
}
