package net.yl.base;

import java.util.Date;

/**
 * �����߼�¼��׼
 * @author yl
 * @date 2016��12��29��
 */
public 
interface CreateRecord<T extends Operaterable> extends Recordable {
	
	/**
	 * ���ô�����
	 * @param creater ������
	 */
	public void setCreater(T creater);
	
	/**
	 * ��ô�����
	 * @return 
	 */
	public T getCreater();
	
	/**
	 * ���ô�������
	 * @param createTime
	 */
	public void setCreateTime(Date createTime);
	
	/**
	 * ��ô�������
	 * @return
	 */
	public Date getCreatTime();
}
