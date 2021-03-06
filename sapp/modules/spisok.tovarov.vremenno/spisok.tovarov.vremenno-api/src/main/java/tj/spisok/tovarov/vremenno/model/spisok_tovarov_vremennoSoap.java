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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.spisok.tovarov.vremenno.service.http.spisok_tovarov_vremennoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.spisok.tovarov.vremenno.service.http.spisok_tovarov_vremennoServiceSoap
 * @generated
 */
@ProviderType
public class spisok_tovarov_vremennoSoap implements Serializable {
	public static spisok_tovarov_vremennoSoap toSoapModel(
		spisok_tovarov_vremenno model) {
		spisok_tovarov_vremennoSoap soapModel = new spisok_tovarov_vremennoSoap();

		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setEdinica_izmerenija_id(model.getEdinica_izmerenija_id());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setKlassifikacija_po_okdp(model.getKlassifikacija_po_okdp());
		soapModel.setKod_po_okdp(model.getKod_po_okdp());
		soapModel.setKod_po_spravochniku_naimenovanij(model.getKod_po_spravochniku_naimenovanij());
		soapModel.setKod_strany_proizvoditelja(model.getKod_strany_proizvoditelja());
		soapModel.setKolichestvo(model.getKolichestvo());
		soapModel.setNaimenovanie_tovara(model.getNaimenovanie_tovara());
		soapModel.setNomer_lota(model.getNomer_lota());
		soapModel.setOpisanie_tovara(model.getOpisanie_tovara());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setSpisok_tovarov_vremenno_id(model.getSpisok_tovarov_vremenno_id());

		return soapModel;
	}

	public static spisok_tovarov_vremennoSoap[] toSoapModels(
		spisok_tovarov_vremenno[] models) {
		spisok_tovarov_vremennoSoap[] soapModels = new spisok_tovarov_vremennoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static spisok_tovarov_vremennoSoap[][] toSoapModels(
		spisok_tovarov_vremenno[][] models) {
		spisok_tovarov_vremennoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new spisok_tovarov_vremennoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new spisok_tovarov_vremennoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static spisok_tovarov_vremennoSoap[] toSoapModels(
		List<spisok_tovarov_vremenno> models) {
		List<spisok_tovarov_vremennoSoap> soapModels = new ArrayList<spisok_tovarov_vremennoSoap>(models.size());

		for (spisok_tovarov_vremenno model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new spisok_tovarov_vremennoSoap[soapModels.size()]);
	}

	public spisok_tovarov_vremennoSoap() {
	}

	public long getPrimaryKey() {
		return _spisok_tovarov_vremenno_id;
	}

	public void setPrimaryKey(long pk) {
		setSpisok_tovarov_vremenno_id(pk);
	}

	public Date getData_sozdanija() {
		return _data_sozdanija;
	}

	public void setData_sozdanija(Date data_sozdanija) {
		_data_sozdanija = data_sozdanija;
	}

	public long getEdinica_izmerenija_id() {
		return _edinica_izmerenija_id;
	}

	public void setEdinica_izmerenija_id(long edinica_izmerenija_id) {
		_edinica_izmerenija_id = edinica_izmerenija_id;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public String getKlassifikacija_po_okdp() {
		return _klassifikacija_po_okdp;
	}

	public void setKlassifikacija_po_okdp(String klassifikacija_po_okdp) {
		_klassifikacija_po_okdp = klassifikacija_po_okdp;
	}

	public String getKod_po_okdp() {
		return _kod_po_okdp;
	}

	public void setKod_po_okdp(String kod_po_okdp) {
		_kod_po_okdp = kod_po_okdp;
	}

	public long getKod_po_spravochniku_naimenovanij() {
		return _kod_po_spravochniku_naimenovanij;
	}

	public void setKod_po_spravochniku_naimenovanij(
		long kod_po_spravochniku_naimenovanij) {
		_kod_po_spravochniku_naimenovanij = kod_po_spravochniku_naimenovanij;
	}

	public long getKod_strany_proizvoditelja() {
		return _kod_strany_proizvoditelja;
	}

	public void setKod_strany_proizvoditelja(long kod_strany_proizvoditelja) {
		_kod_strany_proizvoditelja = kod_strany_proizvoditelja;
	}

	public long getKolichestvo() {
		return _kolichestvo;
	}

	public void setKolichestvo(long kolichestvo) {
		_kolichestvo = kolichestvo;
	}

	public String getNaimenovanie_tovara() {
		return _naimenovanie_tovara;
	}

	public void setNaimenovanie_tovara(String naimenovanie_tovara) {
		_naimenovanie_tovara = naimenovanie_tovara;
	}

	public long getNomer_lota() {
		return _nomer_lota;
	}

	public void setNomer_lota(long nomer_lota) {
		_nomer_lota = nomer_lota;
	}

	public String getOpisanie_tovara() {
		return _opisanie_tovara;
	}

	public void setOpisanie_tovara(String opisanie_tovara) {
		_opisanie_tovara = opisanie_tovara;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	public long getSpisok_tovarov_vremenno_id() {
		return _spisok_tovarov_vremenno_id;
	}

	public void setSpisok_tovarov_vremenno_id(long spisok_tovarov_vremenno_id) {
		_spisok_tovarov_vremenno_id = spisok_tovarov_vremenno_id;
	}

	private Date _data_sozdanija;
	private long _edinica_izmerenija_id;
	private long _izvewenie_id;
	private String _klassifikacija_po_okdp;
	private String _kod_po_okdp;
	private long _kod_po_spravochniku_naimenovanij;
	private long _kod_strany_proizvoditelja;
	private long _kolichestvo;
	private String _naimenovanie_tovara;
	private long _nomer_lota;
	private String _opisanie_tovara;
	private long _sozdal;
	private long _spisok_tovarov_vremenno_id;
}