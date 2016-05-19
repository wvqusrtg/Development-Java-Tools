/**
 * PACKAGE_NAME
 * ToolsCollection
 * 16/5/18 | 下午5:49
 * Created by nixinsheng
 * Email:1911398892@qq.com
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1.MainFunction");

        String timeStr = "2016-05-19 15:30:00";
        System.out.println("2."+StringToTime.string2Time(timeStr));

        String PATH = "/Users/nixinsheng/Documents/GitHub/Development-Java-Tools/src/main/resources/AutoInitController.txt";
        System.out.println(DocumentReadToString.readToString(PATH));

    }
}
