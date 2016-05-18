import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * com.company
 * hello-world
 * 16/5/18 | 下午3:11
 * Created by nixinsheng
 * Email:1911398892@qq.com
 */
public class StringToTime {
    /**
     * String 类型转换成 Time类型
     *
     * @param dateString
     * @return
     */
    public final static java.sql.Timestamp string2Time(String dateString) {
        DateFormat dateFormat;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss", Locale.ENGLISH);
        dateFormat.setLenient(false);
        java.util.Date timeDate;
        try {
            timeDate = dateFormat.parse(dateString);
            java.sql.Timestamp dateTime = new java.sql.Timestamp(
                    timeDate.getTime());
            return dateTime;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
