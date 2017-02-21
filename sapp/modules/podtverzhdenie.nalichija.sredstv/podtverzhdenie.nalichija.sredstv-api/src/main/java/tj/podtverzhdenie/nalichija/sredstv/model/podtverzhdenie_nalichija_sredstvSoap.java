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

package tj.podtverzhdenie.nalichija.sredstv.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.podtverzhdenie.nalichija.sredstv.service.http.podtverzhdenie_nalichija_sredstvServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.podtverzhdenie.nalichija.sredstv.service.http.podtverzhdenie_nalichija_sredstvServiceSoap
 * @generated
 */
@ProviderType
public class podtverzhdenie_nalichija_sredstvSoap implements Serializable {
	public static podtverzhdenie_nalichija_sredstvSoap toSoapModel(
		podtverzhdenie_nalichija_sredstv model) {
		podtverzhdenie_nalichija_sredstvSoap soapModel = new podtverzhdenie_nalichija_sredstvSoap();

		soapModel.setData_zagruzki(model.getData_zagruzki());
		soapModel.setImja_fajla(model.getImja_fajla());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setNazvanie_dokumenta(model.getNazvanie_dokumenta());
		soapModel.setPodtverzhdenie_nalichija_sredstv_id(model.getPodtverzhdenie_nalichija_sredstv_id());
		soapModel.setZagruzil(model.getZagruzil());

		return soapModel;
	}

	public static podtverzhdenie_nalichija_sredstvSoap[] toSoapModels(
		podtverzhdenie_nalichija_sredstv[] models) {
		podtverzhdenie_nalichija_sredstvSoap[] soapModels = new podtverzhdenie_nalichija_sredstvSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static podtverzhdenie_nalichija_sredstvSoap[][] toSoapModels(
		podtverzhdenie_nalichija_sredstv[][] models) {
		podtverzhdenie_nalichija_sredstvSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new podtverzhdenie_nalichija_sredstvSoap[models.length][models[0].length];
		}
		else {
			soapModels = new podtverzhdenie_nalichija_sredstvSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static podtverzhdenie_nalichija_sredstvSoap[] toSoapModels(
		List<podtverzhdenie_nalichija_sredstv> models) {
		List<podtverzhdenie_nalichija_sredstvSoap> soapModels = new ArrayList<podtverzhdenie_nalichija_sredstvSoap>(models.size());

		for (podtverzhdenie_nalichija_sredstv model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new podtverzhdenie_nalichija_sredstvSoap[soapModels.size()]);
	}

	public podtverzhdenie_nalichija_sredstvSoap() {
	}

	public long getPrimaryKey() {
		return _podtverzhdenie_nalichija_sredstv_id;
	}

	public void setPrimaryKey(long pk) {
		setPodtverzhdenie_nalichija_sredstv_id(pk);
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

	public long getPodtverzhdenie_nalichija_sredstv_id() {
		return _podtverzhdenie_nalichija_sredstv_id;
	}

	public void setPodtverzhdenie_nalichija_sredstv_id(
		long podtverzhdenie_nalichija_sredstv_id) {
		_podtverzhdenie_nalichija_sredstv_id = podtverzhdenie_nalichija_sredstv_id;
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
	private long _podtverzhdenie_nalichija_sredstv_id;
	private long _zagruzil;
}