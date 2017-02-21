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

package tj.prichiny.otmeny.model;

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
 * This class is a wrapper for {@link prichiny_otmeny}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prichiny_otmeny
 * @generated
 */
@ProviderType
public class prichiny_otmenyWrapper implements prichiny_otmeny,
	ModelWrapper<prichiny_otmeny> {
	public prichiny_otmenyWrapper(prichiny_otmeny prichiny_otmeny) {
		_prichiny_otmeny = prichiny_otmeny;
	}

	@Override
	public Class<?> getModelClass() {
		return prichiny_otmeny.class;
	}

	@Override
	public String getModelClassName() {
		return prichiny_otmeny.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("prichina", getPrichina());
		attributes.put("prichiny_otmeny_id", getPrichiny_otmeny_id());
		attributes.put("sozdal", getSozdal());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		String prichina = (String)attributes.get("prichina");

		if (prichina != null) {
			setPrichina(prichina);
		}

		Long prichiny_otmeny_id = (Long)attributes.get("prichiny_otmeny_id");

		if (prichiny_otmeny_id != null) {
			setPrichiny_otmeny_id(prichiny_otmeny_id);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _prichiny_otmeny.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _prichiny_otmeny.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _prichiny_otmeny.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _prichiny_otmeny.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.prichiny.otmeny.model.prichiny_otmeny> toCacheModel() {
		return _prichiny_otmeny.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.prichiny.otmeny.model.prichiny_otmeny prichiny_otmeny) {
		return _prichiny_otmeny.compareTo(prichiny_otmeny);
	}

	@Override
	public int hashCode() {
		return _prichiny_otmeny.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _prichiny_otmeny.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new prichiny_otmenyWrapper((prichiny_otmeny)_prichiny_otmeny.clone());
	}

	/**
	* Returns the prichina of this prichiny_otmeny.
	*
	* @return the prichina of this prichiny_otmeny
	*/
	@Override
	public java.lang.String getPrichina() {
		return _prichiny_otmeny.getPrichina();
	}

	@Override
	public java.lang.String toString() {
		return _prichiny_otmeny.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _prichiny_otmeny.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this prichiny_otmeny.
	*
	* @return the data_izmenenija of this prichiny_otmeny
	*/
	@Override
	public Date getData_izmenenija() {
		return _prichiny_otmeny.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this prichiny_otmeny.
	*
	* @return the data_sozdanija of this prichiny_otmeny
	*/
	@Override
	public Date getData_sozdanija() {
		return _prichiny_otmeny.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this prichiny_otmeny.
	*
	* @return the izmenil of this prichiny_otmeny
	*/
	@Override
	public long getIzmenil() {
		return _prichiny_otmeny.getIzmenil();
	}

	/**
	* Returns the izvewenie_id of this prichiny_otmeny.
	*
	* @return the izvewenie_id of this prichiny_otmeny
	*/
	@Override
	public long getIzvewenie_id() {
		return _prichiny_otmeny.getIzvewenie_id();
	}

	/**
	* Returns the prichiny_otmeny_id of this prichiny_otmeny.
	*
	* @return the prichiny_otmeny_id of this prichiny_otmeny
	*/
	@Override
	public long getPrichiny_otmeny_id() {
		return _prichiny_otmeny.getPrichiny_otmeny_id();
	}

	/**
	* Returns the primary key of this prichiny_otmeny.
	*
	* @return the primary key of this prichiny_otmeny
	*/
	@Override
	public long getPrimaryKey() {
		return _prichiny_otmeny.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this prichiny_otmeny.
	*
	* @return the sozdal of this prichiny_otmeny
	*/
	@Override
	public long getSozdal() {
		return _prichiny_otmeny.getSozdal();
	}

	@Override
	public tj.prichiny.otmeny.model.prichiny_otmeny toEscapedModel() {
		return new prichiny_otmenyWrapper(_prichiny_otmeny.toEscapedModel());
	}

	@Override
	public tj.prichiny.otmeny.model.prichiny_otmeny toUnescapedModel() {
		return new prichiny_otmenyWrapper(_prichiny_otmeny.toUnescapedModel());
	}

	@Override
	public void persist() {
		_prichiny_otmeny.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_prichiny_otmeny.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this prichiny_otmeny.
	*
	* @param data_izmenenija the data_izmenenija of this prichiny_otmeny
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_prichiny_otmeny.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this prichiny_otmeny.
	*
	* @param data_sozdanija the data_sozdanija of this prichiny_otmeny
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_prichiny_otmeny.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_prichiny_otmeny.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_prichiny_otmeny.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_prichiny_otmeny.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izmenil of this prichiny_otmeny.
	*
	* @param izmenil the izmenil of this prichiny_otmeny
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_prichiny_otmeny.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenie_id of this prichiny_otmeny.
	*
	* @param izvewenie_id the izvewenie_id of this prichiny_otmeny
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_prichiny_otmeny.setIzvewenie_id(izvewenie_id);
	}

	@Override
	public void setNew(boolean n) {
		_prichiny_otmeny.setNew(n);
	}

	/**
	* Sets the prichina of this prichiny_otmeny.
	*
	* @param prichina the prichina of this prichiny_otmeny
	*/
	@Override
	public void setPrichina(java.lang.String prichina) {
		_prichiny_otmeny.setPrichina(prichina);
	}

	/**
	* Sets the prichiny_otmeny_id of this prichiny_otmeny.
	*
	* @param prichiny_otmeny_id the prichiny_otmeny_id of this prichiny_otmeny
	*/
	@Override
	public void setPrichiny_otmeny_id(long prichiny_otmeny_id) {
		_prichiny_otmeny.setPrichiny_otmeny_id(prichiny_otmeny_id);
	}

	/**
	* Sets the primary key of this prichiny_otmeny.
	*
	* @param primaryKey the primary key of this prichiny_otmeny
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_prichiny_otmeny.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_prichiny_otmeny.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this prichiny_otmeny.
	*
	* @param sozdal the sozdal of this prichiny_otmeny
	*/
	@Override
	public void setSozdal(long sozdal) {
		_prichiny_otmeny.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof prichiny_otmenyWrapper)) {
			return false;
		}

		prichiny_otmenyWrapper prichiny_otmenyWrapper = (prichiny_otmenyWrapper)obj;

		if (Objects.equals(_prichiny_otmeny,
					prichiny_otmenyWrapper._prichiny_otmeny)) {
			return true;
		}

		return false;
	}

	@Override
	public prichiny_otmeny getWrappedModel() {
		return _prichiny_otmeny;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _prichiny_otmeny.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _prichiny_otmeny.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_prichiny_otmeny.resetOriginalValues();
	}

	private final prichiny_otmeny _prichiny_otmeny;
}