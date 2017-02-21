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

package tj.rajony.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.rajony.service.http.rajonyServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.rajony.service.http.rajonyServiceSoap
 * @generated
 */
@ProviderType
public class rajonySoap implements Serializable {
	public static rajonySoap toSoapModel(rajony model) {
		rajonySoap soapModel = new rajonySoap();

		soapModel.setKod_vbk(model.getKod_vbk());
		soapModel.setNazvanie(model.getNazvanie());
		soapModel.setOblast_id(model.getOblast_id());
		soapModel.setRajony_id(model.getRajony_id());

		return soapModel;
	}

	public static rajonySoap[] toSoapModels(rajony[] models) {
		rajonySoap[] soapModels = new rajonySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static rajonySoap[][] toSoapModels(rajony[][] models) {
		rajonySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new rajonySoap[models.length][models[0].length];
		}
		else {
			soapModels = new rajonySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static rajonySoap[] toSoapModels(List<rajony> models) {
		List<rajonySoap> soapModels = new ArrayList<rajonySoap>(models.size());

		for (rajony model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new rajonySoap[soapModels.size()]);
	}

	public rajonySoap() {
	}

	public long getPrimaryKey() {
		return _rajony_id;
	}

	public void setPrimaryKey(long pk) {
		setRajony_id(pk);
	}

	public long getKod_vbk() {
		return _kod_vbk;
	}

	public void setKod_vbk(long kod_vbk) {
		_kod_vbk = kod_vbk;
	}

	public String getNazvanie() {
		return _nazvanie;
	}

	public void setNazvanie(String nazvanie) {
		_nazvanie = nazvanie;
	}

	public long getOblast_id() {
		return _oblast_id;
	}

	public void setOblast_id(long oblast_id) {
		_oblast_id = oblast_id;
	}

	public long getRajony_id() {
		return _rajony_id;
	}

	public void setRajony_id(long rajony_id) {
		_rajony_id = rajony_id;
	}

	private long _kod_vbk;
	private String _nazvanie;
	private long _oblast_id;
	private long _rajony_id;
}