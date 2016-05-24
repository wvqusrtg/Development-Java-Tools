![加菲猫](http://pic.cnblogs.com/avatar/614759/20150806155546.png)
## Development-Java-Tools
———Development Java Tools,java开发tools及示例程序
###1.fastjson
*    Intellij IDEA maven工程

        <dependencies>
        
          <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>3.8.1</version>
            <scope>test</scope>
          </dependency>
          
          <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
            <version>1.2.4</version>
          </dependency>
          
        </dependencies>

####2.DocumentReadToString
    /* 按字节读取字符串 */
	/* 个人感觉最好的方式，（一次读完）读字节就读字节吧，读完转码一次不就好了 */
    /**
     * @Desc 按照指定路径以utf-8读取文件,返回文件内容.
     * Created by nixinsheng on 16/5/18 | 上午11:11.
     * 
     * public static String readToString(String FILE_IN)
     */
     
###3.StringToTime
     /**
     * String 类型转换成 Time类型
     *
     * @param dateString
     * @return
     *  
     * public final static java.sql.Timestamp string2Time(String dateString) 
     */
     
###4.ShellUtils
    /////////////////////兼容Linux/Unix/Android adb shell/////////////////////////////////////////
    System.out.println("******执行命令行开始******");
    String[] cmds = {"cd /Users/nixinsheng/","pwd","ls -la"};
    System.out.println(ShellUtils.execCommand(cmds,false,true).successMsg);     
![Result](https://github.com/wvqusrtg/Development-Java-Tools/blob/master/%E6%88%AA%E5%9B%BE%E8%AE%B0%E5%BD%95/ShellUtils1.gif?raw=true)
##关于作者
```javascript
  Name:nixs(倪新生)
  E-mail:1911398892@qq.com
  Company:Asiainfo
  Blog:http://www.cnblogs.com/wvqusrtg
```
