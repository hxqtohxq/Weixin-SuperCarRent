package com.wteamfly.superW.qcgl.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.formula.functions.T;

import com.wteamfly.superW.biz.service.ResultMessage;
import com.wteamfly.superW.entity.po.PaginationPo;
import com.wteamfly.superW.entity.po.SuperPersistentObject;
import com.wteamfly.superW.qcgl.entity.vo.CarInfoVo;

public final class Help {
	 /**
     * log4j实例对象.
     */
    private static Logger logger = LogManager
            .getLogger(Help.class);
    
    /**
     * 单例对象.
     */
    private static Help instance = new Help();
    
    /**
     * 单例模式的私有构造方法.
     */
    private Help() {
    	
    }
    /**
     * 获取单例.
     * 
     * @return 单例
     */
	public static Help getInstance() {
		return instance;
	} 
	
	/**
	 * 
	 * @param pageResult
	 * @param listVos
	 * @return
	 */
	public final ResultMessage PaginationPoToResultMessage(PaginationPo pageResult,List listVos) {
		ResultMessage rs = new ResultMessage();
         Map<String, Object> parm = new HashMap<String, Object>();
         parm.put("pageList", listVos);
         parm.put("totalCount", pageResult.getTotalCount());

         rs.setResultParm(parm);
         rs.setResultInfo("分页成功");
         rs.setServiceResult(true);
         return rs;
	}
	
    
    
}
