package com.wteamfly.superW.entity.vo;

import com.wteamfly.superW.helper.ValidateType;

/**
 * 订单数据层类.
 * 
 * @author Imissyou
 *
 */
public class OrdersVo extends SuperValueObject {
	/**
	 * 订单id
	 */
	@ValidateType("DIGIT")
	private String ordersId;

	/**
	 * 订单状态
	 */
	@ValidateType("DIGIT")
	private String orderState;

	/**
	 * 使用时长
	 */
	@ValidateType("DIGIT")
	private String usedTime;

	/**
	 * 取车时间
	 */
	@ValidateType("DATETIME")
	private String getCarTime;

	/**
	 * 还车时间
	 */
	@ValidateType("DATETIME")
	private String backCarTime;

	/**
	 * 总费用
	 */
	@ValidateType("DIGIT")
	private String totalCost;

	/**
	 * 生成该订单的用户id
	 */
	@ValidateType("DIGIT")
	private String userId;

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
	 * 获取订单ID的方法.
	 * 
	 * @return ordersId
	 */
	public final String getOrdersId() {
		return ordersId;
	}

	/**
	 * 设置订单ordersId的方法.
	 * 
	 * @param ordersId
	 *            赋值给ordersId的值
	 */
	public final void setOrdersId(final String ordersId) {
		this.ordersId = ordersId;
	}

	/**
	 * 设置订单orderState的值.
	 * 
	 * @return orderState
	 */
	public final String getOrderState() {
		return orderState;
	}

	/**
	 * 设置订单orderState的方法.
	 * 
	 * @param orderState
	 *            赋值给orderState的值
	 */
	public final void setOrderState(final String orderState) {
		this.orderState = orderState;
	}

	/**
	 * 设置订单usedTime的值.
	 * 
	 * @return usedTime
	 */
	public final String getUsedTime() {
		return usedTime;
	}

	/**
	 * 设置订单usedTime的方法.
	 * 
	 * @param usedTime
	 *            赋值给usedTime的值
	 */
	public final void setUsedTime(final String usedTime) {
		this.usedTime = usedTime;
	}

	/**
	 * 设置订单getCarTime的值.
	 * 
	 * @return getCarTime
	 */
	public final String getGetCarTime() {
		return getCarTime;
	}

	/**
	 * 设置订单getCarTime的方法.
	 * 
	 * @param getCarTime
	 *            赋值给getCarTime的值
	 */
	public final void setGetCarTime(final String getCarTime) {
		this.getCarTime = getCarTime;
	}

	/**
	 * 设置订单backCarTime的值.
	 * 
	 * @return backCarTime
	 */
	public final String getBackCarTime() {
		return backCarTime;
	}

	/**
	 * 设置订单backCarTime的方法.
	 * 
	 * @param backCarTime
	 *            赋值给backCarTime的值
	 */
	public final void setBackCarTime(final String backCarTime) {
		this.backCarTime = backCarTime;
	}

	/**
	 * 设置订单totalCost的值.
	 * 
	 * @return totalCost
	 */
	public final String getTotalCost() {
		return totalCost;
	}

	/**
	 * 设置订单totalCost的方法.
	 * 
	 * @param totalCost
	 *            赋值给totalCost的值
	 */
	public final void setTotalCost(final String totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 * 设置订单userId的值.
	 * 
	 * @return userId
	 */
	public final String getUserId() {
		return userId;
	}

	/**
	 * 设置订单userId的方法.
	 * 
	 * @param userId
	 *            赋值给userId的值
	 */
	public final void setUserId(final String userId) {
		this.userId = userId;
	}

	/**
	 * 设置订单carInfoId的值.
	 * 
	 * @return carInfoId
	 */
	public final String getCarInfoId() {
		return carInfoId;
	}

	/**
	 * 设置订单carInfoId的方法.
	 * 
	 * @param carInfoId
	 *            赋值给carInfoId的值
	 */
	public final void setCarInfoId(final String carInfoId) {
		this.carInfoId = carInfoId;
	}

	/**
	 * 设置订单carInfoName的值.
	 * 
	 * @return carInfoName
	 */
	public final String getCarInfoName() {
		return carInfoName;
	}

	/**
	 * 设置订单carInfoName的方法.
	 * 
	 * @param carInfoName
	 *            赋值给carInfoName的值
	 */
	public final void setCarInfoName(final String carInfoName) {
		this.carInfoName = carInfoName;
	}

	/**
	 * 设置订单carType的值.
	 * 
	 * @return carType
	 */
	public final String getCarType() {
		return carType;
	}

	/**
	 * 设置订单carType的方法.
	 * 
	 * @param carType
	 *            赋值给carType的值
	 */
	public final void setCarType(final String carType) {
		this.carType = carType;
	}

	/**
	 * 设置订单carBrand的值.
	 * 
	 * @return carBrand
	 */
	public final String getCarBrand() {
		return carBrand;
	}

	/**
	 * 设置订单carBrand的方法.
	 * 
	 * @param carBrand
	 *            赋值给carBrand的值
	 */
	public final void setCarBrand(final String carBrand) {
		this.carBrand = carBrand;
	}

	/**
	 * 设置订单carState的值.
	 * 
	 * @return carState
	 */
	public final String getCarState() {
		return carState;
	}

	/**
	 * 设置订单carState的方法.
	 * 
	 * @param carState
	 *            赋值给carState的值
	 */
	public final void setCarState(final String carState) {
		this.carState = carState;
	}

	/**
	 * 设置订单createTime的值.
	 * 
	 * @return createTime
	 */
	public final String getCreateTime() {
		return createTime;
	}

	/**
	 * 设置订单createTime的方法.
	 * 
	 * @param createTime
	 *            赋值给createTime的值
	 */
	public final void setCreateTime(final String createTime) {
		this.createTime = createTime;
	}

	/**
	 * 设置订单creatorId的值.
	 * 
	 * @return creatorId
	 */
	public final String getCreatorId() {
		return creatorId;
	}

	/**
	 * 设置订单creatorId的方法.
	 * 
	 * @param creatorId
	 *            赋值给creatorId的值
	 */
	public final void setCreatorId(final String creatorId) {
		this.creatorId = creatorId;
	}

	/**
	 * 设置订单editeTime的值.
	 * 
	 * @return editeTime
	 */
	public final String getEditeTime() {
		return editeTime;
	}

	/**
	 * 设置订单editeTime的方法.
	 * 
	 * @param editeTime
	 *            赋值给editeTime的值
	 */
	public final void setEditeTime(final String editeTime) {
		this.editeTime = editeTime;
	}

	/**
	 * 设置订单editorId的值.
	 * 
	 * @return editorId
	 */
	public final String getEditorId() {
		return editorId;
	}

	/**
	 * 设置订单editorId的方法.
	 * 
	 * @param editorId
	 *            赋值给editorId的值
	 */
	public final void setEditorId(final String editorId) {
		this.editorId = editorId;
	}

	/**
	 * 设置订单isDelete的值.
	 * 
	 * @return isDelete
	 */
	public final String getIsDelete() {
		return isDelete;
	}

	/**
	 * 设置订单isDelete的方法.
	 * 
	 * @param isDelete
	 *            赋值给isDelete的值
	 */
	public final void setIsDelete(final String isDelete) {
		this.isDelete = isDelete;
	}

	/**
	 * 设置订单version的值.
	 * 
	 * @return version
	 */
	public final String getVersion() {
		return version;
	}

	/**
	 * 设置订单version的方法.
	 * 
	 * @param version
	 *            赋值给version的值
	 */
	public final void setVersion(final String version) {
		this.version = version;
	}
}
