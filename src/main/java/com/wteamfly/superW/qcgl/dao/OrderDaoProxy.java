package com.wteamfly.superW.qcgl.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 订单管理Dao层.
 * @author Imissyou
 *
 */
public class OrderDaoProxy {
	 /**
     * log4j实例对象.
     */
    private static Logger logger = LogManager.getLogger(OrderDaoProxy.class);

    /**
     * 单例对象.
     */
    private static OrderDaoProxy instance = new OrderDaoProxy();

    /**
     * 单例模式的私有构造方法.
     */
    private OrderDaoProxy() {

    }

    /**
     * 获取单例.
     * 
     * @return 单例
     */
    public static OrderDaoProxy getInstance() {
        return instance;
    }
    //编辑Service的业务逻辑

}
