package net.yl.base;

import java.util.Date;

/**
 * 修改者记录模型
 * @author yl
 * @date 2016年12月29日
 */
public 
interface RevisedRecord<T extends Operaterable> extends Recordable {

    /**
     * 设置修改者
     * @param reviser
     */
    void setReviser(T reviser);
    
    /**
     * 获得修改者
     * @return
     */
    T getReviser();
    
    /**
     * 设置修改时间
     * @param revisedTime
     */
    void setRevisedTime(Date revisedTime);
    
    /**
     * 获得修改时间
     * @return
     */
    Date getRevisedTime();
    
}
