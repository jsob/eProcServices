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

package tj.balans.postavwika.model;

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
 * This class is a wrapper for {@link balans_postavwika}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see balans_postavwika
 * @generated
 */
@ProviderType
public class balans_postavwikaWrapper implements balans_postavwika,
	ModelWrapper<balans_postavwika> {
	public balans_postavwikaWrapper(balans_postavwika balans_postavwika) {
		_balans_postavwika = balans_postavwika;
	}

	@Override
	public Class<?> getModelClass() {
		return balans_postavwika.class;
	}

	@Override
	public String getModelClassName() {
		return balans_postavwika.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("balans_postavwika_id", getBalans_postavwika_id());
		attributes.put("balans", getBalans());
		attributes.put("postavwik_id", getPostavwik_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long balans_postavwika_id = (Long)attributes.get("balans_postavwika_id");

		if (balans_postavwika_id != null) {
			setBalans_postavwika_id(balans_postavwika_id);
		}

		Double balans = (Double)attributes.get("balans");

		if (balans != null) {
			setBalans(balans);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _balans_postavwika.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _balans_postavwika.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _balans_postavwika.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _balans_postavwika.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.balans.postavwika.model.balans_postavwika> toCacheModel() {
		return _balans_postavwika.toCacheModel();
	}

	/**
	* Returns the balans of this balans_postavwika.
	*
	* @return the balans of this balans_postavwika
	*/
	@Override
	public double getBalans() {
		return _balans_postavwika.getBalans();
	}

	@Override
	public int compareTo(
		tj.balans.postavwika.model.balans_postavwika balans_postavwika) {
		return _balans_postavwika.compareTo(balans_postavwika);
	}

	@Override
	public int hashCode() {
		return _balans_postavwika.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _balans_postavwika.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new balans_postavwikaWrapper((balans_postavwika)_balans_postavwika.clone());
	}

	@Override
	public java.lang.String toString() {
		return _balans_postavwika.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _balans_postavwika.toXmlString();
	}

	/**
	* Returns the balans_postavwika_id of this balans_postavwika.
	*
	* @return the balans_postavwika_id of this balans_postavwika
	*/
	@Override
	public long getBalans_postavwika_id() {
		return _balans_postavwika.getBalans_postavwika_id();
	}

	/**
	* Returns the postavwik_id of this balans_postavwika.
	*
	* @return the postavwik_id of this balans_postavwika
	*/
	@Override
	public long getPostavwik_id() {
		return _balans_postavwika.getPostavwik_id();
	}

	/**
	* Returns the primary key of this balans_postavwika.
	*
	* @return the primary key of this balans_postavwika
	*/
	@Override
	public long getPrimaryKey() {
		return _balans_postavwika.getPrimaryKey();
	}

	@Override
	public tj.balans.postavwika.model.balans_postavwika toEscapedModel() {
		return new balans_postavwikaWrapper(_balans_postavwika.toEscapedModel());
	}

	@Override
	public tj.balans.postavwika.model.balans_postavwika toUnescapedModel() {
		return new balans_postavwikaWrapper(_balans_postavwika.toUnescapedModel());
	}

	@Override
	public void persist() {
		_balans_postavwika.persist();
	}

	/**
	* Sets the balans of this balans_postavwika.
	*
	* @param balans the balans of this balans_postavwika
	*/
	@Override
	public void setBalans(double balans) {
		_balans_postavwika.setBalans(balans);
	}

	/**
	* Sets the balans_postavwika_id of this balans_postavwika.
	*
	* @param balans_postavwika_id the balans_postavwika_id of this balans_postavwika
	*/
	@Override
	public void setBalans_postavwika_id(long balans_postavwika_id) {
		_balans_postavwika.setBalans_postavwika_id(balans_postavwika_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_balans_postavwika.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_balans_postavwika.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_balans_postavwika.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_balans_postavwika.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_balans_postavwika.setNew(n);
	}

	/**
	* Sets the postavwik_id of this balans_postavwika.
	*
	* @param postavwik_id the postavwik_id of this balans_postavwika
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_balans_postavwika.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this balans_postavwika.
	*
	* @param primaryKey the primary key of this balans_postavwika
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_balans_postavwika.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_balans_postavwika.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof balans_postavwikaWrapper)) {
			return false;
		}

		balans_postavwikaWrapper balans_postavwikaWrapper = (balans_postavwikaWrapper)obj;

		if (Objects.equals(_balans_postavwika,
					balans_postavwikaWrapper._balans_postavwika)) {
			return true;
		}

		return false;
	}

	@Override
	public balans_postavwika getWrappedModel() {
		return _balans_postavwika;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _balans_postavwika.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _balans_postavwika.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_balans_postavwika.resetOriginalValues();
	}

	private final balans_postavwika _balans_postavwika;
}