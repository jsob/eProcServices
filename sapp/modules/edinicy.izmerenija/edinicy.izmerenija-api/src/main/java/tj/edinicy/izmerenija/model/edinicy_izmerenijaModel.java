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

package tj.edinicy.izmerenija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the edinicy_izmerenija service. Represents a row in the &quot;sapp.edinicy_izmerenija&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.edinicy.izmerenija.model.impl.edinicy_izmerenijaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.edinicy.izmerenija.model.impl.edinicy_izmerenijaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see edinicy_izmerenija
 * @see tj.edinicy.izmerenija.model.impl.edinicy_izmerenijaImpl
 * @see tj.edinicy.izmerenija.model.impl.edinicy_izmerenijaModelImpl
 * @generated
 */
@ProviderType
public interface edinicy_izmerenijaModel extends BaseModel<edinicy_izmerenija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a edinicy_izmerenija model instance should use the {@link edinicy_izmerenija} interface instead.
	 */

	/**
	 * Returns the primary key of this edinicy_izmerenija.
	 *
	 * @return the primary key of this edinicy_izmerenija
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this edinicy_izmerenija.
	 *
	 * @param primaryKey the primary key of this edinicy_izmerenija
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the edinicy_izmerenija_id of this edinicy_izmerenija.
	 *
	 * @return the edinicy_izmerenija_id of this edinicy_izmerenija
	 */
	public long getEdinicy_izmerenija_id();

	/**
	 * Sets the edinicy_izmerenija_id of this edinicy_izmerenija.
	 *
	 * @param edinicy_izmerenija_id the edinicy_izmerenija_id of this edinicy_izmerenija
	 */
	public void setEdinicy_izmerenija_id(long edinicy_izmerenija_id);

	/**
	 * Returns the nazvanie of this edinicy_izmerenija.
	 *
	 * @return the nazvanie of this edinicy_izmerenija
	 */
	@AutoEscape
	public String getNazvanie();

	/**
	 * Sets the nazvanie of this edinicy_izmerenija.
	 *
	 * @param nazvanie the nazvanie of this edinicy_izmerenija
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
		tj.edinicy.izmerenija.model.edinicy_izmerenija edinicy_izmerenija);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.edinicy.izmerenija.model.edinicy_izmerenija> toCacheModel();

	@Override
	public tj.edinicy.izmerenija.model.edinicy_izmerenija toEscapedModel();

	@Override
	public tj.edinicy.izmerenija.model.edinicy_izmerenija toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}