package UserController;

import java.util.Scanner;

import data.UserData;

public class userLogin {
    
   public void Login(UserData ud){   
    String email;
       String password;
       System.out.println("Enter email & password");
       Scanner sc=new Scanner(System.in);
       email=sc.next();
      password =sc.next();
      System.out.println("*********************");
      System.out.println(ud.getEmail());
      System.out.println("*********************");
     if(email.equals(ud.getEmail()) && password.equals(ud.getPassword())){
        System.out.println("login");
     }
     else{
        System.out.println("not login");
     }
    }
}
