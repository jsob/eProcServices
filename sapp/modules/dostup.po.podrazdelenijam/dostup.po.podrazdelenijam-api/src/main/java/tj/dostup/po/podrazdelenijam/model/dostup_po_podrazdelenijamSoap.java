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

package tj.dostup.po.podrazdelenijam.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.dostup.po.podrazdelenijam.service.http.dostup_po_podrazdelenijamServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.dostup.po.podrazdelenijam.service.http.dostup_po_podrazdelenijamServiceSoap
 * @generated
 */
@ProviderType
public class dostup_po_podrazdelenijamSoap implements Serializable {
	public static dostup_po_podrazdelenijamSoap toSoapModel(
		dostup_po_podrazdelenijam model) {
		dostup_po_podrazdelenijamSoap soapModel = new dostup_po_podrazdelenijamSoap();

		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setDostup_po_podrazdelenijam_id(model.getDostup_po_podrazdelenijam_id());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setPodrazdelenija_id(model.getPodrazdelenija_id());
		soapModel.setPolzovateli_id(model.getPolzovateli_id());
		soapModel.setSozdal(model.getSozdal());

		return soapModel;
	}

	public static dostup_po_podrazdelenijamSoap[] toSoapModels(
		dostup_po_podrazdelenijam[] models) {
		dostup_po_podrazdelenijamSoap[] soapModels = new dostup_po_podrazdelenijamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static dostup_po_podrazdelenijamSoap[][] toSoapModels(
		dostup_po_podrazdelenijam[][] models) {
		dostup_po_podrazdelenijamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new dostup_po_podrazdelenijamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new dostup_po_podrazdelenijamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static dostup_po_podrazdelenijamSoap[] toSoapModels(
		List<dostup_po_podrazdelenijam> models) {
		List<dostup_po_podrazdelenijamSoap> soapModels = new ArrayList<dostup_po_podrazdelenijamSoap>(models.size());

		for (dostup_po_podrazdelenijam model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new dostup_po_podrazdelenijamSoap[soapModels.size()]);
	}

	public dostup_po_podrazdelenijamSoap() {
	}

	public long getPrimaryKey() {
		return _dostup_po_podrazdelenijam_id;
	}

	public void setPrimaryKey(long pk) {
		setDostup_po_podrazdelenijam_id(pk);
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

	public long getDostup_po_podrazdelenijam_id() {
		return _dostup_po_podrazdelenijam_id;
	}

	public void setDostup_po_podrazdelenijam_id(
		long dostup_po_podrazdelenijam_id) {
		_dostup_po_podrazdelenijam_id = dostup_po_podrazdelenijam_id;
	}

	public long getIzmenil() {
		return _izmenil;
	}

	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	public long getPodrazdelenija_id() {
		return _podrazdelenija_id;
	}

	public void setPodrazdelenija_id(long podrazdelenija_id) {
		_podrazdelenija_id = podrazdelenija_id;
	}

	public long getPolzovateli_id() {
		return _polzovateli_id;
	}

	public void setPolzovateli_id(long polzovateli_id) {
		_polzovateli_id = polzovateli_id;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private long _dostup_po_podrazdelenijam_id;
	private long _izmenil;
	private long _podrazdelenija_id;
	private long _polzovateli_id;
	private long _sozdal;
}