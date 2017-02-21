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

package tj.status.izvewenij.model;

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
 * This class is a wrapper for {@link status_izvewenij}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see status_izvewenij
 * @generated
 */
@ProviderType
public class status_izvewenijWrapper implements status_izvewenij,
	ModelWrapper<status_izvewenij> {
	public status_izvewenijWrapper(status_izvewenij status_izvewenij) {
		_status_izvewenij = status_izvewenij;
	}

	@Override
	public Class<?> getModelClass() {
		return status_izvewenij.class;
	}

	@Override
	public String getModelClassName() {
		return status_izvewenij.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("status", getStatus());
		attributes.put("status_izvewenij_id", getStatus_izvewenij_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long status_izvewenij_id = (Long)attributes.get("status_izvewenij_id");

		if (status_izvewenij_id != null) {
			setStatus_izvewenij_id(status_izvewenij_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _status_izvewenij.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _status_izvewenij.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _status_izvewenij.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _status_izvewenij.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.status.izvewenij.model.status_izvewenij> toCacheModel() {
		return _status_izvewenij.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.status.izvewenij.model.status_izvewenij status_izvewenij) {
		return _status_izvewenij.compareTo(status_izvewenij);
	}

	@Override
	public int hashCode() {
		return _status_izvewenij.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _status_izvewenij.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new status_izvewenijWrapper((status_izvewenij)_status_izvewenij.clone());
	}

	/**
	* Returns the status of this status_izvewenij.
	*
	* @return the status of this status_izvewenij
	*/
	@Override
	public java.lang.String getStatus() {
		return _status_izvewenij.getStatus();
	}

	@Override
	public java.lang.String toString() {
		return _status_izvewenij.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _status_izvewenij.toXmlString();
	}

	/**
	* Returns the primary key of this status_izvewenij.
	*
	* @return the primary key of this status_izvewenij
	*/
	@Override
	public long getPrimaryKey() {
		return _status_izvewenij.getPrimaryKey();
	}

	/**
	* Returns the status_izvewenij_id of this status_izvewenij.
	*
	* @return the status_izvewenij_id of this status_izvewenij
	*/
	@Override
	public long getStatus_izvewenij_id() {
		return _status_izvewenij.getStatus_izvewenij_id();
	}

	@Override
	public tj.status.izvewenij.model.status_izvewenij toEscapedModel() {
		return new status_izvewenijWrapper(_status_izvewenij.toEscapedModel());
	}

	@Override
	public tj.status.izvewenij.model.status_izvewenij toUnescapedModel() {
		return new status_izvewenijWrapper(_status_izvewenij.toUnescapedModel());
	}

	@Override
	public void persist() {
		_status_izvewenij.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_status_izvewenij.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_status_izvewenij.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_status_izvewenij.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_status_izvewenij.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_status_izvewenij.setNew(n);
	}

	/**
	* Sets the primary key of this status_izvewenij.
	*
	* @param primaryKey the primary key of this status_izvewenij
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_status_izvewenij.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_status_izvewenij.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this status_izvewenij.
	*
	* @param status the status of this status_izvewenij
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_status_izvewenij.setStatus(status);
	}

	/**
	* Sets the status_izvewenij_id of this status_izvewenij.
	*
	* @param status_izvewenij_id the status_izvewenij_id of this status_izvewenij
	*/
	@Override
	public void setStatus_izvewenij_id(long status_izvewenij_id) {
		_status_izvewenij.setStatus_izvewenij_id(status_izvewenij_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof status_izvewenijWrapper)) {
			return false;
		}

		status_izvewenijWrapper status_izvewenijWrapper = (status_izvewenijWrapper)obj;

		if (Objects.equals(_status_izvewenij,
					status_izvewenijWrapper._status_izvewenij)) {
			return true;
		}

		return false;
	}

	@Override
	public status_izvewenij getWrappedModel() {
		return _status_izvewenij;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _status_izvewenij.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _status_izvewenij.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_status_izvewenij.resetOriginalValues();
	}

	private final status_izvewenij _status_izvewenij;
}