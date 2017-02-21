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

package tj.sostojanie.izvewenij.model;

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
 * This class is a wrapper for {@link sostojanie_izvewenij}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sostojanie_izvewenij
 * @generated
 */
@ProviderType
public class sostojanie_izvewenijWrapper implements sostojanie_izvewenij,
	ModelWrapper<sostojanie_izvewenij> {
	public sostojanie_izvewenijWrapper(
		sostojanie_izvewenij sostojanie_izvewenij) {
		_sostojanie_izvewenij = sostojanie_izvewenij;
	}

	@Override
	public Class<?> getModelClass() {
		return sostojanie_izvewenij.class;
	}

	@Override
	public String getModelClassName() {
		return sostojanie_izvewenij.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sostojanie", getSostojanie());
		attributes.put("sostojanie_izvewenij_id", getSostojanie_izvewenij_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String sostojanie = (String)attributes.get("sostojanie");

		if (sostojanie != null) {
			setSostojanie(sostojanie);
		}

		Long sostojanie_izvewenij_id = (Long)attributes.get(
				"sostojanie_izvewenij_id");

		if (sostojanie_izvewenij_id != null) {
			setSostojanie_izvewenij_id(sostojanie_izvewenij_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _sostojanie_izvewenij.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _sostojanie_izvewenij.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _sostojanie_izvewenij.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _sostojanie_izvewenij.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.sostojanie.izvewenij.model.sostojanie_izvewenij> toCacheModel() {
		return _sostojanie_izvewenij.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.sostojanie.izvewenij.model.sostojanie_izvewenij sostojanie_izvewenij) {
		return _sostojanie_izvewenij.compareTo(sostojanie_izvewenij);
	}

	@Override
	public int hashCode() {
		return _sostojanie_izvewenij.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sostojanie_izvewenij.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new sostojanie_izvewenijWrapper((sostojanie_izvewenij)_sostojanie_izvewenij.clone());
	}

	/**
	* Returns the sostojanie of this sostojanie_izvewenij.
	*
	* @return the sostojanie of this sostojanie_izvewenij
	*/
	@Override
	public java.lang.String getSostojanie() {
		return _sostojanie_izvewenij.getSostojanie();
	}

	@Override
	public java.lang.String toString() {
		return _sostojanie_izvewenij.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sostojanie_izvewenij.toXmlString();
	}

	/**
	* Returns the primary key of this sostojanie_izvewenij.
	*
	* @return the primary key of this sostojanie_izvewenij
	*/
	@Override
	public long getPrimaryKey() {
		return _sostojanie_izvewenij.getPrimaryKey();
	}

	/**
	* Returns the sostojanie_izvewenij_id of this sostojanie_izvewenij.
	*
	* @return the sostojanie_izvewenij_id of this sostojanie_izvewenij
	*/
	@Override
	public long getSostojanie_izvewenij_id() {
		return _sostojanie_izvewenij.getSostojanie_izvewenij_id();
	}

	@Override
	public tj.sostojanie.izvewenij.model.sostojanie_izvewenij toEscapedModel() {
		return new sostojanie_izvewenijWrapper(_sostojanie_izvewenij.toEscapedModel());
	}

	@Override
	public tj.sostojanie.izvewenij.model.sostojanie_izvewenij toUnescapedModel() {
		return new sostojanie_izvewenijWrapper(_sostojanie_izvewenij.toUnescapedModel());
	}

	@Override
	public void persist() {
		_sostojanie_izvewenij.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sostojanie_izvewenij.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_sostojanie_izvewenij.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_sostojanie_izvewenij.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_sostojanie_izvewenij.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_sostojanie_izvewenij.setNew(n);
	}

	/**
	* Sets the primary key of this sostojanie_izvewenij.
	*
	* @param primaryKey the primary key of this sostojanie_izvewenij
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sostojanie_izvewenij.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_sostojanie_izvewenij.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sostojanie of this sostojanie_izvewenij.
	*
	* @param sostojanie the sostojanie of this sostojanie_izvewenij
	*/
	@Override
	public void setSostojanie(java.lang.String sostojanie) {
		_sostojanie_izvewenij.setSostojanie(sostojanie);
	}

	/**
	* Sets the sostojanie_izvewenij_id of this sostojanie_izvewenij.
	*
	* @param sostojanie_izvewenij_id the sostojanie_izvewenij_id of this sostojanie_izvewenij
	*/
	@Override
	public void setSostojanie_izvewenij_id(long sostojanie_izvewenij_id) {
		_sostojanie_izvewenij.setSostojanie_izvewenij_id(sostojanie_izvewenij_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof sostojanie_izvewenijWrapper)) {
			return false;
		}

		sostojanie_izvewenijWrapper sostojanie_izvewenijWrapper = (sostojanie_izvewenijWrapper)obj;

		if (Objects.equals(_sostojanie_izvewenij,
					sostojanie_izvewenijWrapper._sostojanie_izvewenij)) {
			return true;
		}

		return false;
	}

	@Override
	public sostojanie_izvewenij getWrappedModel() {
		return _sostojanie_izvewenij;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _sostojanie_izvewenij.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _sostojanie_izvewenij.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_sostojanie_izvewenij.resetOriginalValues();
	}

	private final sostojanie_izvewenij _sostojanie_izvewenij;
}