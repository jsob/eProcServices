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

package tj.ne.uchastvujushhie.zajavki.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.ne.uchastvujushhie.zajavki.service.http.ne_uchastvujushhie_zajavkiServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.ne.uchastvujushhie.zajavki.service.http.ne_uchastvujushhie_zajavkiServiceSoap
 * @generated
 */
@ProviderType
public class ne_uchastvujushhie_zajavkiSoap implements Serializable {
	public static ne_uchastvujushhie_zajavkiSoap toSoapModel(
		ne_uchastvujushhie_zajavki model) {
		ne_uchastvujushhie_zajavkiSoap soapModel = new ne_uchastvujushhie_zajavkiSoap();

		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setItogo_za_tovar(model.getItogo_za_tovar());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setKolichestvo(model.getKolichestvo());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setNe_uchastvujushhie_zajavki_id(model.getNe_uchastvujushhie_zajavki_id());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setSumma_za_edinicu_tovara(model.getSumma_za_edinicu_tovara());
		soapModel.setTovar_id(model.getTovar_id());

		return soapModel;
	}

	public static ne_uchastvujushhie_zajavkiSoap[] toSoapModels(
		ne_uchastvujushhie_zajavki[] models) {
		ne_uchastvujushhie_zajavkiSoap[] soapModels = new ne_uchastvujushhie_zajavkiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ne_uchastvujushhie_zajavkiSoap[][] toSoapModels(
		ne_uchastvujushhie_zajavki[][] models) {
		ne_uchastvujushhie_zajavkiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ne_uchastvujushhie_zajavkiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ne_uchastvujushhie_zajavkiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ne_uchastvujushhie_zajavkiSoap[] toSoapModels(
		List<ne_uchastvujushhie_zajavki> models) {
		List<ne_uchastvujushhie_zajavkiSoap> soapModels = new ArrayList<ne_uchastvujushhie_zajavkiSoap>(models.size());

		for (ne_uchastvujushhie_zajavki model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ne_uchastvujushhie_zajavkiSoap[soapModels.size()]);
	}

	public ne_uchastvujushhie_zajavkiSoap() {
	}

	public long getPrimaryKey() {
		return _ne_uchastvujushhie_zajavki_id;
	}

	public void setPrimaryKey(long pk) {
		setNe_uchastvujushhie_zajavki_id(pk);
	}

	public Date getData_sozdanija() {
		return _data_sozdanija;
	}

	public void setData_sozdanija(Date data_sozdanija) {
		_data_sozdanija = data_sozdanija;
	}

	public double getItogo_za_tovar() {
		return _itogo_za_tovar;
	}

	public void setItogo_za_tovar(double itogo_za_tovar) {
		_itogo_za_tovar = itogo_za_tovar;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public long getKolichestvo() {
		return _kolichestvo;
	}

	public void setKolichestvo(long kolichestvo) {
		_kolichestvo = kolichestvo;
	}

	public long getLot_id() {
		return _lot_id;
	}

	public void setLot_id(long lot_id) {
		_lot_id = lot_id;
	}

	public long getNe_uchastvujushhie_zajavki_id() {
		return _ne_uchastvujushhie_zajavki_id;
	}

	public void setNe_uchastvujushhie_zajavki_id(
		long ne_uchastvujushhie_zajavki_id) {
		_ne_uchastvujushhie_zajavki_id = ne_uchastvujushhie_zajavki_id;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	public double getSumma_za_edinicu_tovara() {
		return _summa_za_edinicu_tovara;
	}

	public void setSumma_za_edinicu_tovara(double summa_za_edinicu_tovara) {
		_summa_za_edinicu_tovara = summa_za_edinicu_tovara;
	}

	public long getTovar_id() {
		return _tovar_id;
	}

	public void setTovar_id(long tovar_id) {
		_tovar_id = tovar_id;
	}

	private Date _data_sozdanija;
	private double _itogo_za_tovar;
	private long _izvewenie_id;
	private long _kolichestvo;
	private long _lot_id;
	private long _ne_uchastvujushhie_zajavki_id;
	private long _postavwik_id;
	private long _sozdal;
	private double _summa_za_edinicu_tovara;
	private long _tovar_id;
}