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

package tj.oplachennye.zakazy.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.oplachennye.zakazy.service.http.oplachennye_zakazyServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.oplachennye.zakazy.service.http.oplachennye_zakazyServiceSoap
 * @generated
 */
@ProviderType
public class oplachennye_zakazySoap implements Serializable {
	public static oplachennye_zakazySoap toSoapModel(oplachennye_zakazy model) {
		oplachennye_zakazySoap soapModel = new oplachennye_zakazySoap();

		soapModel.setData_oplaty(model.getData_oplaty());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setOplachennye_zakazy_id(model.getOplachennye_zakazy_id());
		soapModel.setOplatil(model.getOplatil());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setSumma(model.getSumma());
		soapModel.setTranzakcija(model.getTranzakcija());

		return soapModel;
	}

	public static oplachennye_zakazySoap[] toSoapModels(
		oplachennye_zakazy[] models) {
		oplachennye_zakazySoap[] soapModels = new oplachennye_zakazySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static oplachennye_zakazySoap[][] toSoapModels(
		oplachennye_zakazy[][] models) {
		oplachennye_zakazySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new oplachennye_zakazySoap[models.length][models[0].length];
		}
		else {
			soapModels = new oplachennye_zakazySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static oplachennye_zakazySoap[] toSoapModels(
		List<oplachennye_zakazy> models) {
		List<oplachennye_zakazySoap> soapModels = new ArrayList<oplachennye_zakazySoap>(models.size());

		for (oplachennye_zakazy model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new oplachennye_zakazySoap[soapModels.size()]);
	}

	public oplachennye_zakazySoap() {
	}

	public long getPrimaryKey() {
		return _oplachennye_zakazy_id;
	}

	public void setPrimaryKey(long pk) {
		setOplachennye_zakazy_id(pk);
	}

	public Date getData_oplaty() {
		return _data_oplaty;
	}

	public void setData_oplaty(Date data_oplaty) {
		_data_oplaty = data_oplaty;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public long getOplachennye_zakazy_id() {
		return _oplachennye_zakazy_id;
	}

	public void setOplachennye_zakazy_id(long oplachennye_zakazy_id) {
		_oplachennye_zakazy_id = oplachennye_zakazy_id;
	}

	public long getOplatil() {
		return _oplatil;
	}

	public void setOplatil(long oplatil) {
		_oplatil = oplatil;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public double getSumma() {
		return _summa;
	}

	public void setSumma(double summa) {
		_summa = summa;
	}

	public String getTranzakcija() {
		return _tranzakcija;
	}

	public void setTranzakcija(String tranzakcija) {
		_tranzakcija = tranzakcija;
	}

	private Date _data_oplaty;
	private long _izvewenie_id;
	private long _oplachennye_zakazy_id;
	private long _oplatil;
	private long _postavwik_id;
	private double _summa;
	private String _tranzakcija;
}