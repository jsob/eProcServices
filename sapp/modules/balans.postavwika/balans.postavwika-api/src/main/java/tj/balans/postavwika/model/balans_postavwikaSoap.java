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

package tj.balans.postavwika.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.balans.postavwika.service.http.balans_postavwikaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.balans.postavwika.service.http.balans_postavwikaServiceSoap
 * @generated
 */
@ProviderType
public class balans_postavwikaSoap implements Serializable {
	public static balans_postavwikaSoap toSoapModel(balans_postavwika model) {
		balans_postavwikaSoap soapModel = new balans_postavwikaSoap();

		soapModel.setBalans_postavwika_id(model.getBalans_postavwika_id());
		soapModel.setBalans(model.getBalans());
		soapModel.setPostavwik_id(model.getPostavwik_id());

		return soapModel;
	}

	public static balans_postavwikaSoap[] toSoapModels(
		balans_postavwika[] models) {
		balans_postavwikaSoap[] soapModels = new balans_postavwikaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static balans_postavwikaSoap[][] toSoapModels(
		balans_postavwika[][] models) {
		balans_postavwikaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new balans_postavwikaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new balans_postavwikaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static balans_postavwikaSoap[] toSoapModels(
		List<balans_postavwika> models) {
		List<balans_postavwikaSoap> soapModels = new ArrayList<balans_postavwikaSoap>(models.size());

		for (balans_postavwika model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new balans_postavwikaSoap[soapModels.size()]);
	}

	public balans_postavwikaSoap() {
	}

	public long getPrimaryKey() {
		return _balans_postavwika_id;
	}

	public void setPrimaryKey(long pk) {
		setBalans_postavwika_id(pk);
	}

	public long getBalans_postavwika_id() {
		return _balans_postavwika_id;
	}

	public void setBalans_postavwika_id(long balans_postavwika_id) {
		_balans_postavwika_id = balans_postavwika_id;
	}

	public double getBalans() {
		return _balans;
	}

	public void setBalans(double balans) {
		_balans = balans;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	private long _balans_postavwika_id;
	private double _balans;
	private long _postavwik_id;
}