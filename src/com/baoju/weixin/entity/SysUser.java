package com.baoju.weixin.entity;

// Generated 2015-9-22 9:29:15 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SysUser generated by hbm2java
 */
@Entity
@Table(name = "sys_user", catalog = "smartlight_dev")
public class SysUser implements java.io.Serializable {

	private Long id;
	private String openid;
	private String nickName;
	private Date createTime;
	private Date lastUpdateTime;
	private String phone;
	private String headimgurl;
	private Integer sex;
	private String sysFlag;

	public SysUser() {
	}

	public SysUser(Date createTime) {
		this.createTime = createTime;
	}

	public SysUser(String openid, String nickName, Date createTime,
			Date lastUpdateTime, String phone, String headimgurl, Integer sex,
			String sysFlag) {
		this.openid = openid;
		this.nickName = nickName;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
		this.phone = phone;
		this.headimgurl = headimgurl;
		this.sex = sex;
		this.sysFlag = sysFlag;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "openid", length = 100)
	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	@Column(name = "nick_name", length = 100)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update_time", length = 19)
	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Column(name = "phone", length = 16)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "headimgurl", length = 500)
	public String getHeadimgurl() {
		return this.headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	@Column(name = "sex")
	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Column(name = "sys_flag", length = 2)
	public String getSysFlag() {
		return this.sysFlag;
	}

	public void setSysFlag(String sysFlag) {
		this.sysFlag = sysFlag;
	}

}