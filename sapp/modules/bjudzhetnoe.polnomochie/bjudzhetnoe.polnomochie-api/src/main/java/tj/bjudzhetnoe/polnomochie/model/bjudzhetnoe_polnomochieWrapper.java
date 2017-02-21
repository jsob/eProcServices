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

package tj.bjudzhetnoe.polnomochie.model;

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
 * This class is a wrapper for {@link bjudzhetnoe_polnomochie}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bjudzhetnoe_polnomochie
 * @generated
 */
@ProviderType
public class bjudzhetnoe_polnomochieWrapper implements bjudzhetnoe_polnomochie,
	ModelWrapper<bjudzhetnoe_polnomochie> {
	public bjudzhetnoe_polnomochieWrapper(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		_bjudzhetnoe_polnomochie = bjudzhetnoe_polnomochie;
	}

	@Override
	public Class<?> getModelClass() {
		return bjudzhetnoe_polnomochie.class;
	}

	@Override
	public String getModelClassName() {
		return bjudzhetnoe_polnomochie.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bjudzhetnoe_polnomochie_id",
			getBjudzhetnoe_polnomochie_id());
		attributes.put("naimenovanie", getNaimenovanie());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bjudzhetnoe_polnomochie_id = (Long)attributes.get(
				"bjudzhetnoe_polnomochie_id");

		if (bjudzhetnoe_polnomochie_id != null) {
			setBjudzhetnoe_polnomochie_id(bjudzhetnoe_polnomochie_id);
		}

		String naimenovanie = (String)attributes.get("naimenovanie");

		if (naimenovanie != null) {
			setNaimenovanie(naimenovanie);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _bjudzhetnoe_polnomochie.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _bjudzhetnoe_polnomochie.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _bjudzhetnoe_polnomochie.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _bjudzhetnoe_polnomochie.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie> toCacheModel() {
		return _bjudzhetnoe_polnomochie.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		return _bjudzhetnoe_polnomochie.compareTo(bjudzhetnoe_polnomochie);
	}

	@Override
	public int hashCode() {
		return _bjudzhetnoe_polnomochie.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bjudzhetnoe_polnomochie.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new bjudzhetnoe_polnomochieWrapper((bjudzhetnoe_polnomochie)_bjudzhetnoe_polnomochie.clone());
	}

	/**
	* Returns the naimenovanie of this bjudzhetnoe_polnomochie.
	*
	* @return the naimenovanie of this bjudzhetnoe_polnomochie
	*/
	@Override
	public java.lang.String getNaimenovanie() {
		return _bjudzhetnoe_polnomochie.getNaimenovanie();
	}

	@Override
	public java.lang.String toString() {
		return _bjudzhetnoe_polnomochie.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bjudzhetnoe_polnomochie.toXmlString();
	}

	/**
	* Returns the bjudzhetnoe_polnomochie_id of this bjudzhetnoe_polnomochie.
	*
	* @return the bjudzhetnoe_polnomochie_id of this bjudzhetnoe_polnomochie
	*/
	@Override
	public long getBjudzhetnoe_polnomochie_id() {
		return _bjudzhetnoe_polnomochie.getBjudzhetnoe_polnomochie_id();
	}

	/**
	* Returns the primary key of this bjudzhetnoe_polnomochie.
	*
	* @return the primary key of this bjudzhetnoe_polnomochie
	*/
	@Override
	public long getPrimaryKey() {
		return _bjudzhetnoe_polnomochie.getPrimaryKey();
	}

	@Override
	public tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie toEscapedModel() {
		return new bjudzhetnoe_polnomochieWrapper(_bjudzhetnoe_polnomochie.toEscapedModel());
	}

	@Override
	public tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie toUnescapedModel() {
		return new bjudzhetnoe_polnomochieWrapper(_bjudzhetnoe_polnomochie.toUnescapedModel());
	}

	@Override
	public void persist() {
		_bjudzhetnoe_polnomochie.persist();
	}

	/**
	* Sets the bjudzhetnoe_polnomochie_id of this bjudzhetnoe_polnomochie.
	*
	* @param bjudzhetnoe_polnomochie_id the bjudzhetnoe_polnomochie_id of this bjudzhetnoe_polnomochie
	*/
	@Override
	public void setBjudzhetnoe_polnomochie_id(long bjudzhetnoe_polnomochie_id) {
		_bjudzhetnoe_polnomochie.setBjudzhetnoe_polnomochie_id(bjudzhetnoe_polnomochie_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bjudzhetnoe_polnomochie.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_bjudzhetnoe_polnomochie.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_bjudzhetnoe_polnomochie.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_bjudzhetnoe_polnomochie.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the naimenovanie of this bjudzhetnoe_polnomochie.
	*
	* @param naimenovanie the naimenovanie of this bjudzhetnoe_polnomochie
	*/
	@Override
	public void setNaimenovanie(java.lang.String naimenovanie) {
		_bjudzhetnoe_polnomochie.setNaimenovanie(naimenovanie);
	}

	@Override
	public void setNew(boolean n) {
		_bjudzhetnoe_polnomochie.setNew(n);
	}

	/**
	* Sets the primary key of this bjudzhetnoe_polnomochie.
	*
	* @param primaryKey the primary key of this bjudzhetnoe_polnomochie
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bjudzhetnoe_polnomochie.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_bjudzhetnoe_polnomochie.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bjudzhetnoe_polnomochieWrapper)) {
			return false;
		}

		bjudzhetnoe_polnomochieWrapper bjudzhetnoe_polnomochieWrapper = (bjudzhetnoe_polnomochieWrapper)obj;

		if (Objects.equals(_bjudzhetnoe_polnomochie,
					bjudzhetnoe_polnomochieWrapper._bjudzhetnoe_polnomochie)) {
			return true;
		}

		return false;
	}

	@Override
	public bjudzhetnoe_polnomochie getWrappedModel() {
		return _bjudzhetnoe_polnomochie;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _bjudzhetnoe_polnomochie.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _bjudzhetnoe_polnomochie.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_bjudzhetnoe_polnomochie.resetOriginalValues();
	}

	private final bjudzhetnoe_polnomochie _bjudzhetnoe_polnomochie;
}