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

package tj.ne.uchastvujushhie.zajavki.model;

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
 * This class is a wrapper for {@link ne_uchastvujushhie_zajavki}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ne_uchastvujushhie_zajavki
 * @generated
 */
@ProviderType
public class ne_uchastvujushhie_zajavkiWrapper
	implements ne_uchastvujushhie_zajavki,
		ModelWrapper<ne_uchastvujushhie_zajavki> {
	public ne_uchastvujushhie_zajavkiWrapper(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		_ne_uchastvujushhie_zajavki = ne_uchastvujushhie_zajavki;
	}

	@Override
	public Class<?> getModelClass() {
		return ne_uchastvujushhie_zajavki.class;
	}

	@Override
	public String getModelClassName() {
		return ne_uchastvujushhie_zajavki.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("itogo_za_tovar", getItogo_za_tovar());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("kolichestvo", getKolichestvo());
		attributes.put("lot_id", getLot_id());
		attributes.put("ne_uchastvujushhie_zajavki_id",
			getNe_uchastvujushhie_zajavki_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("sozdal", getSozdal());
		attributes.put("summa_za_edinicu_tovara", getSumma_za_edinicu_tovara());
		attributes.put("tovar_id", getTovar_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Double itogo_za_tovar = (Double)attributes.get("itogo_za_tovar");

		if (itogo_za_tovar != null) {
			setItogo_za_tovar(itogo_za_tovar);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long kolichestvo = (Long)attributes.get("kolichestvo");

		if (kolichestvo != null) {
			setKolichestvo(kolichestvo);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		Long ne_uchastvujushhie_zajavki_id = (Long)attributes.get(
				"ne_uchastvujushhie_zajavki_id");

		if (ne_uchastvujushhie_zajavki_id != null) {
			setNe_uchastvujushhie_zajavki_id(ne_uchastvujushhie_zajavki_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
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
	}

	@Override
	public boolean isCachedModel() {
		return _ne_uchastvujushhie_zajavki.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ne_uchastvujushhie_zajavki.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ne_uchastvujushhie_zajavki.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ne_uchastvujushhie_zajavki.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki> toCacheModel() {
		return _ne_uchastvujushhie_zajavki.toCacheModel();
	}

	/**
	* Returns the itogo_za_tovar of this ne_uchastvujushhie_zajavki.
	*
	* @return the itogo_za_tovar of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public double getItogo_za_tovar() {
		return _ne_uchastvujushhie_zajavki.getItogo_za_tovar();
	}

	/**
	* Returns the summa_za_edinicu_tovara of this ne_uchastvujushhie_zajavki.
	*
	* @return the summa_za_edinicu_tovara of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public double getSumma_za_edinicu_tovara() {
		return _ne_uchastvujushhie_zajavki.getSumma_za_edinicu_tovara();
	}

	@Override
	public int compareTo(
		tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		return _ne_uchastvujushhie_zajavki.compareTo(ne_uchastvujushhie_zajavki);
	}

	@Override
	public int hashCode() {
		return _ne_uchastvujushhie_zajavki.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ne_uchastvujushhie_zajavki.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ne_uchastvujushhie_zajavkiWrapper((ne_uchastvujushhie_zajavki)_ne_uchastvujushhie_zajavki.clone());
	}

	@Override
	public java.lang.String toString() {
		return _ne_uchastvujushhie_zajavki.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ne_uchastvujushhie_zajavki.toXmlString();
	}

	/**
	* Returns the data_sozdanija of this ne_uchastvujushhie_zajavki.
	*
	* @return the data_sozdanija of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public Date getData_sozdanija() {
		return _ne_uchastvujushhie_zajavki.getData_sozdanija();
	}

	/**
	* Returns the izvewenie_id of this ne_uchastvujushhie_zajavki.
	*
	* @return the izvewenie_id of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public long getIzvewenie_id() {
		return _ne_uchastvujushhie_zajavki.getIzvewenie_id();
	}

	/**
	* Returns the kolichestvo of this ne_uchastvujushhie_zajavki.
	*
	* @return the kolichestvo of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public long getKolichestvo() {
		return _ne_uchastvujushhie_zajavki.getKolichestvo();
	}

	/**
	* Returns the lot_id of this ne_uchastvujushhie_zajavki.
	*
	* @return the lot_id of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public long getLot_id() {
		return _ne_uchastvujushhie_zajavki.getLot_id();
	}

	/**
	* Returns the ne_uchastvujushhie_zajavki_id of this ne_uchastvujushhie_zajavki.
	*
	* @return the ne_uchastvujushhie_zajavki_id of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public long getNe_uchastvujushhie_zajavki_id() {
		return _ne_uchastvujushhie_zajavki.getNe_uchastvujushhie_zajavki_id();
	}

	/**
	* Returns the postavwik_id of this ne_uchastvujushhie_zajavki.
	*
	* @return the postavwik_id of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public long getPostavwik_id() {
		return _ne_uchastvujushhie_zajavki.getPostavwik_id();
	}

	/**
	* Returns the primary key of this ne_uchastvujushhie_zajavki.
	*
	* @return the primary key of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public long getPrimaryKey() {
		return _ne_uchastvujushhie_zajavki.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this ne_uchastvujushhie_zajavki.
	*
	* @return the sozdal of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public long getSozdal() {
		return _ne_uchastvujushhie_zajavki.getSozdal();
	}

	/**
	* Returns the tovar_id of this ne_uchastvujushhie_zajavki.
	*
	* @return the tovar_id of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public long getTovar_id() {
		return _ne_uchastvujushhie_zajavki.getTovar_id();
	}

	@Override
	public tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki toEscapedModel() {
		return new ne_uchastvujushhie_zajavkiWrapper(_ne_uchastvujushhie_zajavki.toEscapedModel());
	}

	@Override
	public tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki toUnescapedModel() {
		return new ne_uchastvujushhie_zajavkiWrapper(_ne_uchastvujushhie_zajavki.toUnescapedModel());
	}

	@Override
	public void persist() {
		_ne_uchastvujushhie_zajavki.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ne_uchastvujushhie_zajavki.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_sozdanija of this ne_uchastvujushhie_zajavki.
	*
	* @param data_sozdanija the data_sozdanija of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_ne_uchastvujushhie_zajavki.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ne_uchastvujushhie_zajavki.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ne_uchastvujushhie_zajavki.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ne_uchastvujushhie_zajavki.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the itogo_za_tovar of this ne_uchastvujushhie_zajavki.
	*
	* @param itogo_za_tovar the itogo_za_tovar of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public void setItogo_za_tovar(double itogo_za_tovar) {
		_ne_uchastvujushhie_zajavki.setItogo_za_tovar(itogo_za_tovar);
	}

	/**
	* Sets the izvewenie_id of this ne_uchastvujushhie_zajavki.
	*
	* @param izvewenie_id the izvewenie_id of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_ne_uchastvujushhie_zajavki.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the kolichestvo of this ne_uchastvujushhie_zajavki.
	*
	* @param kolichestvo the kolichestvo of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public void setKolichestvo(long kolichestvo) {
		_ne_uchastvujushhie_zajavki.setKolichestvo(kolichestvo);
	}

	/**
	* Sets the lot_id of this ne_uchastvujushhie_zajavki.
	*
	* @param lot_id the lot_id of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public void setLot_id(long lot_id) {
		_ne_uchastvujushhie_zajavki.setLot_id(lot_id);
	}

	/**
	* Sets the ne_uchastvujushhie_zajavki_id of this ne_uchastvujushhie_zajavki.
	*
	* @param ne_uchastvujushhie_zajavki_id the ne_uchastvujushhie_zajavki_id of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public void setNe_uchastvujushhie_zajavki_id(
		long ne_uchastvujushhie_zajavki_id) {
		_ne_uchastvujushhie_zajavki.setNe_uchastvujushhie_zajavki_id(ne_uchastvujushhie_zajavki_id);
	}

	@Override
	public void setNew(boolean n) {
		_ne_uchastvujushhie_zajavki.setNew(n);
	}

	/**
	* Sets the postavwik_id of this ne_uchastvujushhie_zajavki.
	*
	* @param postavwik_id the postavwik_id of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_ne_uchastvujushhie_zajavki.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this ne_uchastvujushhie_zajavki.
	*
	* @param primaryKey the primary key of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ne_uchastvujushhie_zajavki.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ne_uchastvujushhie_zajavki.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this ne_uchastvujushhie_zajavki.
	*
	* @param sozdal the sozdal of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public void setSozdal(long sozdal) {
		_ne_uchastvujushhie_zajavki.setSozdal(sozdal);
	}

	/**
	* Sets the summa_za_edinicu_tovara of this ne_uchastvujushhie_zajavki.
	*
	* @param summa_za_edinicu_tovara the summa_za_edinicu_tovara of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public void setSumma_za_edinicu_tovara(double summa_za_edinicu_tovara) {
		_ne_uchastvujushhie_zajavki.setSumma_za_edinicu_tovara(summa_za_edinicu_tovara);
	}

	/**
	* Sets the tovar_id of this ne_uchastvujushhie_zajavki.
	*
	* @param tovar_id the tovar_id of this ne_uchastvujushhie_zajavki
	*/
	@Override
	public void setTovar_id(long tovar_id) {
		_ne_uchastvujushhie_zajavki.setTovar_id(tovar_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ne_uchastvujushhie_zajavkiWrapper)) {
			return false;
		}

		ne_uchastvujushhie_zajavkiWrapper ne_uchastvujushhie_zajavkiWrapper = (ne_uchastvujushhie_zajavkiWrapper)obj;

		if (Objects.equals(_ne_uchastvujushhie_zajavki,
					ne_uchastvujushhie_zajavkiWrapper._ne_uchastvujushhie_zajavki)) {
			return true;
		}

		return false;
	}

	@Override
	public ne_uchastvujushhie_zajavki getWrappedModel() {
		return _ne_uchastvujushhie_zajavki;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ne_uchastvujushhie_zajavki.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ne_uchastvujushhie_zajavki.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ne_uchastvujushhie_zajavki.resetOriginalValues();
	}

	private final ne_uchastvujushhie_zajavki _ne_uchastvujushhie_zajavki;
}