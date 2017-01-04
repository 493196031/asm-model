package net.yl.base.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * ����ģ��
 * @author yl
 * @date 2016��12��29��
 * @param <T> Object Id ����
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
