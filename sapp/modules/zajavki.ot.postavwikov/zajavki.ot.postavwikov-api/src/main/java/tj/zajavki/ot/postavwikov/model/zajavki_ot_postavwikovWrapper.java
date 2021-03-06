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

package tj.zajavki.ot.postavwikov.model;

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
 * This class is a wrapper for {@link zajavki_ot_postavwikov}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see zajavki_ot_postavwikov
 * @generated
 */
@ProviderType
public class zajavki_ot_postavwikovWrapper implements zajavki_ot_postavwikov,
	ModelWrapper<zajavki_ot_postavwikov> {
	public zajavki_ot_postavwikovWrapper(
		zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		_zajavki_ot_postavwikov = zajavki_ot_postavwikov;
	}

	@Override
	public Class<?> getModelClass() {
		return zajavki_ot_postavwikov.class;
	}

	@Override
	public String getModelClassName() {
		return zajavki_ot_postavwikov.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("itogo_za_tovar", getItogo_za_tovar());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("kod_po_obshhemu_klassifikatoru",
			getKod_po_obshhemu_klassifikatoru());
		attributes.put("kod_strany_proizvoditelja",
			getKod_strany_proizvoditelja());
		attributes.put("kolichestvo", getKolichestvo());
		attributes.put("lot_id", getLot_id());
		attributes.put("opisanie_tovara", getOpisanie_tovara());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("predlozhenie_postavwika", getPredlozhenie_postavwika());
		attributes.put("sozdal", getSozdal());
		attributes.put("summa_za_edinicu_tovara", getSumma_za_edinicu_tovara());
		attributes.put("tovar_id", getTovar_id());
		attributes.put("zajavki_ot_postavwikov_id",
			getZajavki_ot_postavwikov_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Double itogo_za_tovar = (Double)attributes.get("itogo_za_tovar");

		if (itogo_za_tovar != null) {
			setItogo_za_tovar(itogo_za_tovar);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long kod_po_obshhemu_klassifikatoru = (Long)attributes.get(
				"kod_po_obshhemu_klassifikatoru");

		if (kod_po_obshhemu_klassifikatoru != null) {
			setKod_po_obshhemu_klassifikatoru(kod_po_obshhemu_klassifikatoru);
		}

		Long kod_strany_proizvoditelja = (Long)attributes.get(
				"kod_strany_proizvoditelja");

		if (kod_strany_proizvoditelja != null) {
			setKod_strany_proizvoditelja(kod_strany_proizvoditelja);
		}

		Long kolichestvo = (Long)attributes.get("kolichestvo");

		if (kolichestvo != null) {
			setKolichestvo(kolichestvo);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		String opisanie_tovara = (String)attributes.get("opisanie_tovara");

		if (opisanie_tovara != null) {
			setOpisanie_tovara(opisanie_tovara);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		String predlozhenie_postavwika = (String)attributes.get(
				"predlozhenie_postavwika");

		if (predlozhenie_postavwika != null) {
			setPredlozhenie_postavwika(predlozhenie_postavwika);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		Double summa_za_edinicu_tovara = (Double)attributes.get(
				"summa_za_edinicu_tovara");

		if (summa_za_edinicu_tovara != null) {
			setSumma_za_edinicu_tovara(summa_za_edinicu_tovara);
		}

		Long tovar_id = (Long)attributes.get("tovar_id");

		if (tovar_id != null) {
			setTovar_id(tovar_id);
		}

		Long zajavki_ot_postavwikov_id = (Long)attributes.get(
				"zajavki_ot_postavwikov_id");

		if (zajavki_ot_postavwikov_id != null) {
			setZajavki_ot_postavwikov_id(zajavki_ot_postavwikov_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _zajavki_ot_postavwikov.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _zajavki_ot_postavwikov.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _zajavki_ot_postavwikov.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _zajavki_ot_postavwikov.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov> toCacheModel() {
		return _zajavki_ot_postavwikov.toCacheModel();
	}

	/**
	* Returns the itogo_za_tovar of this zajavki_ot_postavwikov.
	*
	* @return the itogo_za_tovar of this zajavki_ot_postavwikov
	*/
	@Override
	public double getItogo_za_tovar() {
		return _zajavki_ot_postavwikov.getItogo_za_tovar();
	}

	/**
	* Returns the summa_za_edinicu_tovara of this zajavki_ot_postavwikov.
	*
	* @return the summa_za_edinicu_tovara of this zajavki_ot_postavwikov
	*/
	@Override
	public double getSumma_za_edinicu_tovara() {
		return _zajavki_ot_postavwikov.getSumma_za_edinicu_tovara();
	}

	@Override
	public int compareTo(
		tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		return _zajavki_ot_postavwikov.compareTo(zajavki_ot_postavwikov);
	}

	@Override
	public int hashCode() {
		return _zajavki_ot_postavwikov.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _zajavki_ot_postavwikov.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new zajavki_ot_postavwikovWrapper((zajavki_ot_postavwikov)_zajavki_ot_postavwikov.clone());
	}

	/**
	* Returns the opisanie_tovara of this zajavki_ot_postavwikov.
	*
	* @return the opisanie_tovara of this zajavki_ot_postavwikov
	*/
	@Override
	public java.lang.String getOpisanie_tovara() {
		return _zajavki_ot_postavwikov.getOpisanie_tovara();
	}

	/**
	* Returns the predlozhenie_postavwika of this zajavki_ot_postavwikov.
	*
	* @return the predlozhenie_postavwika of this zajavki_ot_postavwikov
	*/
	@Override
	public java.lang.String getPredlozhenie_postavwika() {
		return _zajavki_ot_postavwikov.getPredlozhenie_postavwika();
	}

	@Override
	public java.lang.String toString() {
		return _zajavki_ot_postavwikov.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _zajavki_ot_postavwikov.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this zajavki_ot_postavwikov.
	*
	* @return the data_izmenenija of this zajavki_ot_postavwikov
	*/
	@Override
	public Date getData_izmenenija() {
		return _zajavki_ot_postavwikov.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this zajavki_ot_postavwikov.
	*
	* @return the data_sozdanija of this zajavki_ot_postavwikov
	*/
	@Override
	public Date getData_sozdanija() {
		return _zajavki_ot_postavwikov.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this zajavki_ot_postavwikov.
	*
	* @return the izmenil of this zajavki_ot_postavwikov
	*/
	@Override
	public long getIzmenil() {
		return _zajavki_ot_postavwikov.getIzmenil();
	}

	/**
	* Returns the izvewenie_id of this zajavki_ot_postavwikov.
	*
	* @return the izvewenie_id of this zajavki_ot_postavwikov
	*/
	@Override
	public long getIzvewenie_id() {
		return _zajavki_ot_postavwikov.getIzvewenie_id();
	}

	/**
	* Returns the kod_po_obshhemu_klassifikatoru of this zajavki_ot_postavwikov.
	*
	* @return the kod_po_obshhemu_klassifikatoru of this zajavki_ot_postavwikov
	*/
	@Override
	public long getKod_po_obshhemu_klassifikatoru() {
		return _zajavki_ot_postavwikov.getKod_po_obshhemu_klassifikatoru();
	}

	/**
	* Returns the kod_strany_proizvoditelja of this zajavki_ot_postavwikov.
	*
	* @return the kod_strany_proizvoditelja of this zajavki_ot_postavwikov
	*/
	@Override
	public long getKod_strany_proizvoditelja() {
		return _zajavki_ot_postavwikov.getKod_strany_proizvoditelja();
	}

	/**
	* Returns the kolichestvo of this zajavki_ot_postavwikov.
	*
	* @return the kolichestvo of this zajavki_ot_postavwikov
	*/
	@Override
	public long getKolichestvo() {
		return _zajavki_ot_postavwikov.getKolichestvo();
	}

	/**
	* Returns the lot_id of this zajavki_ot_postavwikov.
	*
	* @return the lot_id of this zajavki_ot_postavwikov
	*/
	@Override
	public long getLot_id() {
		return _zajavki_ot_postavwikov.getLot_id();
	}

	/**
	* Returns the postavwik_id of this zajavki_ot_postavwikov.
	*
	* @return the postavwik_id of this zajavki_ot_postavwikov
	*/
	@Override
	public long getPostavwik_id() {
		return _zajavki_ot_postavwikov.getPostavwik_id();
	}

	/**
	* Returns the primary key of this zajavki_ot_postavwikov.
	*
	* @return the primary key of this zajavki_ot_postavwikov
	*/
	@Override
	public long getPrimaryKey() {
		return _zajavki_ot_postavwikov.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this zajavki_ot_postavwikov.
	*
	* @return the sozdal of this zajavki_ot_postavwikov
	*/
	@Override
	public long getSozdal() {
		return _zajavki_ot_postavwikov.getSozdal();
	}

	/**
	* Returns the tovar_id of this zajavki_ot_postavwikov.
	*
	* @return the tovar_id of this zajavki_ot_postavwikov
	*/
	@Override
	public long getTovar_id() {
		return _zajavki_ot_postavwikov.getTovar_id();
	}

	/**
	* Returns the zajavki_ot_postavwikov_id of this zajavki_ot_postavwikov.
	*
	* @return the zajavki_ot_postavwikov_id of this zajavki_ot_postavwikov
	*/
	@Override
	public long getZajavki_ot_postavwikov_id() {
		return _zajavki_ot_postavwikov.getZajavki_ot_postavwikov_id();
	}

	@Override
	public tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov toEscapedModel() {
		return new zajavki_ot_postavwikovWrapper(_zajavki_ot_postavwikov.toEscapedModel());
	}

	@Override
	public tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov toUnescapedModel() {
		return new zajavki_ot_postavwikovWrapper(_zajavki_ot_postavwikov.toUnescapedModel());
	}

	@Override
	public void persist() {
		_zajavki_ot_postavwikov.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_zajavki_ot_postavwikov.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this zajavki_ot_postavwikov.
	*
	* @param data_izmenenija the data_izmenenija of this zajavki_ot_postavwikov
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_zajavki_ot_postavwikov.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this zajavki_ot_postavwikov.
	*
	* @param data_sozdanija the data_sozdanija of this zajavki_ot_postavwikov
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_zajavki_ot_postavwikov.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_zajavki_ot_postavwikov.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_zajavki_ot_postavwikov.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_zajavki_ot_postavwikov.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the itogo_za_tovar of this zajavki_ot_postavwikov.
	*
	* @param itogo_za_tovar the itogo_za_tovar of this zajavki_ot_postavwikov
	*/
	@Override
	public void setItogo_za_tovar(double itogo_za_tovar) {
		_zajavki_ot_postavwikov.setItogo_za_tovar(itogo_za_tovar);
	}

	/**
	* Sets the izmenil of this zajavki_ot_postavwikov.
	*
	* @param izmenil the izmenil of this zajavki_ot_postavwikov
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_zajavki_ot_postavwikov.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenie_id of this zajavki_ot_postavwikov.
	*
	* @param izvewenie_id the izvewenie_id of this zajavki_ot_postavwikov
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_zajavki_ot_postavwikov.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the kod_po_obshhemu_klassifikatoru of this zajavki_ot_postavwikov.
	*
	* @param kod_po_obshhemu_klassifikatoru the kod_po_obshhemu_klassifikatoru of this zajavki_ot_postavwikov
	*/
	@Override
	public void setKod_po_obshhemu_klassifikatoru(
		long kod_po_obshhemu_klassifikatoru) {
		_zajavki_ot_postavwikov.setKod_po_obshhemu_klassifikatoru(kod_po_obshhemu_klassifikatoru);
	}

	/**
	* Sets the kod_strany_proizvoditelja of this zajavki_ot_postavwikov.
	*
	* @param kod_strany_proizvoditelja the kod_strany_proizvoditelja of this zajavki_ot_postavwikov
	*/
	@Override
	public void setKod_strany_proizvoditelja(long kod_strany_proizvoditelja) {
		_zajavki_ot_postavwikov.setKod_strany_proizvoditelja(kod_strany_proizvoditelja);
	}

	/**
	* Sets the kolichestvo of this zajavki_ot_postavwikov.
	*
	* @param kolichestvo the kolichestvo of this zajavki_ot_postavwikov
	*/
	@Override
	public void setKolichestvo(long kolichestvo) {
		_zajavki_ot_postavwikov.setKolichestvo(kolichestvo);
	}

	/**
	* Sets the lot_id of this zajavki_ot_postavwikov.
	*
	* @param lot_id the lot_id of this zajavki_ot_postavwikov
	*/
	@Override
	public void setLot_id(long lot_id) {
		_zajavki_ot_postavwikov.setLot_id(lot_id);
	}

	@Override
	public void setNew(boolean n) {
		_zajavki_ot_postavwikov.setNew(n);
	}

	/**
	* Sets the opisanie_tovara of this zajavki_ot_postavwikov.
	*
	* @param opisanie_tovara the opisanie_tovara of this zajavki_ot_postavwikov
	*/
	@Override
	public void setOpisanie_tovara(java.lang.String opisanie_tovara) {
		_zajavki_ot_postavwikov.setOpisanie_tovara(opisanie_tovara);
	}

	/**
	* Sets the postavwik_id of this zajavki_ot_postavwikov.
	*
	* @param postavwik_id the postavwik_id of this zajavki_ot_postavwikov
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_zajavki_ot_postavwikov.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the predlozhenie_postavwika of this zajavki_ot_postavwikov.
	*
	* @param predlozhenie_postavwika the predlozhenie_postavwika of this zajavki_ot_postavwikov
	*/
	@Override
	public void setPredlozhenie_postavwika(
		java.lang.String predlozhenie_postavwika) {
		_zajavki_ot_postavwikov.setPredlozhenie_postavwika(predlozhenie_postavwika);
	}

	/**
	* Sets the primary key of this zajavki_ot_postavwikov.
	*
	* @param primaryKey the primary key of this zajavki_ot_postavwikov
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_zajavki_ot_postavwikov.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_zajavki_ot_postavwikov.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this zajavki_ot_postavwikov.
	*
	* @param sozdal the sozdal of this zajavki_ot_postavwikov
	*/
	@Override
	public void setSozdal(long sozdal) {
		_zajavki_ot_postavwikov.setSozdal(sozdal);
	}

	/**
	* Sets the summa_za_edinicu_tovara of this zajavki_ot_postavwikov.
	*
	* @param summa_za_edinicu_tovara the summa_za_edinicu_tovara of this zajavki_ot_postavwikov
	*/
	@Override
	public void setSumma_za_edinicu_tovara(double summa_za_edinicu_tovara) {
		_zajavki_ot_postavwikov.setSumma_za_edinicu_tovara(summa_za_edinicu_tovara);
	}

	/**
	* Sets the tovar_id of this zajavki_ot_postavwikov.
	*
	* @param tovar_id the tovar_id of this zajavki_ot_postavwikov
	*/
	@Override
	public void setTovar_id(long tovar_id) {
		_zajavki_ot_postavwikov.setTovar_id(tovar_id);
	}

	/**
	* Sets the zajavki_ot_postavwikov_id of this zajavki_ot_postavwikov.
	*
	* @param zajavki_ot_postavwikov_id the zajavki_ot_postavwikov_id of this zajavki_ot_postavwikov
	*/
	@Override
	public void setZajavki_ot_postavwikov_id(long zajavki_ot_postavwikov_id) {
		_zajavki_ot_postavwikov.setZajavki_ot_postavwikov_id(zajavki_ot_postavwikov_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof zajavki_ot_postavwikovWrapper)) {
			return false;
		}

		zajavki_ot_postavwikovWrapper zajavki_ot_postavwikovWrapper = (zajavki_ot_postavwikovWrapper)obj;

		if (Objects.equals(_zajavki_ot_postavwikov,
					zajavki_ot_postavwikovWrapper._zajavki_ot_postavwikov)) {
			return true;
		}

		return false;
	}

	@Override
	public zajavki_ot_postavwikov getWrappedModel() {
		return _zajavki_ot_postavwikov;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _zajavki_ot_postavwikov.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _zajavki_ot_postavwikov.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_zajavki_ot_postavwikov.resetOriginalValues();
	}

	private final zajavki_ot_postavwikov _zajavki_ot_postavwikov;
}