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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ocenka_uchastnikam_v_moment_vskrytija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ocenka_uchastnikam_v_moment_vskrytija
 * @generated
 */
@ProviderType
public class ocenka_uchastnikam_v_moment_vskrytijaWrapper
	implements ocenka_uchastnikam_v_moment_vskrytija,
		ModelWrapper<ocenka_uchastnikam_v_moment_vskrytija> {
	public ocenka_uchastnikam_v_moment_vskrytijaWrapper(
		ocenka_uchastnikam_v_moment_vskrytija ocenka_uchastnikam_v_moment_vskrytija) {
		_ocenka_uchastnikam_v_moment_vskrytija = ocenka_uchastnikam_v_moment_vskrytija;
	}

	@Override
	public Class<?> getModelClass() {
		return ocenka_uchastnikam_v_moment_vskrytija.class;
	}

	@Override
	public String getModelClassName() {
		return ocenka_uchastnikam_v_moment_vskrytija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_otkaza", getData_otkaza());
		attributes.put("data_vskrytija", getData_vskrytija());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("lot_id", getLot_id());
		attributes.put("ocenka_uchastnikam_v_moment_vskrytija_id",
			getOcenka_uchastnikam_v_moment_vskrytija_id());
		attributes.put("otkazal", getOtkazal());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("prichina_otkaza", getPrichina_otkaza());
		attributes.put("protokol_vskrytija_id", getProtokol_vskrytija_id());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_otkaza = (Date)attributes.get("data_otkaza");

		if (data_otkaza != null) {
			setData_otkaza(data_otkaza);
		}

		Date data_vskrytija = (Date)attributes.get("data_vskrytija");

		if (data_vskrytija != null) {
			setData_vskrytija(data_vskrytija);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		Long ocenka_uchastnikam_v_moment_vskrytija_id = (Long)attributes.get(
				"ocenka_uchastnikam_v_moment_vskrytija_id");

		if (ocenka_uchastnikam_v_moment_vskrytija_id != null) {
			setOcenka_uchastnikam_v_moment_vskrytija_id(ocenka_uchastnikam_v_moment_vskrytija_id);
		}

		Long otkazal = (Long)attributes.get("otkazal");

		if (otkazal != null) {
			setOtkazal(otkazal);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		String prichina_otkaza = (String)attributes.get("prichina_otkaza");

		if (prichina_otkaza != null) {
			setPrichina_otkaza(prichina_otkaza);
		}

		Long protokol_vskrytija_id = (Long)attributes.get(
				"protokol_vskrytija_id");

		if (protokol_vskrytija_id != null) {
			setProtokol_vskrytija_id(protokol_vskrytija_id);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _ocenka_uchastnikam_v_moment_vskrytija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ocenka_uchastnikam_v_moment_vskrytija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ocenka_uchastnikam_v_moment_vskrytija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija> toCacheModel() {
		return _ocenka_uchastnikam_v_moment_vskrytija.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija ocenka_uchastnikam_v_moment_vskrytija) {
		return _ocenka_uchastnikam_v_moment_vskrytija.compareTo(ocenka_uchastnikam_v_moment_vskrytija);
	}

	@Override
	public int hashCode() {
		return _ocenka_uchastnikam_v_moment_vskrytija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ocenka_uchastnikam_v_moment_vskrytijaWrapper((ocenka_uchastnikam_v_moment_vskrytija)_ocenka_uchastnikam_v_moment_vskrytija.clone());
	}

	/**
	* Returns the prichina_otkaza of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @return the prichina_otkaza of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public java.lang.String getPrichina_otkaza() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getPrichina_otkaza();
	}

	@Override
	public java.lang.String toString() {
		return _ocenka_uchastnikam_v_moment_vskrytija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ocenka_uchastnikam_v_moment_vskrytija.toXmlString();
	}

	/**
	* Returns the data_otkaza of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @return the data_otkaza of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public Date getData_otkaza() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getData_otkaza();
	}

	/**
	* Returns the data_vskrytija of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @return the data_vskrytija of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public Date getData_vskrytija() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getData_vskrytija();
	}

	/**
	* Returns the izvewenie_id of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @return the izvewenie_id of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public long getIzvewenie_id() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getIzvewenie_id();
	}

	/**
	* Returns the lot_id of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @return the lot_id of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public long getLot_id() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getLot_id();
	}

	/**
	* Returns the ocenka_uchastnikam_v_moment_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @return the ocenka_uchastnikam_v_moment_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public long getOcenka_uchastnikam_v_moment_vskrytija_id() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getOcenka_uchastnikam_v_moment_vskrytija_id();
	}

	/**
	* Returns the otkazal of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @return the otkazal of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public long getOtkazal() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getOtkazal();
	}

	/**
	* Returns the postavwik_id of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @return the postavwik_id of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public long getPostavwik_id() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getPostavwik_id();
	}

	/**
	* Returns the primary key of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @return the primary key of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public long getPrimaryKey() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getPrimaryKey();
	}

	/**
	* Returns the protokol_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @return the protokol_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public long getProtokol_vskrytija_id() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getProtokol_vskrytija_id();
	}

	/**
	* Returns the status of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @return the status of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public long getStatus() {
		return _ocenka_uchastnikam_v_moment_vskrytija.getStatus();
	}

	@Override
	public tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija toEscapedModel() {
		return new ocenka_uchastnikam_v_moment_vskrytijaWrapper(_ocenka_uchastnikam_v_moment_vskrytija.toEscapedModel());
	}

	@Override
	public tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija toUnescapedModel() {
		return new ocenka_uchastnikam_v_moment_vskrytijaWrapper(_ocenka_uchastnikam_v_moment_vskrytija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_ocenka_uchastnikam_v_moment_vskrytija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ocenka_uchastnikam_v_moment_vskrytija.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_otkaza of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @param data_otkaza the data_otkaza of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public void setData_otkaza(Date data_otkaza) {
		_ocenka_uchastnikam_v_moment_vskrytija.setData_otkaza(data_otkaza);
	}

	/**
	* Sets the data_vskrytija of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @param data_vskrytija the data_vskrytija of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public void setData_vskrytija(Date data_vskrytija) {
		_ocenka_uchastnikam_v_moment_vskrytija.setData_vskrytija(data_vskrytija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ocenka_uchastnikam_v_moment_vskrytija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ocenka_uchastnikam_v_moment_vskrytija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ocenka_uchastnikam_v_moment_vskrytija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @param izvewenie_id the izvewenie_id of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_ocenka_uchastnikam_v_moment_vskrytija.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the lot_id of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @param lot_id the lot_id of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public void setLot_id(long lot_id) {
		_ocenka_uchastnikam_v_moment_vskrytija.setLot_id(lot_id);
	}

	@Override
	public void setNew(boolean n) {
		_ocenka_uchastnikam_v_moment_vskrytija.setNew(n);
	}

	/**
	* Sets the ocenka_uchastnikam_v_moment_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija_id the ocenka_uchastnikam_v_moment_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public void setOcenka_uchastnikam_v_moment_vskrytija_id(
		long ocenka_uchastnikam_v_moment_vskrytija_id) {
		_ocenka_uchastnikam_v_moment_vskrytija.setOcenka_uchastnikam_v_moment_vskrytija_id(ocenka_uchastnikam_v_moment_vskrytija_id);
	}

	/**
	* Sets the otkazal of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @param otkazal the otkazal of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public void setOtkazal(long otkazal) {
		_ocenka_uchastnikam_v_moment_vskrytija.setOtkazal(otkazal);
	}

	/**
	* Sets the postavwik_id of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @param postavwik_id the postavwik_id of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_ocenka_uchastnikam_v_moment_vskrytija.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the prichina_otkaza of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @param prichina_otkaza the prichina_otkaza of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public void setPrichina_otkaza(java.lang.String prichina_otkaza) {
		_ocenka_uchastnikam_v_moment_vskrytija.setPrichina_otkaza(prichina_otkaza);
	}

	/**
	* Sets the primary key of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @param primaryKey the primary key of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ocenka_uchastnikam_v_moment_vskrytija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ocenka_uchastnikam_v_moment_vskrytija.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the protokol_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @param protokol_vskrytija_id the protokol_vskrytija_id of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public void setProtokol_vskrytija_id(long protokol_vskrytija_id) {
		_ocenka_uchastnikam_v_moment_vskrytija.setProtokol_vskrytija_id(protokol_vskrytija_id);
	}

	/**
	* Sets the status of this ocenka_uchastnikam_v_moment_vskrytija.
	*
	* @param status the status of this ocenka_uchastnikam_v_moment_vskrytija
	*/
	@Override
	public void setStatus(long status) {
		_ocenka_uchastnikam_v_moment_vskrytija.setStatus(status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ocenka_uchastnikam_v_moment_vskrytijaWrapper)) {
			return false;
		}

		ocenka_uchastnikam_v_moment_vskrytijaWrapper ocenka_uchastnikam_v_moment_vskrytijaWrapper =
			(ocenka_uchastnikam_v_moment_vskrytijaWrapper)obj;

		if (Objects.equals(_ocenka_uchastnikam_v_moment_vskrytija,
					ocenka_uchastnikam_v_moment_vskrytijaWrapper._ocenka_uchastnikam_v_moment_vskrytija)) {
			return true;
		}

		return false;
	}

	@Override
	public ocenka_uchastnikam_v_moment_vskrytija getWrappedModel() {
		return _ocenka_uchastnikam_v_moment_vskrytija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ocenka_uchastnikam_v_moment_vskrytija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ocenka_uchastnikam_v_moment_vskrytija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ocenka_uchastnikam_v_moment_vskrytija.resetOriginalValues();
	}

	private final ocenka_uchastnikam_v_moment_vskrytija _ocenka_uchastnikam_v_moment_vskrytija;
}