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

package tj.protokol.podachi.pretenzij.model;

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
 * This class is a wrapper for {@link protokol_podachi_pretenzij}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see protokol_podachi_pretenzij
 * @generated
 */
@ProviderType
public class protokol_podachi_pretenzijWrapper
	implements protokol_podachi_pretenzij,
		ModelWrapper<protokol_podachi_pretenzij> {
	public protokol_podachi_pretenzijWrapper(
		protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		_protokol_podachi_pretenzij = protokol_podachi_pretenzij;
	}

	@Override
	public Class<?> getModelClass() {
		return protokol_podachi_pretenzij.class;
	}

	@Override
	public String getModelClassName() {
		return protokol_podachi_pretenzij.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_generacii", getData_generacii());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("protokol_podachi_pretenzij_id",
			getProtokol_podachi_pretenzij_id());
		attributes.put("sgeneriroval", getSgeneriroval());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_generacii = (Date)attributes.get("data_generacii");

		if (data_generacii != null) {
			setData_generacii(data_generacii);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long protokol_podachi_pretenzij_id = (Long)attributes.get(
				"protokol_podachi_pretenzij_id");

		if (protokol_podachi_pretenzij_id != null) {
			setProtokol_podachi_pretenzij_id(protokol_podachi_pretenzij_id);
		}

		Long sgeneriroval = (Long)attributes.get("sgeneriroval");

		if (sgeneriroval != null) {
			setSgeneriroval(sgeneriroval);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _protokol_podachi_pretenzij.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _protokol_podachi_pretenzij.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _protokol_podachi_pretenzij.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _protokol_podachi_pretenzij.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij> toCacheModel() {
		return _protokol_podachi_pretenzij.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		return _protokol_podachi_pretenzij.compareTo(protokol_podachi_pretenzij);
	}

	@Override
	public int hashCode() {
		return _protokol_podachi_pretenzij.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _protokol_podachi_pretenzij.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new protokol_podachi_pretenzijWrapper((protokol_podachi_pretenzij)_protokol_podachi_pretenzij.clone());
	}

	@Override
	public java.lang.String toString() {
		return _protokol_podachi_pretenzij.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _protokol_podachi_pretenzij.toXmlString();
	}

	/**
	* Returns the data_generacii of this protokol_podachi_pretenzij.
	*
	* @return the data_generacii of this protokol_podachi_pretenzij
	*/
	@Override
	public Date getData_generacii() {
		return _protokol_podachi_pretenzij.getData_generacii();
	}

	/**
	* Returns the izvewenie_id of this protokol_podachi_pretenzij.
	*
	* @return the izvewenie_id of this protokol_podachi_pretenzij
	*/
	@Override
	public long getIzvewenie_id() {
		return _protokol_podachi_pretenzij.getIzvewenie_id();
	}

	/**
	* Returns the primary key of this protokol_podachi_pretenzij.
	*
	* @return the primary key of this protokol_podachi_pretenzij
	*/
	@Override
	public long getPrimaryKey() {
		return _protokol_podachi_pretenzij.getPrimaryKey();
	}

	/**
	* Returns the protokol_podachi_pretenzij_id of this protokol_podachi_pretenzij.
	*
	* @return the protokol_podachi_pretenzij_id of this protokol_podachi_pretenzij
	*/
	@Override
	public long getProtokol_podachi_pretenzij_id() {
		return _protokol_podachi_pretenzij.getProtokol_podachi_pretenzij_id();
	}

	/**
	* Returns the sgeneriroval of this protokol_podachi_pretenzij.
	*
	* @return the sgeneriroval of this protokol_podachi_pretenzij
	*/
	@Override
	public long getSgeneriroval() {
		return _protokol_podachi_pretenzij.getSgeneriroval();
	}

	@Override
	public tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij toEscapedModel() {
		return new protokol_podachi_pretenzijWrapper(_protokol_podachi_pretenzij.toEscapedModel());
	}

	@Override
	public tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij toUnescapedModel() {
		return new protokol_podachi_pretenzijWrapper(_protokol_podachi_pretenzij.toUnescapedModel());
	}

	@Override
	public void persist() {
		_protokol_podachi_pretenzij.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_protokol_podachi_pretenzij.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_generacii of this protokol_podachi_pretenzij.
	*
	* @param data_generacii the data_generacii of this protokol_podachi_pretenzij
	*/
	@Override
	public void setData_generacii(Date data_generacii) {
		_protokol_podachi_pretenzij.setData_generacii(data_generacii);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_protokol_podachi_pretenzij.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_protokol_podachi_pretenzij.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_protokol_podachi_pretenzij.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this protokol_podachi_pretenzij.
	*
	* @param izvewenie_id the izvewenie_id of this protokol_podachi_pretenzij
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_protokol_podachi_pretenzij.setIzvewenie_id(izvewenie_id);
	}

	@Override
	public void setNew(boolean n) {
		_protokol_podachi_pretenzij.setNew(n);
	}

	/**
	* Sets the primary key of this protokol_podachi_pretenzij.
	*
	* @param primaryKey the primary key of this protokol_podachi_pretenzij
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_protokol_podachi_pretenzij.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_protokol_podachi_pretenzij.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the protokol_podachi_pretenzij_id of this protokol_podachi_pretenzij.
	*
	* @param protokol_podachi_pretenzij_id the protokol_podachi_pretenzij_id of this protokol_podachi_pretenzij
	*/
	@Override
	public void setProtokol_podachi_pretenzij_id(
		long protokol_podachi_pretenzij_id) {
		_protokol_podachi_pretenzij.setProtokol_podachi_pretenzij_id(protokol_podachi_pretenzij_id);
	}

	/**
	* Sets the sgeneriroval of this protokol_podachi_pretenzij.
	*
	* @param sgeneriroval the sgeneriroval of this protokol_podachi_pretenzij
	*/
	@Override
	public void setSgeneriroval(long sgeneriroval) {
		_protokol_podachi_pretenzij.setSgeneriroval(sgeneriroval);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof protokol_podachi_pretenzijWrapper)) {
			return false;
		}

		protokol_podachi_pretenzijWrapper protokol_podachi_pretenzijWrapper = (protokol_podachi_pretenzijWrapper)obj;

		if (Objects.equals(_protokol_podachi_pretenzij,
					protokol_podachi_pretenzijWrapper._protokol_podachi_pretenzij)) {
			return true;
		}

		return false;
	}

	@Override
	public protokol_podachi_pretenzij getWrappedModel() {
		return _protokol_podachi_pretenzij;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _protokol_podachi_pretenzij.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _protokol_podachi_pretenzij.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_protokol_podachi_pretenzij.resetOriginalValues();
	}

	private final protokol_podachi_pretenzij _protokol_podachi_pretenzij;
}