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

package tj.protokol.vskrytija.model;

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
 * This class is a wrapper for {@link protokol_vskrytija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see protokol_vskrytija
 * @generated
 */
@ProviderType
public class protokol_vskrytijaWrapper implements protokol_vskrytija,
	ModelWrapper<protokol_vskrytija> {
	public protokol_vskrytijaWrapper(protokol_vskrytija protokol_vskrytija) {
		_protokol_vskrytija = protokol_vskrytija;
	}

	@Override
	public Class<?> getModelClass() {
		return protokol_vskrytija.class;
	}

	@Override
	public String getModelClassName() {
		return protokol_vskrytija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_vskrytija", getData_vskrytija());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("protokol_vskrytija_id", getProtokol_vskrytija_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_vskrytija = (Date)attributes.get("data_vskrytija");

		if (data_vskrytija != null) {
			setData_vskrytija(data_vskrytija);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long protokol_vskrytija_id = (Long)attributes.get(
				"protokol_vskrytija_id");

		if (protokol_vskrytija_id != null) {
			setProtokol_vskrytija_id(protokol_vskrytija_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _protokol_vskrytija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _protokol_vskrytija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _protokol_vskrytija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _protokol_vskrytija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.protokol.vskrytija.model.protokol_vskrytija> toCacheModel() {
		return _protokol_vskrytija.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.protokol.vskrytija.model.protokol_vskrytija protokol_vskrytija) {
		return _protokol_vskrytija.compareTo(protokol_vskrytija);
	}

	@Override
	public int hashCode() {
		return _protokol_vskrytija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _protokol_vskrytija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new protokol_vskrytijaWrapper((protokol_vskrytija)_protokol_vskrytija.clone());
	}

	@Override
	public java.lang.String toString() {
		return _protokol_vskrytija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _protokol_vskrytija.toXmlString();
	}

	/**
	* Returns the data_vskrytija of this protokol_vskrytija.
	*
	* @return the data_vskrytija of this protokol_vskrytija
	*/
	@Override
	public Date getData_vskrytija() {
		return _protokol_vskrytija.getData_vskrytija();
	}

	/**
	* Returns the izvewenie_id of this protokol_vskrytija.
	*
	* @return the izvewenie_id of this protokol_vskrytija
	*/
	@Override
	public long getIzvewenie_id() {
		return _protokol_vskrytija.getIzvewenie_id();
	}

	/**
	* Returns the primary key of this protokol_vskrytija.
	*
	* @return the primary key of this protokol_vskrytija
	*/
	@Override
	public long getPrimaryKey() {
		return _protokol_vskrytija.getPrimaryKey();
	}

	/**
	* Returns the protokol_vskrytija_id of this protokol_vskrytija.
	*
	* @return the protokol_vskrytija_id of this protokol_vskrytija
	*/
	@Override
	public long getProtokol_vskrytija_id() {
		return _protokol_vskrytija.getProtokol_vskrytija_id();
	}

	@Override
	public tj.protokol.vskrytija.model.protokol_vskrytija toEscapedModel() {
		return new protokol_vskrytijaWrapper(_protokol_vskrytija.toEscapedModel());
	}

	@Override
	public tj.protokol.vskrytija.model.protokol_vskrytija toUnescapedModel() {
		return new protokol_vskrytijaWrapper(_protokol_vskrytija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_protokol_vskrytija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_protokol_vskrytija.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_vskrytija of this protokol_vskrytija.
	*
	* @param data_vskrytija the data_vskrytija of this protokol_vskrytija
	*/
	@Override
	public void setData_vskrytija(Date data_vskrytija) {
		_protokol_vskrytija.setData_vskrytija(data_vskrytija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_protokol_vskrytija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_protokol_vskrytija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_protokol_vskrytija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this protokol_vskrytija.
	*
	* @param izvewenie_id the izvewenie_id of this protokol_vskrytija
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_protokol_vskrytija.setIzvewenie_id(izvewenie_id);
	}

	@Override
	public void setNew(boolean n) {
		_protokol_vskrytija.setNew(n);
	}

	/**
	* Sets the primary key of this protokol_vskrytija.
	*
	* @param primaryKey the primary key of this protokol_vskrytija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_protokol_vskrytija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_protokol_vskrytija.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the protokol_vskrytija_id of this protokol_vskrytija.
	*
	* @param protokol_vskrytija_id the protokol_vskrytija_id of this protokol_vskrytija
	*/
	@Override
	public void setProtokol_vskrytija_id(long protokol_vskrytija_id) {
		_protokol_vskrytija.setProtokol_vskrytija_id(protokol_vskrytija_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof protokol_vskrytijaWrapper)) {
			return false;
		}

		protokol_vskrytijaWrapper protokol_vskrytijaWrapper = (protokol_vskrytijaWrapper)obj;

		if (Objects.equals(_protokol_vskrytija,
					protokol_vskrytijaWrapper._protokol_vskrytija)) {
			return true;
		}

		return false;
	}

	@Override
	public protokol_vskrytija getWrappedModel() {
		return _protokol_vskrytija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _protokol_vskrytija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _protokol_vskrytija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_protokol_vskrytija.resetOriginalValues();
	}

	private final protokol_vskrytija _protokol_vskrytija;
}