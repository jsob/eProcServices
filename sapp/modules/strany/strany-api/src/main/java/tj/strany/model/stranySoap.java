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

package tj.strany.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.strany.service.http.stranyServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.strany.service.http.stranyServiceSoap
 * @generated
 */
@ProviderType
public class stranySoap implements Serializable {
	public static stranySoap toSoapModel(strany model) {
		stranySoap soapModel = new stranySoap();

		soapModel.setNazvanie(model.getNazvanie());
		soapModel.setNazvanie_tj(model.getNazvanie_tj());
		soapModel.setStrany_id(model.getStrany_id());

		return soapModel;
	}

	public static stranySoap[] toSoapModels(strany[] models) {
		stranySoap[] soapModels = new stranySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static stranySoap[][] toSoapModels(strany[][] models) {
		stranySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new stranySoap[models.length][models[0].length];
		}
		else {
			soapModels = new stranySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static stranySoap[] toSoapModels(List<strany> models) {
		List<stranySoap> soapModels = new ArrayList<stranySoap>(models.size());

		for (strany model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new stranySoap[soapModels.size()]);
	}

	public stranySoap() {
	}

	public long getPrimaryKey() {
		return _strany_id;
	}

	public void setPrimaryKey(long pk) {
		setStrany_id(pk);
	}

	public String getNazvanie() {
		return _nazvanie;
	}

	public void setNazvanie(String nazvanie) {
		_nazvanie = nazvanie;
	}

	public String getNazvanie_tj() {
		return _nazvanie_tj;
	}

	public void setNazvanie_tj(String nazvanie_tj) {
		_nazvanie_tj = nazvanie_tj;
	}

	public long getStrany_id() {
		return _strany_id;
	}

	public void setStrany_id(long strany_id) {
		_strany_id = strany_id;
	}

	private String _nazvanie;
	private String _nazvanie_tj;
	private long _strany_id;
}