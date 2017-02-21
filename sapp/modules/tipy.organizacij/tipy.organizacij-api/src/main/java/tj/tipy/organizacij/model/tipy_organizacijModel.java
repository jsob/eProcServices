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

package tj.tipy.organizacij.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the tipy_organizacij service. Represents a row in the &quot;sapp.tipy_organizacij&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.tipy.organizacij.model.impl.tipy_organizacijModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.tipy.organizacij.model.impl.tipy_organizacijImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_organizacij
 * @see tj.tipy.organizacij.model.impl.tipy_organizacijImpl
 * @see tj.tipy.organizacij.model.impl.tipy_organizacijModelImpl
 * @generated
 */
@ProviderType
public interface tipy_organizacijModel extends BaseModel<tipy_organizacij> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tipy_organizacij model instance should use the {@link tipy_organizacij} interface instead.
	 */

	/**
	 * Returns the primary key of this tipy_organizacij.
	 *
	 * @return the primary key of this tipy_organizacij
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tipy_organizacij.
	 *
	 * @param primaryKey the primary key of this tipy_organizacij
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tipy_organizacij_id of this tipy_organizacij.
	 *
	 * @return the tipy_organizacij_id of this tipy_organizacij
	 */
	public long getTipy_organizacij_id();

	/**
	 * Sets the tipy_organizacij_id of this tipy_organizacij.
	 *
	 * @param tipy_organizacij_id the tipy_organizacij_id of this tipy_organizacij
	 */
	public void setTipy_organizacij_id(long tipy_organizacij_id);

	/**
	 * Returns the nazvanie of this tipy_organizacij.
	 *
	 * @return the nazvanie of this tipy_organizacij
	 */
	@AutoEscape
	public String getNazvanie();

	/**
	 * Sets the nazvanie of this tipy_organizacij.
	 *
	 * @param nazvanie the nazvanie of this tipy_organizacij
	 */
	public void setNazvanie(String nazvanie);

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
		tj.tipy.organizacij.model.tipy_organizacij tipy_organizacij);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.tipy.organizacij.model.tipy_organizacij> toCacheModel();

	@Override
	public tj.tipy.organizacij.model.tipy_organizacij toEscapedModel();

	@Override
	public tj.tipy.organizacij.model.tipy_organizacij toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}