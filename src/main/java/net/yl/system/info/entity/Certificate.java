package net.yl.system.info.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import net.yl.base.model.DelModel;

/**
 * 证件信息
 * @author yl
 * @date 2017年1月4日
 */
@Entity
@Table(name = "WIWJ_CERTIFICATE")
public class Certificate extends DelModel<String> {

    /**
     * 证件类型
     */
    private String type;
    /**
     * 证件号码
     */
    private String idCard;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

}
