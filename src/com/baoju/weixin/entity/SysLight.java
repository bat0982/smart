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
 * SysLight generated by hbm2java
 */
@Entity
@Table(name = "sys_light", catalog = "smartlight_dev")
public class SysLight implements java.io.Serializable {

	private String id;
	private String name;
	private Date createTime;
	private Long createBy;
	private String lightKey;
	private Integer bitNum;
	private Integer lightType;
	private Integer isOnline;
	private Long brightness;
	private Long temperature;
	private Long rgb;
	private Integer onOff;
	private Integer swithLight;
	private Integer rgbshade;
	private Integer colorBrightness;
	private String fogDid;

	public SysLight() {
	}

	public SysLight(Date createTime) {
		this.createTime = createTime;
	}

	public SysLight(String name, Date createTime, Long createBy,
			String lightKey, Integer bitNum, Integer lightType, Integer isOnline) {
		this.name = name;
		this.createTime = createTime;
		this.createBy = createBy;
		this.lightKey = lightKey;
		this.bitNum = bitNum;
		this.lightType = lightType;
		this.isOnline = isOnline;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false, length = 19)
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

	@Column(name = "light_key", length = 100)
	public String getLightKey() {
		return this.lightKey;
	}

	public void setLightKey(String lightKey) {
		this.lightKey = lightKey;
	}

	@Column(name = "bit_num")
	public Integer getBitNum() {
		return this.bitNum;
	}

	public void setBitNum(Integer bitNum) {
		this.bitNum = bitNum;
	}

	@Column(name = "light_type")
	public Integer getLightType() {
		return this.lightType;
	}

	public void setLightType(Integer lightType) {
		this.lightType = lightType;
	}
	
	@Column(name = "is_online")
	public Integer getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}
	
	@Column(name = "brightness")
	public Long getBrightness() {
		return this.brightness;
	}

	public void setBrightness(Long brightness) {
		this.brightness = brightness;
	}

	@Column(name = "temperature")
	public Long getTemperature() {
		return this.temperature;
	}

	public void setTemperature(Long temperature) {
		this.temperature = temperature;
	}

	@Column(name = "rgb")
	public Long getRgb() {
		return this.rgb;
	}

	public void setRgb(Long rgb) {
		this.rgb = rgb;
	}

	@Column(name = "on_off")
	public Integer getOnOff() {
		return this.onOff;
	}

	public void setOnOff(Integer onOff) {
		this.onOff = onOff;
	}

	@Column(name = "swith_light")
	public Integer getSwithLight() {
		return this.swithLight;
	}

	public void setSwithLight(Integer swithLight) {
		this.swithLight = swithLight;
	}

	@Column(name = "rgbshade")
	public Integer getRgbshade() {
		return this.rgbshade;
	}

	public void setRgbshade(Integer rgbshade) {
		this.rgbshade = rgbshade;
	}

	@Column(name = "color_brightness")
	public Integer getColorBrightness() {
		return this.colorBrightness;
	}

	public void setColorBrightness(Integer colorBrightness) {
		this.colorBrightness = colorBrightness;
	}

	@Column(name = "fog_did")
	public String getFogDid() {
		return fogDid;
	}

	public void setFogDid(String fogDid) {
		this.fogDid = fogDid;
	}
	

}