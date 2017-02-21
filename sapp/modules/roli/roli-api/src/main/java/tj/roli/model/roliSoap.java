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

package tj.roli.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.roli.service.http.roliServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.roli.service.http.roliServiceSoap
 * @generated
 */
@ProviderType
public class roliSoap implements Serializable {
	public static roliSoap toSoapModel(roli model) {
		roliSoap soapModel = new roliSoap();

		soapModel.setRol(model.getRol());
		soapModel.setRoli_id(model.getRoli_id());

		return soapModel;
	}

	public static roliSoap[] toSoapModels(roli[] models) {
		roliSoap[] soapModels = new roliSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static roliSoap[][] toSoapModels(roli[][] models) {
		roliSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new roliSoap[models.length][models[0].length];
		}
		else {
			soapModels = new roliSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static roliSoap[] toSoapModels(List<roli> models) {
		List<roliSoap> soapModels = new ArrayList<roliSoap>(models.size());

		for (roli model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new roliSoap[soapModels.size()]);
	}

	public roliSoap() {
	}

	public long getPrimaryKey() {
		return _roli_id;
	}

	public void setPrimaryKey(long pk) {
		setRoli_id(pk);
	}

	public String getRol() {
		return _rol;
	}

	public void setRol(String rol) {
		_rol = rol;
	}

	public long getRoli_id() {
		return _roli_id;
	}

	public void setRoli_id(long roli_id) {
		_roli_id = roli_id;
	}

	private String _rol;
	private long _roli_id;
}