package net.yl.system.region.entity;

import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import net.yl.base.model.CDUModel;

/**
 * ��Ͻ��Χ���ֳ���
 * 
 * @author yl
 * @date 2017��1��3��
 */
public 
abstract class ManagementDivision extends CDUModel<String> {

    /*---------------------------------------
     * ��������
     */
    /**
     * ����
     */
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private ManagementDivision parent;
    /**
     * �Ӽ�
     */
    @OneToMany(mappedBy = "parent")
    private Set<ManagementDivision> children;
    /*---------------------------------------
     * ��������
     */
    /**
     * ����ID
     */
    private String linkId;
    /**
     * �������
     */
    private String code;
    /**
     * ����
     */
    private String name;
    /**
     * ������
     */
    private int order;
    /**
     * �Ƿ�Ҷ�ӽڵ�
     */
    private boolean leaf;
    /**
     * ����IP��ַ
     */
    private String remoteIp;
    /**
     * ��ע
     */
    private String remark;
    /**
     * erp����
     */
    private String erpCode;
    /**
     * hr�Խ���Ϣ���ݶ���
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
