package com.live.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class LiveUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.uid
     *
     * @mbggenerated
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.account
     *
     * @mbggenerated
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.pwd
     *
     * @mbggenerated
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.real_name
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.birthday
     *
     * @mbggenerated
     */
    private Integer birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.card_id
     *
     * @mbggenerated
     */
    private String cardId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.mark
     *
     * @mbggenerated
     */
    private String mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.partner_id
     *
     * @mbggenerated
     */
    private Integer partnerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.group_id
     *
     * @mbggenerated
     */
    private Integer groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.nickname
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.avatar
     *
     * @mbggenerated
     */
    private String avatar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.add_time
     *
     * @mbggenerated
     */
    private Integer addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.add_ip
     *
     * @mbggenerated
     */
    private String addIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.last_time
     *
     * @mbggenerated
     */
    private Integer lastTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.last_ip
     *
     * @mbggenerated
     */
    private String lastIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.now_money
     *
     * @mbggenerated
     */
    private BigDecimal nowMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.brokerage_price
     *
     * @mbggenerated
     */
    private BigDecimal brokeragePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.integral
     *
     * @mbggenerated
     */
    private BigDecimal integral;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.sign_num
     *
     * @mbggenerated
     */
    private Integer signNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.status
     *
     * @mbggenerated
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.level
     *
     * @mbggenerated
     */
    private Byte level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.spread_uid
     *
     * @mbggenerated
     */
    private Integer spreadUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.spread_time
     *
     * @mbggenerated
     */
    private Integer spreadTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.user_type
     *
     * @mbggenerated
     */
    private String userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.is_promoter
     *
     * @mbggenerated
     */
    private Boolean isPromoter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.pay_count
     *
     * @mbggenerated
     */
    private Integer payCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.spread_count
     *
     * @mbggenerated
     */
    private Integer spreadCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.clean_time
     *
     * @mbggenerated
     */
    private Integer cleanTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.addres
     *
     * @mbggenerated
     */
    private String addres;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.adminid
     *
     * @mbggenerated
     */
    private Integer adminid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.login_type
     *
     * @mbggenerated
     */
    private String loginType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.clerk_id
     *
     * @mbggenerated
     */
    private Integer clerkId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.pay_money
     *
     * @mbggenerated
     */
    private BigDecimal payMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_user.bind_store_time
     *
     * @mbggenerated
     */
    private Integer bindStoreTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table live_user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.uid
     *
     * @return the value of live_user.uid
     *
     * @mbggenerated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.uid
     *
     * @param uid the value for live_user.uid
     *
     * @mbggenerated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.account
     *
     * @return the value of live_user.account
     *
     * @mbggenerated
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.account
     *
     * @param account the value for live_user.account
     *
     * @mbggenerated
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.pwd
     *
     * @return the value of live_user.pwd
     *
     * @mbggenerated
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.pwd
     *
     * @param pwd the value for live_user.pwd
     *
     * @mbggenerated
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.real_name
     *
     * @return the value of live_user.real_name
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.real_name
     *
     * @param realName the value for live_user.real_name
     *
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.birthday
     *
     * @return the value of live_user.birthday
     *
     * @mbggenerated
     */
    public Integer getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.birthday
     *
     * @param birthday the value for live_user.birthday
     *
     * @mbggenerated
     */
    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.card_id
     *
     * @return the value of live_user.card_id
     *
     * @mbggenerated
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.card_id
     *
     * @param cardId the value for live_user.card_id
     *
     * @mbggenerated
     */
    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.mark
     *
     * @return the value of live_user.mark
     *
     * @mbggenerated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.mark
     *
     * @param mark the value for live_user.mark
     *
     * @mbggenerated
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.partner_id
     *
     * @return the value of live_user.partner_id
     *
     * @mbggenerated
     */
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.partner_id
     *
     * @param partnerId the value for live_user.partner_id
     *
     * @mbggenerated
     */
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.group_id
     *
     * @return the value of live_user.group_id
     *
     * @mbggenerated
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.group_id
     *
     * @param groupId the value for live_user.group_id
     *
     * @mbggenerated
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.nickname
     *
     * @return the value of live_user.nickname
     *
     * @mbggenerated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.nickname
     *
     * @param nickname the value for live_user.nickname
     *
     * @mbggenerated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.avatar
     *
     * @return the value of live_user.avatar
     *
     * @mbggenerated
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.avatar
     *
     * @param avatar the value for live_user.avatar
     *
     * @mbggenerated
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.phone
     *
     * @return the value of live_user.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.phone
     *
     * @param phone the value for live_user.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.add_time
     *
     * @return the value of live_user.add_time
     *
     * @mbggenerated
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.add_time
     *
     * @param addTime the value for live_user.add_time
     *
     * @mbggenerated
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.add_ip
     *
     * @return the value of live_user.add_ip
     *
     * @mbggenerated
     */
    public String getAddIp() {
        return addIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.add_ip
     *
     * @param addIp the value for live_user.add_ip
     *
     * @mbggenerated
     */
    public void setAddIp(String addIp) {
        this.addIp = addIp == null ? null : addIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.last_time
     *
     * @return the value of live_user.last_time
     *
     * @mbggenerated
     */
    public Integer getLastTime() {
        return lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.last_time
     *
     * @param lastTime the value for live_user.last_time
     *
     * @mbggenerated
     */
    public void setLastTime(Integer lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.last_ip
     *
     * @return the value of live_user.last_ip
     *
     * @mbggenerated
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.last_ip
     *
     * @param lastIp the value for live_user.last_ip
     *
     * @mbggenerated
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.now_money
     *
     * @return the value of live_user.now_money
     *
     * @mbggenerated
     */
    public BigDecimal getNowMoney() {
        return nowMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.now_money
     *
     * @param nowMoney the value for live_user.now_money
     *
     * @mbggenerated
     */
    public void setNowMoney(BigDecimal nowMoney) {
        this.nowMoney = nowMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.brokerage_price
     *
     * @return the value of live_user.brokerage_price
     *
     * @mbggenerated
     */
    public BigDecimal getBrokeragePrice() {
        return brokeragePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.brokerage_price
     *
     * @param brokeragePrice the value for live_user.brokerage_price
     *
     * @mbggenerated
     */
    public void setBrokeragePrice(BigDecimal brokeragePrice) {
        this.brokeragePrice = brokeragePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.integral
     *
     * @return the value of live_user.integral
     *
     * @mbggenerated
     */
    public BigDecimal getIntegral() {
        return integral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.integral
     *
     * @param integral the value for live_user.integral
     *
     * @mbggenerated
     */
    public void setIntegral(BigDecimal integral) {
        this.integral = integral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.sign_num
     *
     * @return the value of live_user.sign_num
     *
     * @mbggenerated
     */
    public Integer getSignNum() {
        return signNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.sign_num
     *
     * @param signNum the value for live_user.sign_num
     *
     * @mbggenerated
     */
    public void setSignNum(Integer signNum) {
        this.signNum = signNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.status
     *
     * @return the value of live_user.status
     *
     * @mbggenerated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.status
     *
     * @param status the value for live_user.status
     *
     * @mbggenerated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.level
     *
     * @return the value of live_user.level
     *
     * @mbggenerated
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.level
     *
     * @param level the value for live_user.level
     *
     * @mbggenerated
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.spread_uid
     *
     * @return the value of live_user.spread_uid
     *
     * @mbggenerated
     */
    public Integer getSpreadUid() {
        return spreadUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.spread_uid
     *
     * @param spreadUid the value for live_user.spread_uid
     *
     * @mbggenerated
     */
    public void setSpreadUid(Integer spreadUid) {
        this.spreadUid = spreadUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.spread_time
     *
     * @return the value of live_user.spread_time
     *
     * @mbggenerated
     */
    public Integer getSpreadTime() {
        return spreadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.spread_time
     *
     * @param spreadTime the value for live_user.spread_time
     *
     * @mbggenerated
     */
    public void setSpreadTime(Integer spreadTime) {
        this.spreadTime = spreadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.user_type
     *
     * @return the value of live_user.user_type
     *
     * @mbggenerated
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.user_type
     *
     * @param userType the value for live_user.user_type
     *
     * @mbggenerated
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.is_promoter
     *
     * @return the value of live_user.is_promoter
     *
     * @mbggenerated
     */
    public Boolean getIsPromoter() {
        return isPromoter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.is_promoter
     *
     * @param isPromoter the value for live_user.is_promoter
     *
     * @mbggenerated
     */
    public void setIsPromoter(Boolean isPromoter) {
        this.isPromoter = isPromoter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.pay_count
     *
     * @return the value of live_user.pay_count
     *
     * @mbggenerated
     */
    public Integer getPayCount() {
        return payCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.pay_count
     *
     * @param payCount the value for live_user.pay_count
     *
     * @mbggenerated
     */
    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.spread_count
     *
     * @return the value of live_user.spread_count
     *
     * @mbggenerated
     */
    public Integer getSpreadCount() {
        return spreadCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.spread_count
     *
     * @param spreadCount the value for live_user.spread_count
     *
     * @mbggenerated
     */
    public void setSpreadCount(Integer spreadCount) {
        this.spreadCount = spreadCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.clean_time
     *
     * @return the value of live_user.clean_time
     *
     * @mbggenerated
     */
    public Integer getCleanTime() {
        return cleanTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.clean_time
     *
     * @param cleanTime the value for live_user.clean_time
     *
     * @mbggenerated
     */
    public void setCleanTime(Integer cleanTime) {
        this.cleanTime = cleanTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.addres
     *
     * @return the value of live_user.addres
     *
     * @mbggenerated
     */
    public String getAddres() {
        return addres;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.addres
     *
     * @param addres the value for live_user.addres
     *
     * @mbggenerated
     */
    public void setAddres(String addres) {
        this.addres = addres == null ? null : addres.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.adminid
     *
     * @return the value of live_user.adminid
     *
     * @mbggenerated
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.adminid
     *
     * @param adminid the value for live_user.adminid
     *
     * @mbggenerated
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.login_type
     *
     * @return the value of live_user.login_type
     *
     * @mbggenerated
     */
    public String getLoginType() {
        return loginType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.login_type
     *
     * @param loginType the value for live_user.login_type
     *
     * @mbggenerated
     */
    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.clerk_id
     *
     * @return the value of live_user.clerk_id
     *
     * @mbggenerated
     */
    public Integer getClerkId() {
        return clerkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.clerk_id
     *
     * @param clerkId the value for live_user.clerk_id
     *
     * @mbggenerated
     */
    public void setClerkId(Integer clerkId) {
        this.clerkId = clerkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.pay_money
     *
     * @return the value of live_user.pay_money
     *
     * @mbggenerated
     */
    public BigDecimal getPayMoney() {
        return payMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.pay_money
     *
     * @param payMoney the value for live_user.pay_money
     *
     * @mbggenerated
     */
    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_user.bind_store_time
     *
     * @return the value of live_user.bind_store_time
     *
     * @mbggenerated
     */
    public Integer getBindStoreTime() {
        return bindStoreTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_user.bind_store_time
     *
     * @param bindStoreTime the value for live_user.bind_store_time
     *
     * @mbggenerated
     */
    public void setBindStoreTime(Integer bindStoreTime) {
        this.bindStoreTime = bindStoreTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", account=").append(account);
        sb.append(", pwd=").append(pwd);
        sb.append(", realName=").append(realName);
        sb.append(", birthday=").append(birthday);
        sb.append(", cardId=").append(cardId);
        sb.append(", mark=").append(mark);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", groupId=").append(groupId);
        sb.append(", nickname=").append(nickname);
        sb.append(", avatar=").append(avatar);
        sb.append(", phone=").append(phone);
        sb.append(", addTime=").append(addTime);
        sb.append(", addIp=").append(addIp);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", lastIp=").append(lastIp);
        sb.append(", nowMoney=").append(nowMoney);
        sb.append(", brokeragePrice=").append(brokeragePrice);
        sb.append(", integral=").append(integral);
        sb.append(", signNum=").append(signNum);
        sb.append(", status=").append(status);
        sb.append(", level=").append(level);
        sb.append(", spreadUid=").append(spreadUid);
        sb.append(", spreadTime=").append(spreadTime);
        sb.append(", userType=").append(userType);
        sb.append(", isPromoter=").append(isPromoter);
        sb.append(", payCount=").append(payCount);
        sb.append(", spreadCount=").append(spreadCount);
        sb.append(", cleanTime=").append(cleanTime);
        sb.append(", addres=").append(addres);
        sb.append(", adminid=").append(adminid);
        sb.append(", loginType=").append(loginType);
        sb.append(", clerkId=").append(clerkId);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", bindStoreTime=").append(bindStoreTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}