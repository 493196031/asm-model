package net.yl.system.user.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import net.yl.base.Operaterable;
import net.yl.base.model.CDUModel;
import net.yl.system.dept.entity.Department;
import net.yl.system.info.entity.Certificate;
import net.yl.system.info.entity.Projection;
import net.yl.system.region.entity.Group;
import net.yl.system.region.entity.Region;
import net.yl.system.region.entity.Store;
import net.yl.system.region.entity.StoreGroup;
import net.yl.system.user.enums.Star;

/**
 * ϵͳ�û�
 * 
 * @author yl
 * @see net.yl.constant.SysDictMap
 * @date 2016��12��29��
 */
@Entity
@Table(name = "WIWJ_SYSTEM_USER")
public class User extends CDUModel<String> implements Operaterable {

    /*----------------------------------------------------------------------------
     * ���¹�������
     */
    /**
     * �������T
     */
    @ManyToOne
    private Department department;
    /**
     * ����С��
     */
    @ManyToOne
    private Projection projection;
    /**
     * ��������
     */
    @ManyToOne
    private Region region;
    /**
     * ���ڵ���
     */
    @ManyToOne
    private StoreGroup storeGroup;
    /**
     * ��������
     */
    @ManyToOne
    private Group group;
    /**
     * �ŵ�
     */
    @ManyToOne
    private Store store;
    /**
     * ����code;
     */
    private String storeCode;
    /**
     * ֤��
     */
    @ManyToOne
    private Certificate certificate;
    /*----------------------------------------------------------------------------
     * ���»�������
     */
    /**
     * ����
     */
    private String CPTRoomID;
    /**
     * �����ʼ�
     */
    private String email;
    /**
     * ��ͥסַ
     */
    private String familyAddress;
    /**
     * ����
     */
    private String fax;
    /**
     * �ֻ�����
     */
    private String mobile;
    /**
     * �̻�
     */
    private String phone;
    /**
     * ��ע
     */
    private String remark;
    /**
     * �Ա�
     */
    private String sex;
    /**
     * �û�Ȩ��
     */
    private String degree;
    /**
     * �˻�ID
     */
    private String userid;
    /**
     * �û���
     */
    private String username;
    /**
     * ����
     */
    private String password;
    /**
     * ������ʹ�õ�IP��ַ
     */
    private String createrRemoteIp;
    /**
     * ��������
     */
    private String postCode;
    /**
     * ����״̬
     */
    private boolean enable;
    /**
     * ����״̬
     */
    private boolean expired;
    /**
     * ����״̬
     */
    private boolean locked;
    /**
     * ȫְ���ְ
     */
    private boolean full;
    /**
     * �Ƿ���Ϣ
     */
    private boolean atRested;
    /**
     * �˻�״̬
     */
    private String status;
    /**
     * �Ƿ�ͬ��
     */
    private boolean sync;
    /**
     * �������������������
     */
    private Integer failCount;
    /**
     * �Ƿ�������
     */
    private boolean isPartner;
    /**
     * ����
     */
    private String isManage;
    /**
     * QQ��
     */
    private String qq;
    /**
     * ����
     */
    private String levelNum;
    /**
     * ͷ��URL
     */
    private String headImageUrl;
    /**
     * ����״̬
     */
    private String acceptStatus;
    /**
     * ����
     */
    private Integer age;
    /**
     * ��������
     */
    private Integer workingLife;
    /**
     * ��ְʱ��
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryTime;
    /**
     * ����
     */
    @Enumerated(EnumType.ORDINAL)
    private Star star;
    /**
     * �豸ID
     */
    private String deviceId;
    /**
     * �޸�����ʱ��
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastEditePwdTime;
    /**
     * ��ʱ��Ȩ��ʼʱ��
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date authenStartTime;
    /**
     * ��ʱ��Ȩ����ʱ��
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date authenEndTime;
    /**
     * ��Ȩ����
     */
    private Integer authenCount;
    /**
     * ��ʱ��Ȩ����
     */
    private Integer authenDays;
    /**
     * ����ĸƴ��
     */
    private String shortNameSpell;

    /*----------------------------------------------------------------------------
     * setter and getter
     */
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Projection getProjection() {
        return projection;
    }

    public void setProjection(Projection projection) {
        this.projection = projection;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public StoreGroup getStoreGroup() {
        return storeGroup;
    }

    public void setStoreGroup(StoreGroup storeGroup) {
        this.storeGroup = storeGroup;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public String getCPTRoomID() {
        return CPTRoomID;
    }

    public void setCPTRoomID(String cPTRoomID) {
        CPTRoomID = cPTRoomID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreaterRemoteIp() {
        return createrRemoteIp;
    }

    public void setCreaterRemoteIp(String createrRemoteIp) {
        this.createrRemoteIp = createrRemoteIp;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public boolean isAtRested() {
        return atRested;
    }

    public void setAtRested(boolean atRested) {
        this.atRested = atRested;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSync() {
        return sync;
    }

    public void setSync(boolean sync) {
        this.sync = sync;
    }

    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public boolean isPartner() {
        return isPartner;
    }

    public void setPartner(boolean isPartner) {
        this.isPartner = isPartner;
    }

    public String getIsManage() {
        return isManage;
    }

    public void setIsManage(String isManage) {
        this.isManage = isManage;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(String levelNum) {
        this.levelNum = levelNum;
    }

    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    public String getAcceptStatus() {
        return acceptStatus;
    }

    public void setAcceptStatus(String acceptStatus) {
        this.acceptStatus = acceptStatus;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWorkingLife() {
        return workingLife;
    }

    public void setWorkingLife(Integer workingLife) {
        this.workingLife = workingLife;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Date getLastEditePwdTime() {
        return lastEditePwdTime;
    }

    public void setLastEditePwdTime(Date lastEditePwdTime) {
        this.lastEditePwdTime = lastEditePwdTime;
    }

    public Date getAuthenStartTime() {
        return authenStartTime;
    }

    public void setAuthenStartTime(Date authenStartTime) {
        this.authenStartTime = authenStartTime;
    }

    public Date getAuthenEndTime() {
        return authenEndTime;
    }

    public void setAuthenEndTime(Date authenEndTime) {
        this.authenEndTime = authenEndTime;
    }

    public Integer getAuthenCount() {
        return authenCount;
    }

    public void setAuthenCount(Integer authenCount) {
        this.authenCount = authenCount;
    }

    public Integer getAuthenDays() {
        return authenDays;
    }

    public void setAuthenDays(Integer authenDays) {
        this.authenDays = authenDays;
    }

    public String getShortNameSpell() {
        return shortNameSpell;
    }

    public void setShortNameSpell(String shortNameSpell) {
        this.shortNameSpell = shortNameSpell;
    }

}
