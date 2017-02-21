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

package tj.protokol.dlja.zakljuchenija.kontrakta.model;

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
 * This class is a wrapper for {@link protokol_dlja_zakljuchenija_kontrakta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see protokol_dlja_zakljuchenija_kontrakta
 * @generated
 */
@ProviderType
public class protokol_dlja_zakljuchenija_kontraktaWrapper
	implements protokol_dlja_zakljuchenija_kontrakta,
		ModelWrapper<protokol_dlja_zakljuchenija_kontrakta> {
	public protokol_dlja_zakljuchenija_kontraktaWrapper(
		protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		_protokol_dlja_zakljuchenija_kontrakta = protokol_dlja_zakljuchenija_kontrakta;
	}

	@Override
	public Class<?> getModelClass() {
		return protokol_dlja_zakljuchenija_kontrakta.class;
	}

	@Override
	public String getModelClassName() {
		return protokol_dlja_zakljuchenija_kontrakta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_generacii", getData_generacii());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("protokol_dlja_zakljuchenija_kontrakta_id",
			getProtokol_dlja_zakljuchenija_kontrakta_id());
		attributes.put("sgeneriroval", getSgeneriroval());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_generacii = (Date)attributes.get("data_generacii");

		if (data_generacii != null) {
			setData_generacii(data_generacii);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long protokol_dlja_zakljuchenija_kontrakta_id = (Long)attributes.get(
				"protokol_dlja_zakljuchenija_kontrakta_id");

		if (protokol_dlja_zakljuchenija_kontrakta_id != null) {
			setProtokol_dlja_zakljuchenija_kontrakta_id(protokol_dlja_zakljuchenija_kontrakta_id);
		}

		Long sgeneriroval = (Long)attributes.get("sgeneriroval");

		if (sgeneriroval != null) {
			setSgeneriroval(sgeneriroval);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _protokol_dlja_zakljuchenija_kontrakta.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _protokol_dlja_zakljuchenija_kontrakta.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _protokol_dlja_zakljuchenija_kontrakta.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _protokol_dlja_zakljuchenija_kontrakta.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta> toCacheModel() {
		return _protokol_dlja_zakljuchenija_kontrakta.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		return _protokol_dlja_zakljuchenija_kontrakta.compareTo(protokol_dlja_zakljuchenija_kontrakta);
	}

	@Override
	public int hashCode() {
		return _protokol_dlja_zakljuchenija_kontrakta.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _protokol_dlja_zakljuchenija_kontrakta.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new protokol_dlja_zakljuchenija_kontraktaWrapper((protokol_dlja_zakljuchenija_kontrakta)_protokol_dlja_zakljuchenija_kontrakta.clone());
	}

	@Override
	public java.lang.String toString() {
		return _protokol_dlja_zakljuchenija_kontrakta.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _protokol_dlja_zakljuchenija_kontrakta.toXmlString();
	}

	/**
	* Returns the data_generacii of this protokol_dlja_zakljuchenija_kontrakta.
	*
	* @return the data_generacii of this protokol_dlja_zakljuchenija_kontrakta
	*/
	@Override
	public Date getData_generacii() {
		return _protokol_dlja_zakljuchenija_kontrakta.getData_generacii();
	}

	/**
	* Returns the izvewenie_id of this protokol_dlja_zakljuchenija_kontrakta.
	*
	* @return the izvewenie_id of this protokol_dlja_zakljuchenija_kontrakta
	*/
	@Override
	public long getIzvewenie_id() {
		return _protokol_dlja_zakljuchenija_kontrakta.getIzvewenie_id();
	}

	/**
	* Returns the primary key of this protokol_dlja_zakljuchenija_kontrakta.
	*
	* @return the primary key of this protokol_dlja_zakljuchenija_kontrakta
	*/
	@Override
	public long getPrimaryKey() {
		return _protokol_dlja_zakljuchenija_kontrakta.getPrimaryKey();
	}

	/**
	* Returns the protokol_dlja_zakljuchenija_kontrakta_id of this protokol_dlja_zakljuchenija_kontrakta.
	*
	* @return the protokol_dlja_zakljuchenija_kontrakta_id of this protokol_dlja_zakljuchenija_kontrakta
	*/
	@Override
	public long getProtokol_dlja_zakljuchenija_kontrakta_id() {
		return _protokol_dlja_zakljuchenija_kontrakta.getProtokol_dlja_zakljuchenija_kontrakta_id();
	}

	/**
	* Returns the sgeneriroval of this protokol_dlja_zakljuchenija_kontrakta.
	*
	* @return the sgeneriroval of this protokol_dlja_zakljuchenija_kontrakta
	*/
	@Override
	public long getSgeneriroval() {
		return _protokol_dlja_zakljuchenija_kontrakta.getSgeneriroval();
	}

	@Override
	public tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta toEscapedModel() {
		return new protokol_dlja_zakljuchenija_kontraktaWrapper(_protokol_dlja_zakljuchenija_kontrakta.toEscapedModel());
	}

	@Override
	public tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta toUnescapedModel() {
		return new protokol_dlja_zakljuchenija_kontraktaWrapper(_protokol_dlja_zakljuchenija_kontrakta.toUnescapedModel());
	}

	@Override
	public void persist() {
		_protokol_dlja_zakljuchenija_kontrakta.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_protokol_dlja_zakljuchenija_kontrakta.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_generacii of this protokol_dlja_zakljuchenija_kontrakta.
	*
	* @param data_generacii the data_generacii of this protokol_dlja_zakljuchenija_kontrakta
	*/
	@Override
	public void setData_generacii(Date data_generacii) {
		_protokol_dlja_zakljuchenija_kontrakta.setData_generacii(data_generacii);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_protokol_dlja_zakljuchenija_kontrakta.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_protokol_dlja_zakljuchenija_kontrakta.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_protokol_dlja_zakljuchenija_kontrakta.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this protokol_dlja_zakljuchenija_kontrakta.
	*
	* @param izvewenie_id the izvewenie_id of this protokol_dlja_zakljuchenija_kontrakta
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_protokol_dlja_zakljuchenija_kontrakta.setIzvewenie_id(izvewenie_id);
	}

	@Override
	public void setNew(boolean n) {
		_protokol_dlja_zakljuchenija_kontrakta.setNew(n);
	}

	/**
	* Sets the primary key of this protokol_dlja_zakljuchenija_kontrakta.
	*
	* @param primaryKey the primary key of this protokol_dlja_zakljuchenija_kontrakta
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_protokol_dlja_zakljuchenija_kontrakta.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_protokol_dlja_zakljuchenija_kontrakta.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the protokol_dlja_zakljuchenija_kontrakta_id of this protokol_dlja_zakljuchenija_kontrakta.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta_id the protokol_dlja_zakljuchenija_kontrakta_id of this protokol_dlja_zakljuchenija_kontrakta
	*/
	@Override
	public void setProtokol_dlja_zakljuchenija_kontrakta_id(
		long protokol_dlja_zakljuchenija_kontrakta_id) {
		_protokol_dlja_zakljuchenija_kontrakta.setProtokol_dlja_zakljuchenija_kontrakta_id(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	/**
	* Sets the sgeneriroval of this protokol_dlja_zakljuchenija_kontrakta.
	*
	* @param sgeneriroval the sgeneriroval of this protokol_dlja_zakljuchenija_kontrakta
	*/
	@Override
	public void setSgeneriroval(long sgeneriroval) {
		_protokol_dlja_zakljuchenija_kontrakta.setSgeneriroval(sgeneriroval);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof protokol_dlja_zakljuchenija_kontraktaWrapper)) {
			return false;
		}

		protokol_dlja_zakljuchenija_kontraktaWrapper protokol_dlja_zakljuchenija_kontraktaWrapper =
			(protokol_dlja_zakljuchenija_kontraktaWrapper)obj;

		if (Objects.equals(_protokol_dlja_zakljuchenija_kontrakta,
					protokol_dlja_zakljuchenija_kontraktaWrapper._protokol_dlja_zakljuchenija_kontrakta)) {
			return true;
		}

		return false;
	}

	@Override
	public protokol_dlja_zakljuchenija_kontrakta getWrappedModel() {
		return _protokol_dlja_zakljuchenija_kontrakta;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _protokol_dlja_zakljuchenija_kontrakta.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _protokol_dlja_zakljuchenija_kontrakta.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_protokol_dlja_zakljuchenija_kontrakta.resetOriginalValues();
	}

	private final protokol_dlja_zakljuchenija_kontrakta _protokol_dlja_zakljuchenija_kontrakta;
}