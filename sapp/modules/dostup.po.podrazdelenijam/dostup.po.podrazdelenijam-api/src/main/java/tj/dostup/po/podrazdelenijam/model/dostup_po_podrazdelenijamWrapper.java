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

package tj.dostup.po.podrazdelenijam.model;

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
 * This class is a wrapper for {@link dostup_po_podrazdelenijam}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dostup_po_podrazdelenijam
 * @generated
 */
@ProviderType
public class dostup_po_podrazdelenijamWrapper
	implements dostup_po_podrazdelenijam,
		ModelWrapper<dostup_po_podrazdelenijam> {
	public dostup_po_podrazdelenijamWrapper(
		dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		_dostup_po_podrazdelenijam = dostup_po_podrazdelenijam;
	}

	@Override
	public Class<?> getModelClass() {
		return dostup_po_podrazdelenijam.class;
	}

	@Override
	public String getModelClassName() {
		return dostup_po_podrazdelenijam.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("dostup_po_podrazdelenijam_id",
			getDostup_po_podrazdelenijam_id());
		attributes.put("izmenil", getIzmenil());
		attributes.put("podrazdelenija_id", getPodrazdelenija_id());
		attributes.put("polzovateli_id", getPolzovateli_id());
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

		Long dostup_po_podrazdelenijam_id = (Long)attributes.get(
				"dostup_po_podrazdelenijam_id");

		if (dostup_po_podrazdelenijam_id != null) {
			setDostup_po_podrazdelenijam_id(dostup_po_podrazdelenijam_id);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Long podrazdelenija_id = (Long)attributes.get("podrazdelenija_id");

		if (podrazdelenija_id != null) {
			setPodrazdelenija_id(podrazdelenija_id);
		}

		Long polzovateli_id = (Long)attributes.get("polzovateli_id");

		if (polzovateli_id != null) {
			setPolzovateli_id(polzovateli_id);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _dostup_po_podrazdelenijam.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dostup_po_podrazdelenijam.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dostup_po_podrazdelenijam.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dostup_po_podrazdelenijam.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam> toCacheModel() {
		return _dostup_po_podrazdelenijam.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		return _dostup_po_podrazdelenijam.compareTo(dostup_po_podrazdelenijam);
	}

	@Override
	public int hashCode() {
		return _dostup_po_podrazdelenijam.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dostup_po_podrazdelenijam.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new dostup_po_podrazdelenijamWrapper((dostup_po_podrazdelenijam)_dostup_po_podrazdelenijam.clone());
	}

	@Override
	public java.lang.String toString() {
		return _dostup_po_podrazdelenijam.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dostup_po_podrazdelenijam.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this dostup_po_podrazdelenijam.
	*
	* @return the data_izmenenija of this dostup_po_podrazdelenijam
	*/
	@Override
	public Date getData_izmenenija() {
		return _dostup_po_podrazdelenijam.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this dostup_po_podrazdelenijam.
	*
	* @return the data_sozdanija of this dostup_po_podrazdelenijam
	*/
	@Override
	public Date getData_sozdanija() {
		return _dostup_po_podrazdelenijam.getData_sozdanija();
	}

	/**
	* Returns the dostup_po_podrazdelenijam_id of this dostup_po_podrazdelenijam.
	*
	* @return the dostup_po_podrazdelenijam_id of this dostup_po_podrazdelenijam
	*/
	@Override
	public long getDostup_po_podrazdelenijam_id() {
		return _dostup_po_podrazdelenijam.getDostup_po_podrazdelenijam_id();
	}

	/**
	* Returns the izmenil of this dostup_po_podrazdelenijam.
	*
	* @return the izmenil of this dostup_po_podrazdelenijam
	*/
	@Override
	public long getIzmenil() {
		return _dostup_po_podrazdelenijam.getIzmenil();
	}

	/**
	* Returns the podrazdelenija_id of this dostup_po_podrazdelenijam.
	*
	* @return the podrazdelenija_id of this dostup_po_podrazdelenijam
	*/
	@Override
	public long getPodrazdelenija_id() {
		return _dostup_po_podrazdelenijam.getPodrazdelenija_id();
	}

	/**
	* Returns the polzovateli_id of this dostup_po_podrazdelenijam.
	*
	* @return the polzovateli_id of this dostup_po_podrazdelenijam
	*/
	@Override
	public long getPolzovateli_id() {
		return _dostup_po_podrazdelenijam.getPolzovateli_id();
	}

	/**
	* Returns the primary key of this dostup_po_podrazdelenijam.
	*
	* @return the primary key of this dostup_po_podrazdelenijam
	*/
	@Override
	public long getPrimaryKey() {
		return _dostup_po_podrazdelenijam.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this dostup_po_podrazdelenijam.
	*
	* @return the sozdal of this dostup_po_podrazdelenijam
	*/
	@Override
	public long getSozdal() {
		return _dostup_po_podrazdelenijam.getSozdal();
	}

	@Override
	public tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam toEscapedModel() {
		return new dostup_po_podrazdelenijamWrapper(_dostup_po_podrazdelenijam.toEscapedModel());
	}

	@Override
	public tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam toUnescapedModel() {
		return new dostup_po_podrazdelenijamWrapper(_dostup_po_podrazdelenijam.toUnescapedModel());
	}

	@Override
	public void persist() {
		_dostup_po_podrazdelenijam.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dostup_po_podrazdelenijam.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this dostup_po_podrazdelenijam.
	*
	* @param data_izmenenija the data_izmenenija of this dostup_po_podrazdelenijam
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_dostup_po_podrazdelenijam.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this dostup_po_podrazdelenijam.
	*
	* @param data_sozdanija the data_sozdanija of this dostup_po_podrazdelenijam
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_dostup_po_podrazdelenijam.setData_sozdanija(data_sozdanija);
	}

	/**
	* Sets the dostup_po_podrazdelenijam_id of this dostup_po_podrazdelenijam.
	*
	* @param dostup_po_podrazdelenijam_id the dostup_po_podrazdelenijam_id of this dostup_po_podrazdelenijam
	*/
	@Override
	public void setDostup_po_podrazdelenijam_id(
		long dostup_po_podrazdelenijam_id) {
		_dostup_po_podrazdelenijam.setDostup_po_podrazdelenijam_id(dostup_po_podrazdelenijam_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dostup_po_podrazdelenijam.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dostup_po_podrazdelenijam.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dostup_po_podrazdelenijam.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izmenil of this dostup_po_podrazdelenijam.
	*
	* @param izmenil the izmenil of this dostup_po_podrazdelenijam
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_dostup_po_podrazdelenijam.setIzmenil(izmenil);
	}

	@Override
	public void setNew(boolean n) {
		_dostup_po_podrazdelenijam.setNew(n);
	}

	/**
	* Sets the podrazdelenija_id of this dostup_po_podrazdelenijam.
	*
	* @param podrazdelenija_id the podrazdelenija_id of this dostup_po_podrazdelenijam
	*/
	@Override
	public void setPodrazdelenija_id(long podrazdelenija_id) {
		_dostup_po_podrazdelenijam.setPodrazdelenija_id(podrazdelenija_id);
	}

	/**
	* Sets the polzovateli_id of this dostup_po_podrazdelenijam.
	*
	* @param polzovateli_id the polzovateli_id of this dostup_po_podrazdelenijam
	*/
	@Override
	public void setPolzovateli_id(long polzovateli_id) {
		_dostup_po_podrazdelenijam.setPolzovateli_id(polzovateli_id);
	}

	/**
	* Sets the primary key of this dostup_po_podrazdelenijam.
	*
	* @param primaryKey the primary key of this dostup_po_podrazdelenijam
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dostup_po_podrazdelenijam.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dostup_po_podrazdelenijam.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this dostup_po_podrazdelenijam.
	*
	* @param sozdal the sozdal of this dostup_po_podrazdelenijam
	*/
	@Override
	public void setSozdal(long sozdal) {
		_dostup_po_podrazdelenijam.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof dostup_po_podrazdelenijamWrapper)) {
			return false;
		}

		dostup_po_podrazdelenijamWrapper dostup_po_podrazdelenijamWrapper = (dostup_po_podrazdelenijamWrapper)obj;

		if (Objects.equals(_dostup_po_podrazdelenijam,
					dostup_po_podrazdelenijamWrapper._dostup_po_podrazdelenijam)) {
			return true;
		}

		return false;
	}

	@Override
	public dostup_po_podrazdelenijam getWrappedModel() {
		return _dostup_po_podrazdelenijam;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dostup_po_podrazdelenijam.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dostup_po_podrazdelenijam.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dostup_po_podrazdelenijam.resetOriginalValues();
	}

	private final dostup_po_podrazdelenijam _dostup_po_podrazdelenijam;
}