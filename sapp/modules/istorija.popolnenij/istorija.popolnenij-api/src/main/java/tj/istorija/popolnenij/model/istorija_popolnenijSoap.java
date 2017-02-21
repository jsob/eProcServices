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

package tj.istorija.popolnenij.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.istorija.popolnenij.service.http.istorija_popolnenijServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.istorija.popolnenij.service.http.istorija_popolnenijServiceSoap
 * @generated
 */
@ProviderType
public class istorija_popolnenijSoap implements Serializable {
	public static istorija_popolnenijSoap toSoapModel(istorija_popolnenij model) {
		istorija_popolnenijSoap soapModel = new istorija_popolnenijSoap();

		soapModel.setData_zachislenija(model.getData_zachislenija());
		soapModel.setIstorija_popolnenij_id(model.getIstorija_popolnenij_id());
		soapModel.setNomer(model.getNomer());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setPut(model.getPut());
		soapModel.setSumma(model.getSumma());
		soapModel.setTip(model.getTip());
		soapModel.setTranzakcija(model.getTranzakcija());
		soapModel.setZachislil(model.getZachislil());

		return soapModel;
	}

	public static istorija_popolnenijSoap[] toSoapModels(
		istorija_popolnenij[] models) {
		istorija_popolnenijSoap[] soapModels = new istorija_popolnenijSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static istorija_popolnenijSoap[][] toSoapModels(
		istorija_popolnenij[][] models) {
		istorija_popolnenijSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new istorija_popolnenijSoap[models.length][models[0].length];
		}
		else {
			soapModels = new istorija_popolnenijSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static istorija_popolnenijSoap[] toSoapModels(
		List<istorija_popolnenij> models) {
		List<istorija_popolnenijSoap> soapModels = new ArrayList<istorija_popolnenijSoap>(models.size());

		for (istorija_popolnenij model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new istorija_popolnenijSoap[soapModels.size()]);
	}

	public istorija_popolnenijSoap() {
	}

	public long getPrimaryKey() {
		return _istorija_popolnenij_id;
	}

	public void setPrimaryKey(long pk) {
		setIstorija_popolnenij_id(pk);
	}

	public Date getData_zachislenija() {
		return _data_zachislenija;
	}

	public void setData_zachislenija(Date data_zachislenija) {
		_data_zachislenija = data_zachislenija;
	}

	public long getIstorija_popolnenij_id() {
		return _istorija_popolnenij_id;
	}

	public void setIstorija_popolnenij_id(long istorija_popolnenij_id) {
		_istorija_popolnenij_id = istorija_popolnenij_id;
	}

	public String getNomer() {
		return _nomer;
	}

	public void setNomer(String nomer) {
		_nomer = nomer;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public String getPut() {
		return _put;
	}

	public void setPut(String put) {
		_put = put;
	}

	public double getSumma() {
		return _summa;
	}

	public void setSumma(double summa) {
		_summa = summa;
	}

	public String getTip() {
		return _tip;
	}

	public void setTip(String tip) {
		_tip = tip;
	}

	public String getTranzakcija() {
		return _tranzakcija;
	}

	public void setTranzakcija(String tranzakcija) {
		_tranzakcija = tranzakcija;
	}

	public long getZachislil() {
		return _zachislil;
	}

	public void setZachislil(long zachislil) {
		_zachislil = zachislil;
	}

	private Date _data_zachislenija;
	private long _istorija_popolnenij_id;
	private String _nomer;
	private long _postavwik_id;
	private String _put;
	private double _summa;
	private String _tip;
	private String _tranzakcija;
	private long _zachislil;
}