package utils;

import org.apache.commons.lang.StringUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StringUtills {

    /**
     * This method return "" if input String is null or blank.
     * @param input
     * @return
     */
    public static String beautifyString(String input){
        if(StringUtils.isBlank(input)){
            return StringUtils.EMPTY;
        }
        return input;
    }

    /**
     * This method convert the Java Date into GCDocs applicable date format in String.
     * @param date
     * @return
     */
    public static String convertToGCDate(Date date){
        String rtn = StringUtils.EMPTY;
        if(date != null) {
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);

            int year = calendar.get(Calendar.YEAR);
            //Add one to month {0 - 11}
            int month = calendar.get(Calendar.MONTH) + 1;

            int day = calendar.get(Calendar.DAY_OF_MONTH);

            String rtnMonth;
            String rtnDay;
            if (month < 10) {
                rtnMonth = "0" + month;
            } else {
                rtnMonth = Integer.toString(month);
            }

            if (day < 10) {
                rtnDay = "0" + day;
            } else {
                rtnDay = Integer.toString(day);
            }

            rtn = Integer.toString(year) + rtnMonth + rtnDay;
        }

        return rtn;
    }

    /**
     * This method evaluates the compareDate is between the startDate and endDate.
     * @param startDate
     * @param endDate
     * @param compareDate
     * @return
     */
    public static boolean isWithinRange(Date startDate, Date endDate, Date compareDate){
        if(endDate==null){
            return true;
        }else {
            return compareDate.after(startDate) && compareDate.before(endDate);
        }
    }
}
