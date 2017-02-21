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

package tj.goroda.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.goroda.service.http.gorodaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.goroda.service.http.gorodaServiceSoap
 * @generated
 */
@ProviderType
public class gorodaSoap implements Serializable {
	public static gorodaSoap toSoapModel(goroda model) {
		gorodaSoap soapModel = new gorodaSoap();

		soapModel.setGoroda_id(model.getGoroda_id());
		soapModel.setNazvanie(model.getNazvanie());

		return soapModel;
	}

	public static gorodaSoap[] toSoapModels(goroda[] models) {
		gorodaSoap[] soapModels = new gorodaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static gorodaSoap[][] toSoapModels(goroda[][] models) {
		gorodaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new gorodaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new gorodaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static gorodaSoap[] toSoapModels(List<goroda> models) {
		List<gorodaSoap> soapModels = new ArrayList<gorodaSoap>(models.size());

		for (goroda model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new gorodaSoap[soapModels.size()]);
	}

	public gorodaSoap() {
	}

	public long getPrimaryKey() {
		return _goroda_id;
	}

	public void setPrimaryKey(long pk) {
		setGoroda_id(pk);
	}

	public long getGoroda_id() {
		return _goroda_id;
	}

	public void setGoroda_id(long goroda_id) {
		_goroda_id = goroda_id;
	}

	public String getNazvanie() {
		return _nazvanie;
	}

	public void setNazvanie(String nazvanie) {
		_nazvanie = nazvanie;
	}

	private long _goroda_id;
	private String _nazvanie;
}