package net.yl.base.model;

import java.io.Serializable;

import net.yl.base.LogicalDeletable;

/**
 * 逻辑删除模型
 * @author yl
 * @date 2016年12月29日
 * @param <T> Object ID 类型
 */
public 
class DelModel<T extends Serializable> extends BaseModel<T> implements LogicalDeletable{

    /**
     * 逻辑删除标志位
     */
    private boolean deleted;
    
    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

}
