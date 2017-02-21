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

package tj.reestr.kontraktov.model;

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
 * This class is a wrapper for {@link reestr_kontraktov}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see reestr_kontraktov
 * @generated
 */
@ProviderType
public class reestr_kontraktovWrapper implements reestr_kontraktov,
	ModelWrapper<reestr_kontraktov> {
	public reestr_kontraktovWrapper(reestr_kontraktov reestr_kontraktov) {
		_reestr_kontraktov = reestr_kontraktov;
	}

	@Override
	public Class<?> getModelClass() {
		return reestr_kontraktov.class;
	}

	@Override
	public String getModelClassName() {
		return reestr_kontraktov.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_kontrakta", getData_kontrakta());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("lot_id", getLot_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("reestr_kontraktov_id", getReestr_kontraktov_id());
		attributes.put("sozdal", getSozdal());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_kontrakta = (Date)attributes.get("data_kontrakta");

		if (data_kontrakta != null) {
			setData_kontrakta(data_kontrakta);
		}

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

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		String reestr_kontraktov_id = (String)attributes.get(
				"reestr_kontraktov_id");

		if (reestr_kontraktov_id != null) {
			setReestr_kontraktov_id(reestr_kontraktov_id);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _reestr_kontraktov.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _reestr_kontraktov.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _reestr_kontraktov.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _reestr_kontraktov.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.reestr.kontraktov.model.reestr_kontraktov> toCacheModel() {
		return _reestr_kontraktov.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.reestr.kontraktov.model.reestr_kontraktov reestr_kontraktov) {
		return _reestr_kontraktov.compareTo(reestr_kontraktov);
	}

	@Override
	public int hashCode() {
		return _reestr_kontraktov.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _reestr_kontraktov.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new reestr_kontraktovWrapper((reestr_kontraktov)_reestr_kontraktov.clone());
	}

	/**
	* Returns the primary key of this reestr_kontraktov.
	*
	* @return the primary key of this reestr_kontraktov
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _reestr_kontraktov.getPrimaryKey();
	}

	/**
	* Returns the reestr_kontraktov_id of this reestr_kontraktov.
	*
	* @return the reestr_kontraktov_id of this reestr_kontraktov
	*/
	@Override
	public java.lang.String getReestr_kontraktov_id() {
		return _reestr_kontraktov.getReestr_kontraktov_id();
	}

	@Override
	public java.lang.String toString() {
		return _reestr_kontraktov.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _reestr_kontraktov.toXmlString();
	}

	/**
	* Returns the data_kontrakta of this reestr_kontraktov.
	*
	* @return the data_kontrakta of this reestr_kontraktov
	*/
	@Override
	public Date getData_kontrakta() {
		return _reestr_kontraktov.getData_kontrakta();
	}

	/**
	* Returns the data_sozdanija of this reestr_kontraktov.
	*
	* @return the data_sozdanija of this reestr_kontraktov
	*/
	@Override
	public Date getData_sozdanija() {
		return _reestr_kontraktov.getData_sozdanija();
	}

	/**
	* Returns the izvewenie_id of this reestr_kontraktov.
	*
	* @return the izvewenie_id of this reestr_kontraktov
	*/
	@Override
	public long getIzvewenie_id() {
		return _reestr_kontraktov.getIzvewenie_id();
	}

	/**
	* Returns the lot_id of this reestr_kontraktov.
	*
	* @return the lot_id of this reestr_kontraktov
	*/
	@Override
	public long getLot_id() {
		return _reestr_kontraktov.getLot_id();
	}

	/**
	* Returns the postavwik_id of this reestr_kontraktov.
	*
	* @return the postavwik_id of this reestr_kontraktov
	*/
	@Override
	public long getPostavwik_id() {
		return _reestr_kontraktov.getPostavwik_id();
	}

	/**
	* Returns the sozdal of this reestr_kontraktov.
	*
	* @return the sozdal of this reestr_kontraktov
	*/
	@Override
	public long getSozdal() {
		return _reestr_kontraktov.getSozdal();
	}

	@Override
	public tj.reestr.kontraktov.model.reestr_kontraktov toEscapedModel() {
		return new reestr_kontraktovWrapper(_reestr_kontraktov.toEscapedModel());
	}

	@Override
	public tj.reestr.kontraktov.model.reestr_kontraktov toUnescapedModel() {
		return new reestr_kontraktovWrapper(_reestr_kontraktov.toUnescapedModel());
	}

	@Override
	public void persist() {
		_reestr_kontraktov.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_reestr_kontraktov.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_kontrakta of this reestr_kontraktov.
	*
	* @param data_kontrakta the data_kontrakta of this reestr_kontraktov
	*/
	@Override
	public void setData_kontrakta(Date data_kontrakta) {
		_reestr_kontraktov.setData_kontrakta(data_kontrakta);
	}

	/**
	* Sets the data_sozdanija of this reestr_kontraktov.
	*
	* @param data_sozdanija the data_sozdanija of this reestr_kontraktov
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_reestr_kontraktov.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_reestr_kontraktov.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_reestr_kontraktov.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_reestr_kontraktov.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this reestr_kontraktov.
	*
	* @param izvewenie_id the izvewenie_id of this reestr_kontraktov
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_reestr_kontraktov.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the lot_id of this reestr_kontraktov.
	*
	* @param lot_id the lot_id of this reestr_kontraktov
	*/
	@Override
	public void setLot_id(long lot_id) {
		_reestr_kontraktov.setLot_id(lot_id);
	}

	@Override
	public void setNew(boolean n) {
		_reestr_kontraktov.setNew(n);
	}

	/**
	* Sets the postavwik_id of this reestr_kontraktov.
	*
	* @param postavwik_id the postavwik_id of this reestr_kontraktov
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_reestr_kontraktov.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this reestr_kontraktov.
	*
	* @param primaryKey the primary key of this reestr_kontraktov
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_reestr_kontraktov.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_reestr_kontraktov.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reestr_kontraktov_id of this reestr_kontraktov.
	*
	* @param reestr_kontraktov_id the reestr_kontraktov_id of this reestr_kontraktov
	*/
	@Override
	public void setReestr_kontraktov_id(java.lang.String reestr_kontraktov_id) {
		_reestr_kontraktov.setReestr_kontraktov_id(reestr_kontraktov_id);
	}

	/**
	* Sets the sozdal of this reestr_kontraktov.
	*
	* @param sozdal the sozdal of this reestr_kontraktov
	*/
	@Override
	public void setSozdal(long sozdal) {
		_reestr_kontraktov.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof reestr_kontraktovWrapper)) {
			return false;
		}

		reestr_kontraktovWrapper reestr_kontraktovWrapper = (reestr_kontraktovWrapper)obj;

		if (Objects.equals(_reestr_kontraktov,
					reestr_kontraktovWrapper._reestr_kontraktov)) {
			return true;
		}

		return false;
	}

	@Override
	public reestr_kontraktov getWrappedModel() {
		return _reestr_kontraktov;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _reestr_kontraktov.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _reestr_kontraktov.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_reestr_kontraktov.resetOriginalValues();
	}

	private final reestr_kontraktov _reestr_kontraktov;
}