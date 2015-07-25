package com.wteamfly.superW.qcgl.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.wteamfly.superW.biz.service.ResultMessage;
import com.wteamfly.superW.biz.service.SuperService;
import com.wteamfly.superW.entity.po.OrdersPo;
import com.wteamfly.superW.entity.po.PaginationPo;
import com.wteamfly.superW.entity.po.UserPo;
import com.wteamfly.superW.entity.vo.OrdersVo;
import com.wteamfly.superW.entity.vo.PaginationVo;
import com.wteamfly.superW.entity.vo.UserVo;

/**
 * 订单管理Action层.
 * 
 * @author Imissyou
 *
 */
public class OrderManageAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * log4的实体对象.
	 */
	private static Logger logger = LogManager
			.getLogger(OrderManageAction.class);

	/**
	 * 汽车信息实体.
	 */
	private OrdersVo orders;

	/**
	 * 当前用户实体.
	 */
	private UserVo currentUser;

	/**
	 * 返回信息实体.
	 */
	private ResultMessage resultMessage;

	/**
	 * 分页信息.
	 */
	private PaginationVo page;

	/**
	 * @return 获取的orders
	 */
	public final OrdersVo getOrders() {
		return orders;
	}

	/**
	 * 设置orders的方法.
	 * 
	 * @param orders
	 *            赋值给orders的值
	 */
	public final void setOrders(final OrdersVo orders) {
		this.orders = orders;
	}

	/**
	 * @return 获取的currentUser
	 */
	public final UserVo getCurrentUser() {
		return currentUser;
	}

	/**
	 * 设置currentUser的方法.
	 * 
	 * @param currentUser
	 *            赋值给currentUser的值
	 */
	public final void setCurrentUser(final UserVo currentUser) {
		this.currentUser = currentUser;
	}

	/**
	 * @return 获取的resultMessage
	 */
	public final ResultMessage getResultMessage() {
		return resultMessage;
	}

	/**
	 * 设置resultMessage的方法.
	 * 
	 * @param resultMessage
	 *            赋值给resultMessage的值
	 */
	public final void setResultMessage(final ResultMessage resultMessage) {
		this.resultMessage = resultMessage;
	}

	/**
	 * @return 获取的page
	 */
	public final PaginationVo getPage() {
		return page;
	}

	/**
	 * 设置page的方法.
	 * 
	 * @param page
	 *            赋值给page的值
	 */
	public final void setPage(final PaginationVo page) {
		this.page = page;
	}

	/**
	 * 添加订单.
	 */
	public final void addOrder() {
		logger.debug("进入方法addOrder");
		final OrdersPo orderPo = orders.voToPo(OrdersPo.class);
		final UserPo currentUserPo = currentUser.voToPo(UserPo.class);
		SuperService service = SuperService.getInstance();
		resultMessage = service.addEntity(orderPo, currentUserPo);
		resultMessage.setUserToken(true);
		logger.debug("退出方法addOrder");
	}

	/**
	 * 删除订单.
	 */
	public final void deleteOrder() {
		logger.debug("进入deleteOrder方法");
		final OrdersPo orderPo = orders.voToPo(OrdersPo.class);
		final UserPo currentUserPo = currentUser.voToPo(UserPo.class);
		final SuperService service = SuperService.getInstance();
		resultMessage = service.logicDeleteEntity(orderPo, currentUserPo);
		resultMessage.setUserToken(true);
		logger.debug("退出deleteOrder方法");
	}

	/**
	 * 编辑订单.
	 */
	public final void editOrder() {
		logger.debug("进入editOrder方法");
		final OrdersPo orderPo = orders.voToPo(OrdersPo.class);
		final UserPo currentUserPo = currentUser.voToPo(UserPo.class);
		final SuperService service = SuperService.getInstance();
		resultMessage = service.editEntity(orderPo, currentUserPo);
		resultMessage.setUserToken(true);
		logger.debug("退出editOrder方法");
	}

	/**
	 * 分页查询订单.
	 */
	public final void pageOrders() {
		logger.debug("进入pageOrders方法");
		PaginationPo paginationPo = page.voToPo(PaginationPo.class);
		OrdersPo ordersPo = null;
		if (orders != null) {
			ordersPo = orders.voToPo(OrdersPo.class);
		} else {
			ordersPo = new OrdersPo();
		}
		ordersPo.setIsDelete(false);
		final SuperService service = SuperService.getInstance();
		resultMessage = service.pageEntity(paginationPo, ordersPo);
		resultMessage.setUserToken(true);
		logger.debug("退出pageOrders方法");
	}
}
