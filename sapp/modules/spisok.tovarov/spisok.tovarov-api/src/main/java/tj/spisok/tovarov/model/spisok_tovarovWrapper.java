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

package tj.spisok.tovarov.model;

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
 * This class is a wrapper for {@link spisok_tovarov}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarov
 * @generated
 */
@ProviderType
public class spisok_tovarovWrapper implements spisok_tovarov,
	ModelWrapper<spisok_tovarov> {
	public spisok_tovarovWrapper(spisok_tovarov spisok_tovarov) {
		_spisok_tovarov = spisok_tovarov;
	}

	@Override
	public Class<?> getModelClass() {
		return spisok_tovarov.class;
	}

	@Override
	public String getModelClassName() {
		return spisok_tovarov.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("edinica_izmerenija_id", getEdinica_izmerenija_id());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("klassifikacija_po_okdp", getKlassifikacija_po_okdp());
		attributes.put("kod_po_okdp", getKod_po_okdp());
		attributes.put("kod_po_spravochniku_naimenovanij",
			getKod_po_spravochniku_naimenovanij());
		attributes.put("kod_strany_proizvoditelja",
			getKod_strany_proizvoditelja());
		attributes.put("kolichestvo", getKolichestvo());
		attributes.put("lot_id", getLot_id());
		attributes.put("naimenovanie_tovara", getNaimenovanie_tovara());
		attributes.put("opisanie_tovara", getOpisanie_tovara());
		attributes.put("sozdal", getSozdal());
		attributes.put("spisok_tovarov_id", getSpisok_tovarov_id());

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

		Long edinica_izmerenija_id = (Long)attributes.get(
				"edinica_izmerenija_id");

		if (edinica_izmerenija_id != null) {
			setEdinica_izmerenija_id(edinica_izmerenija_id);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
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

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		String naimenovanie_tovara = (String)attributes.get(
				"naimenovanie_tovara");

		if (naimenovanie_tovara != null) {
			setNaimenovanie_tovara(naimenovanie_tovara);
		}

		String opisanie_tovara = (String)attributes.get("opisanie_tovara");

		if (opisanie_tovara != null) {
			setOpisanie_tovara(opisanie_tovara);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		Long spisok_tovarov_id = (Long)attributes.get("spisok_tovarov_id");

		if (spisok_tovarov_id != null) {
			setSpisok_tovarov_id(spisok_tovarov_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _spisok_tovarov.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _spisok_tovarov.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _spisok_tovarov.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _spisok_tovarov.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.spisok.tovarov.model.spisok_tovarov> toCacheModel() {
		return _spisok_tovarov.toCacheModel();
	}

	@Override
	public int compareTo(tj.spisok.tovarov.model.spisok_tovarov spisok_tovarov) {
		return _spisok_tovarov.compareTo(spisok_tovarov);
	}

	@Override
	public int hashCode() {
		return _spisok_tovarov.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _spisok_tovarov.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new spisok_tovarovWrapper((spisok_tovarov)_spisok_tovarov.clone());
	}

	/**
	* Returns the klassifikacija_po_okdp of this spisok_tovarov.
	*
	* @return the klassifikacija_po_okdp of this spisok_tovarov
	*/
	@Override
	public java.lang.String getKlassifikacija_po_okdp() {
		return _spisok_tovarov.getKlassifikacija_po_okdp();
	}

	/**
	* Returns the kod_po_okdp of this spisok_tovarov.
	*
	* @return the kod_po_okdp of this spisok_tovarov
	*/
	@Override
	public java.lang.String getKod_po_okdp() {
		return _spisok_tovarov.getKod_po_okdp();
	}

	/**
	* Returns the naimenovanie_tovara of this spisok_tovarov.
	*
	* @return the naimenovanie_tovara of this spisok_tovarov
	*/
	@Override
	public java.lang.String getNaimenovanie_tovara() {
		return _spisok_tovarov.getNaimenovanie_tovara();
	}

	/**
	* Returns the opisanie_tovara of this spisok_tovarov.
	*
	* @return the opisanie_tovara of this spisok_tovarov
	*/
	@Override
	public java.lang.String getOpisanie_tovara() {
		return _spisok_tovarov.getOpisanie_tovara();
	}

	@Override
	public java.lang.String toString() {
		return _spisok_tovarov.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _spisok_tovarov.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this spisok_tovarov.
	*
	* @return the data_izmenenija of this spisok_tovarov
	*/
	@Override
	public Date getData_izmenenija() {
		return _spisok_tovarov.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this spisok_tovarov.
	*
	* @return the data_sozdanija of this spisok_tovarov
	*/
	@Override
	public Date getData_sozdanija() {
		return _spisok_tovarov.getData_sozdanija();
	}

	/**
	* Returns the edinica_izmerenija_id of this spisok_tovarov.
	*
	* @return the edinica_izmerenija_id of this spisok_tovarov
	*/
	@Override
	public long getEdinica_izmerenija_id() {
		return _spisok_tovarov.getEdinica_izmerenija_id();
	}

	/**
	* Returns the izmenil of this spisok_tovarov.
	*
	* @return the izmenil of this spisok_tovarov
	*/
	@Override
	public long getIzmenil() {
		return _spisok_tovarov.getIzmenil();
	}

	/**
	* Returns the izvewenie_id of this spisok_tovarov.
	*
	* @return the izvewenie_id of this spisok_tovarov
	*/
	@Override
	public long getIzvewenie_id() {
		return _spisok_tovarov.getIzvewenie_id();
	}

	/**
	* Returns the kod_po_spravochniku_naimenovanij of this spisok_tovarov.
	*
	* @return the kod_po_spravochniku_naimenovanij of this spisok_tovarov
	*/
	@Override
	public long getKod_po_spravochniku_naimenovanij() {
		return _spisok_tovarov.getKod_po_spravochniku_naimenovanij();
	}

	/**
	* Returns the kod_strany_proizvoditelja of this spisok_tovarov.
	*
	* @return the kod_strany_proizvoditelja of this spisok_tovarov
	*/
	@Override
	public long getKod_strany_proizvoditelja() {
		return _spisok_tovarov.getKod_strany_proizvoditelja();
	}

	/**
	* Returns the kolichestvo of this spisok_tovarov.
	*
	* @return the kolichestvo of this spisok_tovarov
	*/
	@Override
	public long getKolichestvo() {
		return _spisok_tovarov.getKolichestvo();
	}

	/**
	* Returns the lot_id of this spisok_tovarov.
	*
	* @return the lot_id of this spisok_tovarov
	*/
	@Override
	public long getLot_id() {
		return _spisok_tovarov.getLot_id();
	}

	/**
	* Returns the primary key of this spisok_tovarov.
	*
	* @return the primary key of this spisok_tovarov
	*/
	@Override
	public long getPrimaryKey() {
		return _spisok_tovarov.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this spisok_tovarov.
	*
	* @return the sozdal of this spisok_tovarov
	*/
	@Override
	public long getSozdal() {
		return _spisok_tovarov.getSozdal();
	}

	/**
	* Returns the spisok_tovarov_id of this spisok_tovarov.
	*
	* @return the spisok_tovarov_id of this spisok_tovarov
	*/
	@Override
	public long getSpisok_tovarov_id() {
		return _spisok_tovarov.getSpisok_tovarov_id();
	}

	@Override
	public tj.spisok.tovarov.model.spisok_tovarov toEscapedModel() {
		return new spisok_tovarovWrapper(_spisok_tovarov.toEscapedModel());
	}

	@Override
	public tj.spisok.tovarov.model.spisok_tovarov toUnescapedModel() {
		return new spisok_tovarovWrapper(_spisok_tovarov.toUnescapedModel());
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_spisok_tovarov.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this spisok_tovarov.
	*
	* @param data_izmenenija the data_izmenenija of this spisok_tovarov
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_spisok_tovarov.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this spisok_tovarov.
	*
	* @param data_sozdanija the data_sozdanija of this spisok_tovarov
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_spisok_tovarov.setData_sozdanija(data_sozdanija);
	}

	/**
	* Sets the edinica_izmerenija_id of this spisok_tovarov.
	*
	* @param edinica_izmerenija_id the edinica_izmerenija_id of this spisok_tovarov
	*/
	@Override
	public void setEdinica_izmerenija_id(long edinica_izmerenija_id) {
		_spisok_tovarov.setEdinica_izmerenija_id(edinica_izmerenija_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_spisok_tovarov.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_spisok_tovarov.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_spisok_tovarov.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izmenil of this spisok_tovarov.
	*
	* @param izmenil the izmenil of this spisok_tovarov
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_spisok_tovarov.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenie_id of this spisok_tovarov.
	*
	* @param izvewenie_id the izvewenie_id of this spisok_tovarov
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_spisok_tovarov.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the klassifikacija_po_okdp of this spisok_tovarov.
	*
	* @param klassifikacija_po_okdp the klassifikacija_po_okdp of this spisok_tovarov
	*/
	@Override
	public void setKlassifikacija_po_okdp(
		java.lang.String klassifikacija_po_okdp) {
		_spisok_tovarov.setKlassifikacija_po_okdp(klassifikacija_po_okdp);
	}

	/**
	* Sets the kod_po_okdp of this spisok_tovarov.
	*
	* @param kod_po_okdp the kod_po_okdp of this spisok_tovarov
	*/
	@Override
	public void setKod_po_okdp(java.lang.String kod_po_okdp) {
		_spisok_tovarov.setKod_po_okdp(kod_po_okdp);
	}

	/**
	* Sets the kod_po_spravochniku_naimenovanij of this spisok_tovarov.
	*
	* @param kod_po_spravochniku_naimenovanij the kod_po_spravochniku_naimenovanij of this spisok_tovarov
	*/
	@Override
	public void setKod_po_spravochniku_naimenovanij(
		long kod_po_spravochniku_naimenovanij) {
		_spisok_tovarov.setKod_po_spravochniku_naimenovanij(kod_po_spravochniku_naimenovanij);
	}

	/**
	* Sets the kod_strany_proizvoditelja of this spisok_tovarov.
	*
	* @param kod_strany_proizvoditelja the kod_strany_proizvoditelja of this spisok_tovarov
	*/
	@Override
	public void setKod_strany_proizvoditelja(long kod_strany_proizvoditelja) {
		_spisok_tovarov.setKod_strany_proizvoditelja(kod_strany_proizvoditelja);
	}

	/**
	* Sets the kolichestvo of this spisok_tovarov.
	*
	* @param kolichestvo the kolichestvo of this spisok_tovarov
	*/
	@Override
	public void setKolichestvo(long kolichestvo) {
		_spisok_tovarov.setKolichestvo(kolichestvo);
	}

	/**
	* Sets the lot_id of this spisok_tovarov.
	*
	* @param lot_id the lot_id of this spisok_tovarov
	*/
	@Override
	public void setLot_id(long lot_id) {
		_spisok_tovarov.setLot_id(lot_id);
	}

	/**
	* Sets the naimenovanie_tovara of this spisok_tovarov.
	*
	* @param naimenovanie_tovara the naimenovanie_tovara of this spisok_tovarov
	*/
	@Override
	public void setNaimenovanie_tovara(java.lang.String naimenovanie_tovara) {
		_spisok_tovarov.setNaimenovanie_tovara(naimenovanie_tovara);
	}

	@Override
	public void setNew(boolean n) {
		_spisok_tovarov.setNew(n);
	}

	/**
	* Sets the opisanie_tovara of this spisok_tovarov.
	*
	* @param opisanie_tovara the opisanie_tovara of this spisok_tovarov
	*/
	@Override
	public void setOpisanie_tovara(java.lang.String opisanie_tovara) {
		_spisok_tovarov.setOpisanie_tovara(opisanie_tovara);
	}

	/**
	* Sets the primary key of this spisok_tovarov.
	*
	* @param primaryKey the primary key of this spisok_tovarov
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_spisok_tovarov.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_spisok_tovarov.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this spisok_tovarov.
	*
	* @param sozdal the sozdal of this spisok_tovarov
	*/
	@Override
	public void setSozdal(long sozdal) {
		_spisok_tovarov.setSozdal(sozdal);
	}

	/**
	* Sets the spisok_tovarov_id of this spisok_tovarov.
	*
	* @param spisok_tovarov_id the spisok_tovarov_id of this spisok_tovarov
	*/
	@Override
	public void setSpisok_tovarov_id(long spisok_tovarov_id) {
		_spisok_tovarov.setSpisok_tovarov_id(spisok_tovarov_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof spisok_tovarovWrapper)) {
			return false;
		}

		spisok_tovarovWrapper spisok_tovarovWrapper = (spisok_tovarovWrapper)obj;

		if (Objects.equals(_spisok_tovarov,
					spisok_tovarovWrapper._spisok_tovarov)) {
			return true;
		}

		return false;
	}

	@Override
	public spisok_tovarov getWrappedModel() {
		return _spisok_tovarov;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _spisok_tovarov.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _spisok_tovarov.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_spisok_tovarov.resetOriginalValues();
	}

	private final spisok_tovarov _spisok_tovarov;
}