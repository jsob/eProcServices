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

package tj.roli.model;

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
 * This class is a wrapper for {@link roli}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see roli
 * @generated
 */
@ProviderType
public class roliWrapper implements roli, ModelWrapper<roli> {
	public roliWrapper(roli roli) {
		_roli = roli;
	}

	@Override
	public Class<?> getModelClass() {
		return roli.class;
	}

	@Override
	public String getModelClassName() {
		return roli.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("rol", getRol());
		attributes.put("roli_id", getRoli_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String rol = (String)attributes.get("rol");

		if (rol != null) {
			setRol(rol);
		}

		Long roli_id = (Long)attributes.get("roli_id");

		if (roli_id != null) {
			setRoli_id(roli_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _roli.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _roli.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _roli.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _roli.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.roli.model.roli> toCacheModel() {
		return _roli.toCacheModel();
	}

	@Override
	public int compareTo(tj.roli.model.roli roli) {
		return _roli.compareTo(roli);
	}

	@Override
	public int hashCode() {
		return _roli.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _roli.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new roliWrapper((roli)_roli.clone());
	}

	/**
	* Returns the rol of this roli.
	*
	* @return the rol of this roli
	*/
	@Override
	public java.lang.String getRol() {
		return _roli.getRol();
	}

	@Override
	public java.lang.String toString() {
		return _roli.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _roli.toXmlString();
	}

	/**
	* Returns the primary key of this roli.
	*
	* @return the primary key of this roli
	*/
	@Override
	public long getPrimaryKey() {
		return _roli.getPrimaryKey();
	}

	/**
	* Returns the roli_id of this roli.
	*
	* @return the roli_id of this roli
	*/
	@Override
	public long getRoli_id() {
		return _roli.getRoli_id();
	}

	@Override
	public tj.roli.model.roli toEscapedModel() {
		return new roliWrapper(_roli.toEscapedModel());
	}

	@Override
	public tj.roli.model.roli toUnescapedModel() {
		return new roliWrapper(_roli.toUnescapedModel());
	}

	@Override
	public void persist() {
		_roli.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_roli.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_roli.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_roli.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_roli.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_roli.setNew(n);
	}

	/**
	* Sets the primary key of this roli.
	*
	* @param primaryKey the primary key of this roli
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_roli.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_roli.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rol of this roli.
	*
	* @param rol the rol of this roli
	*/
	@Override
	public void setRol(java.lang.String rol) {
		_roli.setRol(rol);
	}

	/**
	* Sets the roli_id of this roli.
	*
	* @param roli_id the roli_id of this roli
	*/
	@Override
	public void setRoli_id(long roli_id) {
		_roli.setRoli_id(roli_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof roliWrapper)) {
			return false;
		}

		roliWrapper roliWrapper = (roliWrapper)obj;

		if (Objects.equals(_roli, roliWrapper._roli)) {
			return true;
		}

		return false;
	}

	@Override
	public roli getWrappedModel() {
		return _roli;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _roli.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _roli.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_roli.resetOriginalValues();
	}

	private final roli _roli;
}