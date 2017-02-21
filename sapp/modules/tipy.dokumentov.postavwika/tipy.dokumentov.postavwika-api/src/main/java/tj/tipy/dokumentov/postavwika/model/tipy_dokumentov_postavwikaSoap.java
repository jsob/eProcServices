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

package tj.tipy.dokumentov.postavwika.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.tipy.dokumentov.postavwika.service.http.tipy_dokumentov_postavwikaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.tipy.dokumentov.postavwika.service.http.tipy_dokumentov_postavwikaServiceSoap
 * @generated
 */
@ProviderType
public class tipy_dokumentov_postavwikaSoap implements Serializable {
	public static tipy_dokumentov_postavwikaSoap toSoapModel(
		tipy_dokumentov_postavwika model) {
		tipy_dokumentov_postavwikaSoap soapModel = new tipy_dokumentov_postavwikaSoap();

		soapModel.setTip(model.getTip());
		soapModel.setTipy_dokumentov_postavwika_id(model.getTipy_dokumentov_postavwika_id());

		return soapModel;
	}

	public static tipy_dokumentov_postavwikaSoap[] toSoapModels(
		tipy_dokumentov_postavwika[] models) {
		tipy_dokumentov_postavwikaSoap[] soapModels = new tipy_dokumentov_postavwikaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static tipy_dokumentov_postavwikaSoap[][] toSoapModels(
		tipy_dokumentov_postavwika[][] models) {
		tipy_dokumentov_postavwikaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new tipy_dokumentov_postavwikaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new tipy_dokumentov_postavwikaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static tipy_dokumentov_postavwikaSoap[] toSoapModels(
		List<tipy_dokumentov_postavwika> models) {
		List<tipy_dokumentov_postavwikaSoap> soapModels = new ArrayList<tipy_dokumentov_postavwikaSoap>(models.size());

		for (tipy_dokumentov_postavwika model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new tipy_dokumentov_postavwikaSoap[soapModels.size()]);
	}

	public tipy_dokumentov_postavwikaSoap() {
	}

	public long getPrimaryKey() {
		return _tipy_dokumentov_postavwika_id;
	}

	public void setPrimaryKey(long pk) {
		setTipy_dokumentov_postavwika_id(pk);
	}

	public String getTip() {
		return _tip;
	}

	public void setTip(String tip) {
		_tip = tip;
	}

	public long getTipy_dokumentov_postavwika_id() {
		return _tipy_dokumentov_postavwika_id;
	}

	public void setTipy_dokumentov_postavwika_id(
		long tipy_dokumentov_postavwika_id) {
		_tipy_dokumentov_postavwika_id = tipy_dokumentov_postavwika_id;
	}

	private String _tip;
	private long _tipy_dokumentov_postavwika_id;
}