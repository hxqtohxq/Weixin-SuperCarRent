<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<div class="divOuterFrame">
	<div class="divInnerFrame">欢迎使用SuperCarRend系统</div>
</div>
<div class="divWhiteLine"></div>
<div class="divNavigatorOuterFrame">
	<div class="divNavigatorInnerFrame">
		<s:a action="LoginAction_toLoginPage" namespace="/">[首页]</s:a>&nbsp;
		<s:a action="CarAction_myOrder" namespace="/">[我的订单]</s:a>&nbsp;
		<s:a action="CarAction_carContorl" namespace="/">[汽车管理]</s:a>&nbsp;
		<s:a namespace="/" action="CarAction_OrderContorl">[订单管理]</s:a>&nbsp;
		<s:a action="RegAction_toRegPage" namespace="/">[用户注册]</s:a>&nbsp;
		<s:a namespace="/" action="UserAuthorizeAction_findAllUsers">[用户授权管理]</s:a>&nbsp;
		<s:a namespace="/" action="RoleAction_findAllRoles">[角色管理]</s:a>&nbsp;
		<s:a namespace="/" action="RightAction_findAllRights">[权限管理]</s:a>&nbsp;
	</div>
</div>
<div class="divWhiteLine"></div>