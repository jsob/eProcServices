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

package tj.reestr.kontraktov.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.reestr.kontraktov.service.http.reestr_kontraktovServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.reestr.kontraktov.service.http.reestr_kontraktovServiceSoap
 * @generated
 */
@ProviderType
public class reestr_kontraktovSoap implements Serializable {
	public static reestr_kontraktovSoap toSoapModel(reestr_kontraktov model) {
		reestr_kontraktovSoap soapModel = new reestr_kontraktovSoap();

		soapModel.setData_kontrakta(model.getData_kontrakta());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setReestr_kontraktov_id(model.getReestr_kontraktov_id());
		soapModel.setSozdal(model.getSozdal());

		return soapModel;
	}

	public static reestr_kontraktovSoap[] toSoapModels(
		reestr_kontraktov[] models) {
		reestr_kontraktovSoap[] soapModels = new reestr_kontraktovSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static reestr_kontraktovSoap[][] toSoapModels(
		reestr_kontraktov[][] models) {
		reestr_kontraktovSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new reestr_kontraktovSoap[models.length][models[0].length];
		}
		else {
			soapModels = new reestr_kontraktovSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static reestr_kontraktovSoap[] toSoapModels(
		List<reestr_kontraktov> models) {
		List<reestr_kontraktovSoap> soapModels = new ArrayList<reestr_kontraktovSoap>(models.size());

		for (reestr_kontraktov model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new reestr_kontraktovSoap[soapModels.size()]);
	}

	public reestr_kontraktovSoap() {
	}

	public String getPrimaryKey() {
		return _reestr_kontraktov_id;
	}

	public void setPrimaryKey(String pk) {
		setReestr_kontraktov_id(pk);
	}

	public Date getData_kontrakta() {
		return _data_kontrakta;
	}

	public void setData_kontrakta(Date data_kontrakta) {
		_data_kontrakta = data_kontrakta;
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

	public long getLot_id() {
		return _lot_id;
	}

	public void setLot_id(long lot_id) {
		_lot_id = lot_id;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public String getReestr_kontraktov_id() {
		return _reestr_kontraktov_id;
	}

	public void setReestr_kontraktov_id(String reestr_kontraktov_id) {
		_reestr_kontraktov_id = reestr_kontraktov_id;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	private Date _data_kontrakta;
	private Date _data_sozdanija;
	private long _izvewenie_id;
	private long _lot_id;
	private long _postavwik_id;
	private String _reestr_kontraktov_id;
	private long _sozdal;
}