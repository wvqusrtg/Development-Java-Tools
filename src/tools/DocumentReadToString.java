import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * com.company
 * hello-world
 * 16/5/18 | 上午11:09
 * Created by nixinsheng
 * Email:1911398892@qq.com
 */
public class DocumentReadToString {
    /* 按字节读取字符串 */
	/* 个人感觉最好的方式，（一次读完）读字节就读字节吧，读完转码一次不就好了 */
    /**
     * @Desc 按照指定路径以utf-8读取文件,返回文件内容.
     * Created by nixinsheng on 16/5/18 | 上午11:11.
     */
    public static String readToString(String FILE_IN)
    {
        String str = "";
        File file = new File(FILE_IN);
        try {
            FileInputStream in = new FileInputStream(file);
            // size 为字串的长度 ，这里一次性读完
            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            in.close();
            str = new String(buffer, "utf8");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return str;
    }
}
