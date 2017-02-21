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

package tj.otozvannye.zajavki.model;

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
 * This class is a wrapper for {@link otozvannye_zajavki}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see otozvannye_zajavki
 * @generated
 */
@ProviderType
public class otozvannye_zajavkiWrapper implements otozvannye_zajavki,
	ModelWrapper<otozvannye_zajavki> {
	public otozvannye_zajavkiWrapper(otozvannye_zajavki otozvannye_zajavki) {
		_otozvannye_zajavki = otozvannye_zajavki;
	}

	@Override
	public Class<?> getModelClass() {
		return otozvannye_zajavki.class;
	}

	@Override
	public String getModelClassName() {
		return otozvannye_zajavki.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_otzyva", getData_otzyva());
		attributes.put("itogo_za_tovar", getItogo_za_tovar());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("kolichestvo", getKolichestvo());
		attributes.put("lot_id", getLot_id());
		attributes.put("otozval", getOtozval());
		attributes.put("otozvannye_zajavki_id", getOtozvannye_zajavki_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("summa_za_edinicu_tovara", getSumma_za_edinicu_tovara());
		attributes.put("tovar_id", getTovar_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_otzyva = (Date)attributes.get("data_otzyva");

		if (data_otzyva != null) {
			setData_otzyva(data_otzyva);
		}

		Double itogo_za_tovar = (Double)attributes.get("itogo_za_tovar");

		if (itogo_za_tovar != null) {
			setItogo_za_tovar(itogo_za_tovar);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Integer kolichestvo = (Integer)attributes.get("kolichestvo");

		if (kolichestvo != null) {
			setKolichestvo(kolichestvo);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		Long otozval = (Long)attributes.get("otozval");

		if (otozval != null) {
			setOtozval(otozval);
		}

		Long otozvannye_zajavki_id = (Long)attributes.get(
				"otozvannye_zajavki_id");

		if (otozvannye_zajavki_id != null) {
			setOtozvannye_zajavki_id(otozvannye_zajavki_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
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
		return _otozvannye_zajavki.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _otozvannye_zajavki.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _otozvannye_zajavki.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _otozvannye_zajavki.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.otozvannye.zajavki.model.otozvannye_zajavki> toCacheModel() {
		return _otozvannye_zajavki.toCacheModel();
	}

	/**
	* Returns the itogo_za_tovar of this otozvannye_zajavki.
	*
	* @return the itogo_za_tovar of this otozvannye_zajavki
	*/
	@Override
	public double getItogo_za_tovar() {
		return _otozvannye_zajavki.getItogo_za_tovar();
	}

	/**
	* Returns the summa_za_edinicu_tovara of this otozvannye_zajavki.
	*
	* @return the summa_za_edinicu_tovara of this otozvannye_zajavki
	*/
	@Override
	public double getSumma_za_edinicu_tovara() {
		return _otozvannye_zajavki.getSumma_za_edinicu_tovara();
	}

	@Override
	public int compareTo(
		tj.otozvannye.zajavki.model.otozvannye_zajavki otozvannye_zajavki) {
		return _otozvannye_zajavki.compareTo(otozvannye_zajavki);
	}

	/**
	* Returns the kolichestvo of this otozvannye_zajavki.
	*
	* @return the kolichestvo of this otozvannye_zajavki
	*/
	@Override
	public int getKolichestvo() {
		return _otozvannye_zajavki.getKolichestvo();
	}

	@Override
	public int hashCode() {
		return _otozvannye_zajavki.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _otozvannye_zajavki.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new otozvannye_zajavkiWrapper((otozvannye_zajavki)_otozvannye_zajavki.clone());
	}

	@Override
	public java.lang.String toString() {
		return _otozvannye_zajavki.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _otozvannye_zajavki.toXmlString();
	}

	/**
	* Returns the data_otzyva of this otozvannye_zajavki.
	*
	* @return the data_otzyva of this otozvannye_zajavki
	*/
	@Override
	public Date getData_otzyva() {
		return _otozvannye_zajavki.getData_otzyva();
	}

	/**
	* Returns the izvewenie_id of this otozvannye_zajavki.
	*
	* @return the izvewenie_id of this otozvannye_zajavki
	*/
	@Override
	public long getIzvewenie_id() {
		return _otozvannye_zajavki.getIzvewenie_id();
	}

	/**
	* Returns the lot_id of this otozvannye_zajavki.
	*
	* @return the lot_id of this otozvannye_zajavki
	*/
	@Override
	public long getLot_id() {
		return _otozvannye_zajavki.getLot_id();
	}

	/**
	* Returns the otozval of this otozvannye_zajavki.
	*
	* @return the otozval of this otozvannye_zajavki
	*/
	@Override
	public long getOtozval() {
		return _otozvannye_zajavki.getOtozval();
	}

	/**
	* Returns the otozvannye_zajavki_id of this otozvannye_zajavki.
	*
	* @return the otozvannye_zajavki_id of this otozvannye_zajavki
	*/
	@Override
	public long getOtozvannye_zajavki_id() {
		return _otozvannye_zajavki.getOtozvannye_zajavki_id();
	}

	/**
	* Returns the postavwik_id of this otozvannye_zajavki.
	*
	* @return the postavwik_id of this otozvannye_zajavki
	*/
	@Override
	public long getPostavwik_id() {
		return _otozvannye_zajavki.getPostavwik_id();
	}

	/**
	* Returns the primary key of this otozvannye_zajavki.
	*
	* @return the primary key of this otozvannye_zajavki
	*/
	@Override
	public long getPrimaryKey() {
		return _otozvannye_zajavki.getPrimaryKey();
	}

	/**
	* Returns the tovar_id of this otozvannye_zajavki.
	*
	* @return the tovar_id of this otozvannye_zajavki
	*/
	@Override
	public long getTovar_id() {
		return _otozvannye_zajavki.getTovar_id();
	}

	@Override
	public tj.otozvannye.zajavki.model.otozvannye_zajavki toEscapedModel() {
		return new otozvannye_zajavkiWrapper(_otozvannye_zajavki.toEscapedModel());
	}

	@Override
	public tj.otozvannye.zajavki.model.otozvannye_zajavki toUnescapedModel() {
		return new otozvannye_zajavkiWrapper(_otozvannye_zajavki.toUnescapedModel());
	}

	@Override
	public void persist() {
		_otozvannye_zajavki.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_otozvannye_zajavki.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_otzyva of this otozvannye_zajavki.
	*
	* @param data_otzyva the data_otzyva of this otozvannye_zajavki
	*/
	@Override
	public void setData_otzyva(Date data_otzyva) {
		_otozvannye_zajavki.setData_otzyva(data_otzyva);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_otozvannye_zajavki.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_otozvannye_zajavki.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_otozvannye_zajavki.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the itogo_za_tovar of this otozvannye_zajavki.
	*
	* @param itogo_za_tovar the itogo_za_tovar of this otozvannye_zajavki
	*/
	@Override
	public void setItogo_za_tovar(double itogo_za_tovar) {
		_otozvannye_zajavki.setItogo_za_tovar(itogo_za_tovar);
	}

	/**
	* Sets the izvewenie_id of this otozvannye_zajavki.
	*
	* @param izvewenie_id the izvewenie_id of this otozvannye_zajavki
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_otozvannye_zajavki.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the kolichestvo of this otozvannye_zajavki.
	*
	* @param kolichestvo the kolichestvo of this otozvannye_zajavki
	*/
	@Override
	public void setKolichestvo(int kolichestvo) {
		_otozvannye_zajavki.setKolichestvo(kolichestvo);
	}

	/**
	* Sets the lot_id of this otozvannye_zajavki.
	*
	* @param lot_id the lot_id of this otozvannye_zajavki
	*/
	@Override
	public void setLot_id(long lot_id) {
		_otozvannye_zajavki.setLot_id(lot_id);
	}

	@Override
	public void setNew(boolean n) {
		_otozvannye_zajavki.setNew(n);
	}

	/**
	* Sets the otozval of this otozvannye_zajavki.
	*
	* @param otozval the otozval of this otozvannye_zajavki
	*/
	@Override
	public void setOtozval(long otozval) {
		_otozvannye_zajavki.setOtozval(otozval);
	}

	/**
	* Sets the otozvannye_zajavki_id of this otozvannye_zajavki.
	*
	* @param otozvannye_zajavki_id the otozvannye_zajavki_id of this otozvannye_zajavki
	*/
	@Override
	public void setOtozvannye_zajavki_id(long otozvannye_zajavki_id) {
		_otozvannye_zajavki.setOtozvannye_zajavki_id(otozvannye_zajavki_id);
	}

	/**
	* Sets the postavwik_id of this otozvannye_zajavki.
	*
	* @param postavwik_id the postavwik_id of this otozvannye_zajavki
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_otozvannye_zajavki.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this otozvannye_zajavki.
	*
	* @param primaryKey the primary key of this otozvannye_zajavki
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_otozvannye_zajavki.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_otozvannye_zajavki.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the summa_za_edinicu_tovara of this otozvannye_zajavki.
	*
	* @param summa_za_edinicu_tovara the summa_za_edinicu_tovara of this otozvannye_zajavki
	*/
	@Override
	public void setSumma_za_edinicu_tovara(double summa_za_edinicu_tovara) {
		_otozvannye_zajavki.setSumma_za_edinicu_tovara(summa_za_edinicu_tovara);
	}

	/**
	* Sets the tovar_id of this otozvannye_zajavki.
	*
	* @param tovar_id the tovar_id of this otozvannye_zajavki
	*/
	@Override
	public void setTovar_id(long tovar_id) {
		_otozvannye_zajavki.setTovar_id(tovar_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof otozvannye_zajavkiWrapper)) {
			return false;
		}

		otozvannye_zajavkiWrapper otozvannye_zajavkiWrapper = (otozvannye_zajavkiWrapper)obj;

		if (Objects.equals(_otozvannye_zajavki,
					otozvannye_zajavkiWrapper._otozvannye_zajavki)) {
			return true;
		}

		return false;
	}

	@Override
	public otozvannye_zajavki getWrappedModel() {
		return _otozvannye_zajavki;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _otozvannye_zajavki.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _otozvannye_zajavki.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_otozvannye_zajavki.resetOriginalValues();
	}

	private final otozvannye_zajavki _otozvannye_zajavki;
}