package net.yl.base;

import java.util.Date;

/**
 * �޸��߼�¼ģ��
 * @author yl
 * @date 2016��12��29��
 */
public 
interface RevisedRecord<T extends Operaterable> extends Recordable {

    /**
     * �����޸���
     * @param reviser
     */
    void setReviser(T reviser);
    
    /**
     * ����޸���
     * @return
     */
    T getReviser();
    
    /**
     * �����޸�ʱ��
     * @param revisedTime
     */
    void setRevisedTime(Date revisedTime);
    
    /**
     * ����޸�ʱ��
     * @return
     */
    Date getRevisedTime();
    
}
