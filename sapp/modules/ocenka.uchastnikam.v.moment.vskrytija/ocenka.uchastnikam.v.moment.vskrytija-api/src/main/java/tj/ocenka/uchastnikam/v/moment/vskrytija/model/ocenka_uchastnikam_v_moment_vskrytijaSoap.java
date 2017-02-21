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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.ocenka.uchastnikam.v.moment.vskrytija.service.http.ocenka_uchastnikam_v_moment_vskrytijaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.ocenka.uchastnikam.v.moment.vskrytija.service.http.ocenka_uchastnikam_v_moment_vskrytijaServiceSoap
 * @generated
 */
@ProviderType
public class ocenka_uchastnikam_v_moment_vskrytijaSoap implements Serializable {
	public static ocenka_uchastnikam_v_moment_vskrytijaSoap toSoapModel(
		ocenka_uchastnikam_v_moment_vskrytija model) {
		ocenka_uchastnikam_v_moment_vskrytijaSoap soapModel = new ocenka_uchastnikam_v_moment_vskrytijaSoap();

		soapModel.setData_otkaza(model.getData_otkaza());
		soapModel.setData_vskrytija(model.getData_vskrytija());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setOcenka_uchastnikam_v_moment_vskrytija_id(model.getOcenka_uchastnikam_v_moment_vskrytija_id());
		soapModel.setOtkazal(model.getOtkazal());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setPrichina_otkaza(model.getPrichina_otkaza());
		soapModel.setProtokol_vskrytija_id(model.getProtokol_vskrytija_id());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static ocenka_uchastnikam_v_moment_vskrytijaSoap[] toSoapModels(
		ocenka_uchastnikam_v_moment_vskrytija[] models) {
		ocenka_uchastnikam_v_moment_vskrytijaSoap[] soapModels = new ocenka_uchastnikam_v_moment_vskrytijaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ocenka_uchastnikam_v_moment_vskrytijaSoap[][] toSoapModels(
		ocenka_uchastnikam_v_moment_vskrytija[][] models) {
		ocenka_uchastnikam_v_moment_vskrytijaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ocenka_uchastnikam_v_moment_vskrytijaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ocenka_uchastnikam_v_moment_vskrytijaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ocenka_uchastnikam_v_moment_vskrytijaSoap[] toSoapModels(
		List<ocenka_uchastnikam_v_moment_vskrytija> models) {
		List<ocenka_uchastnikam_v_moment_vskrytijaSoap> soapModels = new ArrayList<ocenka_uchastnikam_v_moment_vskrytijaSoap>(models.size());

		for (ocenka_uchastnikam_v_moment_vskrytija model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ocenka_uchastnikam_v_moment_vskrytijaSoap[soapModels.size()]);
	}

	public ocenka_uchastnikam_v_moment_vskrytijaSoap() {
	}

	public long getPrimaryKey() {
		return _ocenka_uchastnikam_v_moment_vskrytija_id;
	}

	public void setPrimaryKey(long pk) {
		setOcenka_uchastnikam_v_moment_vskrytija_id(pk);
	}

	public Date getData_otkaza() {
		return _data_otkaza;
	}

	public void setData_otkaza(Date data_otkaza) {
		_data_otkaza = data_otkaza;
	}

	public Date getData_vskrytija() {
		return _data_vskrytija;
	}

	public void setData_vskrytija(Date data_vskrytija) {
		_data_vskrytija = data_vskrytija;
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

	public long getOcenka_uchastnikam_v_moment_vskrytija_id() {
		return _ocenka_uchastnikam_v_moment_vskrytija_id;
	}

	public void setOcenka_uchastnikam_v_moment_vskrytija_id(
		long ocenka_uchastnikam_v_moment_vskrytija_id) {
		_ocenka_uchastnikam_v_moment_vskrytija_id = ocenka_uchastnikam_v_moment_vskrytija_id;
	}

	public long getOtkazal() {
		return _otkazal;
	}

	public void setOtkazal(long otkazal) {
		_otkazal = otkazal;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public String getPrichina_otkaza() {
		return _prichina_otkaza;
	}

	public void setPrichina_otkaza(String prichina_otkaza) {
		_prichina_otkaza = prichina_otkaza;
	}

	public long getProtokol_vskrytija_id() {
		return _protokol_vskrytija_id;
	}

	public void setProtokol_vskrytija_id(long protokol_vskrytija_id) {
		_protokol_vskrytija_id = protokol_vskrytija_id;
	}

	public long getStatus() {
		return _status;
	}

	public void setStatus(long status) {
		_status = status;
	}

	private Date _data_otkaza;
	private Date _data_vskrytija;
	private long _izvewenie_id;
	private long _lot_id;
	private long _ocenka_uchastnikam_v_moment_vskrytija_id;
	private long _otkazal;
	private long _postavwik_id;
	private String _prichina_otkaza;
	private long _protokol_vskrytija_id;
	private long _status;
}