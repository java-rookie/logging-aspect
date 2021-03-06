package com.william.logging.listener;

import com.william.logging.model.LoggerInfo;

/**
 * 访问日志监听器,实现此接口并注入到spring容器即可获取访问日志信息
 */
public interface AccessLoggerListener {

    /**
     * 当产生访问日志时,将调用此方法.注意,此方法内的操作应尽量设置为异步操作,否则可能影响请求性能
     *
     * @param loggerInfo 产生的日志信息
     */
    void onLogger(LoggerInfo loggerInfo);

    default void onLogBefore(LoggerInfo loggerInfo){}
}
