/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.otpravlennye.zajavki.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link otpravlennye_zajavki}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see otpravlennye_zajavki
 * @generated
 */
@ProviderType
public class otpravlennye_zajavkiWrapper implements otpravlennye_zajavki,
	ModelWrapper<otpravlennye_zajavki> {
	public otpravlennye_zajavkiWrapper(
		otpravlennye_zajavki otpravlennye_zajavki) {
		_otpravlennye_zajavki = otpravlennye_zajavki;
	}

	@Override
	public Class<?> getModelClass() {
		return otpravlennye_zajavki.class;
	}

	@Override
	public String getModelClassName() {
		return otpravlennye_zajavki.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_otpravki", getData_otpravki());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("kolichestvo_otpravok", getKolichestvo_otpravok());
		attributes.put("lot_id", getLot_id());
		attributes.put("otpravil", getOtpravil());
		attributes.put("otpravlennye_zajavki_id", getOtpravlennye_zajavki_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		Date data_otpravki = (Date)attributes.get("data_otpravki");

		if (data_otpravki != null) {
			setData_otpravki(data_otpravki);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long kolichestvo_otpravok = (Long)attributes.get("kolichestvo_otpravok");

		if (kolichestvo_otpravok != null) {
			setKolichestvo_otpravok(kolichestvo_otpravok);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		Long otpravil = (Long)attributes.get("otpravil");

		if (otpravil != null) {
			setOtpravil(otpravil);
		}

		Long otpravlennye_zajavki_id = (Long)attributes.get(
				"otpravlennye_zajavki_id");

		if (otpravlennye_zajavki_id != null) {
			setOtpravlennye_zajavki_id(otpravlennye_zajavki_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _otpravlennye_zajavki.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _otpravlennye_zajavki.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _otpravlennye_zajavki.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _otpravlennye_zajavki.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.otpravlennye.zajavki.model.otpravlennye_zajavki> toCacheModel() {
		return _otpravlennye_zajavki.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.otpravlennye.zajavki.model.otpravlennye_zajavki otpravlennye_zajavki) {
		return _otpravlennye_zajavki.compareTo(otpravlennye_zajavki);
	}

	@Override
	public int hashCode() {
		return _otpravlennye_zajavki.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _otpravlennye_zajavki.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new otpravlennye_zajavkiWrapper((otpravlennye_zajavki)_otpravlennye_zajavki.clone());
	}

	@Override
	public java.lang.String toString() {
		return _otpravlennye_zajavki.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _otpravlennye_zajavki.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this otpravlennye_zajavki.
	*
	* @return the data_izmenenija of this otpravlennye_zajavki
	*/
	@Override
	public Date getData_izmenenija() {
		return _otpravlennye_zajavki.getData_izmenenija();
	}

	/**
	* Returns the data_otpravki of this otpravlennye_zajavki.
	*
	* @return the data_otpravki of this otpravlennye_zajavki
	*/
	@Override
	public Date getData_otpravki() {
		return _otpravlennye_zajavki.getData_otpravki();
	}

	/**
	* Returns the izmenil of this otpravlennye_zajavki.
	*
	* @return the izmenil of this otpravlennye_zajavki
	*/
	@Override
	public long getIzmenil() {
		return _otpravlennye_zajavki.getIzmenil();
	}

	/**
	* Returns the izvewenie_id of this otpravlennye_zajavki.
	*
	* @return the izvewenie_id of this otpravlennye_zajavki
	*/
	@Override
	public long getIzvewenie_id() {
		return _otpravlennye_zajavki.getIzvewenie_id();
	}

	/**
	* Returns the kolichestvo_otpravok of this otpravlennye_zajavki.
	*
	* @return the kolichestvo_otpravok of this otpravlennye_zajavki
	*/
	@Override
	public long getKolichestvo_otpravok() {
		return _otpravlennye_zajavki.getKolichestvo_otpravok();
	}

	/**
	* Returns the lot_id of this otpravlennye_zajavki.
	*
	* @return the lot_id of this otpravlennye_zajavki
	*/
	@Override
	public long getLot_id() {
		return _otpravlennye_zajavki.getLot_id();
	}

	/**
	* Returns the otpravil of this otpravlennye_zajavki.
	*
	* @return the otpravil of this otpravlennye_zajavki
	*/
	@Override
	public long getOtpravil() {
		return _otpravlennye_zajavki.getOtpravil();
	}

	/**
	* Returns the otpravlennye_zajavki_id of this otpravlennye_zajavki.
	*
	* @return the otpravlennye_zajavki_id of this otpravlennye_zajavki
	*/
	@Override
	public long getOtpravlennye_zajavki_id() {
		return _otpravlennye_zajavki.getOtpravlennye_zajavki_id();
	}

	/**
	* Returns the postavwik_id of this otpravlennye_zajavki.
	*
	* @return the postavwik_id of this otpravlennye_zajavki
	*/
	@Override
	public long getPostavwik_id() {
		return _otpravlennye_zajavki.getPostavwik_id();
	}

	/**
	* Returns the primary key of this otpravlennye_zajavki.
	*
	* @return the primary key of this otpravlennye_zajavki
	*/
	@Override
	public long getPrimaryKey() {
		return _otpravlennye_zajavki.getPrimaryKey();
	}

	/**
	* Returns the status of this otpravlennye_zajavki.
	*
	* @return the status of this otpravlennye_zajavki
	*/
	@Override
	public long getStatus() {
		return _otpravlennye_zajavki.getStatus();
	}

	@Override
	public tj.otpravlennye.zajavki.model.otpravlennye_zajavki toEscapedModel() {
		return new otpravlennye_zajavkiWrapper(_otpravlennye_zajavki.toEscapedModel());
	}

	@Override
	public tj.otpravlennye.zajavki.model.otpravlennye_zajavki toUnescapedModel() {
		return new otpravlennye_zajavkiWrapper(_otpravlennye_zajavki.toUnescapedModel());
	}

	@Override
	public void persist() {
		_otpravlennye_zajavki.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_otpravlennye_zajavki.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this otpravlennye_zajavki.
	*
	* @param data_izmenenija the data_izmenenija of this otpravlennye_zajavki
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_otpravlennye_zajavki.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_otpravki of this otpravlennye_zajavki.
	*
	* @param data_otpravki the data_otpravki of this otpravlennye_zajavki
	*/
	@Override
	public void setData_otpravki(Date data_otpravki) {
		_otpravlennye_zajavki.setData_otpravki(data_otpravki);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_otpravlennye_zajavki.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_otpravlennye_zajavki.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_otpravlennye_zajavki.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izmenil of this otpravlennye_zajavki.
	*
	* @param izmenil the izmenil of this otpravlennye_zajavki
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_otpravlennye_zajavki.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenie_id of this otpravlennye_zajavki.
	*
	* @param izvewenie_id the izvewenie_id of this otpravlennye_zajavki
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_otpravlennye_zajavki.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the kolichestvo_otpravok of this otpravlennye_zajavki.
	*
	* @param kolichestvo_otpravok the kolichestvo_otpravok of this otpravlennye_zajavki
	*/
	@Override
	public void setKolichestvo_otpravok(long kolichestvo_otpravok) {
		_otpravlennye_zajavki.setKolichestvo_otpravok(kolichestvo_otpravok);
	}

	/**
	* Sets the lot_id of this otpravlennye_zajavki.
	*
	* @param lot_id the lot_id of this otpravlennye_zajavki
	*/
	@Override
	public void setLot_id(long lot_id) {
		_otpravlennye_zajavki.setLot_id(lot_id);
	}

	@Override
	public void setNew(boolean n) {
		_otpravlennye_zajavki.setNew(n);
	}

	/**
	* Sets the otpravil of this otpravlennye_zajavki.
	*
	* @param otpravil the otpravil of this otpravlennye_zajavki
	*/
	@Override
	public void setOtpravil(long otpravil) {
		_otpravlennye_zajavki.setOtpravil(otpravil);
	}

	/**
	* Sets the otpravlennye_zajavki_id of this otpravlennye_zajavki.
	*
	* @param otpravlennye_zajavki_id the otpravlennye_zajavki_id of this otpravlennye_zajavki
	*/
	@Override
	public void setOtpravlennye_zajavki_id(long otpravlennye_zajavki_id) {
		_otpravlennye_zajavki.setOtpravlennye_zajavki_id(otpravlennye_zajavki_id);
	}

	/**
	* Sets the postavwik_id of this otpravlennye_zajavki.
	*
	* @param postavwik_id the postavwik_id of this otpravlennye_zajavki
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_otpravlennye_zajavki.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this otpravlennye_zajavki.
	*
	* @param primaryKey the primary key of this otpravlennye_zajavki
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_otpravlennye_zajavki.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_otpravlennye_zajavki.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this otpravlennye_zajavki.
	*
	* @param status the status of this otpravlennye_zajavki
	*/
	@Override
	public void setStatus(long status) {
		_otpravlennye_zajavki.setStatus(status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof otpravlennye_zajavkiWrapper)) {
			return false;
		}

		otpravlennye_zajavkiWrapper otpravlennye_zajavkiWrapper = (otpravlennye_zajavkiWrapper)obj;

		if (Objects.equals(_otpravlennye_zajavki,
					otpravlennye_zajavkiWrapper._otpravlennye_zajavki)) {
			return true;
		}

		return false;
	}

	@Override
	public otpravlennye_zajavki getWrappedModel() {
		return _otpravlennye_zajavki;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _otpravlennye_zajavki.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _otpravlennye_zajavki.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_otpravlennye_zajavki.resetOriginalValues();
	}

	private final otpravlennye_zajavki _otpravlennye_zajavki;
}