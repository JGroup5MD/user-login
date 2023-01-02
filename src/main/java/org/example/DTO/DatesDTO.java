package org.example.DTO;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DatesDTO {

    public static String  DATES(String dates){
    SimpleDateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
    Date date = new Date("****.**.**");
    return formater.format(date);
    }

}
