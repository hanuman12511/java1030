package UserController;

import data.UserData;

public class userRegister {
    
    public  boolean Register(UserData ud){
        
        
        boolean r;
        if(ud.getEmail().isEmpty() && ud.getName().isEmpty()&&ud.getPassword().isEmpty()){
                r=false;
        }
        else{
            r=true;
        }
        return r;
    }
}
