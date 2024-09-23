package designpatternsofjava.builderdp;

public class User {

    private final String userId;
    private final String password;
    private final String emailId;
    
    private User(UserBuilder userBuilder){
    
            this.userId = userBuilder.userId;
            this.emailId  = userBuilder.emailId;
            this.password = userBuilder.password;
                    
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", password=" + password + ", emailId=" + emailId + '}';
    }
    
    
    
    
    
    
    
//    inner class to create object
    static class UserBuilder{
        private String userId;
        private String password;
        private String emailId;

        public UserBuilder(){
        
        }
        
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }
        
        public User build(){
            User user = new User(this);
            return user;
        }
        
    } 
    
}
