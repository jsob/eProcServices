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

package tj.izvewenie.put.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.izvewenie.put.service.http.izvewenie_putServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.izvewenie.put.service.http.izvewenie_putServiceSoap
 * @generated
 */
@ProviderType
public class izvewenie_putSoap implements Serializable {
	public static izvewenie_putSoap toSoapModel(izvewenie_put model) {
		izvewenie_putSoap soapModel = new izvewenie_putSoap();

		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setIzvewenie_put_id(model.getIzvewenie_put_id());
		soapModel.setPut_a(model.getPut_a());
		soapModel.setPut_b(model.getPut_b());
		soapModel.setPut_c(model.getPut_c());

		return soapModel;
	}

	public static izvewenie_putSoap[] toSoapModels(izvewenie_put[] models) {
		izvewenie_putSoap[] soapModels = new izvewenie_putSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static izvewenie_putSoap[][] toSoapModels(izvewenie_put[][] models) {
		izvewenie_putSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new izvewenie_putSoap[models.length][models[0].length];
		}
		else {
			soapModels = new izvewenie_putSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static izvewenie_putSoap[] toSoapModels(List<izvewenie_put> models) {
		List<izvewenie_putSoap> soapModels = new ArrayList<izvewenie_putSoap>(models.size());

		for (izvewenie_put model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new izvewenie_putSoap[soapModels.size()]);
	}

	public izvewenie_putSoap() {
	}

	public long getPrimaryKey() {
		return _izvewenie_put_id;
	}

	public void setPrimaryKey(long pk) {
		setIzvewenie_put_id(pk);
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public long getIzvewenie_put_id() {
		return _izvewenie_put_id;
	}

	public void setIzvewenie_put_id(long izvewenie_put_id) {
		_izvewenie_put_id = izvewenie_put_id;
	}

	public long getPut_a() {
		return _put_a;
	}

	public void setPut_a(long put_a) {
		_put_a = put_a;
	}

	public long getPut_b() {
		return _put_b;
	}

	public void setPut_b(long put_b) {
		_put_b = put_b;
	}

	public String getPut_c() {
		return _put_c;
	}

	public void setPut_c(String put_c) {
		_put_c = put_c;
	}

	private long _izvewenie_id;
	private long _izvewenie_put_id;
	private long _put_a;
	private long _put_b;
	private String _put_c;
}