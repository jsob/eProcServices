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

package tj.pretenzii.ot.postavshhikov.model;

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
 * This class is a wrapper for {@link pretenzii_ot_postavshhikov}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see pretenzii_ot_postavshhikov
 * @generated
 */
@ProviderType
public class pretenzii_ot_postavshhikovWrapper
	implements pretenzii_ot_postavshhikov,
		ModelWrapper<pretenzii_ot_postavshhikov> {
	public pretenzii_ot_postavshhikovWrapper(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
		_pretenzii_ot_postavshhikov = pretenzii_ot_postavshhikov;
	}

	@Override
	public Class<?> getModelClass() {
		return pretenzii_ot_postavshhikov.class;
	}

	@Override
	public String getModelClassName() {
		return pretenzii_ot_postavshhikov.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_zagruzki", getData_zagruzki());
		attributes.put("imja_fajla", getImja_fajla());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("lot_id", getLot_id());
		attributes.put("nazvanie_dokumenta", getNazvanie_dokumenta());
		attributes.put("postavshik_id", getPostavshik_id());
		attributes.put("pretenzii_ot_postavshhikov_id",
			getPretenzii_ot_postavshhikov_id());
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

		Long postavshik_id = (Long)attributes.get("postavshik_id");

		if (postavshik_id != null) {
			setPostavshik_id(postavshik_id);
		}

		Long pretenzii_ot_postavshhikov_id = (Long)attributes.get(
				"pretenzii_ot_postavshhikov_id");

		if (pretenzii_ot_postavshhikov_id != null) {
			setPretenzii_ot_postavshhikov_id(pretenzii_ot_postavshhikov_id);
		}

		Long zagruzil = (Long)attributes.get("zagruzil");

		if (zagruzil != null) {
			setZagruzil(zagruzil);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _pretenzii_ot_postavshhikov.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _pretenzii_ot_postavshhikov.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _pretenzii_ot_postavshhikov.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _pretenzii_ot_postavshhikov.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.pretenzii.ot.postavshhikov.model.pretenzii_ot_postavshhikov> toCacheModel() {
		return _pretenzii_ot_postavshhikov.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.pretenzii.ot.postavshhikov.model.pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
		return _pretenzii_ot_postavshhikov.compareTo(pretenzii_ot_postavshhikov);
	}

	@Override
	public int hashCode() {
		return _pretenzii_ot_postavshhikov.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pretenzii_ot_postavshhikov.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new pretenzii_ot_postavshhikovWrapper((pretenzii_ot_postavshhikov)_pretenzii_ot_postavshhikov.clone());
	}

	/**
	* Returns the imja_fajla of this pretenzii_ot_postavshhikov.
	*
	* @return the imja_fajla of this pretenzii_ot_postavshhikov
	*/
	@Override
	public java.lang.String getImja_fajla() {
		return _pretenzii_ot_postavshhikov.getImja_fajla();
	}

	/**
	* Returns the nazvanie_dokumenta of this pretenzii_ot_postavshhikov.
	*
	* @return the nazvanie_dokumenta of this pretenzii_ot_postavshhikov
	*/
	@Override
	public java.lang.String getNazvanie_dokumenta() {
		return _pretenzii_ot_postavshhikov.getNazvanie_dokumenta();
	}

	@Override
	public java.lang.String toString() {
		return _pretenzii_ot_postavshhikov.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _pretenzii_ot_postavshhikov.toXmlString();
	}

	/**
	* Returns the data_zagruzki of this pretenzii_ot_postavshhikov.
	*
	* @return the data_zagruzki of this pretenzii_ot_postavshhikov
	*/
	@Override
	public Date getData_zagruzki() {
		return _pretenzii_ot_postavshhikov.getData_zagruzki();
	}

	/**
	* Returns the izvewenie_id of this pretenzii_ot_postavshhikov.
	*
	* @return the izvewenie_id of this pretenzii_ot_postavshhikov
	*/
	@Override
	public long getIzvewenie_id() {
		return _pretenzii_ot_postavshhikov.getIzvewenie_id();
	}

	/**
	* Returns the lot_id of this pretenzii_ot_postavshhikov.
	*
	* @return the lot_id of this pretenzii_ot_postavshhikov
	*/
	@Override
	public long getLot_id() {
		return _pretenzii_ot_postavshhikov.getLot_id();
	}

	/**
	* Returns the postavshik_id of this pretenzii_ot_postavshhikov.
	*
	* @return the postavshik_id of this pretenzii_ot_postavshhikov
	*/
	@Override
	public long getPostavshik_id() {
		return _pretenzii_ot_postavshhikov.getPostavshik_id();
	}

	/**
	* Returns the pretenzii_ot_postavshhikov_id of this pretenzii_ot_postavshhikov.
	*
	* @return the pretenzii_ot_postavshhikov_id of this pretenzii_ot_postavshhikov
	*/
	@Override
	public long getPretenzii_ot_postavshhikov_id() {
		return _pretenzii_ot_postavshhikov.getPretenzii_ot_postavshhikov_id();
	}

	/**
	* Returns the primary key of this pretenzii_ot_postavshhikov.
	*
	* @return the primary key of this pretenzii_ot_postavshhikov
	*/
	@Override
	public long getPrimaryKey() {
		return _pretenzii_ot_postavshhikov.getPrimaryKey();
	}

	/**
	* Returns the zagruzil of this pretenzii_ot_postavshhikov.
	*
	* @return the zagruzil of this pretenzii_ot_postavshhikov
	*/
	@Override
	public long getZagruzil() {
		return _pretenzii_ot_postavshhikov.getZagruzil();
	}

	@Override
	public tj.pretenzii.ot.postavshhikov.model.pretenzii_ot_postavshhikov toEscapedModel() {
		return new pretenzii_ot_postavshhikovWrapper(_pretenzii_ot_postavshhikov.toEscapedModel());
	}

	@Override
	public tj.pretenzii.ot.postavshhikov.model.pretenzii_ot_postavshhikov toUnescapedModel() {
		return new pretenzii_ot_postavshhikovWrapper(_pretenzii_ot_postavshhikov.toUnescapedModel());
	}

	@Override
	public void persist() {
		_pretenzii_ot_postavshhikov.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pretenzii_ot_postavshhikov.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_zagruzki of this pretenzii_ot_postavshhikov.
	*
	* @param data_zagruzki the data_zagruzki of this pretenzii_ot_postavshhikov
	*/
	@Override
	public void setData_zagruzki(Date data_zagruzki) {
		_pretenzii_ot_postavshhikov.setData_zagruzki(data_zagruzki);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_pretenzii_ot_postavshhikov.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_pretenzii_ot_postavshhikov.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_pretenzii_ot_postavshhikov.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the imja_fajla of this pretenzii_ot_postavshhikov.
	*
	* @param imja_fajla the imja_fajla of this pretenzii_ot_postavshhikov
	*/
	@Override
	public void setImja_fajla(java.lang.String imja_fajla) {
		_pretenzii_ot_postavshhikov.setImja_fajla(imja_fajla);
	}

	/**
	* Sets the izvewenie_id of this pretenzii_ot_postavshhikov.
	*
	* @param izvewenie_id the izvewenie_id of this pretenzii_ot_postavshhikov
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_pretenzii_ot_postavshhikov.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the lot_id of this pretenzii_ot_postavshhikov.
	*
	* @param lot_id the lot_id of this pretenzii_ot_postavshhikov
	*/
	@Override
	public void setLot_id(long lot_id) {
		_pretenzii_ot_postavshhikov.setLot_id(lot_id);
	}

	/**
	* Sets the nazvanie_dokumenta of this pretenzii_ot_postavshhikov.
	*
	* @param nazvanie_dokumenta the nazvanie_dokumenta of this pretenzii_ot_postavshhikov
	*/
	@Override
	public void setNazvanie_dokumenta(java.lang.String nazvanie_dokumenta) {
		_pretenzii_ot_postavshhikov.setNazvanie_dokumenta(nazvanie_dokumenta);
	}

	@Override
	public void setNew(boolean n) {
		_pretenzii_ot_postavshhikov.setNew(n);
	}

	/**
	* Sets the postavshik_id of this pretenzii_ot_postavshhikov.
	*
	* @param postavshik_id the postavshik_id of this pretenzii_ot_postavshhikov
	*/
	@Override
	public void setPostavshik_id(long postavshik_id) {
		_pretenzii_ot_postavshhikov.setPostavshik_id(postavshik_id);
	}

	/**
	* Sets the pretenzii_ot_postavshhikov_id of this pretenzii_ot_postavshhikov.
	*
	* @param pretenzii_ot_postavshhikov_id the pretenzii_ot_postavshhikov_id of this pretenzii_ot_postavshhikov
	*/
	@Override
	public void setPretenzii_ot_postavshhikov_id(
		long pretenzii_ot_postavshhikov_id) {
		_pretenzii_ot_postavshhikov.setPretenzii_ot_postavshhikov_id(pretenzii_ot_postavshhikov_id);
	}

	/**
	* Sets the primary key of this pretenzii_ot_postavshhikov.
	*
	* @param primaryKey the primary key of this pretenzii_ot_postavshhikov
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_pretenzii_ot_postavshhikov.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_pretenzii_ot_postavshhikov.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the zagruzil of this pretenzii_ot_postavshhikov.
	*
	* @param zagruzil the zagruzil of this pretenzii_ot_postavshhikov
	*/
	@Override
	public void setZagruzil(long zagruzil) {
		_pretenzii_ot_postavshhikov.setZagruzil(zagruzil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof pretenzii_ot_postavshhikovWrapper)) {
			return false;
		}

		pretenzii_ot_postavshhikovWrapper pretenzii_ot_postavshhikovWrapper = (pretenzii_ot_postavshhikovWrapper)obj;

		if (Objects.equals(_pretenzii_ot_postavshhikov,
					pretenzii_ot_postavshhikovWrapper._pretenzii_ot_postavshhikov)) {
			return true;
		}

		return false;
	}

	@Override
	public pretenzii_ot_postavshhikov getWrappedModel() {
		return _pretenzii_ot_postavshhikov;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _pretenzii_ot_postavshhikov.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _pretenzii_ot_postavshhikov.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_pretenzii_ot_postavshhikov.resetOriginalValues();
	}

	private final pretenzii_ot_postavshhikov _pretenzii_ot_postavshhikov;
}