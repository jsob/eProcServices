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

package tj.podrazdelenija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the podrazdelenija service. Represents a row in the &quot;sapp.podrazdelenija&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.podrazdelenija.model.impl.podrazdelenijaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.podrazdelenija.model.impl.podrazdelenijaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see podrazdelenija
 * @see tj.podrazdelenija.model.impl.podrazdelenijaImpl
 * @see tj.podrazdelenija.model.impl.podrazdelenijaModelImpl
 * @generated
 */
@ProviderType
public interface podrazdelenijaModel extends BaseModel<podrazdelenija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a podrazdelenija model instance should use the {@link podrazdelenija} interface instead.
	 */

	/**
	 * Returns the primary key of this podrazdelenija.
	 *
	 * @return the primary key of this podrazdelenija
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this podrazdelenija.
	 *
	 * @param primaryKey the primary key of this podrazdelenija
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the data_izmenenija of this podrazdelenija.
	 *
	 * @return the data_izmenenija of this podrazdelenija
	 */
	public Date getData_izmenenija();

	/**
	 * Sets the data_izmenenija of this podrazdelenija.
	 *
	 * @param data_izmenenija the data_izmenenija of this podrazdelenija
	 */
	public void setData_izmenenija(Date data_izmenenija);

	/**
	 * Returns the data_sozdanija of this podrazdelenija.
	 *
	 * @return the data_sozdanija of this podrazdelenija
	 */
	public Date getData_sozdanija();

	/**
	 * Sets the data_sozdanija of this podrazdelenija.
	 *
	 * @param data_sozdanija the data_sozdanija of this podrazdelenija
	 */
	public void setData_sozdanija(Date data_sozdanija);

	/**
	 * Returns the izmenil of this podrazdelenija.
	 *
	 * @return the izmenil of this podrazdelenija
	 */
	public long getIzmenil();

	/**
	 * Sets the izmenil of this podrazdelenija.
	 *
	 * @param izmenil the izmenil of this podrazdelenija
	 */
	public void setIzmenil(long izmenil);

	/**
	 * Returns the organizacija_id of this podrazdelenija.
	 *
	 * @return the organizacija_id of this podrazdelenija
	 */
	public long getOrganizacija_id();

	/**
	 * Sets the organizacija_id of this podrazdelenija.
	 *
	 * @param organizacija_id the organizacija_id of this podrazdelenija
	 */
	public void setOrganizacija_id(long organizacija_id);

	/**
	 * Returns the podrazdelenie of this podrazdelenija.
	 *
	 * @return the podrazdelenie of this podrazdelenija
	 */
	@AutoEscape
	public String getPodrazdelenie();

	/**
	 * Sets the podrazdelenie of this podrazdelenija.
	 *
	 * @param podrazdelenie the podrazdelenie of this podrazdelenija
	 */
	public void setPodrazdelenie(String podrazdelenie);

	/**
	 * Returns the podrazdelenija_id of this podrazdelenija.
	 *
	 * @return the podrazdelenija_id of this podrazdelenija
	 */
	public long getPodrazdelenija_id();

	/**
	 * Sets the podrazdelenija_id of this podrazdelenija.
	 *
	 * @param podrazdelenija_id the podrazdelenija_id of this podrazdelenija
	 */
	public void setPodrazdelenija_id(long podrazdelenija_id);

	/**
	 * Returns the sozdal of this podrazdelenija.
	 *
	 * @return the sozdal of this podrazdelenija
	 */
	public long getSozdal();

	/**
	 * Sets the sozdal of this podrazdelenija.
	 *
	 * @param sozdal the sozdal of this podrazdelenija
	 */
	public void setSozdal(long sozdal);

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
	public int compareTo(tj.podrazdelenija.model.podrazdelenija podrazdelenija);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.podrazdelenija.model.podrazdelenija> toCacheModel();

	@Override
	public tj.podrazdelenija.model.podrazdelenija toEscapedModel();

	@Override
	public tj.podrazdelenija.model.podrazdelenija toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}