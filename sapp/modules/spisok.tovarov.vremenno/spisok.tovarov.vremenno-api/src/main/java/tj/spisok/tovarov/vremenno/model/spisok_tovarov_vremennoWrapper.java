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

package tj.spisok.tovarov.vremenno.model;

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
 * This class is a wrapper for {@link spisok_tovarov_vremenno}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarov_vremenno
 * @generated
 */
@ProviderType
public class spisok_tovarov_vremennoWrapper implements spisok_tovarov_vremenno,
	ModelWrapper<spisok_tovarov_vremenno> {
	public spisok_tovarov_vremennoWrapper(
		spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		_spisok_tovarov_vremenno = spisok_tovarov_vremenno;
	}

	@Override
	public Class<?> getModelClass() {
		return spisok_tovarov_vremenno.class;
	}

	@Override
	public String getModelClassName() {
		return spisok_tovarov_vremenno.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("edinica_izmerenija_id", getEdinica_izmerenija_id());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("klassifikacija_po_okdp", getKlassifikacija_po_okdp());
		attributes.put("kod_po_okdp", getKod_po_okdp());
		attributes.put("kod_po_spravochniku_naimenovanij",
			getKod_po_spravochniku_naimenovanij());
		attributes.put("kod_strany_proizvoditelja",
			getKod_strany_proizvoditelja());
		attributes.put("kolichestvo", getKolichestvo());
		attributes.put("naimenovanie_tovara", getNaimenovanie_tovara());
		attributes.put("nomer_lota", getNomer_lota());
		attributes.put("opisanie_tovara", getOpisanie_tovara());
		attributes.put("sozdal", getSozdal());
		attributes.put("spisok_tovarov_vremenno_id",
			getSpisok_tovarov_vremenno_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Long edinica_izmerenija_id = (Long)attributes.get(
				"edinica_izmerenija_id");

		if (edinica_izmerenija_id != null) {
			setEdinica_izmerenija_id(edinica_izmerenija_id);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		String klassifikacija_po_okdp = (String)attributes.get(
				"klassifikacija_po_okdp");

		if (klassifikacija_po_okdp != null) {
			setKlassifikacija_po_okdp(klassifikacija_po_okdp);
		}

		String kod_po_okdp = (String)attributes.get("kod_po_okdp");

		if (kod_po_okdp != null) {
			setKod_po_okdp(kod_po_okdp);
		}

		Long kod_po_spravochniku_naimenovanij = (Long)attributes.get(
				"kod_po_spravochniku_naimenovanij");

		if (kod_po_spravochniku_naimenovanij != null) {
			setKod_po_spravochniku_naimenovanij(kod_po_spravochniku_naimenovanij);
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

		String naimenovanie_tovara = (String)attributes.get(
				"naimenovanie_tovara");

		if (naimenovanie_tovara != null) {
			setNaimenovanie_tovara(naimenovanie_tovara);
		}

		Long nomer_lota = (Long)attributes.get("nomer_lota");

		if (nomer_lota != null) {
			setNomer_lota(nomer_lota);
		}

		String opisanie_tovara = (String)attributes.get("opisanie_tovara");

		if (opisanie_tovara != null) {
			setOpisanie_tovara(opisanie_tovara);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		Long spisok_tovarov_vremenno_id = (Long)attributes.get(
				"spisok_tovarov_vremenno_id");

		if (spisok_tovarov_vremenno_id != null) {
			setSpisok_tovarov_vremenno_id(spisok_tovarov_vremenno_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _spisok_tovarov_vremenno.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _spisok_tovarov_vremenno.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _spisok_tovarov_vremenno.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _spisok_tovarov_vremenno.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno> toCacheModel() {
		return _spisok_tovarov_vremenno.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		return _spisok_tovarov_vremenno.compareTo(spisok_tovarov_vremenno);
	}

	@Override
	public int hashCode() {
		return _spisok_tovarov_vremenno.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _spisok_tovarov_vremenno.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new spisok_tovarov_vremennoWrapper((spisok_tovarov_vremenno)_spisok_tovarov_vremenno.clone());
	}

	/**
	* Returns the klassifikacija_po_okdp of this spisok_tovarov_vremenno.
	*
	* @return the klassifikacija_po_okdp of this spisok_tovarov_vremenno
	*/
	@Override
	public java.lang.String getKlassifikacija_po_okdp() {
		return _spisok_tovarov_vremenno.getKlassifikacija_po_okdp();
	}

	/**
	* Returns the kod_po_okdp of this spisok_tovarov_vremenno.
	*
	* @return the kod_po_okdp of this spisok_tovarov_vremenno
	*/
	@Override
	public java.lang.String getKod_po_okdp() {
		return _spisok_tovarov_vremenno.getKod_po_okdp();
	}

	/**
	* Returns the naimenovanie_tovara of this spisok_tovarov_vremenno.
	*
	* @return the naimenovanie_tovara of this spisok_tovarov_vremenno
	*/
	@Override
	public java.lang.String getNaimenovanie_tovara() {
		return _spisok_tovarov_vremenno.getNaimenovanie_tovara();
	}

	/**
	* Returns the opisanie_tovara of this spisok_tovarov_vremenno.
	*
	* @return the opisanie_tovara of this spisok_tovarov_vremenno
	*/
	@Override
	public java.lang.String getOpisanie_tovara() {
		return _spisok_tovarov_vremenno.getOpisanie_tovara();
	}

	@Override
	public java.lang.String toString() {
		return _spisok_tovarov_vremenno.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _spisok_tovarov_vremenno.toXmlString();
	}

	/**
	* Returns the data_sozdanija of this spisok_tovarov_vremenno.
	*
	* @return the data_sozdanija of this spisok_tovarov_vremenno
	*/
	@Override
	public Date getData_sozdanija() {
		return _spisok_tovarov_vremenno.getData_sozdanija();
	}

	/**
	* Returns the edinica_izmerenija_id of this spisok_tovarov_vremenno.
	*
	* @return the edinica_izmerenija_id of this spisok_tovarov_vremenno
	*/
	@Override
	public long getEdinica_izmerenija_id() {
		return _spisok_tovarov_vremenno.getEdinica_izmerenija_id();
	}

	/**
	* Returns the izvewenie_id of this spisok_tovarov_vremenno.
	*
	* @return the izvewenie_id of this spisok_tovarov_vremenno
	*/
	@Override
	public long getIzvewenie_id() {
		return _spisok_tovarov_vremenno.getIzvewenie_id();
	}

	/**
	* Returns the kod_po_spravochniku_naimenovanij of this spisok_tovarov_vremenno.
	*
	* @return the kod_po_spravochniku_naimenovanij of this spisok_tovarov_vremenno
	*/
	@Override
	public long getKod_po_spravochniku_naimenovanij() {
		return _spisok_tovarov_vremenno.getKod_po_spravochniku_naimenovanij();
	}

	/**
	* Returns the kod_strany_proizvoditelja of this spisok_tovarov_vremenno.
	*
	* @return the kod_strany_proizvoditelja of this spisok_tovarov_vremenno
	*/
	@Override
	public long getKod_strany_proizvoditelja() {
		return _spisok_tovarov_vremenno.getKod_strany_proizvoditelja();
	}

	/**
	* Returns the kolichestvo of this spisok_tovarov_vremenno.
	*
	* @return the kolichestvo of this spisok_tovarov_vremenno
	*/
	@Override
	public long getKolichestvo() {
		return _spisok_tovarov_vremenno.getKolichestvo();
	}

	/**
	* Returns the nomer_lota of this spisok_tovarov_vremenno.
	*
	* @return the nomer_lota of this spisok_tovarov_vremenno
	*/
	@Override
	public long getNomer_lota() {
		return _spisok_tovarov_vremenno.getNomer_lota();
	}

	/**
	* Returns the primary key of this spisok_tovarov_vremenno.
	*
	* @return the primary key of this spisok_tovarov_vremenno
	*/
	@Override
	public long getPrimaryKey() {
		return _spisok_tovarov_vremenno.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this spisok_tovarov_vremenno.
	*
	* @return the sozdal of this spisok_tovarov_vremenno
	*/
	@Override
	public long getSozdal() {
		return _spisok_tovarov_vremenno.getSozdal();
	}

	/**
	* Returns the spisok_tovarov_vremenno_id of this spisok_tovarov_vremenno.
	*
	* @return the spisok_tovarov_vremenno_id of this spisok_tovarov_vremenno
	*/
	@Override
	public long getSpisok_tovarov_vremenno_id() {
		return _spisok_tovarov_vremenno.getSpisok_tovarov_vremenno_id();
	}

	@Override
	public tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno toEscapedModel() {
		return new spisok_tovarov_vremennoWrapper(_spisok_tovarov_vremenno.toEscapedModel());
	}

	@Override
	public tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno toUnescapedModel() {
		return new spisok_tovarov_vremennoWrapper(_spisok_tovarov_vremenno.toUnescapedModel());
	}

	@Override
	public void persist() {
		_spisok_tovarov_vremenno.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_spisok_tovarov_vremenno.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_sozdanija of this spisok_tovarov_vremenno.
	*
	* @param data_sozdanija the data_sozdanija of this spisok_tovarov_vremenno
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_spisok_tovarov_vremenno.setData_sozdanija(data_sozdanija);
	}

	/**
	* Sets the edinica_izmerenija_id of this spisok_tovarov_vremenno.
	*
	* @param edinica_izmerenija_id the edinica_izmerenija_id of this spisok_tovarov_vremenno
	*/
	@Override
	public void setEdinica_izmerenija_id(long edinica_izmerenija_id) {
		_spisok_tovarov_vremenno.setEdinica_izmerenija_id(edinica_izmerenija_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_spisok_tovarov_vremenno.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_spisok_tovarov_vremenno.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_spisok_tovarov_vremenno.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this spisok_tovarov_vremenno.
	*
	* @param izvewenie_id the izvewenie_id of this spisok_tovarov_vremenno
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_spisok_tovarov_vremenno.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the klassifikacija_po_okdp of this spisok_tovarov_vremenno.
	*
	* @param klassifikacija_po_okdp the klassifikacija_po_okdp of this spisok_tovarov_vremenno
	*/
	@Override
	public void setKlassifikacija_po_okdp(
		java.lang.String klassifikacija_po_okdp) {
		_spisok_tovarov_vremenno.setKlassifikacija_po_okdp(klassifikacija_po_okdp);
	}

	/**
	* Sets the kod_po_okdp of this spisok_tovarov_vremenno.
	*
	* @param kod_po_okdp the kod_po_okdp of this spisok_tovarov_vremenno
	*/
	@Override
	public void setKod_po_okdp(java.lang.String kod_po_okdp) {
		_spisok_tovarov_vremenno.setKod_po_okdp(kod_po_okdp);
	}

	/**
	* Sets the kod_po_spravochniku_naimenovanij of this spisok_tovarov_vremenno.
	*
	* @param kod_po_spravochniku_naimenovanij the kod_po_spravochniku_naimenovanij of this spisok_tovarov_vremenno
	*/
	@Override
	public void setKod_po_spravochniku_naimenovanij(
		long kod_po_spravochniku_naimenovanij) {
		_spisok_tovarov_vremenno.setKod_po_spravochniku_naimenovanij(kod_po_spravochniku_naimenovanij);
	}

	/**
	* Sets the kod_strany_proizvoditelja of this spisok_tovarov_vremenno.
	*
	* @param kod_strany_proizvoditelja the kod_strany_proizvoditelja of this spisok_tovarov_vremenno
	*/
	@Override
	public void setKod_strany_proizvoditelja(long kod_strany_proizvoditelja) {
		_spisok_tovarov_vremenno.setKod_strany_proizvoditelja(kod_strany_proizvoditelja);
	}

	/**
	* Sets the kolichestvo of this spisok_tovarov_vremenno.
	*
	* @param kolichestvo the kolichestvo of this spisok_tovarov_vremenno
	*/
	@Override
	public void setKolichestvo(long kolichestvo) {
		_spisok_tovarov_vremenno.setKolichestvo(kolichestvo);
	}

	/**
	* Sets the naimenovanie_tovara of this spisok_tovarov_vremenno.
	*
	* @param naimenovanie_tovara the naimenovanie_tovara of this spisok_tovarov_vremenno
	*/
	@Override
	public void setNaimenovanie_tovara(java.lang.String naimenovanie_tovara) {
		_spisok_tovarov_vremenno.setNaimenovanie_tovara(naimenovanie_tovara);
	}

	@Override
	public void setNew(boolean n) {
		_spisok_tovarov_vremenno.setNew(n);
	}

	/**
	* Sets the nomer_lota of this spisok_tovarov_vremenno.
	*
	* @param nomer_lota the nomer_lota of this spisok_tovarov_vremenno
	*/
	@Override
	public void setNomer_lota(long nomer_lota) {
		_spisok_tovarov_vremenno.setNomer_lota(nomer_lota);
	}

	/**
	* Sets the opisanie_tovara of this spisok_tovarov_vremenno.
	*
	* @param opisanie_tovara the opisanie_tovara of this spisok_tovarov_vremenno
	*/
	@Override
	public void setOpisanie_tovara(java.lang.String opisanie_tovara) {
		_spisok_tovarov_vremenno.setOpisanie_tovara(opisanie_tovara);
	}

	/**
	* Sets the primary key of this spisok_tovarov_vremenno.
	*
	* @param primaryKey the primary key of this spisok_tovarov_vremenno
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_spisok_tovarov_vremenno.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_spisok_tovarov_vremenno.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this spisok_tovarov_vremenno.
	*
	* @param sozdal the sozdal of this spisok_tovarov_vremenno
	*/
	@Override
	public void setSozdal(long sozdal) {
		_spisok_tovarov_vremenno.setSozdal(sozdal);
	}

	/**
	* Sets the spisok_tovarov_vremenno_id of this spisok_tovarov_vremenno.
	*
	* @param spisok_tovarov_vremenno_id the spisok_tovarov_vremenno_id of this spisok_tovarov_vremenno
	*/
	@Override
	public void setSpisok_tovarov_vremenno_id(long spisok_tovarov_vremenno_id) {
		_spisok_tovarov_vremenno.setSpisok_tovarov_vremenno_id(spisok_tovarov_vremenno_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof spisok_tovarov_vremennoWrapper)) {
			return false;
		}

		spisok_tovarov_vremennoWrapper spisok_tovarov_vremennoWrapper = (spisok_tovarov_vremennoWrapper)obj;

		if (Objects.equals(_spisok_tovarov_vremenno,
					spisok_tovarov_vremennoWrapper._spisok_tovarov_vremenno)) {
			return true;
		}

		return false;
	}

	@Override
	public spisok_tovarov_vremenno getWrappedModel() {
		return _spisok_tovarov_vremenno;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _spisok_tovarov_vremenno.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _spisok_tovarov_vremenno.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_spisok_tovarov_vremenno.resetOriginalValues();
	}

	private final spisok_tovarov_vremenno _spisok_tovarov_vremenno;
}