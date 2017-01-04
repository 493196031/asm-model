package net.yl.base.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;

import net.yl.base.CreateRecord;
import net.yl.base.LogicalDeletable;
import net.yl.base.RevisedRecord;
import net.yl.base.vo.CreatableModel;
import net.yl.base.vo.RevisableModel;
import net.yl.system.user.entity.User;

/**
 * ��¼ɾ�����޸ġ�������Ϣģ��
 * @author yl
 * @date 2016��12��29��
 * @param <T> Object ID ����
 */
public  
abstract class  CDUModel<T extends Serializable> extends DelModel<T> implements CreateRecord<User>,LogicalDeletable,RevisedRecord<User> {

    /**
     * ������ģ��
     */
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "creater", column = @Column(name = "createrId")),
            @AttributeOverride(name = "createTime", column = @Column(name = "createTime")) })
    private CreatableModel creatableModel;
    
    /**
     * �޸���ģ��
     */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "reviser", column = @Column(name = "reviserId")),
        @AttributeOverride(name = "revisedTime", column = @Column(name = "revisedTime")) })    
    private RevisableModel revisableModel;
    
    public CDUModel() {
       this(new CreatableModel(),new RevisableModel());
    }
    
    public CDUModel(CreatableModel creatableModel, RevisableModel revisableModel) {
        this.creatableModel = creatableModel;
        this.revisableModel = revisableModel;
    }

    public CreatableModel getCreatableModel() {
        return creatableModel;
    }

    public void setCreatableModel(CreatableModel creatableModel) {
        this.creatableModel = creatableModel;
    }

    public RevisableModel getRevisableModel() {
        return revisableModel;
    }

    public void setRevisableModel(RevisableModel revisableModel) {
        this.revisableModel = revisableModel;
    }

    public void setReviser(User reviser) {
        revisableModel.setReviser(reviser);
    }

    public User getReviser() {
        return revisableModel.getReviser();
    }

    public void setRevisedTime(Date revisedTime) {
        revisableModel.setRevisedTime(revisedTime);
    }

    public Date getRevisedTime() {
        return revisableModel.getRevisedTime();
    }

    public void setCreater(User creater) {
        creatableModel.setCreater(creater);
    }

    public User getCreater() {
        return creatableModel.getCreater();
    }

    public void setCreateTime(Date createTime) {
        creatableModel.setCreateTime(createTime);
    }

    public Date getCreatTime() {
        return creatableModel.getCreatTime();
    }

    @Override
    public String toString() {
        return "CDUModel [creatableModel=" + creatableModel
                + ", revisableModel=" + revisableModel + "]";
    }
}
