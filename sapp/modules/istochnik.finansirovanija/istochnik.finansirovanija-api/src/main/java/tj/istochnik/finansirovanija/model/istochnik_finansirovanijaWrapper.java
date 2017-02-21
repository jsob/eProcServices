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

package tj.istochnik.finansirovanija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link istochnik_finansirovanija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istochnik_finansirovanija
 * @generated
 */
@ProviderType
public class istochnik_finansirovanijaWrapper
	implements istochnik_finansirovanija,
		ModelWrapper<istochnik_finansirovanija> {
	public istochnik_finansirovanijaWrapper(
		istochnik_finansirovanija istochnik_finansirovanija) {
		_istochnik_finansirovanija = istochnik_finansirovanija;
	}

	@Override
	public Class<?> getModelClass() {
		return istochnik_finansirovanija.class;
	}

	@Override
	public String getModelClassName() {
		return istochnik_finansirovanija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("istochnik_finansirovanija_id",
			getIstochnik_finansirovanija_id());
		attributes.put("naimenovanie", getNaimenovanie());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long istochnik_finansirovanija_id = (Long)attributes.get(
				"istochnik_finansirovanija_id");

		if (istochnik_finansirovanija_id != null) {
			setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
		}

		String naimenovanie = (String)attributes.get("naimenovanie");

		if (naimenovanie != null) {
			setNaimenovanie(naimenovanie);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _istochnik_finansirovanija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _istochnik_finansirovanija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _istochnik_finansirovanija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _istochnik_finansirovanija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.istochnik.finansirovanija.model.istochnik_finansirovanija> toCacheModel() {
		return _istochnik_finansirovanija.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.istochnik.finansirovanija.model.istochnik_finansirovanija istochnik_finansirovanija) {
		return _istochnik_finansirovanija.compareTo(istochnik_finansirovanija);
	}

	@Override
	public int hashCode() {
		return _istochnik_finansirovanija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _istochnik_finansirovanija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new istochnik_finansirovanijaWrapper((istochnik_finansirovanija)_istochnik_finansirovanija.clone());
	}

	/**
	* Returns the naimenovanie of this istochnik_finansirovanija.
	*
	* @return the naimenovanie of this istochnik_finansirovanija
	*/
	@Override
	public java.lang.String getNaimenovanie() {
		return _istochnik_finansirovanija.getNaimenovanie();
	}

	@Override
	public java.lang.String toString() {
		return _istochnik_finansirovanija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _istochnik_finansirovanija.toXmlString();
	}

	/**
	* Returns the istochnik_finansirovanija_id of this istochnik_finansirovanija.
	*
	* @return the istochnik_finansirovanija_id of this istochnik_finansirovanija
	*/
	@Override
	public long getIstochnik_finansirovanija_id() {
		return _istochnik_finansirovanija.getIstochnik_finansirovanija_id();
	}

	/**
	* Returns the primary key of this istochnik_finansirovanija.
	*
	* @return the primary key of this istochnik_finansirovanija
	*/
	@Override
	public long getPrimaryKey() {
		return _istochnik_finansirovanija.getPrimaryKey();
	}

	@Override
	public tj.istochnik.finansirovanija.model.istochnik_finansirovanija toEscapedModel() {
		return new istochnik_finansirovanijaWrapper(_istochnik_finansirovanija.toEscapedModel());
	}

	@Override
	public tj.istochnik.finansirovanija.model.istochnik_finansirovanija toUnescapedModel() {
		return new istochnik_finansirovanijaWrapper(_istochnik_finansirovanija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_istochnik_finansirovanija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_istochnik_finansirovanija.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_istochnik_finansirovanija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_istochnik_finansirovanija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_istochnik_finansirovanija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the istochnik_finansirovanija_id of this istochnik_finansirovanija.
	*
	* @param istochnik_finansirovanija_id the istochnik_finansirovanija_id of this istochnik_finansirovanija
	*/
	@Override
	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id) {
		_istochnik_finansirovanija.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
	}

	/**
	* Sets the naimenovanie of this istochnik_finansirovanija.
	*
	* @param naimenovanie the naimenovanie of this istochnik_finansirovanija
	*/
	@Override
	public void setNaimenovanie(java.lang.String naimenovanie) {
		_istochnik_finansirovanija.setNaimenovanie(naimenovanie);
	}

	@Override
	public void setNew(boolean n) {
		_istochnik_finansirovanija.setNew(n);
	}

	/**
	* Sets the primary key of this istochnik_finansirovanija.
	*
	* @param primaryKey the primary key of this istochnik_finansirovanija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_istochnik_finansirovanija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_istochnik_finansirovanija.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof istochnik_finansirovanijaWrapper)) {
			return false;
		}

		istochnik_finansirovanijaWrapper istochnik_finansirovanijaWrapper = (istochnik_finansirovanijaWrapper)obj;

		if (Objects.equals(_istochnik_finansirovanija,
					istochnik_finansirovanijaWrapper._istochnik_finansirovanija)) {
			return true;
		}

		return false;
	}

	@Override
	public istochnik_finansirovanija getWrappedModel() {
		return _istochnik_finansirovanija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _istochnik_finansirovanija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _istochnik_finansirovanija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_istochnik_finansirovanija.resetOriginalValues();
	}

	private final istochnik_finansirovanija _istochnik_finansirovanija;
}