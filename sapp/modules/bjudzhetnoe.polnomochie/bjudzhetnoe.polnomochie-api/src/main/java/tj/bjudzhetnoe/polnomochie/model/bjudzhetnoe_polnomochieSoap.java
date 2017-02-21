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

package tj.bjudzhetnoe.polnomochie.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.bjudzhetnoe.polnomochie.service.http.bjudzhetnoe_polnomochieServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.bjudzhetnoe.polnomochie.service.http.bjudzhetnoe_polnomochieServiceSoap
 * @generated
 */
@ProviderType
public class bjudzhetnoe_polnomochieSoap implements Serializable {
	public static bjudzhetnoe_polnomochieSoap toSoapModel(
		bjudzhetnoe_polnomochie model) {
		bjudzhetnoe_polnomochieSoap soapModel = new bjudzhetnoe_polnomochieSoap();

		soapModel.setBjudzhetnoe_polnomochie_id(model.getBjudzhetnoe_polnomochie_id());
		soapModel.setNaimenovanie(model.getNaimenovanie());

		return soapModel;
	}

	public static bjudzhetnoe_polnomochieSoap[] toSoapModels(
		bjudzhetnoe_polnomochie[] models) {
		bjudzhetnoe_polnomochieSoap[] soapModels = new bjudzhetnoe_polnomochieSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static bjudzhetnoe_polnomochieSoap[][] toSoapModels(
		bjudzhetnoe_polnomochie[][] models) {
		bjudzhetnoe_polnomochieSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new bjudzhetnoe_polnomochieSoap[models.length][models[0].length];
		}
		else {
			soapModels = new bjudzhetnoe_polnomochieSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static bjudzhetnoe_polnomochieSoap[] toSoapModels(
		List<bjudzhetnoe_polnomochie> models) {
		List<bjudzhetnoe_polnomochieSoap> soapModels = new ArrayList<bjudzhetnoe_polnomochieSoap>(models.size());

		for (bjudzhetnoe_polnomochie model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new bjudzhetnoe_polnomochieSoap[soapModels.size()]);
	}

	public bjudzhetnoe_polnomochieSoap() {
	}

	public long getPrimaryKey() {
		return _bjudzhetnoe_polnomochie_id;
	}

	public void setPrimaryKey(long pk) {
		setBjudzhetnoe_polnomochie_id(pk);
	}

	public long getBjudzhetnoe_polnomochie_id() {
		return _bjudzhetnoe_polnomochie_id;
	}

	public void setBjudzhetnoe_polnomochie_id(long bjudzhetnoe_polnomochie_id) {
		_bjudzhetnoe_polnomochie_id = bjudzhetnoe_polnomochie_id;
	}

	public String getNaimenovanie() {
		return _naimenovanie;
	}

	public void setNaimenovanie(String naimenovanie) {
		_naimenovanie = naimenovanie;
	}

	private long _bjudzhetnoe_polnomochie_id;
	private String _naimenovanie;
}