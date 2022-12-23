package org.example.helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dateParser {

    public static Date parseDate(String birthDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY", Locale.ENGLISH);
        Date bthDate = new Date();

        try {
            bthDate = formatter.parse(birthDate);
        } catch (ParseException e) {

        }
        return bthDate;
    }

}
