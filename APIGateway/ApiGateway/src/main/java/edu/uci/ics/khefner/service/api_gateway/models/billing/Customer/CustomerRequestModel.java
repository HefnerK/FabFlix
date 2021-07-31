package edu.uci.ics.khefner.service.api_gateway.models.billing.Customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.uci.ics.khefner.service.api_gateway.models.RequestModel;

public class CustomerRequestModel extends RequestModel {

    private String email;
    private String firstName;
    private String lastName;
    private String ccId;
    private String address;

    public CustomerRequestModel(@JsonProperty(value = "email", required = true) String email,
                                @JsonProperty(value = "firstName", required = true) String firstName,
                                @JsonProperty(value = "lastName", required = true) String lastName,
                                @JsonProperty(value = "ccId", required = true) String ccId,
                                @JsonProperty(value = "address", required = true) String address) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ccId = ccId;
        this.address = address;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCcId() {
        return ccId;
    }

    public void setCcId(String ccId) {
        this.ccId = ccId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
