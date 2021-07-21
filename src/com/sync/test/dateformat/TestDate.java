package com.sync.test.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

  public static void main(String[] args) throws ParseException {
    String date = "02-04-2020";
    Date d = new SimpleDateFormat("dd-MM-yyyy").parse(date);
    System.out.println("Date: "+d);
    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
    cal.add(Calendar.DAY_OF_YEAR,-1);
    Date oneDayBefore= cal.getTime();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    System.out.println("oneDayBefore: "+oneDayBefore);
    String dateString = sdf.format(oneDayBefore);
    System.out.println("date: "+date);
    System.out.println("dateString: "+dateString);
  }

}
