import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * PACKAGE_NAME
 * ToolsCollection
 * 16/5/18 | 下午5:49
 * Created by nixinsheng
 * Email:1911398892@qq.com
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("1.MainFunction");
//
//        String timeStr = "2016-05-19 15:30:00";
//        System.out.println("2."+StringToTime.string2Time(timeStr));
//
//        String PATH = "/Users/nixinsheng/Documents/GitHub/Development-Java-Tools/src/main/resources/AutoInitController.txt";
//        System.out.println(DocumentReadToString.readToString(PATH));

        /////////////////////兼容Linux/Unix/Android adb shell/////////////////////////////////////////
        System.out.println("******执行命令行开始******");
        String[] cmds = {"cd /Users/nixinsheng/","pwd","ls -la"};
        System.out.println(ShellUtils.execCommand(cmds,false,true).successMsg);
    }



    /**
     * 执行shell命令
     *String[] cmd = { "sh", "-c", "lsmod |grep linuxVmux" }或者
     *String[] cmd = { "sh", "-c", "./load_driver.sh" }
     *int tp = 1 返回执行结果  非1 返回命令执行后的输出
     */
    public static String runCommand(String[] cmd,int tp){
        StringBuffer buf = new StringBuffer(1000);
        String rt="-1";
        try {
            Process pos = Runtime.getRuntime().exec(cmd);
            pos.waitFor();
            if(tp==1){
                if(pos.exitValue()==0){
                    rt="1";
                }
            }else{
                InputStreamReader ir = new InputStreamReader(pos.getInputStream());
                LineNumberReader input = new LineNumberReader(ir);
                String ln="";
                while ((ln =input.readLine()) != null) {
                    buf.append(ln+"\n");
                }
                rt = buf.toString();
                input.close();
                ir.close();
            }
        } catch (java.io.IOException e) {
            rt=e.toString();
        }catch (Exception e) {
            rt=e.toString();
        }
        return rt;
    }

    /**
     * 执行简单命令
     * String cmd="ls"
     *int tp = 1 返回执行结果  非1 返回命令执行后的输出
     */
    public static String runCommand(String cmd,int tp){
        StringBuffer buf = new StringBuffer(1000);
        String rt="-1";
        try {
            Process pos = Runtime.getRuntime().exec(cmd);
            pos.waitFor();
            if(tp==1){
                if(pos.exitValue()==0){
                    rt="1";
                }
            }else{
                InputStreamReader ir = new InputStreamReader(pos.getInputStream());
                LineNumberReader input = new LineNumberReader(ir);
                String ln="";
                while ((ln =input.readLine()) != null) {
                    buf.append(ln+"\n");
                }
                rt = buf.toString();
                input.close();
                ir.close();
            }
        } catch (java.io.IOException e) {
            rt=e.toString();
        }catch (Exception e) {
            rt=e.toString();
        }
        return rt;
    }
}
