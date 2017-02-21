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

package tj.protokol.dlja.zakljuchenija.kontrakta.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.protokol.dlja.zakljuchenija.kontrakta.service.http.protokol_dlja_zakljuchenija_kontraktaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.protokol.dlja.zakljuchenija.kontrakta.service.http.protokol_dlja_zakljuchenija_kontraktaServiceSoap
 * @generated
 */
@ProviderType
public class protokol_dlja_zakljuchenija_kontraktaSoap implements Serializable {
	public static protokol_dlja_zakljuchenija_kontraktaSoap toSoapModel(
		protokol_dlja_zakljuchenija_kontrakta model) {
		protokol_dlja_zakljuchenija_kontraktaSoap soapModel = new protokol_dlja_zakljuchenija_kontraktaSoap();

		soapModel.setData_generacii(model.getData_generacii());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setProtokol_dlja_zakljuchenija_kontrakta_id(model.getProtokol_dlja_zakljuchenija_kontrakta_id());
		soapModel.setSgeneriroval(model.getSgeneriroval());

		return soapModel;
	}

	public static protokol_dlja_zakljuchenija_kontraktaSoap[] toSoapModels(
		protokol_dlja_zakljuchenija_kontrakta[] models) {
		protokol_dlja_zakljuchenija_kontraktaSoap[] soapModels = new protokol_dlja_zakljuchenija_kontraktaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static protokol_dlja_zakljuchenija_kontraktaSoap[][] toSoapModels(
		protokol_dlja_zakljuchenija_kontrakta[][] models) {
		protokol_dlja_zakljuchenija_kontraktaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new protokol_dlja_zakljuchenija_kontraktaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new protokol_dlja_zakljuchenija_kontraktaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static protokol_dlja_zakljuchenija_kontraktaSoap[] toSoapModels(
		List<protokol_dlja_zakljuchenija_kontrakta> models) {
		List<protokol_dlja_zakljuchenija_kontraktaSoap> soapModels = new ArrayList<protokol_dlja_zakljuchenija_kontraktaSoap>(models.size());

		for (protokol_dlja_zakljuchenija_kontrakta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new protokol_dlja_zakljuchenija_kontraktaSoap[soapModels.size()]);
	}

	public protokol_dlja_zakljuchenija_kontraktaSoap() {
	}

	public long getPrimaryKey() {
		return _protokol_dlja_zakljuchenija_kontrakta_id;
	}

	public void setPrimaryKey(long pk) {
		setProtokol_dlja_zakljuchenija_kontrakta_id(pk);
	}

	public Date getData_generacii() {
		return _data_generacii;
	}

	public void setData_generacii(Date data_generacii) {
		_data_generacii = data_generacii;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public long getProtokol_dlja_zakljuchenija_kontrakta_id() {
		return _protokol_dlja_zakljuchenija_kontrakta_id;
	}

	public void setProtokol_dlja_zakljuchenija_kontrakta_id(
		long protokol_dlja_zakljuchenija_kontrakta_id) {
		_protokol_dlja_zakljuchenija_kontrakta_id = protokol_dlja_zakljuchenija_kontrakta_id;
	}

	public long getSgeneriroval() {
		return _sgeneriroval;
	}

	public void setSgeneriroval(long sgeneriroval) {
		_sgeneriroval = sgeneriroval;
	}

	private Date _data_generacii;
	private long _izvewenie_id;
	private long _protokol_dlja_zakljuchenija_kontrakta_id;
	private long _sgeneriroval;
}