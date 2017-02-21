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

package tj.istorija.popolnenij.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the istorija_popolnenij service. Represents a row in the &quot;sapp.istorija_popolnenij&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.istorija.popolnenij.model.impl.istorija_popolnenijModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.istorija.popolnenij.model.impl.istorija_popolnenijImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istorija_popolnenij
 * @see tj.istorija.popolnenij.model.impl.istorija_popolnenijImpl
 * @see tj.istorija.popolnenij.model.impl.istorija_popolnenijModelImpl
 * @generated
 */
@ProviderType
public interface istorija_popolnenijModel extends BaseModel<istorija_popolnenij> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a istorija_popolnenij model instance should use the {@link istorija_popolnenij} interface instead.
	 */

	/**
	 * Returns the primary key of this istorija_popolnenij.
	 *
	 * @return the primary key of this istorija_popolnenij
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this istorija_popolnenij.
	 *
	 * @param primaryKey the primary key of this istorija_popolnenij
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the data_zachislenija of this istorija_popolnenij.
	 *
	 * @return the data_zachislenija of this istorija_popolnenij
	 */
	public Date getData_zachislenija();

	/**
	 * Sets the data_zachislenija of this istorija_popolnenij.
	 *
	 * @param data_zachislenija the data_zachislenija of this istorija_popolnenij
	 */
	public void setData_zachislenija(Date data_zachislenija);

	/**
	 * Returns the istorija_popolnenij_id of this istorija_popolnenij.
	 *
	 * @return the istorija_popolnenij_id of this istorija_popolnenij
	 */
	public long getIstorija_popolnenij_id();

	/**
	 * Sets the istorija_popolnenij_id of this istorija_popolnenij.
	 *
	 * @param istorija_popolnenij_id the istorija_popolnenij_id of this istorija_popolnenij
	 */
	public void setIstorija_popolnenij_id(long istorija_popolnenij_id);

	/**
	 * Returns the nomer of this istorija_popolnenij.
	 *
	 * @return the nomer of this istorija_popolnenij
	 */
	@AutoEscape
	public String getNomer();

	/**
	 * Sets the nomer of this istorija_popolnenij.
	 *
	 * @param nomer the nomer of this istorija_popolnenij
	 */
	public void setNomer(String nomer);

	/**
	 * Returns the postavwik_id of this istorija_popolnenij.
	 *
	 * @return the postavwik_id of this istorija_popolnenij
	 */
	public long getPostavwik_id();

	/**
	 * Sets the postavwik_id of this istorija_popolnenij.
	 *
	 * @param postavwik_id the postavwik_id of this istorija_popolnenij
	 */
	public void setPostavwik_id(long postavwik_id);

	/**
	 * Returns the put of this istorija_popolnenij.
	 *
	 * @return the put of this istorija_popolnenij
	 */
	@AutoEscape
	public String getPut();

	/**
	 * Sets the put of this istorija_popolnenij.
	 *
	 * @param put the put of this istorija_popolnenij
	 */
	public void setPut(String put);

	/**
	 * Returns the summa of this istorija_popolnenij.
	 *
	 * @return the summa of this istorija_popolnenij
	 */
	public double getSumma();

	/**
	 * Sets the summa of this istorija_popolnenij.
	 *
	 * @param summa the summa of this istorija_popolnenij
	 */
	public void setSumma(double summa);

	/**
	 * Returns the tip of this istorija_popolnenij.
	 *
	 * @return the tip of this istorija_popolnenij
	 */
	@AutoEscape
	public String getTip();

	/**
	 * Sets the tip of this istorija_popolnenij.
	 *
	 * @param tip the tip of this istorija_popolnenij
	 */
	public void setTip(String tip);

	/**
	 * Returns the tranzakcija of this istorija_popolnenij.
	 *
	 * @return the tranzakcija of this istorija_popolnenij
	 */
	@AutoEscape
	public String getTranzakcija();

	/**
	 * Sets the tranzakcija of this istorija_popolnenij.
	 *
	 * @param tranzakcija the tranzakcija of this istorija_popolnenij
	 */
	public void setTranzakcija(String tranzakcija);

	/**
	 * Returns the zachislil of this istorija_popolnenij.
	 *
	 * @return the zachislil of this istorija_popolnenij
	 */
	public long getZachislil();

	/**
	 * Sets the zachislil of this istorija_popolnenij.
	 *
	 * @param zachislil the zachislil of this istorija_popolnenij
	 */
	public void setZachislil(long zachislil);

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
		tj.istorija.popolnenij.model.istorija_popolnenij istorija_popolnenij);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.istorija.popolnenij.model.istorija_popolnenij> toCacheModel();

	@Override
	public tj.istorija.popolnenij.model.istorija_popolnenij toEscapedModel();

	@Override
	public tj.istorija.popolnenij.model.istorija_popolnenij toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}