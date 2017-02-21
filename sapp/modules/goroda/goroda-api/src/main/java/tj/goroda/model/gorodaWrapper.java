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

package tj.goroda.model;

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
 * This class is a wrapper for {@link goroda}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see goroda
 * @generated
 */
@ProviderType
public class gorodaWrapper implements goroda, ModelWrapper<goroda> {
	public gorodaWrapper(goroda goroda) {
		_goroda = goroda;
	}

	@Override
	public Class<?> getModelClass() {
		return goroda.class;
	}

	@Override
	public String getModelClassName() {
		return goroda.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("goroda_id", getGoroda_id());
		attributes.put("nazvanie", getNazvanie());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long goroda_id = (Long)attributes.get("goroda_id");

		if (goroda_id != null) {
			setGoroda_id(goroda_id);
		}

		String nazvanie = (String)attributes.get("nazvanie");

		if (nazvanie != null) {
			setNazvanie(nazvanie);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _goroda.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _goroda.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _goroda.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _goroda.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.goroda.model.goroda> toCacheModel() {
		return _goroda.toCacheModel();
	}

	@Override
	public int compareTo(tj.goroda.model.goroda goroda) {
		return _goroda.compareTo(goroda);
	}

	@Override
	public int hashCode() {
		return _goroda.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _goroda.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new gorodaWrapper((goroda)_goroda.clone());
	}

	/**
	* Returns the nazvanie of this goroda.
	*
	* @return the nazvanie of this goroda
	*/
	@Override
	public java.lang.String getNazvanie() {
		return _goroda.getNazvanie();
	}

	@Override
	public java.lang.String toString() {
		return _goroda.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _goroda.toXmlString();
	}

	/**
	* Returns the goroda_id of this goroda.
	*
	* @return the goroda_id of this goroda
	*/
	@Override
	public long getGoroda_id() {
		return _goroda.getGoroda_id();
	}

	/**
	* Returns the primary key of this goroda.
	*
	* @return the primary key of this goroda
	*/
	@Override
	public long getPrimaryKey() {
		return _goroda.getPrimaryKey();
	}

	@Override
	public tj.goroda.model.goroda toEscapedModel() {
		return new gorodaWrapper(_goroda.toEscapedModel());
	}

	@Override
	public tj.goroda.model.goroda toUnescapedModel() {
		return new gorodaWrapper(_goroda.toUnescapedModel());
	}

	@Override
	public void persist() {
		_goroda.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_goroda.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_goroda.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_goroda.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_goroda.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the goroda_id of this goroda.
	*
	* @param goroda_id the goroda_id of this goroda
	*/
	@Override
	public void setGoroda_id(long goroda_id) {
		_goroda.setGoroda_id(goroda_id);
	}

	/**
	* Sets the nazvanie of this goroda.
	*
	* @param nazvanie the nazvanie of this goroda
	*/
	@Override
	public void setNazvanie(java.lang.String nazvanie) {
		_goroda.setNazvanie(nazvanie);
	}

	@Override
	public void setNew(boolean n) {
		_goroda.setNew(n);
	}

	/**
	* Sets the primary key of this goroda.
	*
	* @param primaryKey the primary key of this goroda
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_goroda.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_goroda.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof gorodaWrapper)) {
			return false;
		}

		gorodaWrapper gorodaWrapper = (gorodaWrapper)obj;

		if (Objects.equals(_goroda, gorodaWrapper._goroda)) {
			return true;
		}

		return false;
	}

	@Override
	public goroda getWrappedModel() {
		return _goroda;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _goroda.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _goroda.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_goroda.resetOriginalValues();
	}

	private final goroda _goroda;
}