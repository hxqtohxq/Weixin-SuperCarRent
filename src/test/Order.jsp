<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>保存/更新权限</title>
		<link rel="stylesheet" type="text/css" href='<s:url value="/styles.css" />'>
	</head>
	<body>
		<s:include value="/header.jsp" />
		<table>
			<tr>
				<td class="tdHeader"  align="center"><h1>选择服务</h1></td>
			</tr>
			<tr>
				<td style="vertical-align: top;">
					<table>
						<tr>
							<td>
								<s:form action="ServiceAction" method="post">
								<s:hidden name="id" />
								<table>
									<tr>
										<td class="tdFormLabel">手续费:</td>
										<td class="tdFormControl"><s:textfield name="topService" cssClass="text" />20元/辆</td>
									</tr>
									<tr>
										<td class="tdFormLabel">基本保险费</td>
										<td class="tdFormControl"><s:textfield name="baseService" cssClass="text" />40元/辆</td>
									</tr>
									<tr>
										<td class="tdFormLabel">不计免赔服务费</td>
										<td class="tdFormControl"><s:checkbox name="unselfService" cssClass="text" readonly="true"/></td>
									</tr>
									<tr>
										<td class="tdFormLabel">GPS服务费</td>
										<td class="tdFormControl"><s:checkbox name="GPSService" cssClass="text" readonly="true"/></td>
									</tr>
									<tr>
										<td class="tdFormLabel">共计</td>
										<td class="tdFormControl">
											<s:textfield name="common" />
										</td>
									</tr>
								
								</table>
								</s:form>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>