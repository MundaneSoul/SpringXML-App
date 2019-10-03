package springXML.services;

public interface UserLoginStatus {
    public String getLoginStatus();

    public String getLoginError();

    public String getUserID(String loginID);

}
