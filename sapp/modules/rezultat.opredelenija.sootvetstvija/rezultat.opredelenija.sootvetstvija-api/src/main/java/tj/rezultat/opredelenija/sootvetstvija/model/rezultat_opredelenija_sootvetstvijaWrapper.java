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

package tj.rezultat.opredelenija.sootvetstvija.model;

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
 * This class is a wrapper for {@link rezultat_opredelenija_sootvetstvija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_opredelenija_sootvetstvija
 * @generated
 */
@ProviderType
public class rezultat_opredelenija_sootvetstvijaWrapper
	implements rezultat_opredelenija_sootvetstvija,
		ModelWrapper<rezultat_opredelenija_sootvetstvija> {
	public rezultat_opredelenija_sootvetstvijaWrapper(
		rezultat_opredelenija_sootvetstvija rezultat_opredelenija_sootvetstvija) {
		_rezultat_opredelenija_sootvetstvija = rezultat_opredelenija_sootvetstvija;
	}

	@Override
	public Class<?> getModelClass() {
		return rezultat_opredelenija_sootvetstvija.class;
	}

	@Override
	public String getModelClassName() {
		return rezultat_opredelenija_sootvetstvija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("rezultat_opredelenija_sootvetstvija_id",
			getRezultat_opredelenija_sootvetstvija_id());
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

		Long rezultat_opredelenija_sootvetstvija_id = (Long)attributes.get(
				"rezultat_opredelenija_sootvetstvija_id");

		if (rezultat_opredelenija_sootvetstvija_id != null) {
			setRezultat_opredelenija_sootvetstvija_id(rezultat_opredelenija_sootvetstvija_id);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _rezultat_opredelenija_sootvetstvija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _rezultat_opredelenija_sootvetstvija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _rezultat_opredelenija_sootvetstvija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _rezultat_opredelenija_sootvetstvija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija> toCacheModel() {
		return _rezultat_opredelenija_sootvetstvija.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija rezultat_opredelenija_sootvetstvija) {
		return _rezultat_opredelenija_sootvetstvija.compareTo(rezultat_opredelenija_sootvetstvija);
	}

	@Override
	public int hashCode() {
		return _rezultat_opredelenija_sootvetstvija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rezultat_opredelenija_sootvetstvija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new rezultat_opredelenija_sootvetstvijaWrapper((rezultat_opredelenija_sootvetstvija)_rezultat_opredelenija_sootvetstvija.clone());
	}

	@Override
	public java.lang.String toString() {
		return _rezultat_opredelenija_sootvetstvija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rezultat_opredelenija_sootvetstvija.toXmlString();
	}

	/**
	* Returns the data_sozdanija of this rezultat_opredelenija_sootvetstvija.
	*
	* @return the data_sozdanija of this rezultat_opredelenija_sootvetstvija
	*/
	@Override
	public Date getData_sozdanija() {
		return _rezultat_opredelenija_sootvetstvija.getData_sozdanija();
	}

	/**
	* Returns the izvewenie_id of this rezultat_opredelenija_sootvetstvija.
	*
	* @return the izvewenie_id of this rezultat_opredelenija_sootvetstvija
	*/
	@Override
	public long getIzvewenie_id() {
		return _rezultat_opredelenija_sootvetstvija.getIzvewenie_id();
	}

	/**
	* Returns the primary key of this rezultat_opredelenija_sootvetstvija.
	*
	* @return the primary key of this rezultat_opredelenija_sootvetstvija
	*/
	@Override
	public long getPrimaryKey() {
		return _rezultat_opredelenija_sootvetstvija.getPrimaryKey();
	}

	/**
	* Returns the rezultat_opredelenija_sootvetstvija_id of this rezultat_opredelenija_sootvetstvija.
	*
	* @return the rezultat_opredelenija_sootvetstvija_id of this rezultat_opredelenija_sootvetstvija
	*/
	@Override
	public long getRezultat_opredelenija_sootvetstvija_id() {
		return _rezultat_opredelenija_sootvetstvija.getRezultat_opredelenija_sootvetstvija_id();
	}

	/**
	* Returns the sozdal of this rezultat_opredelenija_sootvetstvija.
	*
	* @return the sozdal of this rezultat_opredelenija_sootvetstvija
	*/
	@Override
	public long getSozdal() {
		return _rezultat_opredelenija_sootvetstvija.getSozdal();
	}

	@Override
	public tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija toEscapedModel() {
		return new rezultat_opredelenija_sootvetstvijaWrapper(_rezultat_opredelenija_sootvetstvija.toEscapedModel());
	}

	@Override
	public tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija toUnescapedModel() {
		return new rezultat_opredelenija_sootvetstvijaWrapper(_rezultat_opredelenija_sootvetstvija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_rezultat_opredelenija_sootvetstvija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rezultat_opredelenija_sootvetstvija.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_sozdanija of this rezultat_opredelenija_sootvetstvija.
	*
	* @param data_sozdanija the data_sozdanija of this rezultat_opredelenija_sootvetstvija
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_rezultat_opredelenija_sootvetstvija.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_rezultat_opredelenija_sootvetstvija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_rezultat_opredelenija_sootvetstvija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_rezultat_opredelenija_sootvetstvija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this rezultat_opredelenija_sootvetstvija.
	*
	* @param izvewenie_id the izvewenie_id of this rezultat_opredelenija_sootvetstvija
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_rezultat_opredelenija_sootvetstvija.setIzvewenie_id(izvewenie_id);
	}

	@Override
	public void setNew(boolean n) {
		_rezultat_opredelenija_sootvetstvija.setNew(n);
	}

	/**
	* Sets the primary key of this rezultat_opredelenija_sootvetstvija.
	*
	* @param primaryKey the primary key of this rezultat_opredelenija_sootvetstvija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rezultat_opredelenija_sootvetstvija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_rezultat_opredelenija_sootvetstvija.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rezultat_opredelenija_sootvetstvija_id of this rezultat_opredelenija_sootvetstvija.
	*
	* @param rezultat_opredelenija_sootvetstvija_id the rezultat_opredelenija_sootvetstvija_id of this rezultat_opredelenija_sootvetstvija
	*/
	@Override
	public void setRezultat_opredelenija_sootvetstvija_id(
		long rezultat_opredelenija_sootvetstvija_id) {
		_rezultat_opredelenija_sootvetstvija.setRezultat_opredelenija_sootvetstvija_id(rezultat_opredelenija_sootvetstvija_id);
	}

	/**
	* Sets the sozdal of this rezultat_opredelenija_sootvetstvija.
	*
	* @param sozdal the sozdal of this rezultat_opredelenija_sootvetstvija
	*/
	@Override
	public void setSozdal(long sozdal) {
		_rezultat_opredelenija_sootvetstvija.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof rezultat_opredelenija_sootvetstvijaWrapper)) {
			return false;
		}

		rezultat_opredelenija_sootvetstvijaWrapper rezultat_opredelenija_sootvetstvijaWrapper =
			(rezultat_opredelenija_sootvetstvijaWrapper)obj;

		if (Objects.equals(_rezultat_opredelenija_sootvetstvija,
					rezultat_opredelenija_sootvetstvijaWrapper._rezultat_opredelenija_sootvetstvija)) {
			return true;
		}

		return false;
	}

	@Override
	public rezultat_opredelenija_sootvetstvija getWrappedModel() {
		return _rezultat_opredelenija_sootvetstvija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _rezultat_opredelenija_sootvetstvija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _rezultat_opredelenija_sootvetstvija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_rezultat_opredelenija_sootvetstvija.resetOriginalValues();
	}

	private final rezultat_opredelenija_sootvetstvija _rezultat_opredelenija_sootvetstvija;
}