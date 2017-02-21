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

package tj.edinicy.izmerenija.model;

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
 * This class is a wrapper for {@link edinicy_izmerenija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see edinicy_izmerenija
 * @generated
 */
@ProviderType
public class edinicy_izmerenijaWrapper implements edinicy_izmerenija,
	ModelWrapper<edinicy_izmerenija> {
	public edinicy_izmerenijaWrapper(edinicy_izmerenija edinicy_izmerenija) {
		_edinicy_izmerenija = edinicy_izmerenija;
	}

	@Override
	public Class<?> getModelClass() {
		return edinicy_izmerenija.class;
	}

	@Override
	public String getModelClassName() {
		return edinicy_izmerenija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("edinicy_izmerenija_id", getEdinicy_izmerenija_id());
		attributes.put("nazvanie", getNazvanie());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long edinicy_izmerenija_id = (Long)attributes.get(
				"edinicy_izmerenija_id");

		if (edinicy_izmerenija_id != null) {
			setEdinicy_izmerenija_id(edinicy_izmerenija_id);
		}

		String nazvanie = (String)attributes.get("nazvanie");

		if (nazvanie != null) {
			setNazvanie(nazvanie);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _edinicy_izmerenija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _edinicy_izmerenija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _edinicy_izmerenija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _edinicy_izmerenija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.edinicy.izmerenija.model.edinicy_izmerenija> toCacheModel() {
		return _edinicy_izmerenija.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.edinicy.izmerenija.model.edinicy_izmerenija edinicy_izmerenija) {
		return _edinicy_izmerenija.compareTo(edinicy_izmerenija);
	}

	@Override
	public int hashCode() {
		return _edinicy_izmerenija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _edinicy_izmerenija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new edinicy_izmerenijaWrapper((edinicy_izmerenija)_edinicy_izmerenija.clone());
	}

	/**
	* Returns the nazvanie of this edinicy_izmerenija.
	*
	* @return the nazvanie of this edinicy_izmerenija
	*/
	@Override
	public java.lang.String getNazvanie() {
		return _edinicy_izmerenija.getNazvanie();
	}

	@Override
	public java.lang.String toString() {
		return _edinicy_izmerenija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _edinicy_izmerenija.toXmlString();
	}

	/**
	* Returns the edinicy_izmerenija_id of this edinicy_izmerenija.
	*
	* @return the edinicy_izmerenija_id of this edinicy_izmerenija
	*/
	@Override
	public long getEdinicy_izmerenija_id() {
		return _edinicy_izmerenija.getEdinicy_izmerenija_id();
	}

	/**
	* Returns the primary key of this edinicy_izmerenija.
	*
	* @return the primary key of this edinicy_izmerenija
	*/
	@Override
	public long getPrimaryKey() {
		return _edinicy_izmerenija.getPrimaryKey();
	}

	@Override
	public tj.edinicy.izmerenija.model.edinicy_izmerenija toEscapedModel() {
		return new edinicy_izmerenijaWrapper(_edinicy_izmerenija.toEscapedModel());
	}

	@Override
	public tj.edinicy.izmerenija.model.edinicy_izmerenija toUnescapedModel() {
		return new edinicy_izmerenijaWrapper(_edinicy_izmerenija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_edinicy_izmerenija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_edinicy_izmerenija.setCachedModel(cachedModel);
	}

	/**
	* Sets the edinicy_izmerenija_id of this edinicy_izmerenija.
	*
	* @param edinicy_izmerenija_id the edinicy_izmerenija_id of this edinicy_izmerenija
	*/
	@Override
	public void setEdinicy_izmerenija_id(long edinicy_izmerenija_id) {
		_edinicy_izmerenija.setEdinicy_izmerenija_id(edinicy_izmerenija_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_edinicy_izmerenija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_edinicy_izmerenija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_edinicy_izmerenija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the nazvanie of this edinicy_izmerenija.
	*
	* @param nazvanie the nazvanie of this edinicy_izmerenija
	*/
	@Override
	public void setNazvanie(java.lang.String nazvanie) {
		_edinicy_izmerenija.setNazvanie(nazvanie);
	}

	@Override
	public void setNew(boolean n) {
		_edinicy_izmerenija.setNew(n);
	}

	/**
	* Sets the primary key of this edinicy_izmerenija.
	*
	* @param primaryKey the primary key of this edinicy_izmerenija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_edinicy_izmerenija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_edinicy_izmerenija.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof edinicy_izmerenijaWrapper)) {
			return false;
		}

		edinicy_izmerenijaWrapper edinicy_izmerenijaWrapper = (edinicy_izmerenijaWrapper)obj;

		if (Objects.equals(_edinicy_izmerenija,
					edinicy_izmerenijaWrapper._edinicy_izmerenija)) {
			return true;
		}

		return false;
	}

	@Override
	public edinicy_izmerenija getWrappedModel() {
		return _edinicy_izmerenija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _edinicy_izmerenija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _edinicy_izmerenija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_edinicy_izmerenija.resetOriginalValues();
	}

	private final edinicy_izmerenija _edinicy_izmerenija;
}