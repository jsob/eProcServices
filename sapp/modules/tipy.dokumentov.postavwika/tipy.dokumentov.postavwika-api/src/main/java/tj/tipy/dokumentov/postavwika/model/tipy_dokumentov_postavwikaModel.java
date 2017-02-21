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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the tipy_dokumentov_postavwika service. Represents a row in the &quot;sapp.tipy_dokumentov_postavwika&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_dokumentov_postavwika
 * @see tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaImpl
 * @see tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaModelImpl
 * @generated
 */
@ProviderType
public interface tipy_dokumentov_postavwikaModel extends BaseModel<tipy_dokumentov_postavwika> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tipy_dokumentov_postavwika model instance should use the {@link tipy_dokumentov_postavwika} interface instead.
	 */

	/**
	 * Returns the primary key of this tipy_dokumentov_postavwika.
	 *
	 * @return the primary key of this tipy_dokumentov_postavwika
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tipy_dokumentov_postavwika.
	 *
	 * @param primaryKey the primary key of this tipy_dokumentov_postavwika
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tip of this tipy_dokumentov_postavwika.
	 *
	 * @return the tip of this tipy_dokumentov_postavwika
	 */
	@AutoEscape
	public String getTip();

	/**
	 * Sets the tip of this tipy_dokumentov_postavwika.
	 *
	 * @param tip the tip of this tipy_dokumentov_postavwika
	 */
	public void setTip(String tip);

	/**
	 * Returns the tipy_dokumentov_postavwika_id of this tipy_dokumentov_postavwika.
	 *
	 * @return the tipy_dokumentov_postavwika_id of this tipy_dokumentov_postavwika
	 */
	public long getTipy_dokumentov_postavwika_id();

	/**
	 * Sets the tipy_dokumentov_postavwika_id of this tipy_dokumentov_postavwika.
	 *
	 * @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id of this tipy_dokumentov_postavwika
	 */
	public void setTipy_dokumentov_postavwika_id(
		long tipy_dokumentov_postavwika_id);

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
		tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika tipy_dokumentov_postavwika);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika> toCacheModel();

	@Override
	public tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika toEscapedModel();

	@Override
	public tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}