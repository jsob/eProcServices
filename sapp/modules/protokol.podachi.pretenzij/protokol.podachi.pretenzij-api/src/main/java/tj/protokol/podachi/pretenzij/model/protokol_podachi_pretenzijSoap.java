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

package tj.protokol.podachi.pretenzij.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.protokol.podachi.pretenzij.service.http.protokol_podachi_pretenzijServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.protokol.podachi.pretenzij.service.http.protokol_podachi_pretenzijServiceSoap
 * @generated
 */
@ProviderType
public class protokol_podachi_pretenzijSoap implements Serializable {
	public static protokol_podachi_pretenzijSoap toSoapModel(
		protokol_podachi_pretenzij model) {
		protokol_podachi_pretenzijSoap soapModel = new protokol_podachi_pretenzijSoap();

		soapModel.setData_generacii(model.getData_generacii());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setProtokol_podachi_pretenzij_id(model.getProtokol_podachi_pretenzij_id());
		soapModel.setSgeneriroval(model.getSgeneriroval());

		return soapModel;
	}

	public static protokol_podachi_pretenzijSoap[] toSoapModels(
		protokol_podachi_pretenzij[] models) {
		protokol_podachi_pretenzijSoap[] soapModels = new protokol_podachi_pretenzijSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static protokol_podachi_pretenzijSoap[][] toSoapModels(
		protokol_podachi_pretenzij[][] models) {
		protokol_podachi_pretenzijSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new protokol_podachi_pretenzijSoap[models.length][models[0].length];
		}
		else {
			soapModels = new protokol_podachi_pretenzijSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static protokol_podachi_pretenzijSoap[] toSoapModels(
		List<protokol_podachi_pretenzij> models) {
		List<protokol_podachi_pretenzijSoap> soapModels = new ArrayList<protokol_podachi_pretenzijSoap>(models.size());

		for (protokol_podachi_pretenzij model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new protokol_podachi_pretenzijSoap[soapModels.size()]);
	}

	public protokol_podachi_pretenzijSoap() {
	}

	public long getPrimaryKey() {
		return _protokol_podachi_pretenzij_id;
	}

	public void setPrimaryKey(long pk) {
		setProtokol_podachi_pretenzij_id(pk);
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

	public long getProtokol_podachi_pretenzij_id() {
		return _protokol_podachi_pretenzij_id;
	}

	public void setProtokol_podachi_pretenzij_id(
		long protokol_podachi_pretenzij_id) {
		_protokol_podachi_pretenzij_id = protokol_podachi_pretenzij_id;
	}

	public long getSgeneriroval() {
		return _sgeneriroval;
	}

	public void setSgeneriroval(long sgeneriroval) {
		_sgeneriroval = sgeneriroval;
	}

	private Date _data_generacii;
	private long _izvewenie_id;
	private long _protokol_podachi_pretenzij_id;
	private long _sgeneriroval;
}