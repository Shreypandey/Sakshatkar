package constants;

public enum RequestCode {

    LOGIN_REQUEST,
    SIGNUP_REQUEST,
    USERSEARCH_REQUEST,
    ONLINEUSER_REQUEST,
    STATUS_CHANGE_REQUEST,
    PROFILEPHOTO_REQUEST,
    FRIENDLIST_REQUEST,
    LOGOUT_REQUEST,
    ADDFRIEND_REQUEST;

    RequestCode(){
        this.toString();
    }
}
