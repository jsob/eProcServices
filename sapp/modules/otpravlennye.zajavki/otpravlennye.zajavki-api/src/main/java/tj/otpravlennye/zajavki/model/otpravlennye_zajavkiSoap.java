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

package tj.otpravlennye.zajavki.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.otpravlennye.zajavki.service.http.otpravlennye_zajavkiServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.otpravlennye.zajavki.service.http.otpravlennye_zajavkiServiceSoap
 * @generated
 */
@ProviderType
public class otpravlennye_zajavkiSoap implements Serializable {
	public static otpravlennye_zajavkiSoap toSoapModel(
		otpravlennye_zajavki model) {
		otpravlennye_zajavkiSoap soapModel = new otpravlennye_zajavkiSoap();

		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_otpravki(model.getData_otpravki());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setKolichestvo_otpravok(model.getKolichestvo_otpravok());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setOtpravil(model.getOtpravil());
		soapModel.setOtpravlennye_zajavki_id(model.getOtpravlennye_zajavki_id());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static otpravlennye_zajavkiSoap[] toSoapModels(
		otpravlennye_zajavki[] models) {
		otpravlennye_zajavkiSoap[] soapModels = new otpravlennye_zajavkiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static otpravlennye_zajavkiSoap[][] toSoapModels(
		otpravlennye_zajavki[][] models) {
		otpravlennye_zajavkiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new otpravlennye_zajavkiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new otpravlennye_zajavkiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static otpravlennye_zajavkiSoap[] toSoapModels(
		List<otpravlennye_zajavki> models) {
		List<otpravlennye_zajavkiSoap> soapModels = new ArrayList<otpravlennye_zajavkiSoap>(models.size());

		for (otpravlennye_zajavki model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new otpravlennye_zajavkiSoap[soapModels.size()]);
	}

	public otpravlennye_zajavkiSoap() {
	}

	public long getPrimaryKey() {
		return _otpravlennye_zajavki_id;
	}

	public void setPrimaryKey(long pk) {
		setOtpravlennye_zajavki_id(pk);
	}

	public Date getData_izmenenija() {
		return _data_izmenenija;
	}

	public void setData_izmenenija(Date data_izmenenija) {
		_data_izmenenija = data_izmenenija;
	}

	public Date getData_otpravki() {
		return _data_otpravki;
	}

	public void setData_otpravki(Date data_otpravki) {
		_data_otpravki = data_otpravki;
	}

	public long getIzmenil() {
		return _izmenil;
	}

	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public long getKolichestvo_otpravok() {
		return _kolichestvo_otpravok;
	}

	public void setKolichestvo_otpravok(long kolichestvo_otpravok) {
		_kolichestvo_otpravok = kolichestvo_otpravok;
	}

	public long getLot_id() {
		return _lot_id;
	}

	public void setLot_id(long lot_id) {
		_lot_id = lot_id;
	}

	public long getOtpravil() {
		return _otpravil;
	}

	public void setOtpravil(long otpravil) {
		_otpravil = otpravil;
	}

	public long getOtpravlennye_zajavki_id() {
		return _otpravlennye_zajavki_id;
	}

	public void setOtpravlennye_zajavki_id(long otpravlennye_zajavki_id) {
		_otpravlennye_zajavki_id = otpravlennye_zajavki_id;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public long getStatus() {
		return _status;
	}

	public void setStatus(long status) {
		_status = status;
	}

	private Date _data_izmenenija;
	private Date _data_otpravki;
	private long _izmenil;
	private long _izvewenie_id;
	private long _kolichestvo_otpravok;
	private long _lot_id;
	private long _otpravil;
	private long _otpravlennye_zajavki_id;
	private long _postavwik_id;
	private long _status;
}