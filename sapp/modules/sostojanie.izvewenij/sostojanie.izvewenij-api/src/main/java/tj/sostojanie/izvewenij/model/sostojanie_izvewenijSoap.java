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

package tj.sostojanie.izvewenij.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.sostojanie.izvewenij.service.http.sostojanie_izvewenijServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.sostojanie.izvewenij.service.http.sostojanie_izvewenijServiceSoap
 * @generated
 */
@ProviderType
public class sostojanie_izvewenijSoap implements Serializable {
	public static sostojanie_izvewenijSoap toSoapModel(
		sostojanie_izvewenij model) {
		sostojanie_izvewenijSoap soapModel = new sostojanie_izvewenijSoap();

		soapModel.setSostojanie(model.getSostojanie());
		soapModel.setSostojanie_izvewenij_id(model.getSostojanie_izvewenij_id());

		return soapModel;
	}

	public static sostojanie_izvewenijSoap[] toSoapModels(
		sostojanie_izvewenij[] models) {
		sostojanie_izvewenijSoap[] soapModels = new sostojanie_izvewenijSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static sostojanie_izvewenijSoap[][] toSoapModels(
		sostojanie_izvewenij[][] models) {
		sostojanie_izvewenijSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new sostojanie_izvewenijSoap[models.length][models[0].length];
		}
		else {
			soapModels = new sostojanie_izvewenijSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static sostojanie_izvewenijSoap[] toSoapModels(
		List<sostojanie_izvewenij> models) {
		List<sostojanie_izvewenijSoap> soapModels = new ArrayList<sostojanie_izvewenijSoap>(models.size());

		for (sostojanie_izvewenij model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new sostojanie_izvewenijSoap[soapModels.size()]);
	}

	public sostojanie_izvewenijSoap() {
	}

	public long getPrimaryKey() {
		return _sostojanie_izvewenij_id;
	}

	public void setPrimaryKey(long pk) {
		setSostojanie_izvewenij_id(pk);
	}

	public String getSostojanie() {
		return _sostojanie;
	}

	public void setSostojanie(String sostojanie) {
		_sostojanie = sostojanie;
	}

	public long getSostojanie_izvewenij_id() {
		return _sostojanie_izvewenij_id;
	}

	public void setSostojanie_izvewenij_id(long sostojanie_izvewenij_id) {
		_sostojanie_izvewenij_id = sostojanie_izvewenij_id;
	}

	private String _sostojanie;
	private long _sostojanie_izvewenij_id;
}