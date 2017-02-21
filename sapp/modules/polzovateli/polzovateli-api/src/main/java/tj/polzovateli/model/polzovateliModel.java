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

package tj.polzovateli.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the polzovateli service. Represents a row in the &quot;sapp.polzovateli&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.polzovateli.model.impl.polzovateliModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.polzovateli.model.impl.polzovateliImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see polzovateli
 * @see tj.polzovateli.model.impl.polzovateliImpl
 * @see tj.polzovateli.model.impl.polzovateliModelImpl
 * @generated
 */
@ProviderType
public interface polzovateliModel extends BaseModel<polzovateli> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a polzovateli model instance should use the {@link polzovateli} interface instead.
	 */

	/**
	 * Returns the primary key of this polzovateli.
	 *
	 * @return the primary key of this polzovateli
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this polzovateli.
	 *
	 * @param primaryKey the primary key of this polzovateli
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the aktivnost of this polzovateli.
	 *
	 * @return the aktivnost of this polzovateli
	 */
	public long getAktivnost();

	/**
	 * Sets the aktivnost of this polzovateli.
	 *
	 * @param aktivnost the aktivnost of this polzovateli
	 */
	public void setAktivnost(long aktivnost);

	/**
	 * Returns the data_izmenenija of this polzovateli.
	 *
	 * @return the data_izmenenija of this polzovateli
	 */
	public Date getData_izmenenija();

	/**
	 * Sets the data_izmenenija of this polzovateli.
	 *
	 * @param data_izmenenija the data_izmenenija of this polzovateli
	 */
	public void setData_izmenenija(Date data_izmenenija);

	/**
	 * Returns the data_sozdanija of this polzovateli.
	 *
	 * @return the data_sozdanija of this polzovateli
	 */
	public Date getData_sozdanija();

	/**
	 * Sets the data_sozdanija of this polzovateli.
	 *
	 * @param data_sozdanija the data_sozdanija of this polzovateli
	 */
	public void setData_sozdanija(Date data_sozdanija);

	/**
	 * Returns the imja_polzovatelja of this polzovateli.
	 *
	 * @return the imja_polzovatelja of this polzovateli
	 */
	@AutoEscape
	public String getImja_polzovatelja();

	/**
	 * Sets the imja_polzovatelja of this polzovateli.
	 *
	 * @param imja_polzovatelja the imja_polzovatelja of this polzovateli
	 */
	public void setImja_polzovatelja(String imja_polzovatelja);

	/**
	 * Returns the izmenil of this polzovateli.
	 *
	 * @return the izmenil of this polzovateli
	 */
	public long getIzmenil();

	/**
	 * Sets the izmenil of this polzovateli.
	 *
	 * @param izmenil the izmenil of this polzovateli
	 */
	public void setIzmenil(long izmenil);

	/**
	 * Returns the organizacija_id of this polzovateli.
	 *
	 * @return the organizacija_id of this polzovateli
	 */
	public long getOrganizacija_id();

	/**
	 * Sets the organizacija_id of this polzovateli.
	 *
	 * @param organizacija_id the organizacija_id of this polzovateli
	 */
	public void setOrganizacija_id(long organizacija_id);

	/**
	 * Returns the parol of this polzovateli.
	 *
	 * @return the parol of this polzovateli
	 */
	@AutoEscape
	public String getParol();

	/**
	 * Sets the parol of this polzovateli.
	 *
	 * @param parol the parol of this polzovateli
	 */
	public void setParol(String parol);

	/**
	 * Returns the podrazdelenije_id of this polzovateli.
	 *
	 * @return the podrazdelenije_id of this polzovateli
	 */
	public long getPodrazdelenije_id();

	/**
	 * Sets the podrazdelenije_id of this polzovateli.
	 *
	 * @param podrazdelenije_id the podrazdelenije_id of this polzovateli
	 */
	public void setPodrazdelenije_id(long podrazdelenije_id);

	/**
	 * Returns the polzovateli_id of this polzovateli.
	 *
	 * @return the polzovateli_id of this polzovateli
	 */
	public long getPolzovateli_id();

	/**
	 * Sets the polzovateli_id of this polzovateli.
	 *
	 * @param polzovateli_id the polzovateli_id of this polzovateli
	 */
	public void setPolzovateli_id(long polzovateli_id);

	/**
	 * Returns the rol_id of this polzovateli.
	 *
	 * @return the rol_id of this polzovateli
	 */
	public long getRol_id();

	/**
	 * Sets the rol_id of this polzovateli.
	 *
	 * @param rol_id the rol_id of this polzovateli
	 */
	public void setRol_id(long rol_id);

	/**
	 * Returns the sozdal of this polzovateli.
	 *
	 * @return the sozdal of this polzovateli
	 */
	public long getSozdal();

	/**
	 * Sets the sozdal of this polzovateli.
	 *
	 * @param sozdal the sozdal of this polzovateli
	 */
	public void setSozdal(long sozdal);

	/**
	 * Returns the tip_organizacii_id of this polzovateli.
	 *
	 * @return the tip_organizacii_id of this polzovateli
	 */
	public long getTip_organizacii_id();

	/**
	 * Sets the tip_organizacii_id of this polzovateli.
	 *
	 * @param tip_organizacii_id the tip_organizacii_id of this polzovateli
	 */
	public void setTip_organizacii_id(long tip_organizacii_id);

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
	public int compareTo(tj.polzovateli.model.polzovateli polzovateli);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.polzovateli.model.polzovateli> toCacheModel();

	@Override
	public tj.polzovateli.model.polzovateli toEscapedModel();

	@Override
	public tj.polzovateli.model.polzovateli toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}