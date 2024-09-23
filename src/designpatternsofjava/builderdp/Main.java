package designpatternsofjava.builderdp;

public class Main {

    public static void main(String[] args) {

        User user = new User.UserBuilder().setEmailId("namesadaf@gmail.com").setPassword("admin").setUserId("sadaf786").build();
        System.out.println(user);
    
    
    }
    
    
    
}
