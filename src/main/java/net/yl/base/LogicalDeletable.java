package net.yl.base;

/**
 * ���߼�ɾ�����
 * @author yl
 * @date 2016��12��29��
 */
public interface LogicalDeletable {

    /**
     * �ж��Ƿ����߼�ɾ��
     * @return �߼�ɾ����־
     */
    boolean isDeleted();
    
    /**
     * �����Ƿ��߼�ɾ����־
     * @param deleted �߼�ɾ����־
     */
    void setDeleted(boolean deleted);
    
}
