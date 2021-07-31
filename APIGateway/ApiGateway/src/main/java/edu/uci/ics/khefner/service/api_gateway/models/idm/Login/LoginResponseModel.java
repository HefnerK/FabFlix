package edu.uci.ics.khefner.service.api_gateway.models.idm.Login;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.uci.ics.khefner.service.api_gateway.models.Model;

@JsonIgnoreProperties(value = "dataValid")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginResponseModel extends Model {

    @JsonProperty(required = true)
    private int resultCode;
    @JsonProperty(required = true)
    private String message;
    private String sessionID;

    public LoginResponseModel() {}

    @JsonCreator
    public LoginResponseModel(int resultCode, String message){
        this.resultCode = resultCode;
        this.message = message;
        this.sessionID = null;
    }

    @JsonProperty("resultCode")
    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSessionID() {
        return sessionID;
    }

    @JsonProperty(value = "sessionID")
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
}
