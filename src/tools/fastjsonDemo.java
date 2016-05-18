import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * com.company
 * hello-world
 * 16/5/4 | 下午4:51
 * Created by nixinsheng
 * Email:1911398892@qq.com
 */
public class fastjsonDemo {
    /**
     * @Author nixinsheng
     * @Email - 1911398892@qq.com
     * @Date 16/5/4 | 下午5:46
     */
    public static String toJSONString(String key) {
        HashMap<String,Object> rep = new HashMap<String,Object>();
        HashMap<String,Object> reptail = new HashMap<String,Object>();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        jsonObject.put("name","wvqusrtg");
        jsonObject.put("sex","male");
        jsonObject.put("height","1.75m");
        jsonArray.add(jsonObject);
        reptail.put(key,jsonArray);
        reptail.put("time",df.format(date));
        rep.put("rep",reptail);

        return JSON.toJSONString(rep);
    }
    /**
     * @Desc
     * Created by nixinsheng on 16/5/5 | 下午4:31.
     * @Email - 1911398892@qq.com
     */
    public String NXS_Print() {
        return super.toString();
    }

    /**
     * @Desc
     * @Author nixinsheng
     * @Email - 1911398892@qq.com
     * @Date 16/5/5 | 下午4:18
     */
    public boolean NXS_Equ(Object obj) {
        return super.equals(obj);
    }

}
