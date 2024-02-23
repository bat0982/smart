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
 * SysDevice generated by hbm2java
 */
@Entity
@Table(name = "sys_device", catalog = "smartlight_dev")
public class SysDevice implements java.io.Serializable {

	private Long id;
	private String name;
	private String mac;
	private String fogDid;
	private String fogPasscode;
	private String wxDid;
	private String wxQrticket;
	private String deviceType;
	private Date createTime;
	private Long createBy;
	private Integer status;
	private Integer isOnline;
	private Date lastUpdateTime;

	public SysDevice() {
	}

	public SysDevice(String name, String mac, String fogDid,
			String fogPasscode, String wxDid, String wxQrticket,
			String deviceType, Date createTime, Long createBy, Integer status,
			Integer isOnline, Date lastUpdateTime) {
		this.name = name;
		this.mac = mac;
		this.fogDid = fogDid;
		this.fogPasscode = fogPasscode;
		this.wxDid = wxDid;
		this.wxQrticket = wxQrticket;
		this.deviceType = deviceType;
		this.createTime = createTime;
		this.createBy = createBy;
		this.status = status;
		this.isOnline = isOnline;
		this.lastUpdateTime = lastUpdateTime;
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

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "mac", length = 50)
	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	@Column(name = "fog_did", length = 500)
	public String getFogDid() {
		return this.fogDid;
	}

	public void setFogDid(String fogDid) {
		this.fogDid = fogDid;
	}

	@Column(name = "fog_passcode", length = 500)
	public String getFogPasscode() {
		return this.fogPasscode;
	}

	public void setFogPasscode(String fogPasscode) {
		this.fogPasscode = fogPasscode;
	}

	@Column(name = "wx_did", length = 500)
	public String getWxDid() {
		return this.wxDid;
	}

	public void setWxDid(String wxDid) {
		this.wxDid = wxDid;
	}

	@Column(name = "wx_qrticket", length = 500)
	public String getWxQrticket() {
		return this.wxQrticket;
	}

	public void setWxQrticket(String wxQrticket) {
		this.wxQrticket = wxQrticket;
	}

	@Column(name = "device_type", length = 100)
	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "create_by")
	public Long getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "is_online")
	public Integer getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update_time", length = 19)
	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

}