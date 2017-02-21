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

package tj.status.izvewenij.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.status.izvewenij.service.http.status_izvewenijServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.status.izvewenij.service.http.status_izvewenijServiceSoap
 * @generated
 */
@ProviderType
public class status_izvewenijSoap implements Serializable {
	public static status_izvewenijSoap toSoapModel(status_izvewenij model) {
		status_izvewenijSoap soapModel = new status_izvewenijSoap();

		soapModel.setStatus(model.getStatus());
		soapModel.setStatus_izvewenij_id(model.getStatus_izvewenij_id());

		return soapModel;
	}

	public static status_izvewenijSoap[] toSoapModels(status_izvewenij[] models) {
		status_izvewenijSoap[] soapModels = new status_izvewenijSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static status_izvewenijSoap[][] toSoapModels(
		status_izvewenij[][] models) {
		status_izvewenijSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new status_izvewenijSoap[models.length][models[0].length];
		}
		else {
			soapModels = new status_izvewenijSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static status_izvewenijSoap[] toSoapModels(
		List<status_izvewenij> models) {
		List<status_izvewenijSoap> soapModels = new ArrayList<status_izvewenijSoap>(models.size());

		for (status_izvewenij model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new status_izvewenijSoap[soapModels.size()]);
	}

	public status_izvewenijSoap() {
	}

	public long getPrimaryKey() {
		return _status_izvewenij_id;
	}

	public void setPrimaryKey(long pk) {
		setStatus_izvewenij_id(pk);
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public long getStatus_izvewenij_id() {
		return _status_izvewenij_id;
	}

	public void setStatus_izvewenij_id(long status_izvewenij_id) {
		_status_izvewenij_id = status_izvewenij_id;
	}

	private String _status;
	private long _status_izvewenij_id;
}