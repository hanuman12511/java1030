import java.util.Scanner;

import UserController.userLogin;
import UserController.userRegister;
import data.UserData;

public class User30 {
    public static void main(String...rr) {
       String name;
       String email;
       String password;
       System.out.println("Enter name ,email & password");
       Scanner sc=new Scanner(System.in);
       UserData ud =new UserData();
      name=sc.next();
       email=sc.next();
      
       password =sc.next();
       ud.setEmail(email); 
       ud.setName(name); 
       ud.setPassword(password); 
      if(new userRegister().Register(ud)){
        System.out.println("register user");
        userLogin ul =new userLogin();
          ul.Login(ud);
      }

    }
}
