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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link godovoj_plan_zakupok}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see godovoj_plan_zakupok
 * @generated
 */
@ProviderType
public class godovoj_plan_zakupokWrapper implements godovoj_plan_zakupok,
	ModelWrapper<godovoj_plan_zakupok> {
	public godovoj_plan_zakupokWrapper(
		godovoj_plan_zakupok godovoj_plan_zakupok) {
		_godovoj_plan_zakupok = godovoj_plan_zakupok;
	}

	@Override
	public Class<?> getModelClass() {
		return godovoj_plan_zakupok.class;
	}

	@Override
	public String getModelClassName() {
		return godovoj_plan_zakupok.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("godovoj_plan_zakupok_id", getGodovoj_plan_zakupok_id());
		attributes.put("istochnik_finansirovanija_id",
			getIstochnik_finansirovanija_id());
		attributes.put("naimenovanie_predmeta_zakupki",
			getNaimenovanie_predmeta_zakupki());
		attributes.put("planiruemyj_metod_zakupki_id",
			getPlaniruemyj_metod_zakupki_id());
		attributes.put("predpolagaemaja_summa", getPredpolagaemaja_summa());
		attributes.put("sozdal", getSozdal());
		attributes.put("sroki_provedenija_zakupki",
			getSroki_provedenija_zakupki());
		attributes.put("summa_finansirovanija", getSumma_finansirovanija());
		attributes.put("vbk_id", getVbk_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Long godovoj_plan_zakupok_id = (Long)attributes.get(
				"godovoj_plan_zakupok_id");

		if (godovoj_plan_zakupok_id != null) {
			setGodovoj_plan_zakupok_id(godovoj_plan_zakupok_id);
		}

		Long istochnik_finansirovanija_id = (Long)attributes.get(
				"istochnik_finansirovanija_id");

		if (istochnik_finansirovanija_id != null) {
			setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
		}

		String naimenovanie_predmeta_zakupki = (String)attributes.get(
				"naimenovanie_predmeta_zakupki");

		if (naimenovanie_predmeta_zakupki != null) {
			setNaimenovanie_predmeta_zakupki(naimenovanie_predmeta_zakupki);
		}

		Long planiruemyj_metod_zakupki_id = (Long)attributes.get(
				"planiruemyj_metod_zakupki_id");

		if (planiruemyj_metod_zakupki_id != null) {
			setPlaniruemyj_metod_zakupki_id(planiruemyj_metod_zakupki_id);
		}

		Double predpolagaemaja_summa = (Double)attributes.get(
				"predpolagaemaja_summa");

		if (predpolagaemaja_summa != null) {
			setPredpolagaemaja_summa(predpolagaemaja_summa);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		String sroki_provedenija_zakupki = (String)attributes.get(
				"sroki_provedenija_zakupki");

		if (sroki_provedenija_zakupki != null) {
			setSroki_provedenija_zakupki(sroki_provedenija_zakupki);
		}

		Double summa_finansirovanija = (Double)attributes.get(
				"summa_finansirovanija");

		if (summa_finansirovanija != null) {
			setSumma_finansirovanija(summa_finansirovanija);
		}

		Long vbk_id = (Long)attributes.get("vbk_id");

		if (vbk_id != null) {
			setVbk_id(vbk_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _godovoj_plan_zakupok.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _godovoj_plan_zakupok.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _godovoj_plan_zakupok.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _godovoj_plan_zakupok.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.godovoj.plan.zakupok.model.godovoj_plan_zakupok> toCacheModel() {
		return _godovoj_plan_zakupok.toCacheModel();
	}

	/**
	* Returns the predpolagaemaja_summa of this godovoj_plan_zakupok.
	*
	* @return the predpolagaemaja_summa of this godovoj_plan_zakupok
	*/
	@Override
	public double getPredpolagaemaja_summa() {
		return _godovoj_plan_zakupok.getPredpolagaemaja_summa();
	}

	/**
	* Returns the summa_finansirovanija of this godovoj_plan_zakupok.
	*
	* @return the summa_finansirovanija of this godovoj_plan_zakupok
	*/
	@Override
	public double getSumma_finansirovanija() {
		return _godovoj_plan_zakupok.getSumma_finansirovanija();
	}

	@Override
	public int compareTo(
		tj.godovoj.plan.zakupok.model.godovoj_plan_zakupok godovoj_plan_zakupok) {
		return _godovoj_plan_zakupok.compareTo(godovoj_plan_zakupok);
	}

	@Override
	public int hashCode() {
		return _godovoj_plan_zakupok.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _godovoj_plan_zakupok.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new godovoj_plan_zakupokWrapper((godovoj_plan_zakupok)_godovoj_plan_zakupok.clone());
	}

	/**
	* Returns the naimenovanie_predmeta_zakupki of this godovoj_plan_zakupok.
	*
	* @return the naimenovanie_predmeta_zakupki of this godovoj_plan_zakupok
	*/
	@Override
	public java.lang.String getNaimenovanie_predmeta_zakupki() {
		return _godovoj_plan_zakupok.getNaimenovanie_predmeta_zakupki();
	}

	/**
	* Returns the sroki_provedenija_zakupki of this godovoj_plan_zakupok.
	*
	* @return the sroki_provedenija_zakupki of this godovoj_plan_zakupok
	*/
	@Override
	public java.lang.String getSroki_provedenija_zakupki() {
		return _godovoj_plan_zakupok.getSroki_provedenija_zakupki();
	}

	@Override
	public java.lang.String toString() {
		return _godovoj_plan_zakupok.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _godovoj_plan_zakupok.toXmlString();
	}

	/**
	* Returns the data_sozdanija of this godovoj_plan_zakupok.
	*
	* @return the data_sozdanija of this godovoj_plan_zakupok
	*/
	@Override
	public Date getData_sozdanija() {
		return _godovoj_plan_zakupok.getData_sozdanija();
	}

	/**
	* Returns the godovoj_plan_zakupok_id of this godovoj_plan_zakupok.
	*
	* @return the godovoj_plan_zakupok_id of this godovoj_plan_zakupok
	*/
	@Override
	public long getGodovoj_plan_zakupok_id() {
		return _godovoj_plan_zakupok.getGodovoj_plan_zakupok_id();
	}

	/**
	* Returns the istochnik_finansirovanija_id of this godovoj_plan_zakupok.
	*
	* @return the istochnik_finansirovanija_id of this godovoj_plan_zakupok
	*/
	@Override
	public long getIstochnik_finansirovanija_id() {
		return _godovoj_plan_zakupok.getIstochnik_finansirovanija_id();
	}

	/**
	* Returns the planiruemyj_metod_zakupki_id of this godovoj_plan_zakupok.
	*
	* @return the planiruemyj_metod_zakupki_id of this godovoj_plan_zakupok
	*/
	@Override
	public long getPlaniruemyj_metod_zakupki_id() {
		return _godovoj_plan_zakupok.getPlaniruemyj_metod_zakupki_id();
	}

	/**
	* Returns the primary key of this godovoj_plan_zakupok.
	*
	* @return the primary key of this godovoj_plan_zakupok
	*/
	@Override
	public long getPrimaryKey() {
		return _godovoj_plan_zakupok.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this godovoj_plan_zakupok.
	*
	* @return the sozdal of this godovoj_plan_zakupok
	*/
	@Override
	public long getSozdal() {
		return _godovoj_plan_zakupok.getSozdal();
	}

	/**
	* Returns the vbk_id of this godovoj_plan_zakupok.
	*
	* @return the vbk_id of this godovoj_plan_zakupok
	*/
	@Override
	public long getVbk_id() {
		return _godovoj_plan_zakupok.getVbk_id();
	}

	@Override
	public tj.godovoj.plan.zakupok.model.godovoj_plan_zakupok toEscapedModel() {
		return new godovoj_plan_zakupokWrapper(_godovoj_plan_zakupok.toEscapedModel());
	}

	@Override
	public tj.godovoj.plan.zakupok.model.godovoj_plan_zakupok toUnescapedModel() {
		return new godovoj_plan_zakupokWrapper(_godovoj_plan_zakupok.toUnescapedModel());
	}

	@Override
	public void persist() {
		_godovoj_plan_zakupok.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_godovoj_plan_zakupok.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_sozdanija of this godovoj_plan_zakupok.
	*
	* @param data_sozdanija the data_sozdanija of this godovoj_plan_zakupok
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_godovoj_plan_zakupok.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_godovoj_plan_zakupok.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_godovoj_plan_zakupok.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_godovoj_plan_zakupok.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the godovoj_plan_zakupok_id of this godovoj_plan_zakupok.
	*
	* @param godovoj_plan_zakupok_id the godovoj_plan_zakupok_id of this godovoj_plan_zakupok
	*/
	@Override
	public void setGodovoj_plan_zakupok_id(long godovoj_plan_zakupok_id) {
		_godovoj_plan_zakupok.setGodovoj_plan_zakupok_id(godovoj_plan_zakupok_id);
	}

	/**
	* Sets the istochnik_finansirovanija_id of this godovoj_plan_zakupok.
	*
	* @param istochnik_finansirovanija_id the istochnik_finansirovanija_id of this godovoj_plan_zakupok
	*/
	@Override
	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id) {
		_godovoj_plan_zakupok.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
	}

	/**
	* Sets the naimenovanie_predmeta_zakupki of this godovoj_plan_zakupok.
	*
	* @param naimenovanie_predmeta_zakupki the naimenovanie_predmeta_zakupki of this godovoj_plan_zakupok
	*/
	@Override
	public void setNaimenovanie_predmeta_zakupki(
		java.lang.String naimenovanie_predmeta_zakupki) {
		_godovoj_plan_zakupok.setNaimenovanie_predmeta_zakupki(naimenovanie_predmeta_zakupki);
	}

	@Override
	public void setNew(boolean n) {
		_godovoj_plan_zakupok.setNew(n);
	}

	/**
	* Sets the planiruemyj_metod_zakupki_id of this godovoj_plan_zakupok.
	*
	* @param planiruemyj_metod_zakupki_id the planiruemyj_metod_zakupki_id of this godovoj_plan_zakupok
	*/
	@Override
	public void setPlaniruemyj_metod_zakupki_id(
		long planiruemyj_metod_zakupki_id) {
		_godovoj_plan_zakupok.setPlaniruemyj_metod_zakupki_id(planiruemyj_metod_zakupki_id);
	}

	/**
	* Sets the predpolagaemaja_summa of this godovoj_plan_zakupok.
	*
	* @param predpolagaemaja_summa the predpolagaemaja_summa of this godovoj_plan_zakupok
	*/
	@Override
	public void setPredpolagaemaja_summa(double predpolagaemaja_summa) {
		_godovoj_plan_zakupok.setPredpolagaemaja_summa(predpolagaemaja_summa);
	}

	/**
	* Sets the primary key of this godovoj_plan_zakupok.
	*
	* @param primaryKey the primary key of this godovoj_plan_zakupok
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_godovoj_plan_zakupok.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_godovoj_plan_zakupok.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this godovoj_plan_zakupok.
	*
	* @param sozdal the sozdal of this godovoj_plan_zakupok
	*/
	@Override
	public void setSozdal(long sozdal) {
		_godovoj_plan_zakupok.setSozdal(sozdal);
	}

	/**
	* Sets the sroki_provedenija_zakupki of this godovoj_plan_zakupok.
	*
	* @param sroki_provedenija_zakupki the sroki_provedenija_zakupki of this godovoj_plan_zakupok
	*/
	@Override
	public void setSroki_provedenija_zakupki(
		java.lang.String sroki_provedenija_zakupki) {
		_godovoj_plan_zakupok.setSroki_provedenija_zakupki(sroki_provedenija_zakupki);
	}

	/**
	* Sets the summa_finansirovanija of this godovoj_plan_zakupok.
	*
	* @param summa_finansirovanija the summa_finansirovanija of this godovoj_plan_zakupok
	*/
	@Override
	public void setSumma_finansirovanija(double summa_finansirovanija) {
		_godovoj_plan_zakupok.setSumma_finansirovanija(summa_finansirovanija);
	}

	/**
	* Sets the vbk_id of this godovoj_plan_zakupok.
	*
	* @param vbk_id the vbk_id of this godovoj_plan_zakupok
	*/
	@Override
	public void setVbk_id(long vbk_id) {
		_godovoj_plan_zakupok.setVbk_id(vbk_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof godovoj_plan_zakupokWrapper)) {
			return false;
		}

		godovoj_plan_zakupokWrapper godovoj_plan_zakupokWrapper = (godovoj_plan_zakupokWrapper)obj;

		if (Objects.equals(_godovoj_plan_zakupok,
					godovoj_plan_zakupokWrapper._godovoj_plan_zakupok)) {
			return true;
		}

		return false;
	}

	@Override
	public godovoj_plan_zakupok getWrappedModel() {
		return _godovoj_plan_zakupok;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _godovoj_plan_zakupok.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _godovoj_plan_zakupok.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_godovoj_plan_zakupok.resetOriginalValues();
	}

	private final godovoj_plan_zakupok _godovoj_plan_zakupok;
}