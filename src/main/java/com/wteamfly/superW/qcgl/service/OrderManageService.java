package com.wteamfly.superW.qcgl.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class OrderManageService {
	  /**
     * log4j实例对象.
     */
    private static Logger logger = LogManager
            .getLogger(OrderManageService.class);

    /**
     * 单例对象.
     */
    private static OrderManageService instance = new OrderManageService();

    /**
     * 单例模式的私有构造方法.
     */
    private OrderManageService() {
    }
    
    /**
     * 获取单例.
     * 
     * @return 单例
     */
    public static OrderManageService getInstance() {
        return instance;
    }
    //开始业务的编辑

}
