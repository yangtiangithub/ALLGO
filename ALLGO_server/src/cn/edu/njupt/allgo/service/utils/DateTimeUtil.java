package cn.edu.njupt.allgo.service.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateTimeUtil {

	public static String date2string (Date date){
		SimpleDateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);
		//df.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
		String sendtime = df.format(date);
		//String sendtime = date.toString();
		return sendtime;
	}
	
	public static String currentTime(){
		SimpleDateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);
		//df.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
		String sendtime = df.format(new Date());
		return sendtime;
	}
	
	public static Date string2date (String time1) {
		Date date = null;
		if(!time1.equals("")){
			SimpleDateFormat sf = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);
				try {
					date = sf.parse(time1);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		return date;
	}
	
}
