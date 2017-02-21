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

package tj.dokumenty.na.zajavku.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the dokumenty_na_zajavku service. Represents a row in the &quot;sapp.dokumenty_na_zajavku&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_na_zajavku
 * @see tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuImpl
 * @see tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuModelImpl
 * @generated
 */
@ProviderType
public interface dokumenty_na_zajavkuModel extends BaseModel<dokumenty_na_zajavku> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dokumenty_na_zajavku model instance should use the {@link dokumenty_na_zajavku} interface instead.
	 */

	/**
	 * Returns the primary key of this dokumenty_na_zajavku.
	 *
	 * @return the primary key of this dokumenty_na_zajavku
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dokumenty_na_zajavku.
	 *
	 * @param primaryKey the primary key of this dokumenty_na_zajavku
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dokumenty_na_zajavku_id of this dokumenty_na_zajavku.
	 *
	 * @return the dokumenty_na_zajavku_id of this dokumenty_na_zajavku
	 */
	public long getDokumenty_na_zajavku_id();

	/**
	 * Sets the dokumenty_na_zajavku_id of this dokumenty_na_zajavku.
	 *
	 * @param dokumenty_na_zajavku_id the dokumenty_na_zajavku_id of this dokumenty_na_zajavku
	 */
	public void setDokumenty_na_zajavku_id(long dokumenty_na_zajavku_id);

	/**
	 * Returns the data_zagruzki of this dokumenty_na_zajavku.
	 *
	 * @return the data_zagruzki of this dokumenty_na_zajavku
	 */
	public Date getData_zagruzki();

	/**
	 * Sets the data_zagruzki of this dokumenty_na_zajavku.
	 *
	 * @param data_zagruzki the data_zagruzki of this dokumenty_na_zajavku
	 */
	public void setData_zagruzki(Date data_zagruzki);

	/**
	 * Returns the imja_fajla of this dokumenty_na_zajavku.
	 *
	 * @return the imja_fajla of this dokumenty_na_zajavku
	 */
	@AutoEscape
	public String getImja_fajla();

	/**
	 * Sets the imja_fajla of this dokumenty_na_zajavku.
	 *
	 * @param imja_fajla the imja_fajla of this dokumenty_na_zajavku
	 */
	public void setImja_fajla(String imja_fajla);

	/**
	 * Returns the izvewenie_id of this dokumenty_na_zajavku.
	 *
	 * @return the izvewenie_id of this dokumenty_na_zajavku
	 */
	public long getIzvewenie_id();

	/**
	 * Sets the izvewenie_id of this dokumenty_na_zajavku.
	 *
	 * @param izvewenie_id the izvewenie_id of this dokumenty_na_zajavku
	 */
	public void setIzvewenie_id(long izvewenie_id);

	/**
	 * Returns the lot_id of this dokumenty_na_zajavku.
	 *
	 * @return the lot_id of this dokumenty_na_zajavku
	 */
	public long getLot_id();

	/**
	 * Sets the lot_id of this dokumenty_na_zajavku.
	 *
	 * @param lot_id the lot_id of this dokumenty_na_zajavku
	 */
	public void setLot_id(long lot_id);

	/**
	 * Returns the nazvanie_dokumenta of this dokumenty_na_zajavku.
	 *
	 * @return the nazvanie_dokumenta of this dokumenty_na_zajavku
	 */
	@AutoEscape
	public String getNazvanie_dokumenta();

	/**
	 * Sets the nazvanie_dokumenta of this dokumenty_na_zajavku.
	 *
	 * @param nazvanie_dokumenta the nazvanie_dokumenta of this dokumenty_na_zajavku
	 */
	public void setNazvanie_dokumenta(String nazvanie_dokumenta);

	/**
	 * Returns the postavwik_id of this dokumenty_na_zajavku.
	 *
	 * @return the postavwik_id of this dokumenty_na_zajavku
	 */
	public long getPostavwik_id();

	/**
	 * Sets the postavwik_id of this dokumenty_na_zajavku.
	 *
	 * @param postavwik_id the postavwik_id of this dokumenty_na_zajavku
	 */
	public void setPostavwik_id(long postavwik_id);

	/**
	 * Returns the zagruzil of this dokumenty_na_zajavku.
	 *
	 * @return the zagruzil of this dokumenty_na_zajavku
	 */
	public long getZagruzil();

	/**
	 * Sets the zagruzil of this dokumenty_na_zajavku.
	 *
	 * @param zagruzil the zagruzil of this dokumenty_na_zajavku
	 */
	public void setZagruzil(long zagruzil);

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
		tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku dokumenty_na_zajavku);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku> toCacheModel();

	@Override
	public tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku toEscapedModel();

	@Override
	public tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}