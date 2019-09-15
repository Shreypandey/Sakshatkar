package request;

import constants.RequestCode;

import java.io.Serializable;

public class ProfilePhotoRequest extends Request implements Serializable
{

    private String userUID;
    public ProfilePhotoRequest(String userUID)
    {
        this.userUID=userUID;
    }
    @Override
    public RequestCode getRequestCode() {
        return null;
    }
}
