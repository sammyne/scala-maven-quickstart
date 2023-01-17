# scala-maven-quickstart

基于 Maven 的 Scala 示例项目。

## 环境
- scala - 2.10.12
- maven - 3.6.3

## 快速开始

### 编译并运行

> 相关插件为
>  - org.apache.maven.plugins/maven-assembly-plugin@3.4.2
>  - org.codehaus.mojo/exec-maven-plugin@3.1.0

```bash
mvn -DskipTests=true clean package exec:java
```

### 测试

> 相关插件为 org.scalatest/scalatest-maven-plugin@2.2.0。

```bash
mvn test
```

### 格式检查

> 相关插件为 com.diffplug.spotless/spotless-maven-plugin@2.30.0。

```bash
mvn -DskipTests=true spotless:check
```

### 格式修复

> 相关插件为 com.diffplug.spotless/spotless-maven-plugin@2.30.0。

```bash
mvn -DskipTests=true spotless:apply
```

### 生成 ScalaDoc 风格的文档

> 相关插件：org.apache.maven.plugins/maven-site-plugin@3.12.1

```bash
mvn scala:doc
```

生成的静态文件路径为 target/site/scaladocs。
