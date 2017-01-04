package net.yl.base;

import java.util.Date;

/**
 * 创建者记录标准
 * @author yl
 * @date 2016年12月29日
 */
public 
interface CreateRecord<T extends Operaterable> extends Recordable {
	
	/**
	 * 设置创建者
	 * @param creater 创建者
	 */
	public void setCreater(T creater);
	
	/**
	 * 获得创建者
	 * @return 
	 */
	public T getCreater();
	
	/**
	 * 设置创建日期
	 * @param createTime
	 */
	public void setCreateTime(Date createTime);
	
	/**
	 * 获得创建日期
	 * @return
	 */
	public Date getCreatTime();
}
