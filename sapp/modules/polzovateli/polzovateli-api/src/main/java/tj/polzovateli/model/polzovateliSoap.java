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

package tj.polzovateli.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.polzovateli.service.http.polzovateliServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.polzovateli.service.http.polzovateliServiceSoap
 * @generated
 */
@ProviderType
public class polzovateliSoap implements Serializable {
	public static polzovateliSoap toSoapModel(polzovateli model) {
		polzovateliSoap soapModel = new polzovateliSoap();

		soapModel.setAktivnost(model.getAktivnost());
		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setImja_polzovatelja(model.getImja_polzovatelja());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setOrganizacija_id(model.getOrganizacija_id());
		soapModel.setParol(model.getParol());
		soapModel.setPodrazdelenije_id(model.getPodrazdelenije_id());
		soapModel.setPolzovateli_id(model.getPolzovateli_id());
		soapModel.setRol_id(model.getRol_id());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setTip_organizacii_id(model.getTip_organizacii_id());

		return soapModel;
	}

	public static polzovateliSoap[] toSoapModels(polzovateli[] models) {
		polzovateliSoap[] soapModels = new polzovateliSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static polzovateliSoap[][] toSoapModels(polzovateli[][] models) {
		polzovateliSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new polzovateliSoap[models.length][models[0].length];
		}
		else {
			soapModels = new polzovateliSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static polzovateliSoap[] toSoapModels(List<polzovateli> models) {
		List<polzovateliSoap> soapModels = new ArrayList<polzovateliSoap>(models.size());

		for (polzovateli model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new polzovateliSoap[soapModels.size()]);
	}

	public polzovateliSoap() {
	}

	public long getPrimaryKey() {
		return _polzovateli_id;
	}

	public void setPrimaryKey(long pk) {
		setPolzovateli_id(pk);
	}

	public long getAktivnost() {
		return _aktivnost;
	}

	public void setAktivnost(long aktivnost) {
		_aktivnost = aktivnost;
	}

	public Date getData_izmenenija() {
		return _data_izmenenija;
	}

	public void setData_izmenenija(Date data_izmenenija) {
		_data_izmenenija = data_izmenenija;
	}

	public Date getData_sozdanija() {
		return _data_sozdanija;
	}

	public void setData_sozdanija(Date data_sozdanija) {
		_data_sozdanija = data_sozdanija;
	}

	public String getImja_polzovatelja() {
		return _imja_polzovatelja;
	}

	public void setImja_polzovatelja(String imja_polzovatelja) {
		_imja_polzovatelja = imja_polzovatelja;
	}

	public long getIzmenil() {
		return _izmenil;
	}

	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	public long getOrganizacija_id() {
		return _organizacija_id;
	}

	public void setOrganizacija_id(long organizacija_id) {
		_organizacija_id = organizacija_id;
	}

	public String getParol() {
		return _parol;
	}

	public void setParol(String parol) {
		_parol = parol;
	}

	public long getPodrazdelenije_id() {
		return _podrazdelenije_id;
	}

	public void setPodrazdelenije_id(long podrazdelenije_id) {
		_podrazdelenije_id = podrazdelenije_id;
	}

	public long getPolzovateli_id() {
		return _polzovateli_id;
	}

	public void setPolzovateli_id(long polzovateli_id) {
		_polzovateli_id = polzovateli_id;
	}

	public long getRol_id() {
		return _rol_id;
	}

	public void setRol_id(long rol_id) {
		_rol_id = rol_id;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	public long getTip_organizacii_id() {
		return _tip_organizacii_id;
	}

	public void setTip_organizacii_id(long tip_organizacii_id) {
		_tip_organizacii_id = tip_organizacii_id;
	}

	private long _aktivnost;
	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private String _imja_polzovatelja;
	private long _izmenil;
	private long _organizacija_id;
	private String _parol;
	private long _podrazdelenije_id;
	private long _polzovateli_id;
	private long _rol_id;
	private long _sozdal;
	private long _tip_organizacii_id;
}