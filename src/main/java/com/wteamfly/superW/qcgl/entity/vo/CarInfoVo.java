package com.wteamfly.superW.qcgl.entity.vo;

import com.wteamfly.superW.entity.vo.SuperValueObject;
import com.wteamfly.superW.helper.ValidateType;

/**
 * 汽车数据层类.
 * @author Imissyou
 *
 */
public class CarInfoVo extends SuperValueObject {
	
	 /**
     * 车编号.
     */
	@ValidateType("DIGIT")
    private String carInfoId;

    /**
     * 车名称.
     */
    private String carInfoName;
    
    /**
     * 车类型.
     */
    private String carType;
    
    /**
     * 车品牌.
     */
    private String carBrand;
    
    /**
     * 车状态.
     */
    @ValidateType("DIGIT")
    private String carState;
    
    /**
     * 创建时间.
     */
    @ValidateType("DATETIME")
    private String createTime;

    /**
     * 创建者编号.
     */
    @ValidateType("DIGIT")
    private String creatorId;

    /**
     * 修改时间.
     */
    @ValidateType("DATETIME")
    private String editeTime;

    /**
     * 修改者编号.
     */
    @ValidateType("DIGIT")
    private String editorId;

    /**
     * 是否删除,软删除.
     */
    @ValidateType("LETTER")
    private String isDelete;

    /**
     * 版本.
     */
    @ValidateType("DIGIT")
    private String version;
    
    /**
     * 获取车辆信息ID的方法.
     * @return carInfoId
     */
	public String getCarInfoId() {
		return carInfoId;
	}
	
    /**
     * 设置车辆信息ID的方法.
     * @param carInfoId
     *        赋值给carInfoId的值       
     */
	public final void setCarInfoId(final String carInfoId) {
		this.carInfoId = carInfoId;
	}
	
    /**
     * 获取车辆名的方法.
     * @return carInfoName
     */
	public final String getCarInfoName() {
		return carInfoName;
	}
    
	/**
	 * 设置车辆名的方法.
	 * @param carInfoName
	 *        赋值给carInfoName的值 
	 */
	public final void setCarInfoName(final String carInfoName) {
		this.carInfoName = carInfoName;
	}
    
	/**
	 * 获取车辆的类型的方法.
	 * @return carType
	 */
	public final String getCarType() {
		return carType;
	}
    
	/**
	 * 设置车辆类型的方法.
	 * @param carType
	 *       赋值给carType的值 
	 */
	public final void setCarType(final String carType) {
		this.carType = carType;
	}
	
	/**
	 * 获取carBrand的方法.
	 * @return carBrand
	 */
	public final String getCarBrand() {
		return carBrand;
	}
    
	/**
	 * 设置carBrand的方法.
	 * @param carBrand
	 *       赋值给carBrand的值 
	 */
	public final void setCarBrand(final String carBrand) {
		this.carBrand = carBrand;
	}
    
	/**
	 * 获取carState的方法.
	 * @return carState
	 */
	public final String getCarState() {
		return carState;
	}
    
	/**
	 * 设置carState的方法.
	 * @param carState
	 *       赋值给carState的值 
	 */
	public final void setCarState(final String carState) {
		this.carState = carState;
	}
    
	/**
	 * 获取createTime的方法.
	 * @return createTime
	 */
	public final String getCreateTime() {
		return createTime;
	}

	/**
	 * 设置createTime的方法.
	 * @param createTime
	 *       赋值给createTime的值 
	 */
	public final void setCreateTime(final String createTime) {
		this.createTime = createTime;
	}
    
	/**
	 * 获取creatorId的方法.
	 * @return creatorId
	 */
	public final String getCreatorId() {
		return creatorId;
	}

	/**
	 * 设置creatorId的方法.
	 * @param creatorId
	 *       赋值给creatorId的值 
	 */
	public final void setCreatorId(final String creatorId) {
		this.creatorId = creatorId;
	}
    
	/**
	 * 获取editeTime的方法.
	 * @return editeTime
	 */
	public final String getEditeTime() {
		return editeTime;
	}

	/**
	 * 设置editeTime的方法.
	 * @param editeTime
	 *       赋值给editeTime的值 
	 */
	public final void setEditeTime(final String editeTime) {
		this.editeTime = editeTime;
	}
    
	/**
	 * 获取editorId的方法.
	 * @return editorId
	 */
	public final String getEditorId() {
		return editorId;
	}

	/**
	 * 设置editorId的方法.
	 * @param editorId
	 *       赋值给editorId的值 
	 */
	public final void setEditorId(final String editorId) {
		this.editorId = editorId;
	}
    
	/**
	 * 获取isDelete的方法.
	 * @return isDelete
	 */
	public final String getIsDelete() {
		return isDelete;
	}

	/**
	 * 设置的isDelete方法.
	 * @param isDelete
	 *       赋值给isDelete的值 
	 */
	public final void setIsDelete(final String isDelete) {
		this.isDelete = isDelete;
	}
    
	/**
	 * 获取车辆的version方法.
	 * @return version
	 */
	public final String getVersion() {
		return version;
	}

	/**
	 * 设置Version的方法.
	 * @param version
	 *       赋值给version的值 
	 */
	public final void setVersion(final String version) {
		this.version = version;
	}

}
