# gmall-mock
================================================
spark-clickhouse-es -> realtime -> mock-log
=============================================

---------------------------------------------------------------------------------------------------------------------------------------------------
common:公共模块
-> db:业务数据生成
->log:日志数据生成
---------------------------------------------------------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------------------------------------------------------
application.properties ： 
---------------------------------------------------------------------------------------------------------------------------------------------------

#外部配置打开
#logging.config=./logback.xml
#业务日期
mock.date=2020-0907

#模拟数据发送模式
mock.type=http
#http模式下，发送的地址
mock.url=http://localhost:8080/applog

#启动次数
mock.startup.count=10000
#设备最大值
mock.max.mid=50
#会员最大值
mock.max.uid=500
#商品最大值
mock.max.sku-id=10
#页面平均访问时间
mock.page.during-time-ms=20000
#错误概率 百分比
mock.error.rate=3
#每条日志发送延迟 ms
mock.log.sleep=10
#商品详情来源  用户查询，商品推广，智能推荐, 促销活动
mock.detail.source-type-rate=40:25:15:20

---------------------------------------------------------------------------------------------------------------------------------------------------
logback.xml:
---------------------------------------------------------------------------------------------------------------------------------------------------

<?xml version="1.0" encoding="UTF-8"?>
<configuration>
<!--    日志保存地方-->
    <property name="LOG_HOME" value="/opt/applog/gmall-logs" />
    <appender name="console" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%msg%n</pattern>
        </encoder>
    </appender>

    <appender name="rollingFile" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <file>${LOG_HOME}/app.log</file>
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <fileNamePattern>${LOG_HOME}/app.%d{yyyy-MM-dd}.log</fileNamePattern>
        </rollingPolicy>
        <encoder>
            <pattern>%msg%n</pattern>
        </encoder>
    </appender>


    <appender name="errorRollingFile" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <fileNamePattern>${LOG_HOME}/error.%d{yyyy-MM-dd}.%i.log</fileNamePattern>
            <timeBasedFileNamingAndTriggeringPolicy class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP">
                <maxFileSize>200mb</maxFileSize>
            </timeBasedFileNamingAndTriggeringPolicy>
            <maxHistory>10</maxHistory>
        </rollingPolicy>
        <encoder>
            <pattern>%date{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
        <filter class="ch.qos.logback.classic.filter.LevelFilter">
            <level>ERROR</level>
            <onMatch>ACCEPT</onMatch>
            <onMismatch>DENY</onMismatch>
        </filter>
    </appender>



    <appender name="async-rollingFile" class="ch.qos.logback.classic.AsyncAppender">
        <appender-ref ref="rollingFile" />
        <discardingThreshold>0</discardingThreshold>
        <queueSize>512</queueSize>
    </appender>


    <appender name="dao-rollingFile" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <fileNamePattern>./logs/dao.%d{yyyy-MM-dd}.%i.log</fileNamePattern>
            <timeBasedFileNamingAndTriggeringPolicy  class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP">
                <maxFileSize>500mb</maxFileSize>
            </timeBasedFileNamingAndTriggeringPolicy>
            <maxHistory>10</maxHistory>
        </rollingPolicy>
        <encoder>
            <pattern>%date{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>
    <appender name="async-daoRollingFile" class="ch.qos.logback.classic.AsyncAppender">
        <appender-ref ref="dao-rollingFile" />
        <includeCallerData>true</includeCallerData>
    </appender>




    <!-- 将某一个包下日志单独打印日志 -->
    <logger name="com.warehouse.gmall.mock.log.Mocker"
            level="INFO" additivity="true">
        <appender-ref ref="rollingFile" />
         <appender-ref ref="console" />
    </logger>

    <root level="error" additivity="true">
        <appender-ref ref="console" />
        <!-- <appender-ref ref="async-rollingFile" />  -->
    </root>
</configuration>
