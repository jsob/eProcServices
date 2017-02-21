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

package tj.ne.sostojavshiesja.zakazy.model;

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
 * This class is a wrapper for {@link ne_sostojavshiesja_zakazy}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ne_sostojavshiesja_zakazy
 * @generated
 */
@ProviderType
public class ne_sostojavshiesja_zakazyWrapper
	implements ne_sostojavshiesja_zakazy,
		ModelWrapper<ne_sostojavshiesja_zakazy> {
	public ne_sostojavshiesja_zakazyWrapper(
		ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy) {
		_ne_sostojavshiesja_zakazy = ne_sostojavshiesja_zakazy;
	}

	@Override
	public Class<?> getModelClass() {
		return ne_sostojavshiesja_zakazy.class;
	}

	@Override
	public String getModelClassName() {
		return ne_sostojavshiesja_zakazy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("ne_sostojavshiesja_zakazy_id",
			getNe_sostojavshiesja_zakazy_id());
		attributes.put("prichina", getPrichina());
		attributes.put("sozdal", getSozdal());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long ne_sostojavshiesja_zakazy_id = (Long)attributes.get(
				"ne_sostojavshiesja_zakazy_id");

		if (ne_sostojavshiesja_zakazy_id != null) {
			setNe_sostojavshiesja_zakazy_id(ne_sostojavshiesja_zakazy_id);
		}

		String prichina = (String)attributes.get("prichina");

		if (prichina != null) {
			setPrichina(prichina);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _ne_sostojavshiesja_zakazy.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ne_sostojavshiesja_zakazy.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ne_sostojavshiesja_zakazy.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ne_sostojavshiesja_zakazy.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy> toCacheModel() {
		return _ne_sostojavshiesja_zakazy.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy) {
		return _ne_sostojavshiesja_zakazy.compareTo(ne_sostojavshiesja_zakazy);
	}

	@Override
	public int hashCode() {
		return _ne_sostojavshiesja_zakazy.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ne_sostojavshiesja_zakazy.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ne_sostojavshiesja_zakazyWrapper((ne_sostojavshiesja_zakazy)_ne_sostojavshiesja_zakazy.clone());
	}

	/**
	* Returns the prichina of this ne_sostojavshiesja_zakazy.
	*
	* @return the prichina of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public java.lang.String getPrichina() {
		return _ne_sostojavshiesja_zakazy.getPrichina();
	}

	@Override
	public java.lang.String toString() {
		return _ne_sostojavshiesja_zakazy.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ne_sostojavshiesja_zakazy.toXmlString();
	}

	/**
	* Returns the data_sozdanija of this ne_sostojavshiesja_zakazy.
	*
	* @return the data_sozdanija of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public Date getData_sozdanija() {
		return _ne_sostojavshiesja_zakazy.getData_sozdanija();
	}

	/**
	* Returns the izvewenie_id of this ne_sostojavshiesja_zakazy.
	*
	* @return the izvewenie_id of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public long getIzvewenie_id() {
		return _ne_sostojavshiesja_zakazy.getIzvewenie_id();
	}

	/**
	* Returns the ne_sostojavshiesja_zakazy_id of this ne_sostojavshiesja_zakazy.
	*
	* @return the ne_sostojavshiesja_zakazy_id of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public long getNe_sostojavshiesja_zakazy_id() {
		return _ne_sostojavshiesja_zakazy.getNe_sostojavshiesja_zakazy_id();
	}

	/**
	* Returns the primary key of this ne_sostojavshiesja_zakazy.
	*
	* @return the primary key of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public long getPrimaryKey() {
		return _ne_sostojavshiesja_zakazy.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this ne_sostojavshiesja_zakazy.
	*
	* @return the sozdal of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public long getSozdal() {
		return _ne_sostojavshiesja_zakazy.getSozdal();
	}

	@Override
	public tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy toEscapedModel() {
		return new ne_sostojavshiesja_zakazyWrapper(_ne_sostojavshiesja_zakazy.toEscapedModel());
	}

	@Override
	public tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy toUnescapedModel() {
		return new ne_sostojavshiesja_zakazyWrapper(_ne_sostojavshiesja_zakazy.toUnescapedModel());
	}

	@Override
	public void persist() {
		_ne_sostojavshiesja_zakazy.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ne_sostojavshiesja_zakazy.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_sozdanija of this ne_sostojavshiesja_zakazy.
	*
	* @param data_sozdanija the data_sozdanija of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_ne_sostojavshiesja_zakazy.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ne_sostojavshiesja_zakazy.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ne_sostojavshiesja_zakazy.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ne_sostojavshiesja_zakazy.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this ne_sostojavshiesja_zakazy.
	*
	* @param izvewenie_id the izvewenie_id of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_ne_sostojavshiesja_zakazy.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the ne_sostojavshiesja_zakazy_id of this ne_sostojavshiesja_zakazy.
	*
	* @param ne_sostojavshiesja_zakazy_id the ne_sostojavshiesja_zakazy_id of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public void setNe_sostojavshiesja_zakazy_id(
		long ne_sostojavshiesja_zakazy_id) {
		_ne_sostojavshiesja_zakazy.setNe_sostojavshiesja_zakazy_id(ne_sostojavshiesja_zakazy_id);
	}

	@Override
	public void setNew(boolean n) {
		_ne_sostojavshiesja_zakazy.setNew(n);
	}

	/**
	* Sets the prichina of this ne_sostojavshiesja_zakazy.
	*
	* @param prichina the prichina of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public void setPrichina(java.lang.String prichina) {
		_ne_sostojavshiesja_zakazy.setPrichina(prichina);
	}

	/**
	* Sets the primary key of this ne_sostojavshiesja_zakazy.
	*
	* @param primaryKey the primary key of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ne_sostojavshiesja_zakazy.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ne_sostojavshiesja_zakazy.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this ne_sostojavshiesja_zakazy.
	*
	* @param sozdal the sozdal of this ne_sostojavshiesja_zakazy
	*/
	@Override
	public void setSozdal(long sozdal) {
		_ne_sostojavshiesja_zakazy.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ne_sostojavshiesja_zakazyWrapper)) {
			return false;
		}

		ne_sostojavshiesja_zakazyWrapper ne_sostojavshiesja_zakazyWrapper = (ne_sostojavshiesja_zakazyWrapper)obj;

		if (Objects.equals(_ne_sostojavshiesja_zakazy,
					ne_sostojavshiesja_zakazyWrapper._ne_sostojavshiesja_zakazy)) {
			return true;
		}

		return false;
	}

	@Override
	public ne_sostojavshiesja_zakazy getWrappedModel() {
		return _ne_sostojavshiesja_zakazy;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ne_sostojavshiesja_zakazy.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ne_sostojavshiesja_zakazy.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ne_sostojavshiesja_zakazy.resetOriginalValues();
	}

	private final ne_sostojavshiesja_zakazy _ne_sostojavshiesja_zakazy;
}