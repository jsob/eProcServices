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

package tj.podrazdelenija.model;

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
 * This class is a wrapper for {@link podrazdelenija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see podrazdelenija
 * @generated
 */
@ProviderType
public class podrazdelenijaWrapper implements podrazdelenija,
	ModelWrapper<podrazdelenija> {
	public podrazdelenijaWrapper(podrazdelenija podrazdelenija) {
		_podrazdelenija = podrazdelenija;
	}

	@Override
	public Class<?> getModelClass() {
		return podrazdelenija.class;
	}

	@Override
	public String getModelClassName() {
		return podrazdelenija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izmenil", getIzmenil());
		attributes.put("organizacija_id", getOrganizacija_id());
		attributes.put("podrazdelenie", getPodrazdelenie());
		attributes.put("podrazdelenija_id", getPodrazdelenija_id());
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

		Long organizacija_id = (Long)attributes.get("organizacija_id");

		if (organizacija_id != null) {
			setOrganizacija_id(organizacija_id);
		}

		String podrazdelenie = (String)attributes.get("podrazdelenie");

		if (podrazdelenie != null) {
			setPodrazdelenie(podrazdelenie);
		}

		Long podrazdelenija_id = (Long)attributes.get("podrazdelenija_id");

		if (podrazdelenija_id != null) {
			setPodrazdelenija_id(podrazdelenija_id);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _podrazdelenija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _podrazdelenija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _podrazdelenija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _podrazdelenija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.podrazdelenija.model.podrazdelenija> toCacheModel() {
		return _podrazdelenija.toCacheModel();
	}

	@Override
	public int compareTo(tj.podrazdelenija.model.podrazdelenija podrazdelenija) {
		return _podrazdelenija.compareTo(podrazdelenija);
	}

	@Override
	public int hashCode() {
		return _podrazdelenija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _podrazdelenija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new podrazdelenijaWrapper((podrazdelenija)_podrazdelenija.clone());
	}

	/**
	* Returns the podrazdelenie of this podrazdelenija.
	*
	* @return the podrazdelenie of this podrazdelenija
	*/
	@Override
	public java.lang.String getPodrazdelenie() {
		return _podrazdelenija.getPodrazdelenie();
	}

	@Override
	public java.lang.String toString() {
		return _podrazdelenija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _podrazdelenija.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this podrazdelenija.
	*
	* @return the data_izmenenija of this podrazdelenija
	*/
	@Override
	public Date getData_izmenenija() {
		return _podrazdelenija.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this podrazdelenija.
	*
	* @return the data_sozdanija of this podrazdelenija
	*/
	@Override
	public Date getData_sozdanija() {
		return _podrazdelenija.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this podrazdelenija.
	*
	* @return the izmenil of this podrazdelenija
	*/
	@Override
	public long getIzmenil() {
		return _podrazdelenija.getIzmenil();
	}

	/**
	* Returns the organizacija_id of this podrazdelenija.
	*
	* @return the organizacija_id of this podrazdelenija
	*/
	@Override
	public long getOrganizacija_id() {
		return _podrazdelenija.getOrganizacija_id();
	}

	/**
	* Returns the podrazdelenija_id of this podrazdelenija.
	*
	* @return the podrazdelenija_id of this podrazdelenija
	*/
	@Override
	public long getPodrazdelenija_id() {
		return _podrazdelenija.getPodrazdelenija_id();
	}

	/**
	* Returns the primary key of this podrazdelenija.
	*
	* @return the primary key of this podrazdelenija
	*/
	@Override
	public long getPrimaryKey() {
		return _podrazdelenija.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this podrazdelenija.
	*
	* @return the sozdal of this podrazdelenija
	*/
	@Override
	public long getSozdal() {
		return _podrazdelenija.getSozdal();
	}

	@Override
	public tj.podrazdelenija.model.podrazdelenija toEscapedModel() {
		return new podrazdelenijaWrapper(_podrazdelenija.toEscapedModel());
	}

	@Override
	public tj.podrazdelenija.model.podrazdelenija toUnescapedModel() {
		return new podrazdelenijaWrapper(_podrazdelenija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_podrazdelenija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_podrazdelenija.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this podrazdelenija.
	*
	* @param data_izmenenija the data_izmenenija of this podrazdelenija
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_podrazdelenija.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this podrazdelenija.
	*
	* @param data_sozdanija the data_sozdanija of this podrazdelenija
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_podrazdelenija.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_podrazdelenija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_podrazdelenija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_podrazdelenija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izmenil of this podrazdelenija.
	*
	* @param izmenil the izmenil of this podrazdelenija
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_podrazdelenija.setIzmenil(izmenil);
	}

	@Override
	public void setNew(boolean n) {
		_podrazdelenija.setNew(n);
	}

	/**
	* Sets the organizacija_id of this podrazdelenija.
	*
	* @param organizacija_id the organizacija_id of this podrazdelenija
	*/
	@Override
	public void setOrganizacija_id(long organizacija_id) {
		_podrazdelenija.setOrganizacija_id(organizacija_id);
	}

	/**
	* Sets the podrazdelenie of this podrazdelenija.
	*
	* @param podrazdelenie the podrazdelenie of this podrazdelenija
	*/
	@Override
	public void setPodrazdelenie(java.lang.String podrazdelenie) {
		_podrazdelenija.setPodrazdelenie(podrazdelenie);
	}

	/**
	* Sets the podrazdelenija_id of this podrazdelenija.
	*
	* @param podrazdelenija_id the podrazdelenija_id of this podrazdelenija
	*/
	@Override
	public void setPodrazdelenija_id(long podrazdelenija_id) {
		_podrazdelenija.setPodrazdelenija_id(podrazdelenija_id);
	}

	/**
	* Sets the primary key of this podrazdelenija.
	*
	* @param primaryKey the primary key of this podrazdelenija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_podrazdelenija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_podrazdelenija.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this podrazdelenija.
	*
	* @param sozdal the sozdal of this podrazdelenija
	*/
	@Override
	public void setSozdal(long sozdal) {
		_podrazdelenija.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof podrazdelenijaWrapper)) {
			return false;
		}

		podrazdelenijaWrapper podrazdelenijaWrapper = (podrazdelenijaWrapper)obj;

		if (Objects.equals(_podrazdelenija,
					podrazdelenijaWrapper._podrazdelenija)) {
			return true;
		}

		return false;
	}

	@Override
	public podrazdelenija getWrappedModel() {
		return _podrazdelenija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _podrazdelenija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _podrazdelenija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_podrazdelenija.resetOriginalValues();
	}

	private final podrazdelenija _podrazdelenija;
}