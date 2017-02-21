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

package tj.podtverzhdenie.nalichija.sredstv.model;

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
 * This class is a wrapper for {@link podtverzhdenie_nalichija_sredstv}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_nalichija_sredstv
 * @generated
 */
@ProviderType
public class podtverzhdenie_nalichija_sredstvWrapper
	implements podtverzhdenie_nalichija_sredstv,
		ModelWrapper<podtverzhdenie_nalichija_sredstv> {
	public podtverzhdenie_nalichija_sredstvWrapper(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		_podtverzhdenie_nalichija_sredstv = podtverzhdenie_nalichija_sredstv;
	}

	@Override
	public Class<?> getModelClass() {
		return podtverzhdenie_nalichija_sredstv.class;
	}

	@Override
	public String getModelClassName() {
		return podtverzhdenie_nalichija_sredstv.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_zagruzki", getData_zagruzki());
		attributes.put("imja_fajla", getImja_fajla());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("lot_id", getLot_id());
		attributes.put("nazvanie_dokumenta", getNazvanie_dokumenta());
		attributes.put("podtverzhdenie_nalichija_sredstv_id",
			getPodtverzhdenie_nalichija_sredstv_id());
		attributes.put("zagruzil", getZagruzil());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_zagruzki = (Date)attributes.get("data_zagruzki");

		if (data_zagruzki != null) {
			setData_zagruzki(data_zagruzki);
		}

		String imja_fajla = (String)attributes.get("imja_fajla");

		if (imja_fajla != null) {
			setImja_fajla(imja_fajla);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		String nazvanie_dokumenta = (String)attributes.get("nazvanie_dokumenta");

		if (nazvanie_dokumenta != null) {
			setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		Long podtverzhdenie_nalichija_sredstv_id = (Long)attributes.get(
				"podtverzhdenie_nalichija_sredstv_id");

		if (podtverzhdenie_nalichija_sredstv_id != null) {
			setPodtverzhdenie_nalichija_sredstv_id(podtverzhdenie_nalichija_sredstv_id);
		}

		Long zagruzil = (Long)attributes.get("zagruzil");

		if (zagruzil != null) {
			setZagruzil(zagruzil);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _podtverzhdenie_nalichija_sredstv.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _podtverzhdenie_nalichija_sredstv.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _podtverzhdenie_nalichija_sredstv.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _podtverzhdenie_nalichija_sredstv.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv> toCacheModel() {
		return _podtverzhdenie_nalichija_sredstv.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		return _podtverzhdenie_nalichija_sredstv.compareTo(podtverzhdenie_nalichija_sredstv);
	}

	@Override
	public int hashCode() {
		return _podtverzhdenie_nalichija_sredstv.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _podtverzhdenie_nalichija_sredstv.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new podtverzhdenie_nalichija_sredstvWrapper((podtverzhdenie_nalichija_sredstv)_podtverzhdenie_nalichija_sredstv.clone());
	}

	/**
	* Returns the imja_fajla of this podtverzhdenie_nalichija_sredstv.
	*
	* @return the imja_fajla of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public java.lang.String getImja_fajla() {
		return _podtverzhdenie_nalichija_sredstv.getImja_fajla();
	}

	/**
	* Returns the nazvanie_dokumenta of this podtverzhdenie_nalichija_sredstv.
	*
	* @return the nazvanie_dokumenta of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public java.lang.String getNazvanie_dokumenta() {
		return _podtverzhdenie_nalichija_sredstv.getNazvanie_dokumenta();
	}

	@Override
	public java.lang.String toString() {
		return _podtverzhdenie_nalichija_sredstv.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _podtverzhdenie_nalichija_sredstv.toXmlString();
	}

	/**
	* Returns the data_zagruzki of this podtverzhdenie_nalichija_sredstv.
	*
	* @return the data_zagruzki of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public Date getData_zagruzki() {
		return _podtverzhdenie_nalichija_sredstv.getData_zagruzki();
	}

	/**
	* Returns the izvewenie_id of this podtverzhdenie_nalichija_sredstv.
	*
	* @return the izvewenie_id of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public long getIzvewenie_id() {
		return _podtverzhdenie_nalichija_sredstv.getIzvewenie_id();
	}

	/**
	* Returns the lot_id of this podtverzhdenie_nalichija_sredstv.
	*
	* @return the lot_id of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public long getLot_id() {
		return _podtverzhdenie_nalichija_sredstv.getLot_id();
	}

	/**
	* Returns the podtverzhdenie_nalichija_sredstv_id of this podtverzhdenie_nalichija_sredstv.
	*
	* @return the podtverzhdenie_nalichija_sredstv_id of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public long getPodtverzhdenie_nalichija_sredstv_id() {
		return _podtverzhdenie_nalichija_sredstv.getPodtverzhdenie_nalichija_sredstv_id();
	}

	/**
	* Returns the primary key of this podtverzhdenie_nalichija_sredstv.
	*
	* @return the primary key of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public long getPrimaryKey() {
		return _podtverzhdenie_nalichija_sredstv.getPrimaryKey();
	}

	/**
	* Returns the zagruzil of this podtverzhdenie_nalichija_sredstv.
	*
	* @return the zagruzil of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public long getZagruzil() {
		return _podtverzhdenie_nalichija_sredstv.getZagruzil();
	}

	@Override
	public tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv toEscapedModel() {
		return new podtverzhdenie_nalichija_sredstvWrapper(_podtverzhdenie_nalichija_sredstv.toEscapedModel());
	}

	@Override
	public tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv toUnescapedModel() {
		return new podtverzhdenie_nalichija_sredstvWrapper(_podtverzhdenie_nalichija_sredstv.toUnescapedModel());
	}

	@Override
	public void persist() {
		_podtverzhdenie_nalichija_sredstv.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_podtverzhdenie_nalichija_sredstv.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_zagruzki of this podtverzhdenie_nalichija_sredstv.
	*
	* @param data_zagruzki the data_zagruzki of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public void setData_zagruzki(Date data_zagruzki) {
		_podtverzhdenie_nalichija_sredstv.setData_zagruzki(data_zagruzki);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_podtverzhdenie_nalichija_sredstv.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_podtverzhdenie_nalichija_sredstv.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_podtverzhdenie_nalichija_sredstv.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the imja_fajla of this podtverzhdenie_nalichija_sredstv.
	*
	* @param imja_fajla the imja_fajla of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public void setImja_fajla(java.lang.String imja_fajla) {
		_podtverzhdenie_nalichija_sredstv.setImja_fajla(imja_fajla);
	}

	/**
	* Sets the izvewenie_id of this podtverzhdenie_nalichija_sredstv.
	*
	* @param izvewenie_id the izvewenie_id of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_podtverzhdenie_nalichija_sredstv.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the lot_id of this podtverzhdenie_nalichija_sredstv.
	*
	* @param lot_id the lot_id of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public void setLot_id(long lot_id) {
		_podtverzhdenie_nalichija_sredstv.setLot_id(lot_id);
	}

	/**
	* Sets the nazvanie_dokumenta of this podtverzhdenie_nalichija_sredstv.
	*
	* @param nazvanie_dokumenta the nazvanie_dokumenta of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public void setNazvanie_dokumenta(java.lang.String nazvanie_dokumenta) {
		_podtverzhdenie_nalichija_sredstv.setNazvanie_dokumenta(nazvanie_dokumenta);
	}

	@Override
	public void setNew(boolean n) {
		_podtverzhdenie_nalichija_sredstv.setNew(n);
	}

	/**
	* Sets the podtverzhdenie_nalichija_sredstv_id of this podtverzhdenie_nalichija_sredstv.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the podtverzhdenie_nalichija_sredstv_id of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public void setPodtverzhdenie_nalichija_sredstv_id(
		long podtverzhdenie_nalichija_sredstv_id) {
		_podtverzhdenie_nalichija_sredstv.setPodtverzhdenie_nalichija_sredstv_id(podtverzhdenie_nalichija_sredstv_id);
	}

	/**
	* Sets the primary key of this podtverzhdenie_nalichija_sredstv.
	*
	* @param primaryKey the primary key of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_podtverzhdenie_nalichija_sredstv.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_podtverzhdenie_nalichija_sredstv.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the zagruzil of this podtverzhdenie_nalichija_sredstv.
	*
	* @param zagruzil the zagruzil of this podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public void setZagruzil(long zagruzil) {
		_podtverzhdenie_nalichija_sredstv.setZagruzil(zagruzil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof podtverzhdenie_nalichija_sredstvWrapper)) {
			return false;
		}

		podtverzhdenie_nalichija_sredstvWrapper podtverzhdenie_nalichija_sredstvWrapper =
			(podtverzhdenie_nalichija_sredstvWrapper)obj;

		if (Objects.equals(_podtverzhdenie_nalichija_sredstv,
					podtverzhdenie_nalichija_sredstvWrapper._podtverzhdenie_nalichija_sredstv)) {
			return true;
		}

		return false;
	}

	@Override
	public podtverzhdenie_nalichija_sredstv getWrappedModel() {
		return _podtverzhdenie_nalichija_sredstv;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _podtverzhdenie_nalichija_sredstv.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _podtverzhdenie_nalichija_sredstv.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_podtverzhdenie_nalichija_sredstv.resetOriginalValues();
	}

	private final podtverzhdenie_nalichija_sredstv _podtverzhdenie_nalichija_sredstv;
}