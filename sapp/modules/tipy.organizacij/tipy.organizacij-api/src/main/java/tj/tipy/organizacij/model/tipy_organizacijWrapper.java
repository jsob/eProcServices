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

package tj.tipy.organizacij.model;

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
 * This class is a wrapper for {@link tipy_organizacij}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_organizacij
 * @generated
 */
@ProviderType
public class tipy_organizacijWrapper implements tipy_organizacij,
	ModelWrapper<tipy_organizacij> {
	public tipy_organizacijWrapper(tipy_organizacij tipy_organizacij) {
		_tipy_organizacij = tipy_organizacij;
	}

	@Override
	public Class<?> getModelClass() {
		return tipy_organizacij.class;
	}

	@Override
	public String getModelClassName() {
		return tipy_organizacij.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tipy_organizacij_id", getTipy_organizacij_id());
		attributes.put("nazvanie", getNazvanie());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tipy_organizacij_id = (Long)attributes.get("tipy_organizacij_id");

		if (tipy_organizacij_id != null) {
			setTipy_organizacij_id(tipy_organizacij_id);
		}

		String nazvanie = (String)attributes.get("nazvanie");

		if (nazvanie != null) {
			setNazvanie(nazvanie);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _tipy_organizacij.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tipy_organizacij.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tipy_organizacij.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tipy_organizacij.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.tipy.organizacij.model.tipy_organizacij> toCacheModel() {
		return _tipy_organizacij.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.tipy.organizacij.model.tipy_organizacij tipy_organizacij) {
		return _tipy_organizacij.compareTo(tipy_organizacij);
	}

	@Override
	public int hashCode() {
		return _tipy_organizacij.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tipy_organizacij.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new tipy_organizacijWrapper((tipy_organizacij)_tipy_organizacij.clone());
	}

	/**
	* Returns the nazvanie of this tipy_organizacij.
	*
	* @return the nazvanie of this tipy_organizacij
	*/
	@Override
	public java.lang.String getNazvanie() {
		return _tipy_organizacij.getNazvanie();
	}

	@Override
	public java.lang.String toString() {
		return _tipy_organizacij.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tipy_organizacij.toXmlString();
	}

	/**
	* Returns the primary key of this tipy_organizacij.
	*
	* @return the primary key of this tipy_organizacij
	*/
	@Override
	public long getPrimaryKey() {
		return _tipy_organizacij.getPrimaryKey();
	}

	/**
	* Returns the tipy_organizacij_id of this tipy_organizacij.
	*
	* @return the tipy_organizacij_id of this tipy_organizacij
	*/
	@Override
	public long getTipy_organizacij_id() {
		return _tipy_organizacij.getTipy_organizacij_id();
	}

	@Override
	public tj.tipy.organizacij.model.tipy_organizacij toEscapedModel() {
		return new tipy_organizacijWrapper(_tipy_organizacij.toEscapedModel());
	}

	@Override
	public tj.tipy.organizacij.model.tipy_organizacij toUnescapedModel() {
		return new tipy_organizacijWrapper(_tipy_organizacij.toUnescapedModel());
	}

	@Override
	public void persist() {
		_tipy_organizacij.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tipy_organizacij.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tipy_organizacij.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tipy_organizacij.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tipy_organizacij.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the nazvanie of this tipy_organizacij.
	*
	* @param nazvanie the nazvanie of this tipy_organizacij
	*/
	@Override
	public void setNazvanie(java.lang.String nazvanie) {
		_tipy_organizacij.setNazvanie(nazvanie);
	}

	@Override
	public void setNew(boolean n) {
		_tipy_organizacij.setNew(n);
	}

	/**
	* Sets the primary key of this tipy_organizacij.
	*
	* @param primaryKey the primary key of this tipy_organizacij
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tipy_organizacij.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tipy_organizacij.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tipy_organizacij_id of this tipy_organizacij.
	*
	* @param tipy_organizacij_id the tipy_organizacij_id of this tipy_organizacij
	*/
	@Override
	public void setTipy_organizacij_id(long tipy_organizacij_id) {
		_tipy_organizacij.setTipy_organizacij_id(tipy_organizacij_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof tipy_organizacijWrapper)) {
			return false;
		}

		tipy_organizacijWrapper tipy_organizacijWrapper = (tipy_organizacijWrapper)obj;

		if (Objects.equals(_tipy_organizacij,
					tipy_organizacijWrapper._tipy_organizacij)) {
			return true;
		}

		return false;
	}

	@Override
	public tipy_organizacij getWrappedModel() {
		return _tipy_organizacij;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tipy_organizacij.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tipy_organizacij.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tipy_organizacij.resetOriginalValues();
	}

	private final tipy_organizacij _tipy_organizacij;
}