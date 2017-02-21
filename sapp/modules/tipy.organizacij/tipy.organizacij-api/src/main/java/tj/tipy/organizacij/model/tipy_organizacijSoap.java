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

package tj.tipy.organizacij.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.tipy.organizacij.service.http.tipy_organizacijServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.tipy.organizacij.service.http.tipy_organizacijServiceSoap
 * @generated
 */
@ProviderType
public class tipy_organizacijSoap implements Serializable {
	public static tipy_organizacijSoap toSoapModel(tipy_organizacij model) {
		tipy_organizacijSoap soapModel = new tipy_organizacijSoap();

		soapModel.setTipy_organizacij_id(model.getTipy_organizacij_id());
		soapModel.setNazvanie(model.getNazvanie());

		return soapModel;
	}

	public static tipy_organizacijSoap[] toSoapModels(tipy_organizacij[] models) {
		tipy_organizacijSoap[] soapModels = new tipy_organizacijSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static tipy_organizacijSoap[][] toSoapModels(
		tipy_organizacij[][] models) {
		tipy_organizacijSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new tipy_organizacijSoap[models.length][models[0].length];
		}
		else {
			soapModels = new tipy_organizacijSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static tipy_organizacijSoap[] toSoapModels(
		List<tipy_organizacij> models) {
		List<tipy_organizacijSoap> soapModels = new ArrayList<tipy_organizacijSoap>(models.size());

		for (tipy_organizacij model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new tipy_organizacijSoap[soapModels.size()]);
	}

	public tipy_organizacijSoap() {
	}

	public long getPrimaryKey() {
		return _tipy_organizacij_id;
	}

	public void setPrimaryKey(long pk) {
		setTipy_organizacij_id(pk);
	}

	public long getTipy_organizacij_id() {
		return _tipy_organizacij_id;
	}

	public void setTipy_organizacij_id(long tipy_organizacij_id) {
		_tipy_organizacij_id = tipy_organizacij_id;
	}

	public String getNazvanie() {
		return _nazvanie;
	}

	public void setNazvanie(String nazvanie) {
		_nazvanie = nazvanie;
	}

	private long _tipy_organizacij_id;
	private String _nazvanie;
}