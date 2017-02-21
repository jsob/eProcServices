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

package tj.rajony.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link rajony}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rajony
 * @generated
 */
@ProviderType
public class rajonyWrapper implements rajony, ModelWrapper<rajony> {
	public rajonyWrapper(rajony rajony) {
		_rajony = rajony;
	}

	@Override
	public Class<?> getModelClass() {
		return rajony.class;
	}

	@Override
	public String getModelClassName() {
		return rajony.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kod_vbk", getKod_vbk());
		attributes.put("nazvanie", getNazvanie());
		attributes.put("oblast_id", getOblast_id());
		attributes.put("rajony_id", getRajony_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long kod_vbk = (Long)attributes.get("kod_vbk");

		if (kod_vbk != null) {
			setKod_vbk(kod_vbk);
		}

		String nazvanie = (String)attributes.get("nazvanie");

		if (nazvanie != null) {
			setNazvanie(nazvanie);
		}

		Long oblast_id = (Long)attributes.get("oblast_id");

		if (oblast_id != null) {
			setOblast_id(oblast_id);
		}

		Long rajony_id = (Long)attributes.get("rajony_id");

		if (rajony_id != null) {
			setRajony_id(rajony_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _rajony.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _rajony.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _rajony.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _rajony.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.rajony.model.rajony> toCacheModel() {
		return _rajony.toCacheModel();
	}

	@Override
	public int compareTo(tj.rajony.model.rajony rajony) {
		return _rajony.compareTo(rajony);
	}

	@Override
	public int hashCode() {
		return _rajony.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rajony.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new rajonyWrapper((rajony)_rajony.clone());
	}

	/**
	* Returns the nazvanie of this rajony.
	*
	* @return the nazvanie of this rajony
	*/
	@Override
	public java.lang.String getNazvanie() {
		return _rajony.getNazvanie();
	}

	@Override
	public java.lang.String toString() {
		return _rajony.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rajony.toXmlString();
	}

	/**
	* Returns the kod_vbk of this rajony.
	*
	* @return the kod_vbk of this rajony
	*/
	@Override
	public long getKod_vbk() {
		return _rajony.getKod_vbk();
	}

	/**
	* Returns the oblast_id of this rajony.
	*
	* @return the oblast_id of this rajony
	*/
	@Override
	public long getOblast_id() {
		return _rajony.getOblast_id();
	}

	/**
	* Returns the primary key of this rajony.
	*
	* @return the primary key of this rajony
	*/
	@Override
	public long getPrimaryKey() {
		return _rajony.getPrimaryKey();
	}

	/**
	* Returns the rajony_id of this rajony.
	*
	* @return the rajony_id of this rajony
	*/
	@Override
	public long getRajony_id() {
		return _rajony.getRajony_id();
	}

	@Override
	public tj.rajony.model.rajony toEscapedModel() {
		return new rajonyWrapper(_rajony.toEscapedModel());
	}

	@Override
	public tj.rajony.model.rajony toUnescapedModel() {
		return new rajonyWrapper(_rajony.toUnescapedModel());
	}

	@Override
	public void persist() {
		_rajony.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rajony.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_rajony.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_rajony.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_rajony.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the kod_vbk of this rajony.
	*
	* @param kod_vbk the kod_vbk of this rajony
	*/
	@Override
	public void setKod_vbk(long kod_vbk) {
		_rajony.setKod_vbk(kod_vbk);
	}

	/**
	* Sets the nazvanie of this rajony.
	*
	* @param nazvanie the nazvanie of this rajony
	*/
	@Override
	public void setNazvanie(java.lang.String nazvanie) {
		_rajony.setNazvanie(nazvanie);
	}

	@Override
	public void setNew(boolean n) {
		_rajony.setNew(n);
	}

	/**
	* Sets the oblast_id of this rajony.
	*
	* @param oblast_id the oblast_id of this rajony
	*/
	@Override
	public void setOblast_id(long oblast_id) {
		_rajony.setOblast_id(oblast_id);
	}

	/**
	* Sets the primary key of this rajony.
	*
	* @param primaryKey the primary key of this rajony
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rajony.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_rajony.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rajony_id of this rajony.
	*
	* @param rajony_id the rajony_id of this rajony
	*/
	@Override
	public void setRajony_id(long rajony_id) {
		_rajony.setRajony_id(rajony_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof rajonyWrapper)) {
			return false;
		}

		rajonyWrapper rajonyWrapper = (rajonyWrapper)obj;

		if (Objects.equals(_rajony, rajonyWrapper._rajony)) {
			return true;
		}

		return false;
	}

	@Override
	public rajony getWrappedModel() {
		return _rajony;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _rajony.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _rajony.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_rajony.resetOriginalValues();
	}

	private final rajony _rajony;
}