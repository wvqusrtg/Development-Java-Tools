# Development-Java-Tools
———Development Java Tools,java开发tools及示例程序
#1.fastjson
1.Intellij IDEA maven工程
    i.pod.xml
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.asiainfo.tools</groupId>
  <artifactId>ToolsCollection</artifactId>
  <packaging>war</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>ToolsCollection Maven Webapp</name>
  <url>http://maven.apache.org</url>
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
  <build>
    <finalName>ToolsCollection</finalName>
  </build>
</project>