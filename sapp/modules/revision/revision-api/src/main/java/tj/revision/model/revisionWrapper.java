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

package tj.revision.model;

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
 * This class is a wrapper for {@link revision}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see revision
 * @generated
 */
@ProviderType
public class revisionWrapper implements revision, ModelWrapper<revision> {
	public revisionWrapper(revision revision) {
		_revision = revision;
	}

	@Override
	public Class<?> getModelClass() {
		return revision.class;
	}

	@Override
	public String getModelClassName() {
		return revision.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("date", getDate());
		attributes.put("revision_id", getRevision_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		Long revision_id = (Long)attributes.get("revision_id");

		if (revision_id != null) {
			setRevision_id(revision_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _revision.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _revision.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _revision.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _revision.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.revision.model.revision> toCacheModel() {
		return _revision.toCacheModel();
	}

	@Override
	public int compareTo(tj.revision.model.revision revision) {
		return _revision.compareTo(revision);
	}

	@Override
	public int hashCode() {
		return _revision.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _revision.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new revisionWrapper((revision)_revision.clone());
	}

	@Override
	public java.lang.String toString() {
		return _revision.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _revision.toXmlString();
	}

	/**
	* Returns the date of this revision.
	*
	* @return the date of this revision
	*/
	@Override
	public Date getDate() {
		return _revision.getDate();
	}

	/**
	* Returns the primary key of this revision.
	*
	* @return the primary key of this revision
	*/
	@Override
	public long getPrimaryKey() {
		return _revision.getPrimaryKey();
	}

	/**
	* Returns the revision_id of this revision.
	*
	* @return the revision_id of this revision
	*/
	@Override
	public long getRevision_id() {
		return _revision.getRevision_id();
	}

	@Override
	public tj.revision.model.revision toEscapedModel() {
		return new revisionWrapper(_revision.toEscapedModel());
	}

	@Override
	public tj.revision.model.revision toUnescapedModel() {
		return new revisionWrapper(_revision.toUnescapedModel());
	}

	@Override
	public void persist() {
		_revision.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_revision.setCachedModel(cachedModel);
	}

	/**
	* Sets the date of this revision.
	*
	* @param date the date of this revision
	*/
	@Override
	public void setDate(Date date) {
		_revision.setDate(date);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_revision.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_revision.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_revision.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_revision.setNew(n);
	}

	/**
	* Sets the primary key of this revision.
	*
	* @param primaryKey the primary key of this revision
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_revision.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_revision.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the revision_id of this revision.
	*
	* @param revision_id the revision_id of this revision
	*/
	@Override
	public void setRevision_id(long revision_id) {
		_revision.setRevision_id(revision_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof revisionWrapper)) {
			return false;
		}

		revisionWrapper revisionWrapper = (revisionWrapper)obj;

		if (Objects.equals(_revision, revisionWrapper._revision)) {
			return true;
		}

		return false;
	}

	@Override
	public revision getWrappedModel() {
		return _revision;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _revision.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _revision.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_revision.resetOriginalValues();
	}

	private final revision _revision;
}