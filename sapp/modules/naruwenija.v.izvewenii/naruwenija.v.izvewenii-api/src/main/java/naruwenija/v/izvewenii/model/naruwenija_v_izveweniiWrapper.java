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

package naruwenija.v.izvewenii.model;

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
 * This class is a wrapper for {@link naruwenija_v_izvewenii}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see naruwenija_v_izvewenii
 * @generated
 */
@ProviderType
public class naruwenija_v_izveweniiWrapper implements naruwenija_v_izvewenii,
	ModelWrapper<naruwenija_v_izvewenii> {
	public naruwenija_v_izveweniiWrapper(
		naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		_naruwenija_v_izvewenii = naruwenija_v_izvewenii;
	}

	@Override
	public Class<?> getModelClass() {
		return naruwenija_v_izvewenii.class;
	}

	@Override
	public String getModelClassName() {
		return naruwenija_v_izvewenii.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("naruwenie", getNaruwenie());
		attributes.put("naruwenija_v_izvewenii_id",
			getNaruwenija_v_izvewenii_id());
		attributes.put("nomer_razdela", getNomer_razdela());
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

		String naruwenie = (String)attributes.get("naruwenie");

		if (naruwenie != null) {
			setNaruwenie(naruwenie);
		}

		Long naruwenija_v_izvewenii_id = (Long)attributes.get(
				"naruwenija_v_izvewenii_id");

		if (naruwenija_v_izvewenii_id != null) {
			setNaruwenija_v_izvewenii_id(naruwenija_v_izvewenii_id);
		}

		Long nomer_razdela = (Long)attributes.get("nomer_razdela");

		if (nomer_razdela != null) {
			setNomer_razdela(nomer_razdela);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _naruwenija_v_izvewenii.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _naruwenija_v_izvewenii.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _naruwenija_v_izvewenii.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _naruwenija_v_izvewenii.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<naruwenija.v.izvewenii.model.naruwenija_v_izvewenii> toCacheModel() {
		return _naruwenija_v_izvewenii.toCacheModel();
	}

	@Override
	public int compareTo(
		naruwenija.v.izvewenii.model.naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		return _naruwenija_v_izvewenii.compareTo(naruwenija_v_izvewenii);
	}

	@Override
	public int hashCode() {
		return _naruwenija_v_izvewenii.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _naruwenija_v_izvewenii.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new naruwenija_v_izveweniiWrapper((naruwenija_v_izvewenii)_naruwenija_v_izvewenii.clone());
	}

	/**
	* Returns the naruwenie of this naruwenija_v_izvewenii.
	*
	* @return the naruwenie of this naruwenija_v_izvewenii
	*/
	@Override
	public java.lang.String getNaruwenie() {
		return _naruwenija_v_izvewenii.getNaruwenie();
	}

	@Override
	public java.lang.String toString() {
		return _naruwenija_v_izvewenii.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _naruwenija_v_izvewenii.toXmlString();
	}

	/**
	* Returns the data_sozdanija of this naruwenija_v_izvewenii.
	*
	* @return the data_sozdanija of this naruwenija_v_izvewenii
	*/
	@Override
	public Date getData_sozdanija() {
		return _naruwenija_v_izvewenii.getData_sozdanija();
	}

	/**
	* Returns the izvewenie_id of this naruwenija_v_izvewenii.
	*
	* @return the izvewenie_id of this naruwenija_v_izvewenii
	*/
	@Override
	public long getIzvewenie_id() {
		return _naruwenija_v_izvewenii.getIzvewenie_id();
	}

	/**
	* Returns the naruwenija_v_izvewenii_id of this naruwenija_v_izvewenii.
	*
	* @return the naruwenija_v_izvewenii_id of this naruwenija_v_izvewenii
	*/
	@Override
	public long getNaruwenija_v_izvewenii_id() {
		return _naruwenija_v_izvewenii.getNaruwenija_v_izvewenii_id();
	}

	/**
	* Returns the nomer_razdela of this naruwenija_v_izvewenii.
	*
	* @return the nomer_razdela of this naruwenija_v_izvewenii
	*/
	@Override
	public long getNomer_razdela() {
		return _naruwenija_v_izvewenii.getNomer_razdela();
	}

	/**
	* Returns the primary key of this naruwenija_v_izvewenii.
	*
	* @return the primary key of this naruwenija_v_izvewenii
	*/
	@Override
	public long getPrimaryKey() {
		return _naruwenija_v_izvewenii.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this naruwenija_v_izvewenii.
	*
	* @return the sozdal of this naruwenija_v_izvewenii
	*/
	@Override
	public long getSozdal() {
		return _naruwenija_v_izvewenii.getSozdal();
	}

	@Override
	public naruwenija.v.izvewenii.model.naruwenija_v_izvewenii toEscapedModel() {
		return new naruwenija_v_izveweniiWrapper(_naruwenija_v_izvewenii.toEscapedModel());
	}

	@Override
	public naruwenija.v.izvewenii.model.naruwenija_v_izvewenii toUnescapedModel() {
		return new naruwenija_v_izveweniiWrapper(_naruwenija_v_izvewenii.toUnescapedModel());
	}

	@Override
	public void persist() {
		_naruwenija_v_izvewenii.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_naruwenija_v_izvewenii.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_sozdanija of this naruwenija_v_izvewenii.
	*
	* @param data_sozdanija the data_sozdanija of this naruwenija_v_izvewenii
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_naruwenija_v_izvewenii.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_naruwenija_v_izvewenii.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_naruwenija_v_izvewenii.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_naruwenija_v_izvewenii.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this naruwenija_v_izvewenii.
	*
	* @param izvewenie_id the izvewenie_id of this naruwenija_v_izvewenii
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_naruwenija_v_izvewenii.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the naruwenie of this naruwenija_v_izvewenii.
	*
	* @param naruwenie the naruwenie of this naruwenija_v_izvewenii
	*/
	@Override
	public void setNaruwenie(java.lang.String naruwenie) {
		_naruwenija_v_izvewenii.setNaruwenie(naruwenie);
	}

	/**
	* Sets the naruwenija_v_izvewenii_id of this naruwenija_v_izvewenii.
	*
	* @param naruwenija_v_izvewenii_id the naruwenija_v_izvewenii_id of this naruwenija_v_izvewenii
	*/
	@Override
	public void setNaruwenija_v_izvewenii_id(long naruwenija_v_izvewenii_id) {
		_naruwenija_v_izvewenii.setNaruwenija_v_izvewenii_id(naruwenija_v_izvewenii_id);
	}

	@Override
	public void setNew(boolean n) {
		_naruwenija_v_izvewenii.setNew(n);
	}

	/**
	* Sets the nomer_razdela of this naruwenija_v_izvewenii.
	*
	* @param nomer_razdela the nomer_razdela of this naruwenija_v_izvewenii
	*/
	@Override
	public void setNomer_razdela(long nomer_razdela) {
		_naruwenija_v_izvewenii.setNomer_razdela(nomer_razdela);
	}

	/**
	* Sets the primary key of this naruwenija_v_izvewenii.
	*
	* @param primaryKey the primary key of this naruwenija_v_izvewenii
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_naruwenija_v_izvewenii.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_naruwenija_v_izvewenii.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this naruwenija_v_izvewenii.
	*
	* @param sozdal the sozdal of this naruwenija_v_izvewenii
	*/
	@Override
	public void setSozdal(long sozdal) {
		_naruwenija_v_izvewenii.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof naruwenija_v_izveweniiWrapper)) {
			return false;
		}

		naruwenija_v_izveweniiWrapper naruwenija_v_izveweniiWrapper = (naruwenija_v_izveweniiWrapper)obj;

		if (Objects.equals(_naruwenija_v_izvewenii,
					naruwenija_v_izveweniiWrapper._naruwenija_v_izvewenii)) {
			return true;
		}

		return false;
	}

	@Override
	public naruwenija_v_izvewenii getWrappedModel() {
		return _naruwenija_v_izvewenii;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _naruwenija_v_izvewenii.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _naruwenija_v_izvewenii.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_naruwenija_v_izvewenii.resetOriginalValues();
	}

	private final naruwenija_v_izvewenii _naruwenija_v_izvewenii;
}