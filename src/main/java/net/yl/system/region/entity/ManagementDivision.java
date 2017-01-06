package net.yl.system.region.entity;

import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import net.yl.base.model.CDUModel;

/**
 * 管辖范围划分抽象
 * 
 * @author yl
 * @date 2017年1月3日
 */
public 
abstract class ManagementDivision extends CDUModel<String> {

    /*---------------------------------------
     * 关联属性
     */
    /**
     * 父级
     */
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private ManagementDivision parent;
    /**
     * 子级
     */
    @OneToMany(mappedBy = "parent")
    private Set<ManagementDivision> children;
    /*---------------------------------------
     * 基本属性
     */
    /**
     * 链接ID
     */
    private String linkId;
    /**
     * 区域编码
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 排序码
     */
    private int order;
    /**
     * 是否叶子节点
     */
    private boolean leaf;
    /**
     * 创建IP地址
     */
    private String remoteIp;
    /**
     * 备注
     */
    private String remark;
    /**
     * erp编码
     */
    private String erpCode;
    /**
     * hr对接信息（暂定）
     */
    private String hr;

    public ManagementDivision getParent() {
        return parent;
    }

    public void setParent(ManagementDivision parent) {
        this.parent = parent;
    }

    public Set<ManagementDivision> getChildren() {
        return children;
    }

    public void setChildren(Set<ManagementDivision> children) {
        this.children = children;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getErpCode() {
        return erpCode;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

}
