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

package tj.prichiny.otmeny.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.prichiny.otmeny.service.http.prichiny_otmenyServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.prichiny.otmeny.service.http.prichiny_otmenyServiceSoap
 * @generated
 */
@ProviderType
public class prichiny_otmenySoap implements Serializable {
	public static prichiny_otmenySoap toSoapModel(prichiny_otmeny model) {
		prichiny_otmenySoap soapModel = new prichiny_otmenySoap();

		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setPrichina(model.getPrichina());
		soapModel.setPrichiny_otmeny_id(model.getPrichiny_otmeny_id());
		soapModel.setSozdal(model.getSozdal());

		return soapModel;
	}

	public static prichiny_otmenySoap[] toSoapModels(prichiny_otmeny[] models) {
		prichiny_otmenySoap[] soapModels = new prichiny_otmenySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static prichiny_otmenySoap[][] toSoapModels(
		prichiny_otmeny[][] models) {
		prichiny_otmenySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new prichiny_otmenySoap[models.length][models[0].length];
		}
		else {
			soapModels = new prichiny_otmenySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static prichiny_otmenySoap[] toSoapModels(
		List<prichiny_otmeny> models) {
		List<prichiny_otmenySoap> soapModels = new ArrayList<prichiny_otmenySoap>(models.size());

		for (prichiny_otmeny model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new prichiny_otmenySoap[soapModels.size()]);
	}

	public prichiny_otmenySoap() {
	}

	public long getPrimaryKey() {
		return _prichiny_otmeny_id;
	}

	public void setPrimaryKey(long pk) {
		setPrichiny_otmeny_id(pk);
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

	public String getPrichina() {
		return _prichina;
	}

	public void setPrichina(String prichina) {
		_prichina = prichina;
	}

	public long getPrichiny_otmeny_id() {
		return _prichiny_otmeny_id;
	}

	public void setPrichiny_otmeny_id(long prichiny_otmeny_id) {
		_prichiny_otmeny_id = prichiny_otmeny_id;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private long _izmenil;
	private long _izvewenie_id;
	private String _prichina;
	private long _prichiny_otmeny_id;
	private long _sozdal;
}