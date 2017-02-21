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

package tj.konkursnaja.dokumentacija.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.konkursnaja.dokumentacija.service.http.konkursnaja_dokumentacijaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.konkursnaja.dokumentacija.service.http.konkursnaja_dokumentacijaServiceSoap
 * @generated
 */
@ProviderType
public class konkursnaja_dokumentacijaSoap implements Serializable {
	public static konkursnaja_dokumentacijaSoap toSoapModel(
		konkursnaja_dokumentacija model) {
		konkursnaja_dokumentacijaSoap soapModel = new konkursnaja_dokumentacijaSoap();

		soapModel.setData_zagruzki(model.getData_zagruzki());
		soapModel.setImja_fajla(model.getImja_fajla());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setKonkursnaja_dokumentacija_id(model.getKonkursnaja_dokumentacija_id());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setNazvanie_dokumenta(model.getNazvanie_dokumenta());
		soapModel.setZagruzil(model.getZagruzil());

		return soapModel;
	}

	public static konkursnaja_dokumentacijaSoap[] toSoapModels(
		konkursnaja_dokumentacija[] models) {
		konkursnaja_dokumentacijaSoap[] soapModels = new konkursnaja_dokumentacijaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static konkursnaja_dokumentacijaSoap[][] toSoapModels(
		konkursnaja_dokumentacija[][] models) {
		konkursnaja_dokumentacijaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new konkursnaja_dokumentacijaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new konkursnaja_dokumentacijaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static konkursnaja_dokumentacijaSoap[] toSoapModels(
		List<konkursnaja_dokumentacija> models) {
		List<konkursnaja_dokumentacijaSoap> soapModels = new ArrayList<konkursnaja_dokumentacijaSoap>(models.size());

		for (konkursnaja_dokumentacija model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new konkursnaja_dokumentacijaSoap[soapModels.size()]);
	}

	public konkursnaja_dokumentacijaSoap() {
	}

	public long getPrimaryKey() {
		return _konkursnaja_dokumentacija_id;
	}

	public void setPrimaryKey(long pk) {
		setKonkursnaja_dokumentacija_id(pk);
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

	public long getKonkursnaja_dokumentacija_id() {
		return _konkursnaja_dokumentacija_id;
	}

	public void setKonkursnaja_dokumentacija_id(
		long konkursnaja_dokumentacija_id) {
		_konkursnaja_dokumentacija_id = konkursnaja_dokumentacija_id;
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

	public long getZagruzil() {
		return _zagruzil;
	}

	public void setZagruzil(long zagruzil) {
		_zagruzil = zagruzil;
	}

	private Date _data_zagruzki;
	private String _imja_fajla;
	private long _izvewenie_id;
	private long _konkursnaja_dokumentacija_id;
	private long _lot_id;
	private String _nazvanie_dokumenta;
	private long _zagruzil;
}