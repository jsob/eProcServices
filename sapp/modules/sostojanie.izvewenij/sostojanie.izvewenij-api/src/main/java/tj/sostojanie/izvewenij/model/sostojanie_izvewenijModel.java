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

package tj.sostojanie.izvewenij.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the sostojanie_izvewenij service. Represents a row in the &quot;sapp.sostojanie_izvewenij&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sostojanie_izvewenij
 * @see tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijImpl
 * @see tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijModelImpl
 * @generated
 */
@ProviderType
public interface sostojanie_izvewenijModel extends BaseModel<sostojanie_izvewenij> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sostojanie_izvewenij model instance should use the {@link sostojanie_izvewenij} interface instead.
	 */

	/**
	 * Returns the primary key of this sostojanie_izvewenij.
	 *
	 * @return the primary key of this sostojanie_izvewenij
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sostojanie_izvewenij.
	 *
	 * @param primaryKey the primary key of this sostojanie_izvewenij
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sostojanie of this sostojanie_izvewenij.
	 *
	 * @return the sostojanie of this sostojanie_izvewenij
	 */
	@AutoEscape
	public String getSostojanie();

	/**
	 * Sets the sostojanie of this sostojanie_izvewenij.
	 *
	 * @param sostojanie the sostojanie of this sostojanie_izvewenij
	 */
	public void setSostojanie(String sostojanie);

	/**
	 * Returns the sostojanie_izvewenij_id of this sostojanie_izvewenij.
	 *
	 * @return the sostojanie_izvewenij_id of this sostojanie_izvewenij
	 */
	public long getSostojanie_izvewenij_id();

	/**
	 * Sets the sostojanie_izvewenij_id of this sostojanie_izvewenij.
	 *
	 * @param sostojanie_izvewenij_id the sostojanie_izvewenij_id of this sostojanie_izvewenij
	 */
	public void setSostojanie_izvewenij_id(long sostojanie_izvewenij_id);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		tj.sostojanie.izvewenij.model.sostojanie_izvewenij sostojanie_izvewenij);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.sostojanie.izvewenij.model.sostojanie_izvewenij> toCacheModel();

	@Override
	public tj.sostojanie.izvewenij.model.sostojanie_izvewenij toEscapedModel();

	@Override
	public tj.sostojanie.izvewenij.model.sostojanie_izvewenij toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}