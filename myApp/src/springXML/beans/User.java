package springXML.beans;

import springXML.services.UserLoginStatus;

public class User implements UserLoginStatus {

    public User() {
        System.out.println("No-arg constructor");
    }


    @Override
    public String getLoginStatus() {
        return "login complete! welcome, "+ getUserID()+ ", you may now checkout your cart, or continue shopping!";
    }

    @Override
    public String getLoginError(){
        return "There has been an error Logging in, please login to view your cart";
    }

    @Override
    public String getUserID(String loginID) {
        return null;
    }

    public String getUserID() {
        return "0895468721";
    }
}
