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

package tj.dokumenty.postavwika.model;

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
 * This class is a wrapper for {@link dokumenty_postavwika}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_postavwika
 * @generated
 */
@ProviderType
public class dokumenty_postavwikaWrapper implements dokumenty_postavwika,
	ModelWrapper<dokumenty_postavwika> {
	public dokumenty_postavwikaWrapper(
		dokumenty_postavwika dokumenty_postavwika) {
		_dokumenty_postavwika = dokumenty_postavwika;
	}

	@Override
	public Class<?> getModelClass() {
		return dokumenty_postavwika.class;
	}

	@Override
	public String getModelClassName() {
		return dokumenty_postavwika.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_zagruzki", getData_zagruzki());
		attributes.put("dokumenty_postavwika_id", getDokumenty_postavwika_id());
		attributes.put("imja_fajla", getImja_fajla());
		attributes.put("nazvanie_dokumenta", getNazvanie_dokumenta());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("tip_dokumenta", getTip_dokumenta());
		attributes.put("zagruzil", getZagruzil());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_zagruzki = (Date)attributes.get("data_zagruzki");

		if (data_zagruzki != null) {
			setData_zagruzki(data_zagruzki);
		}

		Long dokumenty_postavwika_id = (Long)attributes.get(
				"dokumenty_postavwika_id");

		if (dokumenty_postavwika_id != null) {
			setDokumenty_postavwika_id(dokumenty_postavwika_id);
		}

		String imja_fajla = (String)attributes.get("imja_fajla");

		if (imja_fajla != null) {
			setImja_fajla(imja_fajla);
		}

		String nazvanie_dokumenta = (String)attributes.get("nazvanie_dokumenta");

		if (nazvanie_dokumenta != null) {
			setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Integer tip_dokumenta = (Integer)attributes.get("tip_dokumenta");

		if (tip_dokumenta != null) {
			setTip_dokumenta(tip_dokumenta);
		}

		Long zagruzil = (Long)attributes.get("zagruzil");

		if (zagruzil != null) {
			setZagruzil(zagruzil);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _dokumenty_postavwika.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dokumenty_postavwika.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dokumenty_postavwika.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dokumenty_postavwika.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.dokumenty.postavwika.model.dokumenty_postavwika> toCacheModel() {
		return _dokumenty_postavwika.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.dokumenty.postavwika.model.dokumenty_postavwika dokumenty_postavwika) {
		return _dokumenty_postavwika.compareTo(dokumenty_postavwika);
	}

	/**
	* Returns the tip_dokumenta of this dokumenty_postavwika.
	*
	* @return the tip_dokumenta of this dokumenty_postavwika
	*/
	@Override
	public int getTip_dokumenta() {
		return _dokumenty_postavwika.getTip_dokumenta();
	}

	@Override
	public int hashCode() {
		return _dokumenty_postavwika.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dokumenty_postavwika.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new dokumenty_postavwikaWrapper((dokumenty_postavwika)_dokumenty_postavwika.clone());
	}

	/**
	* Returns the imja_fajla of this dokumenty_postavwika.
	*
	* @return the imja_fajla of this dokumenty_postavwika
	*/
	@Override
	public java.lang.String getImja_fajla() {
		return _dokumenty_postavwika.getImja_fajla();
	}

	/**
	* Returns the nazvanie_dokumenta of this dokumenty_postavwika.
	*
	* @return the nazvanie_dokumenta of this dokumenty_postavwika
	*/
	@Override
	public java.lang.String getNazvanie_dokumenta() {
		return _dokumenty_postavwika.getNazvanie_dokumenta();
	}

	@Override
	public java.lang.String toString() {
		return _dokumenty_postavwika.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dokumenty_postavwika.toXmlString();
	}

	/**
	* Returns the data_zagruzki of this dokumenty_postavwika.
	*
	* @return the data_zagruzki of this dokumenty_postavwika
	*/
	@Override
	public Date getData_zagruzki() {
		return _dokumenty_postavwika.getData_zagruzki();
	}

	/**
	* Returns the dokumenty_postavwika_id of this dokumenty_postavwika.
	*
	* @return the dokumenty_postavwika_id of this dokumenty_postavwika
	*/
	@Override
	public long getDokumenty_postavwika_id() {
		return _dokumenty_postavwika.getDokumenty_postavwika_id();
	}

	/**
	* Returns the postavwik_id of this dokumenty_postavwika.
	*
	* @return the postavwik_id of this dokumenty_postavwika
	*/
	@Override
	public long getPostavwik_id() {
		return _dokumenty_postavwika.getPostavwik_id();
	}

	/**
	* Returns the primary key of this dokumenty_postavwika.
	*
	* @return the primary key of this dokumenty_postavwika
	*/
	@Override
	public long getPrimaryKey() {
		return _dokumenty_postavwika.getPrimaryKey();
	}

	/**
	* Returns the zagruzil of this dokumenty_postavwika.
	*
	* @return the zagruzil of this dokumenty_postavwika
	*/
	@Override
	public long getZagruzil() {
		return _dokumenty_postavwika.getZagruzil();
	}

	@Override
	public tj.dokumenty.postavwika.model.dokumenty_postavwika toEscapedModel() {
		return new dokumenty_postavwikaWrapper(_dokumenty_postavwika.toEscapedModel());
	}

	@Override
	public tj.dokumenty.postavwika.model.dokumenty_postavwika toUnescapedModel() {
		return new dokumenty_postavwikaWrapper(_dokumenty_postavwika.toUnescapedModel());
	}

	@Override
	public void persist() {
		_dokumenty_postavwika.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dokumenty_postavwika.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_zagruzki of this dokumenty_postavwika.
	*
	* @param data_zagruzki the data_zagruzki of this dokumenty_postavwika
	*/
	@Override
	public void setData_zagruzki(Date data_zagruzki) {
		_dokumenty_postavwika.setData_zagruzki(data_zagruzki);
	}

	/**
	* Sets the dokumenty_postavwika_id of this dokumenty_postavwika.
	*
	* @param dokumenty_postavwika_id the dokumenty_postavwika_id of this dokumenty_postavwika
	*/
	@Override
	public void setDokumenty_postavwika_id(long dokumenty_postavwika_id) {
		_dokumenty_postavwika.setDokumenty_postavwika_id(dokumenty_postavwika_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dokumenty_postavwika.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dokumenty_postavwika.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dokumenty_postavwika.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the imja_fajla of this dokumenty_postavwika.
	*
	* @param imja_fajla the imja_fajla of this dokumenty_postavwika
	*/
	@Override
	public void setImja_fajla(java.lang.String imja_fajla) {
		_dokumenty_postavwika.setImja_fajla(imja_fajla);
	}

	/**
	* Sets the nazvanie_dokumenta of this dokumenty_postavwika.
	*
	* @param nazvanie_dokumenta the nazvanie_dokumenta of this dokumenty_postavwika
	*/
	@Override
	public void setNazvanie_dokumenta(java.lang.String nazvanie_dokumenta) {
		_dokumenty_postavwika.setNazvanie_dokumenta(nazvanie_dokumenta);
	}

	@Override
	public void setNew(boolean n) {
		_dokumenty_postavwika.setNew(n);
	}

	/**
	* Sets the postavwik_id of this dokumenty_postavwika.
	*
	* @param postavwik_id the postavwik_id of this dokumenty_postavwika
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_dokumenty_postavwika.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this dokumenty_postavwika.
	*
	* @param primaryKey the primary key of this dokumenty_postavwika
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dokumenty_postavwika.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dokumenty_postavwika.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tip_dokumenta of this dokumenty_postavwika.
	*
	* @param tip_dokumenta the tip_dokumenta of this dokumenty_postavwika
	*/
	@Override
	public void setTip_dokumenta(int tip_dokumenta) {
		_dokumenty_postavwika.setTip_dokumenta(tip_dokumenta);
	}

	/**
	* Sets the zagruzil of this dokumenty_postavwika.
	*
	* @param zagruzil the zagruzil of this dokumenty_postavwika
	*/
	@Override
	public void setZagruzil(long zagruzil) {
		_dokumenty_postavwika.setZagruzil(zagruzil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof dokumenty_postavwikaWrapper)) {
			return false;
		}

		dokumenty_postavwikaWrapper dokumenty_postavwikaWrapper = (dokumenty_postavwikaWrapper)obj;

		if (Objects.equals(_dokumenty_postavwika,
					dokumenty_postavwikaWrapper._dokumenty_postavwika)) {
			return true;
		}

		return false;
	}

	@Override
	public dokumenty_postavwika getWrappedModel() {
		return _dokumenty_postavwika;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dokumenty_postavwika.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dokumenty_postavwika.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dokumenty_postavwika.resetOriginalValues();
	}

	private final dokumenty_postavwika _dokumenty_postavwika;
}