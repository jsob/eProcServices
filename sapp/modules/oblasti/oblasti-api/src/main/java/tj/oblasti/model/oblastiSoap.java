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

package tj.oblasti.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.oblasti.service.http.oblastiServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.oblasti.service.http.oblastiServiceSoap
 * @generated
 */
@ProviderType
public class oblastiSoap implements Serializable {
	public static oblastiSoap toSoapModel(oblasti model) {
		oblastiSoap soapModel = new oblastiSoap();

		soapModel.setOblasti_id(model.getOblasti_id());
		soapModel.setNazvanie(model.getNazvanie());

		return soapModel;
	}

	public static oblastiSoap[] toSoapModels(oblasti[] models) {
		oblastiSoap[] soapModels = new oblastiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static oblastiSoap[][] toSoapModels(oblasti[][] models) {
		oblastiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new oblastiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new oblastiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static oblastiSoap[] toSoapModels(List<oblasti> models) {
		List<oblastiSoap> soapModels = new ArrayList<oblastiSoap>(models.size());

		for (oblasti model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new oblastiSoap[soapModels.size()]);
	}

	public oblastiSoap() {
	}

	public long getPrimaryKey() {
		return _oblasti_id;
	}

	public void setPrimaryKey(long pk) {
		setOblasti_id(pk);
	}

	public long getOblasti_id() {
		return _oblasti_id;
	}

	public void setOblasti_id(long oblasti_id) {
		_oblasti_id = oblasti_id;
	}

	public String getNazvanie() {
		return _nazvanie;
	}

	public void setNazvanie(String nazvanie) {
		_nazvanie = nazvanie;
	}

	private long _oblasti_id;
	private String _nazvanie;
}