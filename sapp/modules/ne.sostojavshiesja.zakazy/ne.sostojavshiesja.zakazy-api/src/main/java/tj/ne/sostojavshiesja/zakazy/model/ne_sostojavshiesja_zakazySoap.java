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

package tj.ne.sostojavshiesja.zakazy.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.ne.sostojavshiesja.zakazy.service.http.ne_sostojavshiesja_zakazyServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.ne.sostojavshiesja.zakazy.service.http.ne_sostojavshiesja_zakazyServiceSoap
 * @generated
 */
@ProviderType
public class ne_sostojavshiesja_zakazySoap implements Serializable {
	public static ne_sostojavshiesja_zakazySoap toSoapModel(
		ne_sostojavshiesja_zakazy model) {
		ne_sostojavshiesja_zakazySoap soapModel = new ne_sostojavshiesja_zakazySoap();

		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setNe_sostojavshiesja_zakazy_id(model.getNe_sostojavshiesja_zakazy_id());
		soapModel.setPrichina(model.getPrichina());
		soapModel.setSozdal(model.getSozdal());

		return soapModel;
	}

	public static ne_sostojavshiesja_zakazySoap[] toSoapModels(
		ne_sostojavshiesja_zakazy[] models) {
		ne_sostojavshiesja_zakazySoap[] soapModels = new ne_sostojavshiesja_zakazySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ne_sostojavshiesja_zakazySoap[][] toSoapModels(
		ne_sostojavshiesja_zakazy[][] models) {
		ne_sostojavshiesja_zakazySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ne_sostojavshiesja_zakazySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ne_sostojavshiesja_zakazySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ne_sostojavshiesja_zakazySoap[] toSoapModels(
		List<ne_sostojavshiesja_zakazy> models) {
		List<ne_sostojavshiesja_zakazySoap> soapModels = new ArrayList<ne_sostojavshiesja_zakazySoap>(models.size());

		for (ne_sostojavshiesja_zakazy model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ne_sostojavshiesja_zakazySoap[soapModels.size()]);
	}

	public ne_sostojavshiesja_zakazySoap() {
	}

	public long getPrimaryKey() {
		return _ne_sostojavshiesja_zakazy_id;
	}

	public void setPrimaryKey(long pk) {
		setNe_sostojavshiesja_zakazy_id(pk);
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

	public long getNe_sostojavshiesja_zakazy_id() {
		return _ne_sostojavshiesja_zakazy_id;
	}

	public void setNe_sostojavshiesja_zakazy_id(
		long ne_sostojavshiesja_zakazy_id) {
		_ne_sostojavshiesja_zakazy_id = ne_sostojavshiesja_zakazy_id;
	}

	public String getPrichina() {
		return _prichina;
	}

	public void setPrichina(String prichina) {
		_prichina = prichina;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	private Date _data_sozdanija;
	private long _izvewenie_id;
	private long _ne_sostojavshiesja_zakazy_id;
	private String _prichina;
	private long _sozdal;
}