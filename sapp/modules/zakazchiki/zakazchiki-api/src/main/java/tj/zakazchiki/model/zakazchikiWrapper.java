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

package tj.zakazchiki.model;

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
 * This class is a wrapper for {@link zakazchiki}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see zakazchiki
 * @generated
 */
@ProviderType
public class zakazchikiWrapper implements zakazchiki, ModelWrapper<zakazchiki> {
	public zakazchikiWrapper(zakazchiki zakazchiki) {
		_zakazchiki = zakazchiki;
	}

	@Override
	public Class<?> getModelClass() {
		return zakazchiki.class;
	}

	@Override
	public String getModelClassName() {
		return zakazchiki.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("adres", getAdres());
		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("ein", getEin());
		attributes.put("fbk_id", getFbk_id());
		attributes.put("gorod", getGorod());
		attributes.put("inn", getInn());
		attributes.put("istochnik_finansirovanija_id",
			getIstochnik_finansirovanija_id());
		attributes.put("izmenil", getIzmenil());
		attributes.put("je_pochta", getJe_pochta());
		attributes.put("kontaktnyj_telefon", getKontaktnyj_telefon());
		attributes.put("kvalificirovannaja_organizacija",
			getKvalificirovannaja_organizacija());
		attributes.put("naimenovanie", getNaimenovanie());
		attributes.put("oblast_id", getOblast_id());
		attributes.put("otvetstvennoe_lico", getOtvetstvennoe_lico());
		attributes.put("rajon_id", getRajon_id());
		attributes.put("rukovoditel", getRukovoditel());
		attributes.put("sozdal", getSozdal());
		attributes.put("vbk_id", getVbk_id());
		attributes.put("zakazchiki_id", getZakazchiki_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String adres = (String)attributes.get("adres");

		if (adres != null) {
			setAdres(adres);
		}

		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		String ein = (String)attributes.get("ein");

		if (ein != null) {
			setEin(ein);
		}

		Long fbk_id = (Long)attributes.get("fbk_id");

		if (fbk_id != null) {
			setFbk_id(fbk_id);
		}

		String gorod = (String)attributes.get("gorod");

		if (gorod != null) {
			setGorod(gorod);
		}

		String inn = (String)attributes.get("inn");

		if (inn != null) {
			setInn(inn);
		}

		Long istochnik_finansirovanija_id = (Long)attributes.get(
				"istochnik_finansirovanija_id");

		if (istochnik_finansirovanija_id != null) {
			setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		String je_pochta = (String)attributes.get("je_pochta");

		if (je_pochta != null) {
			setJe_pochta(je_pochta);
		}

		String kontaktnyj_telefon = (String)attributes.get("kontaktnyj_telefon");

		if (kontaktnyj_telefon != null) {
			setKontaktnyj_telefon(kontaktnyj_telefon);
		}

		Long kvalificirovannaja_organizacija = (Long)attributes.get(
				"kvalificirovannaja_organizacija");

		if (kvalificirovannaja_organizacija != null) {
			setKvalificirovannaja_organizacija(kvalificirovannaja_organizacija);
		}

		String naimenovanie = (String)attributes.get("naimenovanie");

		if (naimenovanie != null) {
			setNaimenovanie(naimenovanie);
		}

		Long oblast_id = (Long)attributes.get("oblast_id");

		if (oblast_id != null) {
			setOblast_id(oblast_id);
		}

		String otvetstvennoe_lico = (String)attributes.get("otvetstvennoe_lico");

		if (otvetstvennoe_lico != null) {
			setOtvetstvennoe_lico(otvetstvennoe_lico);
		}

		Long rajon_id = (Long)attributes.get("rajon_id");

		if (rajon_id != null) {
			setRajon_id(rajon_id);
		}

		String rukovoditel = (String)attributes.get("rukovoditel");

		if (rukovoditel != null) {
			setRukovoditel(rukovoditel);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		Long vbk_id = (Long)attributes.get("vbk_id");

		if (vbk_id != null) {
			setVbk_id(vbk_id);
		}

		Long zakazchiki_id = (Long)attributes.get("zakazchiki_id");

		if (zakazchiki_id != null) {
			setZakazchiki_id(zakazchiki_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _zakazchiki.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _zakazchiki.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _zakazchiki.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _zakazchiki.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.zakazchiki.model.zakazchiki> toCacheModel() {
		return _zakazchiki.toCacheModel();
	}

	@Override
	public int compareTo(tj.zakazchiki.model.zakazchiki zakazchiki) {
		return _zakazchiki.compareTo(zakazchiki);
	}

	@Override
	public int hashCode() {
		return _zakazchiki.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _zakazchiki.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new zakazchikiWrapper((zakazchiki)_zakazchiki.clone());
	}

	/**
	* Returns the adres of this zakazchiki.
	*
	* @return the adres of this zakazchiki
	*/
	@Override
	public java.lang.String getAdres() {
		return _zakazchiki.getAdres();
	}

	/**
	* Returns the ein of this zakazchiki.
	*
	* @return the ein of this zakazchiki
	*/
	@Override
	public java.lang.String getEin() {
		return _zakazchiki.getEin();
	}

	/**
	* Returns the gorod of this zakazchiki.
	*
	* @return the gorod of this zakazchiki
	*/
	@Override
	public java.lang.String getGorod() {
		return _zakazchiki.getGorod();
	}

	/**
	* Returns the inn of this zakazchiki.
	*
	* @return the inn of this zakazchiki
	*/
	@Override
	public java.lang.String getInn() {
		return _zakazchiki.getInn();
	}

	/**
	* Returns the je_pochta of this zakazchiki.
	*
	* @return the je_pochta of this zakazchiki
	*/
	@Override
	public java.lang.String getJe_pochta() {
		return _zakazchiki.getJe_pochta();
	}

	/**
	* Returns the kontaktnyj_telefon of this zakazchiki.
	*
	* @return the kontaktnyj_telefon of this zakazchiki
	*/
	@Override
	public java.lang.String getKontaktnyj_telefon() {
		return _zakazchiki.getKontaktnyj_telefon();
	}

	/**
	* Returns the naimenovanie of this zakazchiki.
	*
	* @return the naimenovanie of this zakazchiki
	*/
	@Override
	public java.lang.String getNaimenovanie() {
		return _zakazchiki.getNaimenovanie();
	}

	/**
	* Returns the otvetstvennoe_lico of this zakazchiki.
	*
	* @return the otvetstvennoe_lico of this zakazchiki
	*/
	@Override
	public java.lang.String getOtvetstvennoe_lico() {
		return _zakazchiki.getOtvetstvennoe_lico();
	}

	/**
	* Returns the rukovoditel of this zakazchiki.
	*
	* @return the rukovoditel of this zakazchiki
	*/
	@Override
	public java.lang.String getRukovoditel() {
		return _zakazchiki.getRukovoditel();
	}

	@Override
	public java.lang.String toString() {
		return _zakazchiki.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _zakazchiki.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this zakazchiki.
	*
	* @return the data_izmenenija of this zakazchiki
	*/
	@Override
	public Date getData_izmenenija() {
		return _zakazchiki.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this zakazchiki.
	*
	* @return the data_sozdanija of this zakazchiki
	*/
	@Override
	public Date getData_sozdanija() {
		return _zakazchiki.getData_sozdanija();
	}

	/**
	* Returns the fbk_id of this zakazchiki.
	*
	* @return the fbk_id of this zakazchiki
	*/
	@Override
	public long getFbk_id() {
		return _zakazchiki.getFbk_id();
	}

	/**
	* Returns the istochnik_finansirovanija_id of this zakazchiki.
	*
	* @return the istochnik_finansirovanija_id of this zakazchiki
	*/
	@Override
	public long getIstochnik_finansirovanija_id() {
		return _zakazchiki.getIstochnik_finansirovanija_id();
	}

	/**
	* Returns the izmenil of this zakazchiki.
	*
	* @return the izmenil of this zakazchiki
	*/
	@Override
	public long getIzmenil() {
		return _zakazchiki.getIzmenil();
	}

	/**
	* Returns the kvalificirovannaja_organizacija of this zakazchiki.
	*
	* @return the kvalificirovannaja_organizacija of this zakazchiki
	*/
	@Override
	public long getKvalificirovannaja_organizacija() {
		return _zakazchiki.getKvalificirovannaja_organizacija();
	}

	/**
	* Returns the oblast_id of this zakazchiki.
	*
	* @return the oblast_id of this zakazchiki
	*/
	@Override
	public long getOblast_id() {
		return _zakazchiki.getOblast_id();
	}

	/**
	* Returns the primary key of this zakazchiki.
	*
	* @return the primary key of this zakazchiki
	*/
	@Override
	public long getPrimaryKey() {
		return _zakazchiki.getPrimaryKey();
	}

	/**
	* Returns the rajon_id of this zakazchiki.
	*
	* @return the rajon_id of this zakazchiki
	*/
	@Override
	public long getRajon_id() {
		return _zakazchiki.getRajon_id();
	}

	/**
	* Returns the sozdal of this zakazchiki.
	*
	* @return the sozdal of this zakazchiki
	*/
	@Override
	public long getSozdal() {
		return _zakazchiki.getSozdal();
	}

	/**
	* Returns the vbk_id of this zakazchiki.
	*
	* @return the vbk_id of this zakazchiki
	*/
	@Override
	public long getVbk_id() {
		return _zakazchiki.getVbk_id();
	}

	/**
	* Returns the zakazchiki_id of this zakazchiki.
	*
	* @return the zakazchiki_id of this zakazchiki
	*/
	@Override
	public long getZakazchiki_id() {
		return _zakazchiki.getZakazchiki_id();
	}

	@Override
	public tj.zakazchiki.model.zakazchiki toEscapedModel() {
		return new zakazchikiWrapper(_zakazchiki.toEscapedModel());
	}

	@Override
	public tj.zakazchiki.model.zakazchiki toUnescapedModel() {
		return new zakazchikiWrapper(_zakazchiki.toUnescapedModel());
	}

	@Override
	public void persist() {
		_zakazchiki.persist();
	}

	/**
	* Sets the adres of this zakazchiki.
	*
	* @param adres the adres of this zakazchiki
	*/
	@Override
	public void setAdres(java.lang.String adres) {
		_zakazchiki.setAdres(adres);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_zakazchiki.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this zakazchiki.
	*
	* @param data_izmenenija the data_izmenenija of this zakazchiki
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_zakazchiki.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this zakazchiki.
	*
	* @param data_sozdanija the data_sozdanija of this zakazchiki
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_zakazchiki.setData_sozdanija(data_sozdanija);
	}

	/**
	* Sets the ein of this zakazchiki.
	*
	* @param ein the ein of this zakazchiki
	*/
	@Override
	public void setEin(java.lang.String ein) {
		_zakazchiki.setEin(ein);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_zakazchiki.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_zakazchiki.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_zakazchiki.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fbk_id of this zakazchiki.
	*
	* @param fbk_id the fbk_id of this zakazchiki
	*/
	@Override
	public void setFbk_id(long fbk_id) {
		_zakazchiki.setFbk_id(fbk_id);
	}

	/**
	* Sets the gorod of this zakazchiki.
	*
	* @param gorod the gorod of this zakazchiki
	*/
	@Override
	public void setGorod(java.lang.String gorod) {
		_zakazchiki.setGorod(gorod);
	}

	/**
	* Sets the inn of this zakazchiki.
	*
	* @param inn the inn of this zakazchiki
	*/
	@Override
	public void setInn(java.lang.String inn) {
		_zakazchiki.setInn(inn);
	}

	/**
	* Sets the istochnik_finansirovanija_id of this zakazchiki.
	*
	* @param istochnik_finansirovanija_id the istochnik_finansirovanija_id of this zakazchiki
	*/
	@Override
	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id) {
		_zakazchiki.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
	}

	/**
	* Sets the izmenil of this zakazchiki.
	*
	* @param izmenil the izmenil of this zakazchiki
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_zakazchiki.setIzmenil(izmenil);
	}

	/**
	* Sets the je_pochta of this zakazchiki.
	*
	* @param je_pochta the je_pochta of this zakazchiki
	*/
	@Override
	public void setJe_pochta(java.lang.String je_pochta) {
		_zakazchiki.setJe_pochta(je_pochta);
	}

	/**
	* Sets the kontaktnyj_telefon of this zakazchiki.
	*
	* @param kontaktnyj_telefon the kontaktnyj_telefon of this zakazchiki
	*/
	@Override
	public void setKontaktnyj_telefon(java.lang.String kontaktnyj_telefon) {
		_zakazchiki.setKontaktnyj_telefon(kontaktnyj_telefon);
	}

	/**
	* Sets the kvalificirovannaja_organizacija of this zakazchiki.
	*
	* @param kvalificirovannaja_organizacija the kvalificirovannaja_organizacija of this zakazchiki
	*/
	@Override
	public void setKvalificirovannaja_organizacija(
		long kvalificirovannaja_organizacija) {
		_zakazchiki.setKvalificirovannaja_organizacija(kvalificirovannaja_organizacija);
	}

	/**
	* Sets the naimenovanie of this zakazchiki.
	*
	* @param naimenovanie the naimenovanie of this zakazchiki
	*/
	@Override
	public void setNaimenovanie(java.lang.String naimenovanie) {
		_zakazchiki.setNaimenovanie(naimenovanie);
	}

	@Override
	public void setNew(boolean n) {
		_zakazchiki.setNew(n);
	}

	/**
	* Sets the oblast_id of this zakazchiki.
	*
	* @param oblast_id the oblast_id of this zakazchiki
	*/
	@Override
	public void setOblast_id(long oblast_id) {
		_zakazchiki.setOblast_id(oblast_id);
	}

	/**
	* Sets the otvetstvennoe_lico of this zakazchiki.
	*
	* @param otvetstvennoe_lico the otvetstvennoe_lico of this zakazchiki
	*/
	@Override
	public void setOtvetstvennoe_lico(java.lang.String otvetstvennoe_lico) {
		_zakazchiki.setOtvetstvennoe_lico(otvetstvennoe_lico);
	}

	/**
	* Sets the primary key of this zakazchiki.
	*
	* @param primaryKey the primary key of this zakazchiki
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_zakazchiki.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_zakazchiki.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rajon_id of this zakazchiki.
	*
	* @param rajon_id the rajon_id of this zakazchiki
	*/
	@Override
	public void setRajon_id(long rajon_id) {
		_zakazchiki.setRajon_id(rajon_id);
	}

	/**
	* Sets the rukovoditel of this zakazchiki.
	*
	* @param rukovoditel the rukovoditel of this zakazchiki
	*/
	@Override
	public void setRukovoditel(java.lang.String rukovoditel) {
		_zakazchiki.setRukovoditel(rukovoditel);
	}

	/**
	* Sets the sozdal of this zakazchiki.
	*
	* @param sozdal the sozdal of this zakazchiki
	*/
	@Override
	public void setSozdal(long sozdal) {
		_zakazchiki.setSozdal(sozdal);
	}

	/**
	* Sets the vbk_id of this zakazchiki.
	*
	* @param vbk_id the vbk_id of this zakazchiki
	*/
	@Override
	public void setVbk_id(long vbk_id) {
		_zakazchiki.setVbk_id(vbk_id);
	}

	/**
	* Sets the zakazchiki_id of this zakazchiki.
	*
	* @param zakazchiki_id the zakazchiki_id of this zakazchiki
	*/
	@Override
	public void setZakazchiki_id(long zakazchiki_id) {
		_zakazchiki.setZakazchiki_id(zakazchiki_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof zakazchikiWrapper)) {
			return false;
		}

		zakazchikiWrapper zakazchikiWrapper = (zakazchikiWrapper)obj;

		if (Objects.equals(_zakazchiki, zakazchikiWrapper._zakazchiki)) {
			return true;
		}

		return false;
	}

	@Override
	public zakazchiki getWrappedModel() {
		return _zakazchiki;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _zakazchiki.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _zakazchiki.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_zakazchiki.resetOriginalValues();
	}

	private final zakazchiki _zakazchiki;
}