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

package tj.konkursnaja.dokumentacija.model;

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
 * This class is a wrapper for {@link konkursnaja_dokumentacija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see konkursnaja_dokumentacija
 * @generated
 */
@ProviderType
public class konkursnaja_dokumentacijaWrapper
	implements konkursnaja_dokumentacija,
		ModelWrapper<konkursnaja_dokumentacija> {
	public konkursnaja_dokumentacijaWrapper(
		konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		_konkursnaja_dokumentacija = konkursnaja_dokumentacija;
	}

	@Override
	public Class<?> getModelClass() {
		return konkursnaja_dokumentacija.class;
	}

	@Override
	public String getModelClassName() {
		return konkursnaja_dokumentacija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_zagruzki", getData_zagruzki());
		attributes.put("imja_fajla", getImja_fajla());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("konkursnaja_dokumentacija_id",
			getKonkursnaja_dokumentacija_id());
		attributes.put("lot_id", getLot_id());
		attributes.put("nazvanie_dokumenta", getNazvanie_dokumenta());
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

		Long konkursnaja_dokumentacija_id = (Long)attributes.get(
				"konkursnaja_dokumentacija_id");

		if (konkursnaja_dokumentacija_id != null) {
			setKonkursnaja_dokumentacija_id(konkursnaja_dokumentacija_id);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		String nazvanie_dokumenta = (String)attributes.get("nazvanie_dokumenta");

		if (nazvanie_dokumenta != null) {
			setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		Long zagruzil = (Long)attributes.get("zagruzil");

		if (zagruzil != null) {
			setZagruzil(zagruzil);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _konkursnaja_dokumentacija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _konkursnaja_dokumentacija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _konkursnaja_dokumentacija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _konkursnaja_dokumentacija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija> toCacheModel() {
		return _konkursnaja_dokumentacija.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		return _konkursnaja_dokumentacija.compareTo(konkursnaja_dokumentacija);
	}

	@Override
	public int hashCode() {
		return _konkursnaja_dokumentacija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _konkursnaja_dokumentacija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new konkursnaja_dokumentacijaWrapper((konkursnaja_dokumentacija)_konkursnaja_dokumentacija.clone());
	}

	/**
	* Returns the imja_fajla of this konkursnaja_dokumentacija.
	*
	* @return the imja_fajla of this konkursnaja_dokumentacija
	*/
	@Override
	public java.lang.String getImja_fajla() {
		return _konkursnaja_dokumentacija.getImja_fajla();
	}

	/**
	* Returns the nazvanie_dokumenta of this konkursnaja_dokumentacija.
	*
	* @return the nazvanie_dokumenta of this konkursnaja_dokumentacija
	*/
	@Override
	public java.lang.String getNazvanie_dokumenta() {
		return _konkursnaja_dokumentacija.getNazvanie_dokumenta();
	}

	@Override
	public java.lang.String toString() {
		return _konkursnaja_dokumentacija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _konkursnaja_dokumentacija.toXmlString();
	}

	/**
	* Returns the data_zagruzki of this konkursnaja_dokumentacija.
	*
	* @return the data_zagruzki of this konkursnaja_dokumentacija
	*/
	@Override
	public Date getData_zagruzki() {
		return _konkursnaja_dokumentacija.getData_zagruzki();
	}

	/**
	* Returns the izvewenie_id of this konkursnaja_dokumentacija.
	*
	* @return the izvewenie_id of this konkursnaja_dokumentacija
	*/
	@Override
	public long getIzvewenie_id() {
		return _konkursnaja_dokumentacija.getIzvewenie_id();
	}

	/**
	* Returns the konkursnaja_dokumentacija_id of this konkursnaja_dokumentacija.
	*
	* @return the konkursnaja_dokumentacija_id of this konkursnaja_dokumentacija
	*/
	@Override
	public long getKonkursnaja_dokumentacija_id() {
		return _konkursnaja_dokumentacija.getKonkursnaja_dokumentacija_id();
	}

	/**
	* Returns the lot_id of this konkursnaja_dokumentacija.
	*
	* @return the lot_id of this konkursnaja_dokumentacija
	*/
	@Override
	public long getLot_id() {
		return _konkursnaja_dokumentacija.getLot_id();
	}

	/**
	* Returns the primary key of this konkursnaja_dokumentacija.
	*
	* @return the primary key of this konkursnaja_dokumentacija
	*/
	@Override
	public long getPrimaryKey() {
		return _konkursnaja_dokumentacija.getPrimaryKey();
	}

	/**
	* Returns the zagruzil of this konkursnaja_dokumentacija.
	*
	* @return the zagruzil of this konkursnaja_dokumentacija
	*/
	@Override
	public long getZagruzil() {
		return _konkursnaja_dokumentacija.getZagruzil();
	}

	@Override
	public tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija toEscapedModel() {
		return new konkursnaja_dokumentacijaWrapper(_konkursnaja_dokumentacija.toEscapedModel());
	}

	@Override
	public tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija toUnescapedModel() {
		return new konkursnaja_dokumentacijaWrapper(_konkursnaja_dokumentacija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_konkursnaja_dokumentacija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_konkursnaja_dokumentacija.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_zagruzki of this konkursnaja_dokumentacija.
	*
	* @param data_zagruzki the data_zagruzki of this konkursnaja_dokumentacija
	*/
	@Override
	public void setData_zagruzki(Date data_zagruzki) {
		_konkursnaja_dokumentacija.setData_zagruzki(data_zagruzki);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_konkursnaja_dokumentacija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_konkursnaja_dokumentacija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_konkursnaja_dokumentacija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the imja_fajla of this konkursnaja_dokumentacija.
	*
	* @param imja_fajla the imja_fajla of this konkursnaja_dokumentacija
	*/
	@Override
	public void setImja_fajla(java.lang.String imja_fajla) {
		_konkursnaja_dokumentacija.setImja_fajla(imja_fajla);
	}

	/**
	* Sets the izvewenie_id of this konkursnaja_dokumentacija.
	*
	* @param izvewenie_id the izvewenie_id of this konkursnaja_dokumentacija
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_konkursnaja_dokumentacija.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the konkursnaja_dokumentacija_id of this konkursnaja_dokumentacija.
	*
	* @param konkursnaja_dokumentacija_id the konkursnaja_dokumentacija_id of this konkursnaja_dokumentacija
	*/
	@Override
	public void setKonkursnaja_dokumentacija_id(
		long konkursnaja_dokumentacija_id) {
		_konkursnaja_dokumentacija.setKonkursnaja_dokumentacija_id(konkursnaja_dokumentacija_id);
	}

	/**
	* Sets the lot_id of this konkursnaja_dokumentacija.
	*
	* @param lot_id the lot_id of this konkursnaja_dokumentacija
	*/
	@Override
	public void setLot_id(long lot_id) {
		_konkursnaja_dokumentacija.setLot_id(lot_id);
	}

	/**
	* Sets the nazvanie_dokumenta of this konkursnaja_dokumentacija.
	*
	* @param nazvanie_dokumenta the nazvanie_dokumenta of this konkursnaja_dokumentacija
	*/
	@Override
	public void setNazvanie_dokumenta(java.lang.String nazvanie_dokumenta) {
		_konkursnaja_dokumentacija.setNazvanie_dokumenta(nazvanie_dokumenta);
	}

	@Override
	public void setNew(boolean n) {
		_konkursnaja_dokumentacija.setNew(n);
	}

	/**
	* Sets the primary key of this konkursnaja_dokumentacija.
	*
	* @param primaryKey the primary key of this konkursnaja_dokumentacija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_konkursnaja_dokumentacija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_konkursnaja_dokumentacija.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the zagruzil of this konkursnaja_dokumentacija.
	*
	* @param zagruzil the zagruzil of this konkursnaja_dokumentacija
	*/
	@Override
	public void setZagruzil(long zagruzil) {
		_konkursnaja_dokumentacija.setZagruzil(zagruzil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof konkursnaja_dokumentacijaWrapper)) {
			return false;
		}

		konkursnaja_dokumentacijaWrapper konkursnaja_dokumentacijaWrapper = (konkursnaja_dokumentacijaWrapper)obj;

		if (Objects.equals(_konkursnaja_dokumentacija,
					konkursnaja_dokumentacijaWrapper._konkursnaja_dokumentacija)) {
			return true;
		}

		return false;
	}

	@Override
	public konkursnaja_dokumentacija getWrappedModel() {
		return _konkursnaja_dokumentacija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _konkursnaja_dokumentacija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _konkursnaja_dokumentacija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_konkursnaja_dokumentacija.resetOriginalValues();
	}

	private final konkursnaja_dokumentacija _konkursnaja_dokumentacija;
}