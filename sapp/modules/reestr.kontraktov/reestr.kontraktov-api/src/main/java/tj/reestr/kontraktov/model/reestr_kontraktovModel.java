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

package tj.reestr.kontraktov.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the reestr_kontraktov service. Represents a row in the &quot;sapp.reestr_kontraktov&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.reestr.kontraktov.model.impl.reestr_kontraktovModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.reestr.kontraktov.model.impl.reestr_kontraktovImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see reestr_kontraktov
 * @see tj.reestr.kontraktov.model.impl.reestr_kontraktovImpl
 * @see tj.reestr.kontraktov.model.impl.reestr_kontraktovModelImpl
 * @generated
 */
@ProviderType
public interface reestr_kontraktovModel extends BaseModel<reestr_kontraktov> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a reestr_kontraktov model instance should use the {@link reestr_kontraktov} interface instead.
	 */

	/**
	 * Returns the primary key of this reestr_kontraktov.
	 *
	 * @return the primary key of this reestr_kontraktov
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this reestr_kontraktov.
	 *
	 * @param primaryKey the primary key of this reestr_kontraktov
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the data_kontrakta of this reestr_kontraktov.
	 *
	 * @return the data_kontrakta of this reestr_kontraktov
	 */
	public Date getData_kontrakta();

	/**
	 * Sets the data_kontrakta of this reestr_kontraktov.
	 *
	 * @param data_kontrakta the data_kontrakta of this reestr_kontraktov
	 */
	public void setData_kontrakta(Date data_kontrakta);

	/**
	 * Returns the data_sozdanija of this reestr_kontraktov.
	 *
	 * @return the data_sozdanija of this reestr_kontraktov
	 */
	public Date getData_sozdanija();

	/**
	 * Sets the data_sozdanija of this reestr_kontraktov.
	 *
	 * @param data_sozdanija the data_sozdanija of this reestr_kontraktov
	 */
	public void setData_sozdanija(Date data_sozdanija);

	/**
	 * Returns the izvewenie_id of this reestr_kontraktov.
	 *
	 * @return the izvewenie_id of this reestr_kontraktov
	 */
	public long getIzvewenie_id();

	/**
	 * Sets the izvewenie_id of this reestr_kontraktov.
	 *
	 * @param izvewenie_id the izvewenie_id of this reestr_kontraktov
	 */
	public void setIzvewenie_id(long izvewenie_id);

	/**
	 * Returns the lot_id of this reestr_kontraktov.
	 *
	 * @return the lot_id of this reestr_kontraktov
	 */
	public long getLot_id();

	/**
	 * Sets the lot_id of this reestr_kontraktov.
	 *
	 * @param lot_id the lot_id of this reestr_kontraktov
	 */
	public void setLot_id(long lot_id);

	/**
	 * Returns the postavwik_id of this reestr_kontraktov.
	 *
	 * @return the postavwik_id of this reestr_kontraktov
	 */
	public long getPostavwik_id();

	/**
	 * Sets the postavwik_id of this reestr_kontraktov.
	 *
	 * @param postavwik_id the postavwik_id of this reestr_kontraktov
	 */
	public void setPostavwik_id(long postavwik_id);

	/**
	 * Returns the reestr_kontraktov_id of this reestr_kontraktov.
	 *
	 * @return the reestr_kontraktov_id of this reestr_kontraktov
	 */
	@AutoEscape
	public String getReestr_kontraktov_id();

	/**
	 * Sets the reestr_kontraktov_id of this reestr_kontraktov.
	 *
	 * @param reestr_kontraktov_id the reestr_kontraktov_id of this reestr_kontraktov
	 */
	public void setReestr_kontraktov_id(String reestr_kontraktov_id);

	/**
	 * Returns the sozdal of this reestr_kontraktov.
	 *
	 * @return the sozdal of this reestr_kontraktov
	 */
	public long getSozdal();

	/**
	 * Sets the sozdal of this reestr_kontraktov.
	 *
	 * @param sozdal the sozdal of this reestr_kontraktov
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
	public int compareTo(
		tj.reestr.kontraktov.model.reestr_kontraktov reestr_kontraktov);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.reestr.kontraktov.model.reestr_kontraktov> toCacheModel();

	@Override
	public tj.reestr.kontraktov.model.reestr_kontraktov toEscapedModel();

	@Override
	public tj.reestr.kontraktov.model.reestr_kontraktov toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}