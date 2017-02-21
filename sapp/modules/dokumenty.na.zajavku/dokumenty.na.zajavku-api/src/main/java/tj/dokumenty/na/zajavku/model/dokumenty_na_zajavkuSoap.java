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

package tj.dokumenty.na.zajavku.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.dokumenty.na.zajavku.service.http.dokumenty_na_zajavkuServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.dokumenty.na.zajavku.service.http.dokumenty_na_zajavkuServiceSoap
 * @generated
 */
@ProviderType
public class dokumenty_na_zajavkuSoap implements Serializable {
	public static dokumenty_na_zajavkuSoap toSoapModel(
		dokumenty_na_zajavku model) {
		dokumenty_na_zajavkuSoap soapModel = new dokumenty_na_zajavkuSoap();

		soapModel.setDokumenty_na_zajavku_id(model.getDokumenty_na_zajavku_id());
		soapModel.setData_zagruzki(model.getData_zagruzki());
		soapModel.setImja_fajla(model.getImja_fajla());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setNazvanie_dokumenta(model.getNazvanie_dokumenta());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setZagruzil(model.getZagruzil());

		return soapModel;
	}

	public static dokumenty_na_zajavkuSoap[] toSoapModels(
		dokumenty_na_zajavku[] models) {
		dokumenty_na_zajavkuSoap[] soapModels = new dokumenty_na_zajavkuSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static dokumenty_na_zajavkuSoap[][] toSoapModels(
		dokumenty_na_zajavku[][] models) {
		dokumenty_na_zajavkuSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new dokumenty_na_zajavkuSoap[models.length][models[0].length];
		}
		else {
			soapModels = new dokumenty_na_zajavkuSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static dokumenty_na_zajavkuSoap[] toSoapModels(
		List<dokumenty_na_zajavku> models) {
		List<dokumenty_na_zajavkuSoap> soapModels = new ArrayList<dokumenty_na_zajavkuSoap>(models.size());

		for (dokumenty_na_zajavku model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new dokumenty_na_zajavkuSoap[soapModels.size()]);
	}

	public dokumenty_na_zajavkuSoap() {
	}

	public long getPrimaryKey() {
		return _dokumenty_na_zajavku_id;
	}

	public void setPrimaryKey(long pk) {
		setDokumenty_na_zajavku_id(pk);
	}

	public long getDokumenty_na_zajavku_id() {
		return _dokumenty_na_zajavku_id;
	}

	public void setDokumenty_na_zajavku_id(long dokumenty_na_zajavku_id) {
		_dokumenty_na_zajavku_id = dokumenty_na_zajavku_id;
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

	public long getZagruzil() {
		return _zagruzil;
	}

	public void setZagruzil(long zagruzil) {
		_zagruzil = zagruzil;
	}

	private long _dokumenty_na_zajavku_id;
	private Date _data_zagruzki;
	private String _imja_fajla;
	private long _izvewenie_id;
	private long _lot_id;
	private String _nazvanie_dokumenta;
	private long _postavwik_id;
	private long _zagruzil;
}