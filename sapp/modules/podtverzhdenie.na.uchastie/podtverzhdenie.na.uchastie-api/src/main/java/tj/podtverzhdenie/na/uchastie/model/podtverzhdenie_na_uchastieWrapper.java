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

package tj.podtverzhdenie.na.uchastie.model;

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
 * This class is a wrapper for {@link podtverzhdenie_na_uchastie}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_na_uchastie
 * @generated
 */
@ProviderType
public class podtverzhdenie_na_uchastieWrapper
	implements podtverzhdenie_na_uchastie,
		ModelWrapper<podtverzhdenie_na_uchastie> {
	public podtverzhdenie_na_uchastieWrapper(
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		_podtverzhdenie_na_uchastie = podtverzhdenie_na_uchastie;
	}

	@Override
	public Class<?> getModelClass() {
		return podtverzhdenie_na_uchastie.class;
	}

	@Override
	public String getModelClassName() {
		return podtverzhdenie_na_uchastie.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("lot_id", getLot_id());
		attributes.put("podtverzhdenie_na_uchastie_id",
			getPodtverzhdenie_na_uchastie_id());
		attributes.put("postavwik_id", getPostavwik_id());
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

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		Long podtverzhdenie_na_uchastie_id = (Long)attributes.get(
				"podtverzhdenie_na_uchastie_id");

		if (podtverzhdenie_na_uchastie_id != null) {
			setPodtverzhdenie_na_uchastie_id(podtverzhdenie_na_uchastie_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _podtverzhdenie_na_uchastie.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _podtverzhdenie_na_uchastie.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _podtverzhdenie_na_uchastie.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _podtverzhdenie_na_uchastie.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie> toCacheModel() {
		return _podtverzhdenie_na_uchastie.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		return _podtverzhdenie_na_uchastie.compareTo(podtverzhdenie_na_uchastie);
	}

	@Override
	public int hashCode() {
		return _podtverzhdenie_na_uchastie.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _podtverzhdenie_na_uchastie.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new podtverzhdenie_na_uchastieWrapper((podtverzhdenie_na_uchastie)_podtverzhdenie_na_uchastie.clone());
	}

	@Override
	public java.lang.String toString() {
		return _podtverzhdenie_na_uchastie.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _podtverzhdenie_na_uchastie.toXmlString();
	}

	/**
	* Returns the data_sozdanija of this podtverzhdenie_na_uchastie.
	*
	* @return the data_sozdanija of this podtverzhdenie_na_uchastie
	*/
	@Override
	public Date getData_sozdanija() {
		return _podtverzhdenie_na_uchastie.getData_sozdanija();
	}

	/**
	* Returns the izvewenie_id of this podtverzhdenie_na_uchastie.
	*
	* @return the izvewenie_id of this podtverzhdenie_na_uchastie
	*/
	@Override
	public long getIzvewenie_id() {
		return _podtverzhdenie_na_uchastie.getIzvewenie_id();
	}

	/**
	* Returns the lot_id of this podtverzhdenie_na_uchastie.
	*
	* @return the lot_id of this podtverzhdenie_na_uchastie
	*/
	@Override
	public long getLot_id() {
		return _podtverzhdenie_na_uchastie.getLot_id();
	}

	/**
	* Returns the podtverzhdenie_na_uchastie_id of this podtverzhdenie_na_uchastie.
	*
	* @return the podtverzhdenie_na_uchastie_id of this podtverzhdenie_na_uchastie
	*/
	@Override
	public long getPodtverzhdenie_na_uchastie_id() {
		return _podtverzhdenie_na_uchastie.getPodtverzhdenie_na_uchastie_id();
	}

	/**
	* Returns the postavwik_id of this podtverzhdenie_na_uchastie.
	*
	* @return the postavwik_id of this podtverzhdenie_na_uchastie
	*/
	@Override
	public long getPostavwik_id() {
		return _podtverzhdenie_na_uchastie.getPostavwik_id();
	}

	/**
	* Returns the primary key of this podtverzhdenie_na_uchastie.
	*
	* @return the primary key of this podtverzhdenie_na_uchastie
	*/
	@Override
	public long getPrimaryKey() {
		return _podtverzhdenie_na_uchastie.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this podtverzhdenie_na_uchastie.
	*
	* @return the sozdal of this podtverzhdenie_na_uchastie
	*/
	@Override
	public long getSozdal() {
		return _podtverzhdenie_na_uchastie.getSozdal();
	}

	@Override
	public tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie toEscapedModel() {
		return new podtverzhdenie_na_uchastieWrapper(_podtverzhdenie_na_uchastie.toEscapedModel());
	}

	@Override
	public tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie toUnescapedModel() {
		return new podtverzhdenie_na_uchastieWrapper(_podtverzhdenie_na_uchastie.toUnescapedModel());
	}

	@Override
	public void persist() {
		_podtverzhdenie_na_uchastie.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_podtverzhdenie_na_uchastie.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_sozdanija of this podtverzhdenie_na_uchastie.
	*
	* @param data_sozdanija the data_sozdanija of this podtverzhdenie_na_uchastie
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_podtverzhdenie_na_uchastie.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_podtverzhdenie_na_uchastie.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_podtverzhdenie_na_uchastie.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_podtverzhdenie_na_uchastie.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this podtverzhdenie_na_uchastie.
	*
	* @param izvewenie_id the izvewenie_id of this podtverzhdenie_na_uchastie
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_podtverzhdenie_na_uchastie.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the lot_id of this podtverzhdenie_na_uchastie.
	*
	* @param lot_id the lot_id of this podtverzhdenie_na_uchastie
	*/
	@Override
	public void setLot_id(long lot_id) {
		_podtverzhdenie_na_uchastie.setLot_id(lot_id);
	}

	@Override
	public void setNew(boolean n) {
		_podtverzhdenie_na_uchastie.setNew(n);
	}

	/**
	* Sets the podtverzhdenie_na_uchastie_id of this podtverzhdenie_na_uchastie.
	*
	* @param podtverzhdenie_na_uchastie_id the podtverzhdenie_na_uchastie_id of this podtverzhdenie_na_uchastie
	*/
	@Override
	public void setPodtverzhdenie_na_uchastie_id(
		long podtverzhdenie_na_uchastie_id) {
		_podtverzhdenie_na_uchastie.setPodtverzhdenie_na_uchastie_id(podtverzhdenie_na_uchastie_id);
	}

	/**
	* Sets the postavwik_id of this podtverzhdenie_na_uchastie.
	*
	* @param postavwik_id the postavwik_id of this podtverzhdenie_na_uchastie
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_podtverzhdenie_na_uchastie.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this podtverzhdenie_na_uchastie.
	*
	* @param primaryKey the primary key of this podtverzhdenie_na_uchastie
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_podtverzhdenie_na_uchastie.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_podtverzhdenie_na_uchastie.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this podtverzhdenie_na_uchastie.
	*
	* @param sozdal the sozdal of this podtverzhdenie_na_uchastie
	*/
	@Override
	public void setSozdal(long sozdal) {
		_podtverzhdenie_na_uchastie.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof podtverzhdenie_na_uchastieWrapper)) {
			return false;
		}

		podtverzhdenie_na_uchastieWrapper podtverzhdenie_na_uchastieWrapper = (podtverzhdenie_na_uchastieWrapper)obj;

		if (Objects.equals(_podtverzhdenie_na_uchastie,
					podtverzhdenie_na_uchastieWrapper._podtverzhdenie_na_uchastie)) {
			return true;
		}

		return false;
	}

	@Override
	public podtverzhdenie_na_uchastie getWrappedModel() {
		return _podtverzhdenie_na_uchastie;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _podtverzhdenie_na_uchastie.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _podtverzhdenie_na_uchastie.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_podtverzhdenie_na_uchastie.resetOriginalValues();
	}

	private final podtverzhdenie_na_uchastie _podtverzhdenie_na_uchastie;
}