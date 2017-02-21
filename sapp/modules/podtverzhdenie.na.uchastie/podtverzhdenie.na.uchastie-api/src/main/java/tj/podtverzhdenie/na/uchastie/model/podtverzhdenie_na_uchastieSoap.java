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

package tj.podtverzhdenie.na.uchastie.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.podtverzhdenie.na.uchastie.service.http.podtverzhdenie_na_uchastieServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.podtverzhdenie.na.uchastie.service.http.podtverzhdenie_na_uchastieServiceSoap
 * @generated
 */
@ProviderType
public class podtverzhdenie_na_uchastieSoap implements Serializable {
	public static podtverzhdenie_na_uchastieSoap toSoapModel(
		podtverzhdenie_na_uchastie model) {
		podtverzhdenie_na_uchastieSoap soapModel = new podtverzhdenie_na_uchastieSoap();

		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setPodtverzhdenie_na_uchastie_id(model.getPodtverzhdenie_na_uchastie_id());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setSozdal(model.getSozdal());

		return soapModel;
	}

	public static podtverzhdenie_na_uchastieSoap[] toSoapModels(
		podtverzhdenie_na_uchastie[] models) {
		podtverzhdenie_na_uchastieSoap[] soapModels = new podtverzhdenie_na_uchastieSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static podtverzhdenie_na_uchastieSoap[][] toSoapModels(
		podtverzhdenie_na_uchastie[][] models) {
		podtverzhdenie_na_uchastieSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new podtverzhdenie_na_uchastieSoap[models.length][models[0].length];
		}
		else {
			soapModels = new podtverzhdenie_na_uchastieSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static podtverzhdenie_na_uchastieSoap[] toSoapModels(
		List<podtverzhdenie_na_uchastie> models) {
		List<podtverzhdenie_na_uchastieSoap> soapModels = new ArrayList<podtverzhdenie_na_uchastieSoap>(models.size());

		for (podtverzhdenie_na_uchastie model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new podtverzhdenie_na_uchastieSoap[soapModels.size()]);
	}

	public podtverzhdenie_na_uchastieSoap() {
	}

	public long getPrimaryKey() {
		return _podtverzhdenie_na_uchastie_id;
	}

	public void setPrimaryKey(long pk) {
		setPodtverzhdenie_na_uchastie_id(pk);
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

	public long getPodtverzhdenie_na_uchastie_id() {
		return _podtverzhdenie_na_uchastie_id;
	}

	public void setPodtverzhdenie_na_uchastie_id(
		long podtverzhdenie_na_uchastie_id) {
		_podtverzhdenie_na_uchastie_id = podtverzhdenie_na_uchastie_id;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	private Date _data_sozdanija;
	private long _izvewenie_id;
	private long _lot_id;
	private long _podtverzhdenie_na_uchastie_id;
	private long _postavwik_id;
	private long _sozdal;
}