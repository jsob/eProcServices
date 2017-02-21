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

package tj.podrazdelenija.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.podrazdelenija.service.http.podrazdelenijaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.podrazdelenija.service.http.podrazdelenijaServiceSoap
 * @generated
 */
@ProviderType
public class podrazdelenijaSoap implements Serializable {
	public static podrazdelenijaSoap toSoapModel(podrazdelenija model) {
		podrazdelenijaSoap soapModel = new podrazdelenijaSoap();

		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setOrganizacija_id(model.getOrganizacija_id());
		soapModel.setPodrazdelenie(model.getPodrazdelenie());
		soapModel.setPodrazdelenija_id(model.getPodrazdelenija_id());
		soapModel.setSozdal(model.getSozdal());

		return soapModel;
	}

	public static podrazdelenijaSoap[] toSoapModels(podrazdelenija[] models) {
		podrazdelenijaSoap[] soapModels = new podrazdelenijaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static podrazdelenijaSoap[][] toSoapModels(podrazdelenija[][] models) {
		podrazdelenijaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new podrazdelenijaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new podrazdelenijaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static podrazdelenijaSoap[] toSoapModels(List<podrazdelenija> models) {
		List<podrazdelenijaSoap> soapModels = new ArrayList<podrazdelenijaSoap>(models.size());

		for (podrazdelenija model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new podrazdelenijaSoap[soapModels.size()]);
	}

	public podrazdelenijaSoap() {
	}

	public long getPrimaryKey() {
		return _podrazdelenija_id;
	}

	public void setPrimaryKey(long pk) {
		setPodrazdelenija_id(pk);
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

	public long getOrganizacija_id() {
		return _organizacija_id;
	}

	public void setOrganizacija_id(long organizacija_id) {
		_organizacija_id = organizacija_id;
	}

	public String getPodrazdelenie() {
		return _podrazdelenie;
	}

	public void setPodrazdelenie(String podrazdelenie) {
		_podrazdelenie = podrazdelenie;
	}

	public long getPodrazdelenija_id() {
		return _podrazdelenija_id;
	}

	public void setPodrazdelenija_id(long podrazdelenija_id) {
		_podrazdelenija_id = podrazdelenija_id;
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
	private long _organizacija_id;
	private String _podrazdelenie;
	private long _podrazdelenija_id;
	private long _sozdal;
}