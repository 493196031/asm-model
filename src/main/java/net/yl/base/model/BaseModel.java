package net.yl.base.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 基础模型
 * @author yl
 * @date 2016年12月29日
 * @param <T> Object Id 类型
 */
public 
abstract class BaseModel<T extends Serializable> {

    /**
     * Object ID
     */
    private T id;

    public T getId() {
        return id;
    }

    @Id
    @GeneratedValue(generator="system-uuid")
    public void setId(T id) {
        this.id = id;
    }
    
}
