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

package tj.rezultat.rassmotrenija.pretenzii.model;

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
 * This class is a wrapper for {@link rezultat_rassmotrenija_pretenzii}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_rassmotrenija_pretenzii
 * @generated
 */
@ProviderType
public class rezultat_rassmotrenija_pretenziiWrapper
	implements rezultat_rassmotrenija_pretenzii,
		ModelWrapper<rezultat_rassmotrenija_pretenzii> {
	public rezultat_rassmotrenija_pretenziiWrapper(
		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
		_rezultat_rassmotrenija_pretenzii = rezultat_rassmotrenija_pretenzii;
	}

	@Override
	public Class<?> getModelClass() {
		return rezultat_rassmotrenija_pretenzii.class;
	}

	@Override
	public String getModelClassName() {
		return rezultat_rassmotrenija_pretenzii.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_zagruzki", getData_zagruzki());
		attributes.put("imja_fajla", getImja_fajla());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("lot_id", getLot_id());
		attributes.put("nazvanie_dokumenta", getNazvanie_dokumenta());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("rezultat_rassmotrenija_pretenzii_id",
			getRezultat_rassmotrenija_pretenzii_id());
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

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Long rezultat_rassmotrenija_pretenzii_id = (Long)attributes.get(
				"rezultat_rassmotrenija_pretenzii_id");

		if (rezultat_rassmotrenija_pretenzii_id != null) {
			setRezultat_rassmotrenija_pretenzii_id(rezultat_rassmotrenija_pretenzii_id);
		}

		Long zagruzil = (Long)attributes.get("zagruzil");

		if (zagruzil != null) {
			setZagruzil(zagruzil);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _rezultat_rassmotrenija_pretenzii.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _rezultat_rassmotrenija_pretenzii.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _rezultat_rassmotrenija_pretenzii.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _rezultat_rassmotrenija_pretenzii.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii> toCacheModel() {
		return _rezultat_rassmotrenija_pretenzii.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
		return _rezultat_rassmotrenija_pretenzii.compareTo(rezultat_rassmotrenija_pretenzii);
	}

	@Override
	public int hashCode() {
		return _rezultat_rassmotrenija_pretenzii.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rezultat_rassmotrenija_pretenzii.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new rezultat_rassmotrenija_pretenziiWrapper((rezultat_rassmotrenija_pretenzii)_rezultat_rassmotrenija_pretenzii.clone());
	}

	/**
	* Returns the imja_fajla of this rezultat_rassmotrenija_pretenzii.
	*
	* @return the imja_fajla of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public java.lang.String getImja_fajla() {
		return _rezultat_rassmotrenija_pretenzii.getImja_fajla();
	}

	/**
	* Returns the nazvanie_dokumenta of this rezultat_rassmotrenija_pretenzii.
	*
	* @return the nazvanie_dokumenta of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public java.lang.String getNazvanie_dokumenta() {
		return _rezultat_rassmotrenija_pretenzii.getNazvanie_dokumenta();
	}

	@Override
	public java.lang.String toString() {
		return _rezultat_rassmotrenija_pretenzii.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rezultat_rassmotrenija_pretenzii.toXmlString();
	}

	/**
	* Returns the data_zagruzki of this rezultat_rassmotrenija_pretenzii.
	*
	* @return the data_zagruzki of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public Date getData_zagruzki() {
		return _rezultat_rassmotrenija_pretenzii.getData_zagruzki();
	}

	/**
	* Returns the izvewenie_id of this rezultat_rassmotrenija_pretenzii.
	*
	* @return the izvewenie_id of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public long getIzvewenie_id() {
		return _rezultat_rassmotrenija_pretenzii.getIzvewenie_id();
	}

	/**
	* Returns the lot_id of this rezultat_rassmotrenija_pretenzii.
	*
	* @return the lot_id of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public long getLot_id() {
		return _rezultat_rassmotrenija_pretenzii.getLot_id();
	}

	/**
	* Returns the postavwik_id of this rezultat_rassmotrenija_pretenzii.
	*
	* @return the postavwik_id of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public long getPostavwik_id() {
		return _rezultat_rassmotrenija_pretenzii.getPostavwik_id();
	}

	/**
	* Returns the primary key of this rezultat_rassmotrenija_pretenzii.
	*
	* @return the primary key of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public long getPrimaryKey() {
		return _rezultat_rassmotrenija_pretenzii.getPrimaryKey();
	}

	/**
	* Returns the rezultat_rassmotrenija_pretenzii_id of this rezultat_rassmotrenija_pretenzii.
	*
	* @return the rezultat_rassmotrenija_pretenzii_id of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public long getRezultat_rassmotrenija_pretenzii_id() {
		return _rezultat_rassmotrenija_pretenzii.getRezultat_rassmotrenija_pretenzii_id();
	}

	/**
	* Returns the zagruzil of this rezultat_rassmotrenija_pretenzii.
	*
	* @return the zagruzil of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public long getZagruzil() {
		return _rezultat_rassmotrenija_pretenzii.getZagruzil();
	}

	@Override
	public tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii toEscapedModel() {
		return new rezultat_rassmotrenija_pretenziiWrapper(_rezultat_rassmotrenija_pretenzii.toEscapedModel());
	}

	@Override
	public tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii toUnescapedModel() {
		return new rezultat_rassmotrenija_pretenziiWrapper(_rezultat_rassmotrenija_pretenzii.toUnescapedModel());
	}

	@Override
	public void persist() {
		_rezultat_rassmotrenija_pretenzii.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rezultat_rassmotrenija_pretenzii.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_zagruzki of this rezultat_rassmotrenija_pretenzii.
	*
	* @param data_zagruzki the data_zagruzki of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public void setData_zagruzki(Date data_zagruzki) {
		_rezultat_rassmotrenija_pretenzii.setData_zagruzki(data_zagruzki);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_rezultat_rassmotrenija_pretenzii.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_rezultat_rassmotrenija_pretenzii.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_rezultat_rassmotrenija_pretenzii.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the imja_fajla of this rezultat_rassmotrenija_pretenzii.
	*
	* @param imja_fajla the imja_fajla of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public void setImja_fajla(java.lang.String imja_fajla) {
		_rezultat_rassmotrenija_pretenzii.setImja_fajla(imja_fajla);
	}

	/**
	* Sets the izvewenie_id of this rezultat_rassmotrenija_pretenzii.
	*
	* @param izvewenie_id the izvewenie_id of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_rezultat_rassmotrenija_pretenzii.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the lot_id of this rezultat_rassmotrenija_pretenzii.
	*
	* @param lot_id the lot_id of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public void setLot_id(long lot_id) {
		_rezultat_rassmotrenija_pretenzii.setLot_id(lot_id);
	}

	/**
	* Sets the nazvanie_dokumenta of this rezultat_rassmotrenija_pretenzii.
	*
	* @param nazvanie_dokumenta the nazvanie_dokumenta of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public void setNazvanie_dokumenta(java.lang.String nazvanie_dokumenta) {
		_rezultat_rassmotrenija_pretenzii.setNazvanie_dokumenta(nazvanie_dokumenta);
	}

	@Override
	public void setNew(boolean n) {
		_rezultat_rassmotrenija_pretenzii.setNew(n);
	}

	/**
	* Sets the postavwik_id of this rezultat_rassmotrenija_pretenzii.
	*
	* @param postavwik_id the postavwik_id of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_rezultat_rassmotrenija_pretenzii.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this rezultat_rassmotrenija_pretenzii.
	*
	* @param primaryKey the primary key of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rezultat_rassmotrenija_pretenzii.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_rezultat_rassmotrenija_pretenzii.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rezultat_rassmotrenija_pretenzii_id of this rezultat_rassmotrenija_pretenzii.
	*
	* @param rezultat_rassmotrenija_pretenzii_id the rezultat_rassmotrenija_pretenzii_id of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public void setRezultat_rassmotrenija_pretenzii_id(
		long rezultat_rassmotrenija_pretenzii_id) {
		_rezultat_rassmotrenija_pretenzii.setRezultat_rassmotrenija_pretenzii_id(rezultat_rassmotrenija_pretenzii_id);
	}

	/**
	* Sets the zagruzil of this rezultat_rassmotrenija_pretenzii.
	*
	* @param zagruzil the zagruzil of this rezultat_rassmotrenija_pretenzii
	*/
	@Override
	public void setZagruzil(long zagruzil) {
		_rezultat_rassmotrenija_pretenzii.setZagruzil(zagruzil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof rezultat_rassmotrenija_pretenziiWrapper)) {
			return false;
		}

		rezultat_rassmotrenija_pretenziiWrapper rezultat_rassmotrenija_pretenziiWrapper =
			(rezultat_rassmotrenija_pretenziiWrapper)obj;

		if (Objects.equals(_rezultat_rassmotrenija_pretenzii,
					rezultat_rassmotrenija_pretenziiWrapper._rezultat_rassmotrenija_pretenzii)) {
			return true;
		}

		return false;
	}

	@Override
	public rezultat_rassmotrenija_pretenzii getWrappedModel() {
		return _rezultat_rassmotrenija_pretenzii;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _rezultat_rassmotrenija_pretenzii.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _rezultat_rassmotrenija_pretenzii.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_rezultat_rassmotrenija_pretenzii.resetOriginalValues();
	}

	private final rezultat_rassmotrenija_pretenzii _rezultat_rassmotrenija_pretenzii;
}