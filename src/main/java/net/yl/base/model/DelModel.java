package net.yl.base.model;

import java.io.Serializable;

import net.yl.base.LogicalDeletable;

/**
 * �߼�ɾ��ģ��
 * @author yl
 * @date 2016��12��29��
 * @param <T> Object ID ����
 */
public 
class DelModel<T extends Serializable> extends BaseModel<T> implements LogicalDeletable{

    /**
     * �߼�ɾ����־λ
     */
    private boolean deleted;
    
    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

}
