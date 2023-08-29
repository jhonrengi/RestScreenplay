package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RespuestaPost {

    private String status;
    private DataPost data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataPost getData() {
        return data;
    }

    public void setData(DataPost data) {
        this.data = data;
    }
}
