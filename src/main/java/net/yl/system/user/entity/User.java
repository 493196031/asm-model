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
 * 系统用户
 * 
 * @author yl
 * @see net.yl.constant.SysDictMap
 * @date 2016年12月29日
 */
@Entity
@Table(name = "WIWJ_SYSTEM_USER")
public class User extends CDUModel<String> implements Operaterable {

    /*----------------------------------------------------------------------------
     * 以下关联属性
     */
    /**
     * 所属部門
     */
    @ManyToOne
    private Department department;
    /**
     * 所在小区
     */
    @ManyToOne
    private Projection projection;
    /**
     * 所属大区
     */
    @ManyToOne
    private Region region;
    /**
     * 所在店组
     */
    @ManyToOne
    private StoreGroup storeGroup;
    /**
     * 所属组团
     */
    @ManyToOne
    private Group group;
    /**
     * 门店
     */
    @ManyToOne
    private Store store;
    /**
     * 店组code;
     */
    private String storeCode;
    /**
     * 证件
     */
    @ManyToOne
    private Certificate certificate;
    /*----------------------------------------------------------------------------
     * 以下基础属性
     */
    /**
     * 机房
     */
    private String CPTRoomID;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 家庭住址
     */
    private String familyAddress;
    /**
     * 传真
     */
    private String fax;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 固话
     */
    private String phone;
    /**
     * 备注
     */
    private String remark;
    /**
     * 性别
     */
    private String sex;
    /**
     * 用户权限
     */
    private String degree;
    /**
     * 账户ID
     */
    private String userid;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建人使用的IP地址
     */
    private String createrRemoteIp;
    /**
     * 邮政编码
     */
    private String postCode;
    /**
     * 启用状态
     */
    private boolean enable;
    /**
     * 过期状态
     */
    private boolean expired;
    /**
     * 锁定状态
     */
    private boolean locked;
    /**
     * 全职或兼职
     */
    private boolean full;
    /**
     * 是否休息
     */
    private boolean atRested;
    /**
     * 账户状态
     */
    private String status;
    /**
     * 是否同步
     */
    private boolean sync;
    /**
     * 密码输入连续错误次数
     */
    private Integer failCount;
    /**
     * 是否合作伙伴
     */
    private boolean isPartner;
    /**
     * 管理
     */
    private String isManage;
    /**
     * QQ号
     */
    private String qq;
    /**
     * 级别
     */
    private String levelNum;
    /**
     * 头像URL
     */
    private String headImageUrl;
    /**
     * 接受状态
     */
    private String acceptStatus;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 工作年限
     */
    private Integer workingLife;
    /**
     * 入职时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryTime;
    /**
     * 星座
     */
    @Enumerated(EnumType.ORDINAL)
    private Star star;
    /**
     * 设备ID
     */
    private String deviceId;
    /**
     * 修改密码时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastEditePwdTime;
    /**
     * 临时授权开始时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date authenStartTime;
    /**
     * 临时授权结束时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date authenEndTime;
    /**
     * 授权次数
     */
    private Integer authenCount;
    /**
     * 临时授权天数
     */
    private Integer authenDays;
    /**
     * 首子母拼音
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
