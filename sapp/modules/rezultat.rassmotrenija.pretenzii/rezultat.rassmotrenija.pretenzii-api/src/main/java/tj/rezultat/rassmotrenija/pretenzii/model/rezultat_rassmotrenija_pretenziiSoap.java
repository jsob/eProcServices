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

package tj.rezultat.rassmotrenija.pretenzii.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.rezultat.rassmotrenija.pretenzii.service.http.rezultat_rassmotrenija_pretenziiServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.rezultat.rassmotrenija.pretenzii.service.http.rezultat_rassmotrenija_pretenziiServiceSoap
 * @generated
 */
@ProviderType
public class rezultat_rassmotrenija_pretenziiSoap implements Serializable {
	public static rezultat_rassmotrenija_pretenziiSoap toSoapModel(
		rezultat_rassmotrenija_pretenzii model) {
		rezultat_rassmotrenija_pretenziiSoap soapModel = new rezultat_rassmotrenija_pretenziiSoap();

		soapModel.setData_zagruzki(model.getData_zagruzki());
		soapModel.setImja_fajla(model.getImja_fajla());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setNazvanie_dokumenta(model.getNazvanie_dokumenta());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setRezultat_rassmotrenija_pretenzii_id(model.getRezultat_rassmotrenija_pretenzii_id());
		soapModel.setZagruzil(model.getZagruzil());

		return soapModel;
	}

	public static rezultat_rassmotrenija_pretenziiSoap[] toSoapModels(
		rezultat_rassmotrenija_pretenzii[] models) {
		rezultat_rassmotrenija_pretenziiSoap[] soapModels = new rezultat_rassmotrenija_pretenziiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static rezultat_rassmotrenija_pretenziiSoap[][] toSoapModels(
		rezultat_rassmotrenija_pretenzii[][] models) {
		rezultat_rassmotrenija_pretenziiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new rezultat_rassmotrenija_pretenziiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new rezultat_rassmotrenija_pretenziiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static rezultat_rassmotrenija_pretenziiSoap[] toSoapModels(
		List<rezultat_rassmotrenija_pretenzii> models) {
		List<rezultat_rassmotrenija_pretenziiSoap> soapModels = new ArrayList<rezultat_rassmotrenija_pretenziiSoap>(models.size());

		for (rezultat_rassmotrenija_pretenzii model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new rezultat_rassmotrenija_pretenziiSoap[soapModels.size()]);
	}

	public rezultat_rassmotrenija_pretenziiSoap() {
	}

	public long getPrimaryKey() {
		return _rezultat_rassmotrenija_pretenzii_id;
	}

	public void setPrimaryKey(long pk) {
		setRezultat_rassmotrenija_pretenzii_id(pk);
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

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public long getRezultat_rassmotrenija_pretenzii_id() {
		return _rezultat_rassmotrenija_pretenzii_id;
	}

	public void setRezultat_rassmotrenija_pretenzii_id(
		long rezultat_rassmotrenija_pretenzii_id) {
		_rezultat_rassmotrenija_pretenzii_id = rezultat_rassmotrenija_pretenzii_id;
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
	private long _postavwik_id;
	private long _rezultat_rassmotrenija_pretenzii_id;
	private long _zagruzil;
}