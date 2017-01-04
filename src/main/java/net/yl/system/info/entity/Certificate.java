package net.yl.system.info.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import net.yl.base.model.DelModel;

/**
 * ֤����Ϣ
 * @author yl
 * @date 2017��1��4��
 */
@Entity
@Table(name = "WIWJ_CERTIFICATE")
public class Certificate extends DelModel<String> {

    /**
     * ֤������
     */
    private String type;
    /**
     * ֤������
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
