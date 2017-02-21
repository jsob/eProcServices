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

package tj.pretenzii.ot.postavshhikov.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.pretenzii.ot.postavshhikov.service.http.pretenzii_ot_postavshhikovServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.pretenzii.ot.postavshhikov.service.http.pretenzii_ot_postavshhikovServiceSoap
 * @generated
 */
@ProviderType
public class pretenzii_ot_postavshhikovSoap implements Serializable {
	public static pretenzii_ot_postavshhikovSoap toSoapModel(
		pretenzii_ot_postavshhikov model) {
		pretenzii_ot_postavshhikovSoap soapModel = new pretenzii_ot_postavshhikovSoap();

		soapModel.setData_zagruzki(model.getData_zagruzki());
		soapModel.setImja_fajla(model.getImja_fajla());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setNazvanie_dokumenta(model.getNazvanie_dokumenta());
		soapModel.setPostavshik_id(model.getPostavshik_id());
		soapModel.setPretenzii_ot_postavshhikov_id(model.getPretenzii_ot_postavshhikov_id());
		soapModel.setZagruzil(model.getZagruzil());

		return soapModel;
	}

	public static pretenzii_ot_postavshhikovSoap[] toSoapModels(
		pretenzii_ot_postavshhikov[] models) {
		pretenzii_ot_postavshhikovSoap[] soapModels = new pretenzii_ot_postavshhikovSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static pretenzii_ot_postavshhikovSoap[][] toSoapModels(
		pretenzii_ot_postavshhikov[][] models) {
		pretenzii_ot_postavshhikovSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new pretenzii_ot_postavshhikovSoap[models.length][models[0].length];
		}
		else {
			soapModels = new pretenzii_ot_postavshhikovSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static pretenzii_ot_postavshhikovSoap[] toSoapModels(
		List<pretenzii_ot_postavshhikov> models) {
		List<pretenzii_ot_postavshhikovSoap> soapModels = new ArrayList<pretenzii_ot_postavshhikovSoap>(models.size());

		for (pretenzii_ot_postavshhikov model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new pretenzii_ot_postavshhikovSoap[soapModels.size()]);
	}

	public pretenzii_ot_postavshhikovSoap() {
	}

	public long getPrimaryKey() {
		return _pretenzii_ot_postavshhikov_id;
	}

	public void setPrimaryKey(long pk) {
		setPretenzii_ot_postavshhikov_id(pk);
	}

	public Date getData_zagruzki() {
		return _data_zagruzki;
	}

	public void setData_zagruzki(Date data_zagruzki) {
		_data_zagruzki = data_zagruzki;
	}

	public String getImja_fajla() {
		return _imja_fajla;
	}

	public void setImja_fajla(String imja_fajla) {
		_imja_fajla = imja_fajla;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public long getLot_id() {
		return _lot_id;
	}

	public void setLot_id(long lot_id) {
		_lot_id = lot_id;
	}

	public String getNazvanie_dokumenta() {
		return _nazvanie_dokumenta;
	}

	public void setNazvanie_dokumenta(String nazvanie_dokumenta) {
		_nazvanie_dokumenta = nazvanie_dokumenta;
	}

	public long getPostavshik_id() {
		return _postavshik_id;
	}

	public void setPostavshik_id(long postavshik_id) {
		_postavshik_id = postavshik_id;
	}

	public long getPretenzii_ot_postavshhikov_id() {
		return _pretenzii_ot_postavshhikov_id;
	}

	public void setPretenzii_ot_postavshhikov_id(
		long pretenzii_ot_postavshhikov_id) {
		_pretenzii_ot_postavshhikov_id = pretenzii_ot_postavshhikov_id;
	}

	public long getZagruzil() {
		return _zagruzil;
	}

	public void setZagruzil(long zagruzil) {
		_zagruzil = zagruzil;
	}

	private Date _data_zagruzki;
	private String _imja_fajla;
	private long _izvewenie_id;
	private long _lot_id;
	private String _nazvanie_dokumenta;
	private long _postavshik_id;
	private long _pretenzii_ot_postavshhikov_id;
	private long _zagruzil;
}