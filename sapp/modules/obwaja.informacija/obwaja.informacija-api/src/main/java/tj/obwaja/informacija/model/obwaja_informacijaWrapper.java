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

package tj.obwaja.informacija.model;

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
 * This class is a wrapper for {@link obwaja_informacija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see obwaja_informacija
 * @generated
 */
@ProviderType
public class obwaja_informacijaWrapper implements obwaja_informacija,
	ModelWrapper<obwaja_informacija> {
	public obwaja_informacijaWrapper(obwaja_informacija obwaja_informacija) {
		_obwaja_informacija = obwaja_informacija;
	}

	@Override
	public Class<?> getModelClass() {
		return obwaja_informacija.class;
	}

	@Override
	public String getModelClassName() {
		return obwaja_informacija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("je_pochta", getJe_pochta());
		attributes.put("kontaktnoe_lico", getKontaktnoe_lico());
		attributes.put("kontaktnyj_telefon", getKontaktnyj_telefon());
		attributes.put("obwaja_informacija_id", getObwaja_informacija_id());
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

		String je_pochta = (String)attributes.get("je_pochta");

		if (je_pochta != null) {
			setJe_pochta(je_pochta);
		}

		String kontaktnoe_lico = (String)attributes.get("kontaktnoe_lico");

		if (kontaktnoe_lico != null) {
			setKontaktnoe_lico(kontaktnoe_lico);
		}

		String kontaktnyj_telefon = (String)attributes.get("kontaktnyj_telefon");

		if (kontaktnyj_telefon != null) {
			setKontaktnyj_telefon(kontaktnyj_telefon);
		}

		Long obwaja_informacija_id = (Long)attributes.get(
				"obwaja_informacija_id");

		if (obwaja_informacija_id != null) {
			setObwaja_informacija_id(obwaja_informacija_id);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _obwaja_informacija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _obwaja_informacija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _obwaja_informacija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _obwaja_informacija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.obwaja.informacija.model.obwaja_informacija> toCacheModel() {
		return _obwaja_informacija.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.obwaja.informacija.model.obwaja_informacija obwaja_informacija) {
		return _obwaja_informacija.compareTo(obwaja_informacija);
	}

	@Override
	public int hashCode() {
		return _obwaja_informacija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _obwaja_informacija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new obwaja_informacijaWrapper((obwaja_informacija)_obwaja_informacija.clone());
	}

	/**
	* Returns the je_pochta of this obwaja_informacija.
	*
	* @return the je_pochta of this obwaja_informacija
	*/
	@Override
	public java.lang.String getJe_pochta() {
		return _obwaja_informacija.getJe_pochta();
	}

	/**
	* Returns the kontaktnoe_lico of this obwaja_informacija.
	*
	* @return the kontaktnoe_lico of this obwaja_informacija
	*/
	@Override
	public java.lang.String getKontaktnoe_lico() {
		return _obwaja_informacija.getKontaktnoe_lico();
	}

	/**
	* Returns the kontaktnyj_telefon of this obwaja_informacija.
	*
	* @return the kontaktnyj_telefon of this obwaja_informacija
	*/
	@Override
	public java.lang.String getKontaktnyj_telefon() {
		return _obwaja_informacija.getKontaktnyj_telefon();
	}

	@Override
	public java.lang.String toString() {
		return _obwaja_informacija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _obwaja_informacija.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this obwaja_informacija.
	*
	* @return the data_izmenenija of this obwaja_informacija
	*/
	@Override
	public Date getData_izmenenija() {
		return _obwaja_informacija.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this obwaja_informacija.
	*
	* @return the data_sozdanija of this obwaja_informacija
	*/
	@Override
	public Date getData_sozdanija() {
		return _obwaja_informacija.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this obwaja_informacija.
	*
	* @return the izmenil of this obwaja_informacija
	*/
	@Override
	public long getIzmenil() {
		return _obwaja_informacija.getIzmenil();
	}

	/**
	* Returns the izvewenie_id of this obwaja_informacija.
	*
	* @return the izvewenie_id of this obwaja_informacija
	*/
	@Override
	public long getIzvewenie_id() {
		return _obwaja_informacija.getIzvewenie_id();
	}

	/**
	* Returns the obwaja_informacija_id of this obwaja_informacija.
	*
	* @return the obwaja_informacija_id of this obwaja_informacija
	*/
	@Override
	public long getObwaja_informacija_id() {
		return _obwaja_informacija.getObwaja_informacija_id();
	}

	/**
	* Returns the primary key of this obwaja_informacija.
	*
	* @return the primary key of this obwaja_informacija
	*/
	@Override
	public long getPrimaryKey() {
		return _obwaja_informacija.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this obwaja_informacija.
	*
	* @return the sozdal of this obwaja_informacija
	*/
	@Override
	public long getSozdal() {
		return _obwaja_informacija.getSozdal();
	}

	@Override
	public tj.obwaja.informacija.model.obwaja_informacija toEscapedModel() {
		return new obwaja_informacijaWrapper(_obwaja_informacija.toEscapedModel());
	}

	@Override
	public tj.obwaja.informacija.model.obwaja_informacija toUnescapedModel() {
		return new obwaja_informacijaWrapper(_obwaja_informacija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_obwaja_informacija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_obwaja_informacija.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this obwaja_informacija.
	*
	* @param data_izmenenija the data_izmenenija of this obwaja_informacija
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_obwaja_informacija.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this obwaja_informacija.
	*
	* @param data_sozdanija the data_sozdanija of this obwaja_informacija
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_obwaja_informacija.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_obwaja_informacija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_obwaja_informacija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_obwaja_informacija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izmenil of this obwaja_informacija.
	*
	* @param izmenil the izmenil of this obwaja_informacija
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_obwaja_informacija.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenie_id of this obwaja_informacija.
	*
	* @param izvewenie_id the izvewenie_id of this obwaja_informacija
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_obwaja_informacija.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the je_pochta of this obwaja_informacija.
	*
	* @param je_pochta the je_pochta of this obwaja_informacija
	*/
	@Override
	public void setJe_pochta(java.lang.String je_pochta) {
		_obwaja_informacija.setJe_pochta(je_pochta);
	}

	/**
	* Sets the kontaktnoe_lico of this obwaja_informacija.
	*
	* @param kontaktnoe_lico the kontaktnoe_lico of this obwaja_informacija
	*/
	@Override
	public void setKontaktnoe_lico(java.lang.String kontaktnoe_lico) {
		_obwaja_informacija.setKontaktnoe_lico(kontaktnoe_lico);
	}

	/**
	* Sets the kontaktnyj_telefon of this obwaja_informacija.
	*
	* @param kontaktnyj_telefon the kontaktnyj_telefon of this obwaja_informacija
	*/
	@Override
	public void setKontaktnyj_telefon(java.lang.String kontaktnyj_telefon) {
		_obwaja_informacija.setKontaktnyj_telefon(kontaktnyj_telefon);
	}

	@Override
	public void setNew(boolean n) {
		_obwaja_informacija.setNew(n);
	}

	/**
	* Sets the obwaja_informacija_id of this obwaja_informacija.
	*
	* @param obwaja_informacija_id the obwaja_informacija_id of this obwaja_informacija
	*/
	@Override
	public void setObwaja_informacija_id(long obwaja_informacija_id) {
		_obwaja_informacija.setObwaja_informacija_id(obwaja_informacija_id);
	}

	/**
	* Sets the primary key of this obwaja_informacija.
	*
	* @param primaryKey the primary key of this obwaja_informacija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_obwaja_informacija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_obwaja_informacija.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this obwaja_informacija.
	*
	* @param sozdal the sozdal of this obwaja_informacija
	*/
	@Override
	public void setSozdal(long sozdal) {
		_obwaja_informacija.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof obwaja_informacijaWrapper)) {
			return false;
		}

		obwaja_informacijaWrapper obwaja_informacijaWrapper = (obwaja_informacijaWrapper)obj;

		if (Objects.equals(_obwaja_informacija,
					obwaja_informacijaWrapper._obwaja_informacija)) {
			return true;
		}

		return false;
	}

	@Override
	public obwaja_informacija getWrappedModel() {
		return _obwaja_informacija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _obwaja_informacija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _obwaja_informacija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_obwaja_informacija.resetOriginalValues();
	}

	private final obwaja_informacija _obwaja_informacija;
}