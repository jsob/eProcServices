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

package tj.tipy.dokumentov.postavwika.model;

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
 * This class is a wrapper for {@link tipy_dokumentov_postavwika}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_dokumentov_postavwika
 * @generated
 */
@ProviderType
public class tipy_dokumentov_postavwikaWrapper
	implements tipy_dokumentov_postavwika,
		ModelWrapper<tipy_dokumentov_postavwika> {
	public tipy_dokumentov_postavwikaWrapper(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		_tipy_dokumentov_postavwika = tipy_dokumentov_postavwika;
	}

	@Override
	public Class<?> getModelClass() {
		return tipy_dokumentov_postavwika.class;
	}

	@Override
	public String getModelClassName() {
		return tipy_dokumentov_postavwika.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tip", getTip());
		attributes.put("tipy_dokumentov_postavwika_id",
			getTipy_dokumentov_postavwika_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String tip = (String)attributes.get("tip");

		if (tip != null) {
			setTip(tip);
		}

		Long tipy_dokumentov_postavwika_id = (Long)attributes.get(
				"tipy_dokumentov_postavwika_id");

		if (tipy_dokumentov_postavwika_id != null) {
			setTipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _tipy_dokumentov_postavwika.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tipy_dokumentov_postavwika.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tipy_dokumentov_postavwika.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tipy_dokumentov_postavwika.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika> toCacheModel() {
		return _tipy_dokumentov_postavwika.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		return _tipy_dokumentov_postavwika.compareTo(tipy_dokumentov_postavwika);
	}

	@Override
	public int hashCode() {
		return _tipy_dokumentov_postavwika.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tipy_dokumentov_postavwika.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new tipy_dokumentov_postavwikaWrapper((tipy_dokumentov_postavwika)_tipy_dokumentov_postavwika.clone());
	}

	/**
	* Returns the tip of this tipy_dokumentov_postavwika.
	*
	* @return the tip of this tipy_dokumentov_postavwika
	*/
	@Override
	public java.lang.String getTip() {
		return _tipy_dokumentov_postavwika.getTip();
	}

	@Override
	public java.lang.String toString() {
		return _tipy_dokumentov_postavwika.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tipy_dokumentov_postavwika.toXmlString();
	}

	/**
	* Returns the primary key of this tipy_dokumentov_postavwika.
	*
	* @return the primary key of this tipy_dokumentov_postavwika
	*/
	@Override
	public long getPrimaryKey() {
		return _tipy_dokumentov_postavwika.getPrimaryKey();
	}

	/**
	* Returns the tipy_dokumentov_postavwika_id of this tipy_dokumentov_postavwika.
	*
	* @return the tipy_dokumentov_postavwika_id of this tipy_dokumentov_postavwika
	*/
	@Override
	public long getTipy_dokumentov_postavwika_id() {
		return _tipy_dokumentov_postavwika.getTipy_dokumentov_postavwika_id();
	}

	@Override
	public tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika toEscapedModel() {
		return new tipy_dokumentov_postavwikaWrapper(_tipy_dokumentov_postavwika.toEscapedModel());
	}

	@Override
	public tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika toUnescapedModel() {
		return new tipy_dokumentov_postavwikaWrapper(_tipy_dokumentov_postavwika.toUnescapedModel());
	}

	@Override
	public void persist() {
		_tipy_dokumentov_postavwika.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tipy_dokumentov_postavwika.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tipy_dokumentov_postavwika.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tipy_dokumentov_postavwika.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tipy_dokumentov_postavwika.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_tipy_dokumentov_postavwika.setNew(n);
	}

	/**
	* Sets the primary key of this tipy_dokumentov_postavwika.
	*
	* @param primaryKey the primary key of this tipy_dokumentov_postavwika
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tipy_dokumentov_postavwika.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tipy_dokumentov_postavwika.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tip of this tipy_dokumentov_postavwika.
	*
	* @param tip the tip of this tipy_dokumentov_postavwika
	*/
	@Override
	public void setTip(java.lang.String tip) {
		_tipy_dokumentov_postavwika.setTip(tip);
	}

	/**
	* Sets the tipy_dokumentov_postavwika_id of this tipy_dokumentov_postavwika.
	*
	* @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id of this tipy_dokumentov_postavwika
	*/
	@Override
	public void setTipy_dokumentov_postavwika_id(
		long tipy_dokumentov_postavwika_id) {
		_tipy_dokumentov_postavwika.setTipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof tipy_dokumentov_postavwikaWrapper)) {
			return false;
		}

		tipy_dokumentov_postavwikaWrapper tipy_dokumentov_postavwikaWrapper = (tipy_dokumentov_postavwikaWrapper)obj;

		if (Objects.equals(_tipy_dokumentov_postavwika,
					tipy_dokumentov_postavwikaWrapper._tipy_dokumentov_postavwika)) {
			return true;
		}

		return false;
	}

	@Override
	public tipy_dokumentov_postavwika getWrappedModel() {
		return _tipy_dokumentov_postavwika;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tipy_dokumentov_postavwika.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tipy_dokumentov_postavwika.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tipy_dokumentov_postavwika.resetOriginalValues();
	}

	private final tipy_dokumentov_postavwika _tipy_dokumentov_postavwika;
}