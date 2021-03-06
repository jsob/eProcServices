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

package tj.ocenka.uchastnikam.v.moment.vskrytija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ocenka_uchastnikam_v_moment_vskrytija service. Represents a row in the &quot;sapp.ocenka_uchastnikam_v_moment_vskrytija&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ocenka_uchastnikam_v_moment_vskrytija
 * @see tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaImpl
 * @see tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaModelImpl
 * @generated
 */
@ProviderType
public interface ocenka_uchastnikam_v_moment_vskrytijaModel extends BaseModel<ocenka_uchastnikam_v_moment_vskrytija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ocenka_uchastnikam_v_moment_vskrytija model instance should use the {@link ocenka_uchastnikam_v_moment_vskrytija} interface instead.
	 */

	/**
	 * Returns the primary key of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @return the primary key of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @param primaryKey the primary key of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the data_otkaza of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @return the data_otkaza of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public Date getData_otkaza();

	/**
	 * Sets the data_otkaza of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @param data_otkaza the data_otkaza of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public void setData_otkaza(Date data_otkaza);

	/**
	 * Returns the data_vskrytija of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @return the data_vskrytija of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public Date getData_vskrytija();

	/**
	 * Sets the data_vskrytija of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @param data_vskrytija the data_vskrytija of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public void setData_vskrytija(Date data_vskrytija);

	/**
	 * Returns the izvewenie_id of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @return the izvewenie_id of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public long getIzvewenie_id();

	/**
	 * Sets the izvewenie_id of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @param izvewenie_id the izvewenie_id of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public void setIzvewenie_id(long izvewenie_id);

	/**
	 * Returns the lot_id of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @return the lot_id of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public long getLot_id();

	/**
	 * Sets the lot_id of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @param lot_id the lot_id of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public void setLot_id(long lot_id);

	/**
	 * Returns the ocenka_uchastnikam_v_moment_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @return the ocenka_uchastnikam_v_moment_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public long getOcenka_uchastnikam_v_moment_vskrytija_id();

	/**
	 * Sets the ocenka_uchastnikam_v_moment_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @param ocenka_uchastnikam_v_moment_vskrytija_id the ocenka_uchastnikam_v_moment_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public void setOcenka_uchastnikam_v_moment_vskrytija_id(
		long ocenka_uchastnikam_v_moment_vskrytija_id);

	/**
	 * Returns the otkazal of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @return the otkazal of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public long getOtkazal();

	/**
	 * Sets the otkazal of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @param otkazal the otkazal of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public void setOtkazal(long otkazal);

	/**
	 * Returns the postavwik_id of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @return the postavwik_id of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public long getPostavwik_id();

	/**
	 * Sets the postavwik_id of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @param postavwik_id the postavwik_id of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public void setPostavwik_id(long postavwik_id);

	/**
	 * Returns the prichina_otkaza of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @return the prichina_otkaza of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	@AutoEscape
	public String getPrichina_otkaza();

	/**
	 * Sets the prichina_otkaza of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @param prichina_otkaza the prichina_otkaza of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public void setPrichina_otkaza(String prichina_otkaza);

	/**
	 * Returns the protokol_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @return the protokol_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public long getProtokol_vskrytija_id();

	/**
	 * Sets the protokol_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @param protokol_vskrytija_id the protokol_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public void setProtokol_vskrytija_id(long protokol_vskrytija_id);

	/**
	 * Returns the status of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @return the status of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public long getStatus();

	/**
	 * Sets the status of this ocenka_uchastnikam_v_moment_vskrytija.
	 *
	 * @param status the status of this ocenka_uchastnikam_v_moment_vskrytija
	 */
	public void setStatus(long status);

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
		tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija ocenka_uchastnikam_v_moment_vskrytija);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija> toCacheModel();

	@Override
	public tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija toEscapedModel();

	@Override
	public tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}