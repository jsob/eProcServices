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

package tj.istochnik.finansirovanija.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.istochnik.finansirovanija.service.http.istochnik_finansirovanijaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.istochnik.finansirovanija.service.http.istochnik_finansirovanijaServiceSoap
 * @generated
 */
@ProviderType
public class istochnik_finansirovanijaSoap implements Serializable {
	public static istochnik_finansirovanijaSoap toSoapModel(
		istochnik_finansirovanija model) {
		istochnik_finansirovanijaSoap soapModel = new istochnik_finansirovanijaSoap();

		soapModel.setIstochnik_finansirovanija_id(model.getIstochnik_finansirovanija_id());
		soapModel.setNaimenovanie(model.getNaimenovanie());

		return soapModel;
	}

	public static istochnik_finansirovanijaSoap[] toSoapModels(
		istochnik_finansirovanija[] models) {
		istochnik_finansirovanijaSoap[] soapModels = new istochnik_finansirovanijaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static istochnik_finansirovanijaSoap[][] toSoapModels(
		istochnik_finansirovanija[][] models) {
		istochnik_finansirovanijaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new istochnik_finansirovanijaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new istochnik_finansirovanijaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static istochnik_finansirovanijaSoap[] toSoapModels(
		List<istochnik_finansirovanija> models) {
		List<istochnik_finansirovanijaSoap> soapModels = new ArrayList<istochnik_finansirovanijaSoap>(models.size());

		for (istochnik_finansirovanija model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new istochnik_finansirovanijaSoap[soapModels.size()]);
	}

	public istochnik_finansirovanijaSoap() {
	}

	public long getPrimaryKey() {
		return _istochnik_finansirovanija_id;
	}

	public void setPrimaryKey(long pk) {
		setIstochnik_finansirovanija_id(pk);
	}

	public long getIstochnik_finansirovanija_id() {
		return _istochnik_finansirovanija_id;
	}

	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id) {
		_istochnik_finansirovanija_id = istochnik_finansirovanija_id;
	}

	public String getNaimenovanie() {
		return _naimenovanie;
	}

	public void setNaimenovanie(String naimenovanie) {
		_naimenovanie = naimenovanie;
	}

	private long _istochnik_finansirovanija_id;
	private String _naimenovanie;
}