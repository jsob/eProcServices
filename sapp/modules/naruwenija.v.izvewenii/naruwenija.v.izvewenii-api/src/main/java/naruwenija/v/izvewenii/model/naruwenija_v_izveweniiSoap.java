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

package naruwenija.v.izvewenii.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link naruwenija.v.izvewenii.service.http.naruwenija_v_izveweniiServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see naruwenija.v.izvewenii.service.http.naruwenija_v_izveweniiServiceSoap
 * @generated
 */
@ProviderType
public class naruwenija_v_izveweniiSoap implements Serializable {
	public static naruwenija_v_izveweniiSoap toSoapModel(
		naruwenija_v_izvewenii model) {
		naruwenija_v_izveweniiSoap soapModel = new naruwenija_v_izveweniiSoap();

		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setNaruwenie(model.getNaruwenie());
		soapModel.setNaruwenija_v_izvewenii_id(model.getNaruwenija_v_izvewenii_id());
		soapModel.setNomer_razdela(model.getNomer_razdela());
		soapModel.setSozdal(model.getSozdal());

		return soapModel;
	}

	public static naruwenija_v_izveweniiSoap[] toSoapModels(
		naruwenija_v_izvewenii[] models) {
		naruwenija_v_izveweniiSoap[] soapModels = new naruwenija_v_izveweniiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static naruwenija_v_izveweniiSoap[][] toSoapModels(
		naruwenija_v_izvewenii[][] models) {
		naruwenija_v_izveweniiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new naruwenija_v_izveweniiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new naruwenija_v_izveweniiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static naruwenija_v_izveweniiSoap[] toSoapModels(
		List<naruwenija_v_izvewenii> models) {
		List<naruwenija_v_izveweniiSoap> soapModels = new ArrayList<naruwenija_v_izveweniiSoap>(models.size());

		for (naruwenija_v_izvewenii model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new naruwenija_v_izveweniiSoap[soapModels.size()]);
	}

	public naruwenija_v_izveweniiSoap() {
	}

	public long getPrimaryKey() {
		return _naruwenija_v_izvewenii_id;
	}

	public void setPrimaryKey(long pk) {
		setNaruwenija_v_izvewenii_id(pk);
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

	public String getNaruwenie() {
		return _naruwenie;
	}

	public void setNaruwenie(String naruwenie) {
		_naruwenie = naruwenie;
	}

	public long getNaruwenija_v_izvewenii_id() {
		return _naruwenija_v_izvewenii_id;
	}

	public void setNaruwenija_v_izvewenii_id(long naruwenija_v_izvewenii_id) {
		_naruwenija_v_izvewenii_id = naruwenija_v_izvewenii_id;
	}

	public long getNomer_razdela() {
		return _nomer_razdela;
	}

	public void setNomer_razdela(long nomer_razdela) {
		_nomer_razdela = nomer_razdela;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	private Date _data_sozdanija;
	private long _izvewenie_id;
	private String _naruwenie;
	private long _naruwenija_v_izvewenii_id;
	private long _nomer_razdela;
	private long _sozdal;
}