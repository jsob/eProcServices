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

package tj.godovoj.plan.zakupok.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the godovoj_plan_zakupok service. Represents a row in the &quot;sapp.godovoj_plan_zakupok&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.godovoj.plan.zakupok.model.impl.godovoj_plan_zakupokModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.godovoj.plan.zakupok.model.impl.godovoj_plan_zakupokImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see godovoj_plan_zakupok
 * @see tj.godovoj.plan.zakupok.model.impl.godovoj_plan_zakupokImpl
 * @see tj.godovoj.plan.zakupok.model.impl.godovoj_plan_zakupokModelImpl
 * @generated
 */
@ProviderType
public interface godovoj_plan_zakupokModel extends BaseModel<godovoj_plan_zakupok> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a godovoj_plan_zakupok model instance should use the {@link godovoj_plan_zakupok} interface instead.
	 */

	/**
	 * Returns the primary key of this godovoj_plan_zakupok.
	 *
	 * @return the primary key of this godovoj_plan_zakupok
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this godovoj_plan_zakupok.
	 *
	 * @param primaryKey the primary key of this godovoj_plan_zakupok
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the data_sozdanija of this godovoj_plan_zakupok.
	 *
	 * @return the data_sozdanija of this godovoj_plan_zakupok
	 */
	public Date getData_sozdanija();

	/**
	 * Sets the data_sozdanija of this godovoj_plan_zakupok.
	 *
	 * @param data_sozdanija the data_sozdanija of this godovoj_plan_zakupok
	 */
	public void setData_sozdanija(Date data_sozdanija);

	/**
	 * Returns the godovoj_plan_zakupok_id of this godovoj_plan_zakupok.
	 *
	 * @return the godovoj_plan_zakupok_id of this godovoj_plan_zakupok
	 */
	public long getGodovoj_plan_zakupok_id();

	/**
	 * Sets the godovoj_plan_zakupok_id of this godovoj_plan_zakupok.
	 *
	 * @param godovoj_plan_zakupok_id the godovoj_plan_zakupok_id of this godovoj_plan_zakupok
	 */
	public void setGodovoj_plan_zakupok_id(long godovoj_plan_zakupok_id);

	/**
	 * Returns the istochnik_finansirovanija_id of this godovoj_plan_zakupok.
	 *
	 * @return the istochnik_finansirovanija_id of this godovoj_plan_zakupok
	 */
	public long getIstochnik_finansirovanija_id();

	/**
	 * Sets the istochnik_finansirovanija_id of this godovoj_plan_zakupok.
	 *
	 * @param istochnik_finansirovanija_id the istochnik_finansirovanija_id of this godovoj_plan_zakupok
	 */
	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id);

	/**
	 * Returns the naimenovanie_predmeta_zakupki of this godovoj_plan_zakupok.
	 *
	 * @return the naimenovanie_predmeta_zakupki of this godovoj_plan_zakupok
	 */
	@AutoEscape
	public String getNaimenovanie_predmeta_zakupki();

	/**
	 * Sets the naimenovanie_predmeta_zakupki of this godovoj_plan_zakupok.
	 *
	 * @param naimenovanie_predmeta_zakupki the naimenovanie_predmeta_zakupki of this godovoj_plan_zakupok
	 */
	public void setNaimenovanie_predmeta_zakupki(
		String naimenovanie_predmeta_zakupki);

	/**
	 * Returns the planiruemyj_metod_zakupki_id of this godovoj_plan_zakupok.
	 *
	 * @return the planiruemyj_metod_zakupki_id of this godovoj_plan_zakupok
	 */
	public long getPlaniruemyj_metod_zakupki_id();

	/**
	 * Sets the planiruemyj_metod_zakupki_id of this godovoj_plan_zakupok.
	 *
	 * @param planiruemyj_metod_zakupki_id the planiruemyj_metod_zakupki_id of this godovoj_plan_zakupok
	 */
	public void setPlaniruemyj_metod_zakupki_id(
		long planiruemyj_metod_zakupki_id);

	/**
	 * Returns the predpolagaemaja_summa of this godovoj_plan_zakupok.
	 *
	 * @return the predpolagaemaja_summa of this godovoj_plan_zakupok
	 */
	public double getPredpolagaemaja_summa();

	/**
	 * Sets the predpolagaemaja_summa of this godovoj_plan_zakupok.
	 *
	 * @param predpolagaemaja_summa the predpolagaemaja_summa of this godovoj_plan_zakupok
	 */
	public void setPredpolagaemaja_summa(double predpolagaemaja_summa);

	/**
	 * Returns the sozdal of this godovoj_plan_zakupok.
	 *
	 * @return the sozdal of this godovoj_plan_zakupok
	 */
	public long getSozdal();

	/**
	 * Sets the sozdal of this godovoj_plan_zakupok.
	 *
	 * @param sozdal the sozdal of this godovoj_plan_zakupok
	 */
	public void setSozdal(long sozdal);

	/**
	 * Returns the sroki_provedenija_zakupki of this godovoj_plan_zakupok.
	 *
	 * @return the sroki_provedenija_zakupki of this godovoj_plan_zakupok
	 */
	@AutoEscape
	public String getSroki_provedenija_zakupki();

	/**
	 * Sets the sroki_provedenija_zakupki of this godovoj_plan_zakupok.
	 *
	 * @param sroki_provedenija_zakupki the sroki_provedenija_zakupki of this godovoj_plan_zakupok
	 */
	public void setSroki_provedenija_zakupki(String sroki_provedenija_zakupki);

	/**
	 * Returns the summa_finansirovanija of this godovoj_plan_zakupok.
	 *
	 * @return the summa_finansirovanija of this godovoj_plan_zakupok
	 */
	public double getSumma_finansirovanija();

	/**
	 * Sets the summa_finansirovanija of this godovoj_plan_zakupok.
	 *
	 * @param summa_finansirovanija the summa_finansirovanija of this godovoj_plan_zakupok
	 */
	public void setSumma_finansirovanija(double summa_finansirovanija);

	/**
	 * Returns the vbk_id of this godovoj_plan_zakupok.
	 *
	 * @return the vbk_id of this godovoj_plan_zakupok
	 */
	public long getVbk_id();

	/**
	 * Sets the vbk_id of this godovoj_plan_zakupok.
	 *
	 * @param vbk_id the vbk_id of this godovoj_plan_zakupok
	 */
	public void setVbk_id(long vbk_id);

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
		tj.godovoj.plan.zakupok.model.godovoj_plan_zakupok godovoj_plan_zakupok);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.godovoj.plan.zakupok.model.godovoj_plan_zakupok> toCacheModel();

	@Override
	public tj.godovoj.plan.zakupok.model.godovoj_plan_zakupok toEscapedModel();

	@Override
	public tj.godovoj.plan.zakupok.model.godovoj_plan_zakupok toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}