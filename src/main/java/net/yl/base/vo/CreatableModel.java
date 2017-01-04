package net.yl.base.vo;

import net.yl.base.CreateRecord;
import net.yl.system.user.entity.User;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 创建者记录模型
 * @author yl
 * @date 2016年12月29日
 */
@Embeddable
public 
class CreatableModel implements CreateRecord<User> {

	/**
	 * 创建者
	 */
        @ManyToOne
	private User creater;
	/**
	 * 创建时间
	 */
        @Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	public void setCreater(User creater) {
	    this.creater = creater;
	}

	public User getCreater() {
	    return this.creater;
	}

	public void setCreateTime(Date createTime) {
	    this.createTime = createTime;
	}

	public Date getCreatTime() {
	    return this.createTime;
	}

        @Override
        public String toString() {
            return "CreatableModel [creater=" + creater + ", createTime="
                    + createTime + "]";
        }
}
