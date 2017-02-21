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

package tj.oblasti.model;

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
 * This class is a wrapper for {@link oblasti}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see oblasti
 * @generated
 */
@ProviderType
public class oblastiWrapper implements oblasti, ModelWrapper<oblasti> {
	public oblastiWrapper(oblasti oblasti) {
		_oblasti = oblasti;
	}

	@Override
	public Class<?> getModelClass() {
		return oblasti.class;
	}

	@Override
	public String getModelClassName() {
		return oblasti.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("oblasti_id", getOblasti_id());
		attributes.put("nazvanie", getNazvanie());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long oblasti_id = (Long)attributes.get("oblasti_id");

		if (oblasti_id != null) {
			setOblasti_id(oblasti_id);
		}

		String nazvanie = (String)attributes.get("nazvanie");

		if (nazvanie != null) {
			setNazvanie(nazvanie);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _oblasti.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _oblasti.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _oblasti.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _oblasti.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.oblasti.model.oblasti> toCacheModel() {
		return _oblasti.toCacheModel();
	}

	@Override
	public int compareTo(tj.oblasti.model.oblasti oblasti) {
		return _oblasti.compareTo(oblasti);
	}

	@Override
	public int hashCode() {
		return _oblasti.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _oblasti.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new oblastiWrapper((oblasti)_oblasti.clone());
	}

	/**
	* Returns the nazvanie of this oblasti.
	*
	* @return the nazvanie of this oblasti
	*/
	@Override
	public java.lang.String getNazvanie() {
		return _oblasti.getNazvanie();
	}

	@Override
	public java.lang.String toString() {
		return _oblasti.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oblasti.toXmlString();
	}

	/**
	* Returns the oblasti_id of this oblasti.
	*
	* @return the oblasti_id of this oblasti
	*/
	@Override
	public long getOblasti_id() {
		return _oblasti.getOblasti_id();
	}

	/**
	* Returns the primary key of this oblasti.
	*
	* @return the primary key of this oblasti
	*/
	@Override
	public long getPrimaryKey() {
		return _oblasti.getPrimaryKey();
	}

	@Override
	public tj.oblasti.model.oblasti toEscapedModel() {
		return new oblastiWrapper(_oblasti.toEscapedModel());
	}

	@Override
	public tj.oblasti.model.oblasti toUnescapedModel() {
		return new oblastiWrapper(_oblasti.toUnescapedModel());
	}

	@Override
	public void persist() {
		_oblasti.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oblasti.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_oblasti.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_oblasti.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_oblasti.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the nazvanie of this oblasti.
	*
	* @param nazvanie the nazvanie of this oblasti
	*/
	@Override
	public void setNazvanie(java.lang.String nazvanie) {
		_oblasti.setNazvanie(nazvanie);
	}

	@Override
	public void setNew(boolean n) {
		_oblasti.setNew(n);
	}

	/**
	* Sets the oblasti_id of this oblasti.
	*
	* @param oblasti_id the oblasti_id of this oblasti
	*/
	@Override
	public void setOblasti_id(long oblasti_id) {
		_oblasti.setOblasti_id(oblasti_id);
	}

	/**
	* Sets the primary key of this oblasti.
	*
	* @param primaryKey the primary key of this oblasti
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oblasti.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_oblasti.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof oblastiWrapper)) {
			return false;
		}

		oblastiWrapper oblastiWrapper = (oblastiWrapper)obj;

		if (Objects.equals(_oblasti, oblastiWrapper._oblasti)) {
			return true;
		}

		return false;
	}

	@Override
	public oblasti getWrappedModel() {
		return _oblasti;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _oblasti.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _oblasti.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_oblasti.resetOriginalValues();
	}

	private final oblasti _oblasti;
}