package com.wteamfly.superW.entity.po;

import java.util.Date;

public class TmpOrders extends SuperPersistentObject {

	/**
	 * 订单id
	 */
	private Long ordersId;

	/**
	 * 使用时长
	 */
	private Integer usedTime;

	/**
	 * 取车时间
	 */
	private Date getCarTime;

	/**
	 * 还车时间
	 */
	private Date backCarTime;

	/**
	 * 总费用
	 */
	private Long totalCost;

	/**
	 * 生成该订单的用户id
	 */
	private Long userId;
	/**
	 * 车编号.
	 */
	private Long carInfoId;

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
	 * 创建时间.
	 */
	private Date createTime;

	/**
	 * 创建者编号.
	 */
	private Long creatorId;

	/**
	 * 修改时间.
	 */
	private Date editeTime;

	/**
	 * 修改者编号.
	 */
	private Long editorId;

	/**
	 * 是否删除,软删除.
	 */
	private Boolean isDelete;

	/**
	 * 版本.
	 */
	private Long version;

	/**
	 * @return 获取的ordersId
	 */
	public final Long getOrdersId() {
		return ordersId;
	}

	/**
	 * 设置ordersId的方法.
	 * 
	 * @param ordersId
	 *            赋值给ordersId的值
	 */
	public final void setOrdersId(final Long ordersId) {
		this.ordersId = ordersId;
	}

	/**
	 * @return获取的usedTime.
	 */
	public final Integer getUsedTime() {
		return usedTime;
	}

	/**
	 * 设置usedTime的方法.
	 * 
	 * @param usedTime
	 *            赋值给usedTime的值
	 */
	public final void setUsedTime(final Integer usedTime) {
		this.usedTime = usedTime;
	}

	/**
	 * @return获取的.
	 */
	public final Date getGetCarTime() {
		return getCarTime;
	}

	/**
	 * 设置getCarTime的方法.
	 * 
	 * @param getCarTime
	 *            赋值给getCarTime的值
	 */
	public final void setGetCarTime(final Date getCarTime) {
		this.getCarTime = getCarTime;
	}

	/**
	 * @return获取的backCarTime.
	 */
	public final Date getBackCarTime() {
		return backCarTime;
	}

	/**
	 * 设置backCarTime的方法.
	 * 
	 * @param backCarTime
	 *            赋值给backCarTime的值
	 */
	public final void setBackCarTime(final Date backCarTime) {
		this.backCarTime = backCarTime;
	}

	/**
	 * @return获取的totalCost.
	 */
	public final Long getTotalCost() {
		return totalCost;
	}

	/**
	 * 设置totalCost的方法.
	 * 
	 * @param totalCost
	 *            赋值给totalCost的值
	 */
	public final void setTotalCost(final Long totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 * @return获取的userId.
	 */
	public final Long getUserId() {
		return userId;
	}

	/**
	 * 设置userId的方法.
	 * 
	 * @param userId
	 *            赋值给userId的值
	 */
	public final void setUserId(final Long userId) {
		this.userId = userId;
	}

	/**
	 * @return获取的carInfoId.
	 */
	public final Long getCarInfoId() {
		return carInfoId;
	}

	/**
	 * 设置carInfoId的方法.
	 * 
	 * @param carInfoId
	 *            赋值给carInfoId的值
	 */
	public final void setCarInfoId(final Long carInfoId) {
		this.carInfoId = carInfoId;
	}

	/**
	 * @return获取的carInfoName。
	 */
	public final String getCarInfoName() {
		return carInfoName;
	}

	/**
	 * 设置carInfoName的方法.
	 * 
	 * @param carInfoName
	 *            赋值给carInfoName的值
	 */
	public final void setCarInfoName(final String carInfoName) {
		this.carInfoName = carInfoName;
	}

	/**
	 * @return获取的carType.
	 */
	public final String getCarType() {
		return carType;
	}

	/**
	 * 设置carType的方法.
	 * 
	 * @param carType
	 *            赋值给carType的值
	 */
	public final void setCarType(final String carType) {
		this.carType = carType;
	}

	/**
	 * @return获取的carBrand.
	 */
	public final String getCarBrand() {
		return carBrand;
	}

	/**
	 * 设置carBrand的方法.
	 * 
	 * @param carBrand
	 *            赋值给carBrand的值
	 */
	public final void setCarBrand(final String carBrand) {
		this.carBrand = carBrand;
	}

	/**
	 * @return 获取的createTimed.
	 */
	public final Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置createTime的方法.
	 * 
	 * @param createTime
	 *            赋值给createTime的值
	 */
	public final void setCreateTime(final Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return 获取的creatorId.
	 */
	public final Long getCreatorId() {
		return creatorId;
	}

	/**
	 * 设置creatorId的方法.
	 * 
	 * @param creatorId
	 *            赋值给creatorId的值
	 */
	public final void setCreatorId(final Long creatorId) {
		this.creatorId = creatorId;
	}

	/**
	 * @return 获取的editeTime.
	 */
	public final Date getEditeTime() {
		return editeTime;
	}

	/**
	 * 设置editeTime的方法.
	 * 
	 * @param editeTime
	 *            赋值给editeTime的值
	 */
	public final void setEditeTime(final Date editeTime) {
		this.editeTime = editeTime;
	}

	/**
	 * @return 获取的editorId.
	 */
	public final Long getEditorId() {
		return editorId;
	}

	/**
	 * 设置editorId的方法.
	 * 
	 * @param editorId
	 *            赋值给editorId的值
	 */
	public final void setEditorId(final Long editorId) {
		this.editorId = editorId;
	}

	/**
	 * @return 获取的isDelete.
	 */
	public final Boolean getIsDelete() {
		return isDelete;
	}

	/**
	 * 设置isDelete的方法.
	 * 
	 * @param isDelete
	 *            赋值给isDelete的值
	 */
	public final void setIsDelete(final Boolean isDelete) {
		this.isDelete = isDelete;
	}

	/**
	 * @return 获取的version.
	 */
	public final Long getVersion() {
		return version;
	}

	/**
	 * 设置version的方法.
	 * 
	 * @param version
	 *            赋值给version的值
	 */
	public final void setVersion(final Long version) {
		this.version = version;
	}
}
