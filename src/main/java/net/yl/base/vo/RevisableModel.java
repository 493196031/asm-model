package net.yl.base.vo;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import net.yl.base.RevisedRecord;
import net.yl.system.user.entity.User;

/**
 * 修改者记录模型
 * @author yl
 * @date 2016年12月29日
 */
@Embeddable
public 
class RevisableModel implements RevisedRecord<User>{

    /**
     * 修改者
     */
    @ManyToOne
    private User reviser;
    
    /**
     * 修改时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date revisedTime;
    
    public void setReviser(User reviser) {
        this.reviser = reviser;
    }

    public User getReviser() {
        return this.reviser;
    }

    public void setRevisedTime(Date revisedTime) {
        this.revisedTime = revisedTime;
    }

    public Date getRevisedTime() {
        return this.revisedTime;
    }

    @Override
    public String toString() {
        return "RevisableModel [reviser=" + reviser + ", revisedTime="
                + revisedTime + "]";
    }
    
}
