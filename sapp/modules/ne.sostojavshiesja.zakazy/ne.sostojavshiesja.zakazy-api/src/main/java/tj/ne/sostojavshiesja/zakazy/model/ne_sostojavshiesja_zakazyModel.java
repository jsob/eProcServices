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

package tj.ne.sostojavshiesja.zakazy.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ne_sostojavshiesja_zakazy service. Represents a row in the &quot;sapp.ne_sostojavshiesja_zakazy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ne_sostojavshiesja_zakazy
 * @see tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyImpl
 * @see tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyModelImpl
 * @generated
 */
@ProviderType
public interface ne_sostojavshiesja_zakazyModel extends BaseModel<ne_sostojavshiesja_zakazy> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ne_sostojavshiesja_zakazy model instance should use the {@link ne_sostojavshiesja_zakazy} interface instead.
	 */

	/**
	 * Returns the primary key of this ne_sostojavshiesja_zakazy.
	 *
	 * @return the primary key of this ne_sostojavshiesja_zakazy
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ne_sostojavshiesja_zakazy.
	 *
	 * @param primaryKey the primary key of this ne_sostojavshiesja_zakazy
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the data_sozdanija of this ne_sostojavshiesja_zakazy.
	 *
	 * @return the data_sozdanija of this ne_sostojavshiesja_zakazy
	 */
	public Date getData_sozdanija();

	/**
	 * Sets the data_sozdanija of this ne_sostojavshiesja_zakazy.
	 *
	 * @param data_sozdanija the data_sozdanija of this ne_sostojavshiesja_zakazy
	 */
	public void setData_sozdanija(Date data_sozdanija);

	/**
	 * Returns the izvewenie_id of this ne_sostojavshiesja_zakazy.
	 *
	 * @return the izvewenie_id of this ne_sostojavshiesja_zakazy
	 */
	public long getIzvewenie_id();

	/**
	 * Sets the izvewenie_id of this ne_sostojavshiesja_zakazy.
	 *
	 * @param izvewenie_id the izvewenie_id of this ne_sostojavshiesja_zakazy
	 */
	public void setIzvewenie_id(long izvewenie_id);

	/**
	 * Returns the ne_sostojavshiesja_zakazy_id of this ne_sostojavshiesja_zakazy.
	 *
	 * @return the ne_sostojavshiesja_zakazy_id of this ne_sostojavshiesja_zakazy
	 */
	public long getNe_sostojavshiesja_zakazy_id();

	/**
	 * Sets the ne_sostojavshiesja_zakazy_id of this ne_sostojavshiesja_zakazy.
	 *
	 * @param ne_sostojavshiesja_zakazy_id the ne_sostojavshiesja_zakazy_id of this ne_sostojavshiesja_zakazy
	 */
	public void setNe_sostojavshiesja_zakazy_id(
		long ne_sostojavshiesja_zakazy_id);

	/**
	 * Returns the prichina of this ne_sostojavshiesja_zakazy.
	 *
	 * @return the prichina of this ne_sostojavshiesja_zakazy
	 */
	@AutoEscape
	public String getPrichina();

	/**
	 * Sets the prichina of this ne_sostojavshiesja_zakazy.
	 *
	 * @param prichina the prichina of this ne_sostojavshiesja_zakazy
	 */
	public void setPrichina(String prichina);

	/**
	 * Returns the sozdal of this ne_sostojavshiesja_zakazy.
	 *
	 * @return the sozdal of this ne_sostojavshiesja_zakazy
	 */
	public long getSozdal();

	/**
	 * Sets the sozdal of this ne_sostojavshiesja_zakazy.
	 *
	 * @param sozdal the sozdal of this ne_sostojavshiesja_zakazy
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
		tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy> toCacheModel();

	@Override
	public tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy toEscapedModel();

	@Override
	public tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}