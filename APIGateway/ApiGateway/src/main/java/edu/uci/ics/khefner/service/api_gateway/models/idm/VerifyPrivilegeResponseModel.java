package edu.uci.ics.khefner.service.api_gateway.models.idm;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.uci.ics.khefner.service.api_gateway.models.Model;

@JsonIgnoreProperties(value = "dataValid")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerifyPrivilegeResponseModel extends Model {

    @JsonProperty(value = "resultCode", required = true)
    private int resultCode;
    @JsonProperty(value = "message", required = true)
    private String message;

    @JsonCreator
    public VerifyPrivilegeResponseModel(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultCode: " + resultCode + " Message: " + message;
    }

    @JsonProperty("resultCode")
    public int getResultCode() {
        return resultCode;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }
}
