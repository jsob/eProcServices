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

package tj.obwaja.informacija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the obwaja_informacija service. Represents a row in the &quot;sapp.obwaja_informacija&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.obwaja.informacija.model.impl.obwaja_informacijaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.obwaja.informacija.model.impl.obwaja_informacijaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see obwaja_informacija
 * @see tj.obwaja.informacija.model.impl.obwaja_informacijaImpl
 * @see tj.obwaja.informacija.model.impl.obwaja_informacijaModelImpl
 * @generated
 */
@ProviderType
public interface obwaja_informacijaModel extends BaseModel<obwaja_informacija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a obwaja_informacija model instance should use the {@link obwaja_informacija} interface instead.
	 */

	/**
	 * Returns the primary key of this obwaja_informacija.
	 *
	 * @return the primary key of this obwaja_informacija
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this obwaja_informacija.
	 *
	 * @param primaryKey the primary key of this obwaja_informacija
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the data_izmenenija of this obwaja_informacija.
	 *
	 * @return the data_izmenenija of this obwaja_informacija
	 */
	public Date getData_izmenenija();

	/**
	 * Sets the data_izmenenija of this obwaja_informacija.
	 *
	 * @param data_izmenenija the data_izmenenija of this obwaja_informacija
	 */
	public void setData_izmenenija(Date data_izmenenija);

	/**
	 * Returns the data_sozdanija of this obwaja_informacija.
	 *
	 * @return the data_sozdanija of this obwaja_informacija
	 */
	public Date getData_sozdanija();

	/**
	 * Sets the data_sozdanija of this obwaja_informacija.
	 *
	 * @param data_sozdanija the data_sozdanija of this obwaja_informacija
	 */
	public void setData_sozdanija(Date data_sozdanija);

	/**
	 * Returns the izmenil of this obwaja_informacija.
	 *
	 * @return the izmenil of this obwaja_informacija
	 */
	public long getIzmenil();

	/**
	 * Sets the izmenil of this obwaja_informacija.
	 *
	 * @param izmenil the izmenil of this obwaja_informacija
	 */
	public void setIzmenil(long izmenil);

	/**
	 * Returns the izvewenie_id of this obwaja_informacija.
	 *
	 * @return the izvewenie_id of this obwaja_informacija
	 */
	public long getIzvewenie_id();

	/**
	 * Sets the izvewenie_id of this obwaja_informacija.
	 *
	 * @param izvewenie_id the izvewenie_id of this obwaja_informacija
	 */
	public void setIzvewenie_id(long izvewenie_id);

	/**
	 * Returns the je_pochta of this obwaja_informacija.
	 *
	 * @return the je_pochta of this obwaja_informacija
	 */
	@AutoEscape
	public String getJe_pochta();

	/**
	 * Sets the je_pochta of this obwaja_informacija.
	 *
	 * @param je_pochta the je_pochta of this obwaja_informacija
	 */
	public void setJe_pochta(String je_pochta);

	/**
	 * Returns the kontaktnoe_lico of this obwaja_informacija.
	 *
	 * @return the kontaktnoe_lico of this obwaja_informacija
	 */
	@AutoEscape
	public String getKontaktnoe_lico();

	/**
	 * Sets the kontaktnoe_lico of this obwaja_informacija.
	 *
	 * @param kontaktnoe_lico the kontaktnoe_lico of this obwaja_informacija
	 */
	public void setKontaktnoe_lico(String kontaktnoe_lico);

	/**
	 * Returns the kontaktnyj_telefon of this obwaja_informacija.
	 *
	 * @return the kontaktnyj_telefon of this obwaja_informacija
	 */
	@AutoEscape
	public String getKontaktnyj_telefon();

	/**
	 * Sets the kontaktnyj_telefon of this obwaja_informacija.
	 *
	 * @param kontaktnyj_telefon the kontaktnyj_telefon of this obwaja_informacija
	 */
	public void setKontaktnyj_telefon(String kontaktnyj_telefon);

	/**
	 * Returns the obwaja_informacija_id of this obwaja_informacija.
	 *
	 * @return the obwaja_informacija_id of this obwaja_informacija
	 */
	public long getObwaja_informacija_id();

	/**
	 * Sets the obwaja_informacija_id of this obwaja_informacija.
	 *
	 * @param obwaja_informacija_id the obwaja_informacija_id of this obwaja_informacija
	 */
	public void setObwaja_informacija_id(long obwaja_informacija_id);

	/**
	 * Returns the sozdal of this obwaja_informacija.
	 *
	 * @return the sozdal of this obwaja_informacija
	 */
	public long getSozdal();

	/**
	 * Sets the sozdal of this obwaja_informacija.
	 *
	 * @param sozdal the sozdal of this obwaja_informacija
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
		tj.obwaja.informacija.model.obwaja_informacija obwaja_informacija);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.obwaja.informacija.model.obwaja_informacija> toCacheModel();

	@Override
	public tj.obwaja.informacija.model.obwaja_informacija toEscapedModel();

	@Override
	public tj.obwaja.informacija.model.obwaja_informacija toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}