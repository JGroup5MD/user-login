package org.example.DTO;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DatesDTO {

    public static String  DATES(String dates){
    SimpleDateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
    Date date = new Date(1212121212121L);
    return formater.format(date);
    }

}
