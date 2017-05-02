package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalcUtils {
	
	public final static String datePattern = "yyyy-MM-dd";
	private final static DateFormat dateFormat = new SimpleDateFormat(datePattern);
	private final static DateFormat monthFormat = new SimpleDateFormat("yyyy-MM");
	private final static DateFormat minuteFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	private final static DateFormat secondFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	private final static DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss"); 
	
	public static String month2str(Date date){
		return date==null ? null : monthFormat.format(date);
	}
	
	public static Date str2month(String str){
		try{
			return monthFormat.parse(str);
		}catch(Exception e){
		}
		return null;
	}
	
	public static String date2str(Date date){
		return date==null ? null : dateFormat.format(date);
	}

	public static String date2str(Date date, String pattern){
	    DateFormat formator = new SimpleDateFormat(pattern);
        return date==null ? null : formator.format(date);
    }
	
	public static Date str2date(String str){
		try{
			return dateFormat.parse(str);
		}catch(Exception e){
		}
		return null;
	}
	
	public static Date str2date(String str,String pattern){
        try{
            DateFormat formator = new SimpleDateFormat(pattern);
            return formator.parse(str);
        }catch(Exception e){
        }
        return null;
    }
    
	
	public static String minute2str(Date date){
		return date==null ? null : minuteFormat.format(date);
	}
	
	public static Date str2minute(String str){
		try{
			return minuteFormat.parse(str);
		}catch(Exception e){
		}
		return null;
	}
	
	public static String second2str(Date date){
		return date==null ? null : secondFormat.format(date);
	}
	
	public static Date str2second(String str){
		try{
			return secondFormat.parse(str);
		}catch(Exception e){
		}
		return null;
	}
	
	public static String time2str(Date date){
		return date==null ? null : timeFormat.format(date);
	}
	
	public static Date str2time(String str){
		try{
			return timeFormat.parse(str);
		}catch(Exception e){
		}
		return null;
	}
	
	public static String convertDate2Str(Date date, String symbol) {
		SimpleDateFormat sf = new SimpleDateFormat(symbol);
		return sf.format(date);
	}	
	
	/**
	 * 今天的日期
	 * @return
	 */
	public static Date getCurrentDate(){
		return DateCalcUtils.getCurrentDateTime(0,0,0).getTime();
	}
	
	/**
	 * 当月一号
	 * @return
	 */
	public static Date getMonthOfFirstDate(){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, 1); 
		cal.set(Calendar.HOUR_OF_DAY, 0); 
		cal.set(Calendar.MINUTE, 0); 
		cal.set(Calendar.SECOND, 0); 
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	
	/**
	 * 次月一号
	 * @return
	 */
	public static Date getNextMonthOfFirstDate(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, 1); 
		cal.set(Calendar.HOUR_OF_DAY, 0); 
		cal.set(Calendar.MINUTE, 0); 
		cal.set(Calendar.SECOND, 0); 
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	
	/**
	 * 上月一号
	 * @return
	 */
	public static Date getLastMonthOfFirstDate(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		cal.set(Calendar.DATE, 1); 
		cal.set(Calendar.HOUR_OF_DAY, 0); 
		cal.set(Calendar.MINUTE, 0); 
		cal.set(Calendar.SECOND, 0); 
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	
	/**
	 * 指定日期月份的最后一天
	 * @param checkDate
	 * @return
	 */
    public static int lastDayOfMonth(Date checkDate){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(checkDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }
	
	/**
	 * 上个月的今天
	 * @return
	 */
	public static Date getLastMonthDate() {
		Calendar cal = DateCalcUtils.getCurrentDateTime(0, 0, 0);
		cal.add(Calendar.MONTH, -1);
		return cal.getTime();
	}
	
	/**
	 * 今天的几点几时几分
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Calendar getCurrentDateTime(Integer hour, Integer minute, Integer second){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, hour); 
		cal.set(Calendar.MINUTE, minute); 
		cal.set(Calendar.SECOND, second); 
		cal.set(Calendar.MILLISECOND,0);
		return cal;
	}
	
	/**
	 * 几天前/后的日期
	 * @param days
	 * @return
	 */
	public static Date dateAdd(Integer days){
		Calendar cal = DateCalcUtils.getCurrentDateTime(0, 0, 0);
		cal.add(Calendar.DAY_OF_YEAR, days); 
		return cal.getTime();
	}
	
	public static Date dateAdd(Date date, Integer days){
		Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    calendar.add(Calendar.DAY_OF_YEAR, days); 
		return calendar.getTime();
	}
	
	/**
	 * 几天前/后的几点几时几分
	 * @param days
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Date datetimeAdd(Integer days, Integer hour, Integer minute, Integer second){
		Calendar cal = DateCalcUtils.getCurrentDateTime(hour, minute, second);
		cal.add(Calendar.DAY_OF_YEAR, days); 
		return cal.getTime();
	}
	
	/**
	 * 几秒前/后的日期
	 * @param days
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Date secondAdd(Integer second){
		Calendar cal = DateCalcUtils.getCurrentDateTime(0, 0, 0);
		cal.add(Calendar.SECOND, second); 
		return cal.getTime();
	}
	
	public static Date microSecAdd(Date orgDate,Integer microSeconds){
        Calendar cal = Calendar.getInstance();
        cal.setTime(orgDate);
        cal.add(Calendar.MILLISECOND, microSeconds); 
        return cal.getTime();
    }
	
	public static int getDateField(Date date, int field){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(field);
	}
	
    public static int daysInterval(Date startDate,Date endDate) {
        if(startDate == null || endDate == null || startDate.compareTo(endDate) > 0){
            return -1;
        }
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(startDate);
        
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(endDate);
        
        return (int) ((endCalendar.getTimeInMillis() - startCalendar.getTimeInMillis())/(24*60*60*1000));
    }
	
    public static int monthsInterval(Date startDate,Date endDate)  {
        if(startDate == null || endDate == null || startDate.compareTo(endDate) > 0){
            return -1;
        }
        Calendar calbegin = Calendar.getInstance();
        Calendar calend = Calendar.getInstance();
        calbegin.setTime(startDate);
        calend.setTime(endDate);
        int m_begin = calbegin.get(Calendar.MONTH)+1; 
        int m_end = calend.get(Calendar.MONTH)+1;

        int interval = m_end-m_begin+(calend.get(Calendar.YEAR)-calbegin.get(Calendar.YEAR))*12;
        
        return interval;
    }
    
    public static int yearsInterval(Date startDate,Date endDate) {
        return monthsInterval(startDate,endDate)/12;
    }
	
    public static int timeCompare(Date startDate,Date endDate){
        Calendar calbegin = Calendar.getInstance();
        Calendar calend = Calendar.getInstance();
        calbegin.setTime(startDate);
        calend.setTime(endDate);
        
        long diff = calbegin.getTimeInMillis()-calend.getTimeInMillis();
        if(diff > 0){
            return 1;
        }else if(diff == 0){
            return 0;
        }else{
            return -1;
        }
    }
	
}
