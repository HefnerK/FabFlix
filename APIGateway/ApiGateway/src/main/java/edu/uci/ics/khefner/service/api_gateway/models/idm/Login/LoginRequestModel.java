package edu.uci.ics.khefner.service.api_gateway.models.idm.Login;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.uci.ics.khefner.service.api_gateway.models.RequestModel;

public class LoginRequestModel extends RequestModel {
    private String email;
    private char[] password;


    public LoginRequestModel() {}

    @JsonCreator
    public LoginRequestModel(@JsonProperty(value = "email", required = true) String email,
                             @JsonProperty (value = "password", required = true) char[] password) {
        this.email = email;

            this.password = new char[password.length];
            this.password = password.clone();


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }


}
