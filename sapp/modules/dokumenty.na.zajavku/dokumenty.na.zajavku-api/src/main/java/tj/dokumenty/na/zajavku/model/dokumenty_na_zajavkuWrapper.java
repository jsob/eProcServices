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

package tj.dokumenty.na.zajavku.model;

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
 * This class is a wrapper for {@link dokumenty_na_zajavku}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_na_zajavku
 * @generated
 */
@ProviderType
public class dokumenty_na_zajavkuWrapper implements dokumenty_na_zajavku,
	ModelWrapper<dokumenty_na_zajavku> {
	public dokumenty_na_zajavkuWrapper(
		dokumenty_na_zajavku dokumenty_na_zajavku) {
		_dokumenty_na_zajavku = dokumenty_na_zajavku;
	}

	@Override
	public Class<?> getModelClass() {
		return dokumenty_na_zajavku.class;
	}

	@Override
	public String getModelClassName() {
		return dokumenty_na_zajavku.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dokumenty_na_zajavku_id", getDokumenty_na_zajavku_id());
		attributes.put("data_zagruzki", getData_zagruzki());
		attributes.put("imja_fajla", getImja_fajla());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("lot_id", getLot_id());
		attributes.put("nazvanie_dokumenta", getNazvanie_dokumenta());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("zagruzil", getZagruzil());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dokumenty_na_zajavku_id = (Long)attributes.get(
				"dokumenty_na_zajavku_id");

		if (dokumenty_na_zajavku_id != null) {
			setDokumenty_na_zajavku_id(dokumenty_na_zajavku_id);
		}

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

		Long zagruzil = (Long)attributes.get("zagruzil");

		if (zagruzil != null) {
			setZagruzil(zagruzil);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _dokumenty_na_zajavku.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dokumenty_na_zajavku.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dokumenty_na_zajavku.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dokumenty_na_zajavku.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku> toCacheModel() {
		return _dokumenty_na_zajavku.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku dokumenty_na_zajavku) {
		return _dokumenty_na_zajavku.compareTo(dokumenty_na_zajavku);
	}

	@Override
	public int hashCode() {
		return _dokumenty_na_zajavku.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dokumenty_na_zajavku.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new dokumenty_na_zajavkuWrapper((dokumenty_na_zajavku)_dokumenty_na_zajavku.clone());
	}

	/**
	* Returns the imja_fajla of this dokumenty_na_zajavku.
	*
	* @return the imja_fajla of this dokumenty_na_zajavku
	*/
	@Override
	public java.lang.String getImja_fajla() {
		return _dokumenty_na_zajavku.getImja_fajla();
	}

	/**
	* Returns the nazvanie_dokumenta of this dokumenty_na_zajavku.
	*
	* @return the nazvanie_dokumenta of this dokumenty_na_zajavku
	*/
	@Override
	public java.lang.String getNazvanie_dokumenta() {
		return _dokumenty_na_zajavku.getNazvanie_dokumenta();
	}

	@Override
	public java.lang.String toString() {
		return _dokumenty_na_zajavku.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dokumenty_na_zajavku.toXmlString();
	}

	/**
	* Returns the data_zagruzki of this dokumenty_na_zajavku.
	*
	* @return the data_zagruzki of this dokumenty_na_zajavku
	*/
	@Override
	public Date getData_zagruzki() {
		return _dokumenty_na_zajavku.getData_zagruzki();
	}

	/**
	* Returns the dokumenty_na_zajavku_id of this dokumenty_na_zajavku.
	*
	* @return the dokumenty_na_zajavku_id of this dokumenty_na_zajavku
	*/
	@Override
	public long getDokumenty_na_zajavku_id() {
		return _dokumenty_na_zajavku.getDokumenty_na_zajavku_id();
	}

	/**
	* Returns the izvewenie_id of this dokumenty_na_zajavku.
	*
	* @return the izvewenie_id of this dokumenty_na_zajavku
	*/
	@Override
	public long getIzvewenie_id() {
		return _dokumenty_na_zajavku.getIzvewenie_id();
	}

	/**
	* Returns the lot_id of this dokumenty_na_zajavku.
	*
	* @return the lot_id of this dokumenty_na_zajavku
	*/
	@Override
	public long getLot_id() {
		return _dokumenty_na_zajavku.getLot_id();
	}

	/**
	* Returns the postavwik_id of this dokumenty_na_zajavku.
	*
	* @return the postavwik_id of this dokumenty_na_zajavku
	*/
	@Override
	public long getPostavwik_id() {
		return _dokumenty_na_zajavku.getPostavwik_id();
	}

	/**
	* Returns the primary key of this dokumenty_na_zajavku.
	*
	* @return the primary key of this dokumenty_na_zajavku
	*/
	@Override
	public long getPrimaryKey() {
		return _dokumenty_na_zajavku.getPrimaryKey();
	}

	/**
	* Returns the zagruzil of this dokumenty_na_zajavku.
	*
	* @return the zagruzil of this dokumenty_na_zajavku
	*/
	@Override
	public long getZagruzil() {
		return _dokumenty_na_zajavku.getZagruzil();
	}

	@Override
	public tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku toEscapedModel() {
		return new dokumenty_na_zajavkuWrapper(_dokumenty_na_zajavku.toEscapedModel());
	}

	@Override
	public tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku toUnescapedModel() {
		return new dokumenty_na_zajavkuWrapper(_dokumenty_na_zajavku.toUnescapedModel());
	}

	@Override
	public void persist() {
		_dokumenty_na_zajavku.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dokumenty_na_zajavku.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_zagruzki of this dokumenty_na_zajavku.
	*
	* @param data_zagruzki the data_zagruzki of this dokumenty_na_zajavku
	*/
	@Override
	public void setData_zagruzki(Date data_zagruzki) {
		_dokumenty_na_zajavku.setData_zagruzki(data_zagruzki);
	}

	/**
	* Sets the dokumenty_na_zajavku_id of this dokumenty_na_zajavku.
	*
	* @param dokumenty_na_zajavku_id the dokumenty_na_zajavku_id of this dokumenty_na_zajavku
	*/
	@Override
	public void setDokumenty_na_zajavku_id(long dokumenty_na_zajavku_id) {
		_dokumenty_na_zajavku.setDokumenty_na_zajavku_id(dokumenty_na_zajavku_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dokumenty_na_zajavku.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dokumenty_na_zajavku.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dokumenty_na_zajavku.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the imja_fajla of this dokumenty_na_zajavku.
	*
	* @param imja_fajla the imja_fajla of this dokumenty_na_zajavku
	*/
	@Override
	public void setImja_fajla(java.lang.String imja_fajla) {
		_dokumenty_na_zajavku.setImja_fajla(imja_fajla);
	}

	/**
	* Sets the izvewenie_id of this dokumenty_na_zajavku.
	*
	* @param izvewenie_id the izvewenie_id of this dokumenty_na_zajavku
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_dokumenty_na_zajavku.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the lot_id of this dokumenty_na_zajavku.
	*
	* @param lot_id the lot_id of this dokumenty_na_zajavku
	*/
	@Override
	public void setLot_id(long lot_id) {
		_dokumenty_na_zajavku.setLot_id(lot_id);
	}

	/**
	* Sets the nazvanie_dokumenta of this dokumenty_na_zajavku.
	*
	* @param nazvanie_dokumenta the nazvanie_dokumenta of this dokumenty_na_zajavku
	*/
	@Override
	public void setNazvanie_dokumenta(java.lang.String nazvanie_dokumenta) {
		_dokumenty_na_zajavku.setNazvanie_dokumenta(nazvanie_dokumenta);
	}

	@Override
	public void setNew(boolean n) {
		_dokumenty_na_zajavku.setNew(n);
	}

	/**
	* Sets the postavwik_id of this dokumenty_na_zajavku.
	*
	* @param postavwik_id the postavwik_id of this dokumenty_na_zajavku
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_dokumenty_na_zajavku.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this dokumenty_na_zajavku.
	*
	* @param primaryKey the primary key of this dokumenty_na_zajavku
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dokumenty_na_zajavku.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dokumenty_na_zajavku.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the zagruzil of this dokumenty_na_zajavku.
	*
	* @param zagruzil the zagruzil of this dokumenty_na_zajavku
	*/
	@Override
	public void setZagruzil(long zagruzil) {
		_dokumenty_na_zajavku.setZagruzil(zagruzil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof dokumenty_na_zajavkuWrapper)) {
			return false;
		}

		dokumenty_na_zajavkuWrapper dokumenty_na_zajavkuWrapper = (dokumenty_na_zajavkuWrapper)obj;

		if (Objects.equals(_dokumenty_na_zajavku,
					dokumenty_na_zajavkuWrapper._dokumenty_na_zajavku)) {
			return true;
		}

		return false;
	}

	@Override
	public dokumenty_na_zajavku getWrappedModel() {
		return _dokumenty_na_zajavku;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dokumenty_na_zajavku.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dokumenty_na_zajavku.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dokumenty_na_zajavku.resetOriginalValues();
	}

	private final dokumenty_na_zajavku _dokumenty_na_zajavku;
}