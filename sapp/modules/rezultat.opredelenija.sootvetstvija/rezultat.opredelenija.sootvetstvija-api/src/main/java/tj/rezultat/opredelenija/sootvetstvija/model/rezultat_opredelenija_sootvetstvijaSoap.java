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

package tj.rezultat.opredelenija.sootvetstvija.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.rezultat.opredelenija.sootvetstvija.service.http.rezultat_opredelenija_sootvetstvijaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.rezultat.opredelenija.sootvetstvija.service.http.rezultat_opredelenija_sootvetstvijaServiceSoap
 * @generated
 */
@ProviderType
public class rezultat_opredelenija_sootvetstvijaSoap implements Serializable {
	public static rezultat_opredelenija_sootvetstvijaSoap toSoapModel(
		rezultat_opredelenija_sootvetstvija model) {
		rezultat_opredelenija_sootvetstvijaSoap soapModel = new rezultat_opredelenija_sootvetstvijaSoap();

		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setRezultat_opredelenija_sootvetstvija_id(model.getRezultat_opredelenija_sootvetstvija_id());
		soapModel.setSozdal(model.getSozdal());

		return soapModel;
	}

	public static rezultat_opredelenija_sootvetstvijaSoap[] toSoapModels(
		rezultat_opredelenija_sootvetstvija[] models) {
		rezultat_opredelenija_sootvetstvijaSoap[] soapModels = new rezultat_opredelenija_sootvetstvijaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static rezultat_opredelenija_sootvetstvijaSoap[][] toSoapModels(
		rezultat_opredelenija_sootvetstvija[][] models) {
		rezultat_opredelenija_sootvetstvijaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new rezultat_opredelenija_sootvetstvijaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new rezultat_opredelenija_sootvetstvijaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static rezultat_opredelenija_sootvetstvijaSoap[] toSoapModels(
		List<rezultat_opredelenija_sootvetstvija> models) {
		List<rezultat_opredelenija_sootvetstvijaSoap> soapModels = new ArrayList<rezultat_opredelenija_sootvetstvijaSoap>(models.size());

		for (rezultat_opredelenija_sootvetstvija model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new rezultat_opredelenija_sootvetstvijaSoap[soapModels.size()]);
	}

	public rezultat_opredelenija_sootvetstvijaSoap() {
	}

	public long getPrimaryKey() {
		return _rezultat_opredelenija_sootvetstvija_id;
	}

	public void setPrimaryKey(long pk) {
		setRezultat_opredelenija_sootvetstvija_id(pk);
	}

	public Date getData_sozdanija() {
		return _data_sozdanija;
	}

	public void setData_sozdanija(Date data_sozdanija) {
		_data_sozdanija = data_sozdanija;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public long getRezultat_opredelenija_sootvetstvija_id() {
		return _rezultat_opredelenija_sootvetstvija_id;
	}

	public void setRezultat_opredelenija_sootvetstvija_id(
		long rezultat_opredelenija_sootvetstvija_id) {
		_rezultat_opredelenija_sootvetstvija_id = rezultat_opredelenija_sootvetstvija_id;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	private Date _data_sozdanija;
	private long _izvewenie_id;
	private long _rezultat_opredelenija_sootvetstvija_id;
	private long _sozdal;
}