/**
 * Copyright (c) 2014 Wteamfly.  All rights reserved. 网飞公司 版权所有.
 * 请勿修改或删除版权声明及文件头部.
 */
package com.wteamfly.superW.entity.vo;

import com.wteamfly.superW.helper.ValidateType;

/**
 * 角色行为映射数据值对象类.
 * 
 * @author 侯骏雄
 * @since 3.0.0
 */
public class RolePermissionMapVo extends SuperValueObject {
    /**
     * 角色行为映射编号.
     */
    @ValidateType("DIGIT")
    private String rolePermissionMapId;

    /**
     * 行为编号.
     */
    @ValidateType("DIGIT")
    private String permissionId;

    /**
     * 角色编号.
     */
    @ValidateType("DIGIT")
    private String roleId;

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
     * 是否删除.
     */
    @ValidateType("LETTER")
    private String isDelete;

    /**
     * 是否冻结.
     */
    @ValidateType("LETTER")
    private String isLockUp;

    /**
     * 版本.
     */
    @ValidateType("DIGIT")
    private String version;

    /**
     * @return 获取的rolePermissionMapId
     */
    public final String getRolePermissionMapId() {
        return rolePermissionMapId;
    }

    /**
     * 设置rolePermissionMapId的方法.
     * 
     * @param rolePermissionMapId
     *            赋值给rolePermissionMapId的值
     */
    public final void setRolePermissionMapId(final String rolePermissionMapId) {
        this.rolePermissionMapId = rolePermissionMapId;
    }

    /**
     * @return 获取的permissionId
     */
    public final String getPermissionId() {
        return permissionId;
    }

    /**
     * 设置permissionId的方法.
     * 
     * @param permissionId
     *            赋值给permissionId的值
     */
    public final void setPermissionId(final String permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * @return 获取的roleId
     */
    public final String getRoleId() {
        return roleId;
    }

    /**
     * 设置roleId的方法.
     * 
     * @param roleId
     *            赋值给roleId的值
     */
    public final void setRoleId(final String roleId) {
        this.roleId = roleId;
    }

    /**
     * @return 获取的createTime
     */
    public final String getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime的方法.
     * 
     * @param createTime
     *            赋值给createTime的值
     */
    public final void setCreateTime(final String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return 获取的creatorId
     */
    public final String getCreatorId() {
        return creatorId;
    }

    /**
     * 设置creatorId的方法.
     * 
     * @param creatorId
     *            赋值给creatorId的值
     */
    public final void setCreatorId(final String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * @return 获取的editeTime
     */
    public final String getEditeTime() {
        return editeTime;
    }

    /**
     * 设置editeTime的方法.
     * 
     * @param editeTime
     *            赋值给editeTime的值
     */
    public final void setEditeTime(final String editeTime) {
        this.editeTime = editeTime;
    }

    /**
     * @return 获取的editorId
     */
    public final String getEditorId() {
        return editorId;
    }

    /**
     * 设置editorId的方法.
     * 
     * @param editorId
     *            赋值给editorId的值
     */
    public final void setEditorId(final String editorId) {
        this.editorId = editorId;
    }

    /**
     * @return 获取的isDelete
     */
    public final String getIsDelete() {
        return isDelete;
    }

    /**
     * 设置isDelete的方法.
     * 
     * @param isDelete
     *            赋值给isDelete的值
     */
    public final void setIsDelete(final String isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * @return 获取的isLockUp
     */
    public final String getIsLockUp() {
        return isLockUp;
    }

    /**
     * 设置isLockUp的方法.
     * 
     * @param isLockUp
     *            赋值给isLockUp的值
     */
    public final void setIsLockUp(final String isLockUp) {
        this.isLockUp = isLockUp;
    }

    /**
     * @return 获取的version
     */
    public final String getVersion() {
        return version;
    }

    /**
     * 设置version的方法.
     * 
     * @param version
     *            赋值给version的值
     */
    public final void setVersion(final String version) {
        this.version = version;
    }

}
