package com.wiredbraincoffe.producttapiannotation.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class CustomerSession {

    private String CSID;
    private String date;
    private String time;

//    public CustomerSession(String CSID, String date, String time) {
//        this.CSID = CSID;
//        this.date = date;
//        this.time = time;
//    }


}
