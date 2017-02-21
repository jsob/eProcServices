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

package tj.izvewenie.put.model;

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
 * This class is a wrapper for {@link izvewenie_put}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see izvewenie_put
 * @generated
 */
@ProviderType
public class izvewenie_putWrapper implements izvewenie_put,
	ModelWrapper<izvewenie_put> {
	public izvewenie_putWrapper(izvewenie_put izvewenie_put) {
		_izvewenie_put = izvewenie_put;
	}

	@Override
	public Class<?> getModelClass() {
		return izvewenie_put.class;
	}

	@Override
	public String getModelClassName() {
		return izvewenie_put.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("izvewenie_put_id", getIzvewenie_put_id());
		attributes.put("put_a", getPut_a());
		attributes.put("put_b", getPut_b());
		attributes.put("put_c", getPut_c());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long izvewenie_put_id = (Long)attributes.get("izvewenie_put_id");

		if (izvewenie_put_id != null) {
			setIzvewenie_put_id(izvewenie_put_id);
		}

		Long put_a = (Long)attributes.get("put_a");

		if (put_a != null) {
			setPut_a(put_a);
		}

		Long put_b = (Long)attributes.get("put_b");

		if (put_b != null) {
			setPut_b(put_b);
		}

		String put_c = (String)attributes.get("put_c");

		if (put_c != null) {
			setPut_c(put_c);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _izvewenie_put.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _izvewenie_put.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _izvewenie_put.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _izvewenie_put.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.izvewenie.put.model.izvewenie_put> toCacheModel() {
		return _izvewenie_put.toCacheModel();
	}

	@Override
	public int compareTo(tj.izvewenie.put.model.izvewenie_put izvewenie_put) {
		return _izvewenie_put.compareTo(izvewenie_put);
	}

	@Override
	public int hashCode() {
		return _izvewenie_put.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _izvewenie_put.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new izvewenie_putWrapper((izvewenie_put)_izvewenie_put.clone());
	}

	/**
	* Returns the put_c of this izvewenie_put.
	*
	* @return the put_c of this izvewenie_put
	*/
	@Override
	public java.lang.String getPut_c() {
		return _izvewenie_put.getPut_c();
	}

	@Override
	public java.lang.String toString() {
		return _izvewenie_put.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _izvewenie_put.toXmlString();
	}

	/**
	* Returns the izvewenie_id of this izvewenie_put.
	*
	* @return the izvewenie_id of this izvewenie_put
	*/
	@Override
	public long getIzvewenie_id() {
		return _izvewenie_put.getIzvewenie_id();
	}

	/**
	* Returns the izvewenie_put_id of this izvewenie_put.
	*
	* @return the izvewenie_put_id of this izvewenie_put
	*/
	@Override
	public long getIzvewenie_put_id() {
		return _izvewenie_put.getIzvewenie_put_id();
	}

	/**
	* Returns the primary key of this izvewenie_put.
	*
	* @return the primary key of this izvewenie_put
	*/
	@Override
	public long getPrimaryKey() {
		return _izvewenie_put.getPrimaryKey();
	}

	/**
	* Returns the put_a of this izvewenie_put.
	*
	* @return the put_a of this izvewenie_put
	*/
	@Override
	public long getPut_a() {
		return _izvewenie_put.getPut_a();
	}

	/**
	* Returns the put_b of this izvewenie_put.
	*
	* @return the put_b of this izvewenie_put
	*/
	@Override
	public long getPut_b() {
		return _izvewenie_put.getPut_b();
	}

	@Override
	public tj.izvewenie.put.model.izvewenie_put toEscapedModel() {
		return new izvewenie_putWrapper(_izvewenie_put.toEscapedModel());
	}

	@Override
	public tj.izvewenie.put.model.izvewenie_put toUnescapedModel() {
		return new izvewenie_putWrapper(_izvewenie_put.toUnescapedModel());
	}

	@Override
	public void persist() {
		_izvewenie_put.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_izvewenie_put.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_izvewenie_put.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_izvewenie_put.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_izvewenie_put.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this izvewenie_put.
	*
	* @param izvewenie_id the izvewenie_id of this izvewenie_put
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_put.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the izvewenie_put_id of this izvewenie_put.
	*
	* @param izvewenie_put_id the izvewenie_put_id of this izvewenie_put
	*/
	@Override
	public void setIzvewenie_put_id(long izvewenie_put_id) {
		_izvewenie_put.setIzvewenie_put_id(izvewenie_put_id);
	}

	@Override
	public void setNew(boolean n) {
		_izvewenie_put.setNew(n);
	}

	/**
	* Sets the primary key of this izvewenie_put.
	*
	* @param primaryKey the primary key of this izvewenie_put
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_izvewenie_put.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_izvewenie_put.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the put_a of this izvewenie_put.
	*
	* @param put_a the put_a of this izvewenie_put
	*/
	@Override
	public void setPut_a(long put_a) {
		_izvewenie_put.setPut_a(put_a);
	}

	/**
	* Sets the put_b of this izvewenie_put.
	*
	* @param put_b the put_b of this izvewenie_put
	*/
	@Override
	public void setPut_b(long put_b) {
		_izvewenie_put.setPut_b(put_b);
	}

	/**
	* Sets the put_c of this izvewenie_put.
	*
	* @param put_c the put_c of this izvewenie_put
	*/
	@Override
	public void setPut_c(java.lang.String put_c) {
		_izvewenie_put.setPut_c(put_c);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof izvewenie_putWrapper)) {
			return false;
		}

		izvewenie_putWrapper izvewenie_putWrapper = (izvewenie_putWrapper)obj;

		if (Objects.equals(_izvewenie_put, izvewenie_putWrapper._izvewenie_put)) {
			return true;
		}

		return false;
	}

	@Override
	public izvewenie_put getWrappedModel() {
		return _izvewenie_put;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _izvewenie_put.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _izvewenie_put.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_izvewenie_put.resetOriginalValues();
	}

	private final izvewenie_put _izvewenie_put;
}