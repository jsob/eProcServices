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

package tj.protokol.vskrytija.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.protokol.vskrytija.service.http.protokol_vskrytijaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.protokol.vskrytija.service.http.protokol_vskrytijaServiceSoap
 * @generated
 */
@ProviderType
public class protokol_vskrytijaSoap implements Serializable {
	public static protokol_vskrytijaSoap toSoapModel(protokol_vskrytija model) {
		protokol_vskrytijaSoap soapModel = new protokol_vskrytijaSoap();

		soapModel.setData_vskrytija(model.getData_vskrytija());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setProtokol_vskrytija_id(model.getProtokol_vskrytija_id());

		return soapModel;
	}

	public static protokol_vskrytijaSoap[] toSoapModels(
		protokol_vskrytija[] models) {
		protokol_vskrytijaSoap[] soapModels = new protokol_vskrytijaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static protokol_vskrytijaSoap[][] toSoapModels(
		protokol_vskrytija[][] models) {
		protokol_vskrytijaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new protokol_vskrytijaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new protokol_vskrytijaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static protokol_vskrytijaSoap[] toSoapModels(
		List<protokol_vskrytija> models) {
		List<protokol_vskrytijaSoap> soapModels = new ArrayList<protokol_vskrytijaSoap>(models.size());

		for (protokol_vskrytija model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new protokol_vskrytijaSoap[soapModels.size()]);
	}

	public protokol_vskrytijaSoap() {
	}

	public long getPrimaryKey() {
		return _protokol_vskrytija_id;
	}

	public void setPrimaryKey(long pk) {
		setProtokol_vskrytija_id(pk);
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

	public long getProtokol_vskrytija_id() {
		return _protokol_vskrytija_id;
	}

	public void setProtokol_vskrytija_id(long protokol_vskrytija_id) {
		_protokol_vskrytija_id = protokol_vskrytija_id;
	}

	private Date _data_vskrytija;
	private long _izvewenie_id;
	private long _protokol_vskrytija_id;
}