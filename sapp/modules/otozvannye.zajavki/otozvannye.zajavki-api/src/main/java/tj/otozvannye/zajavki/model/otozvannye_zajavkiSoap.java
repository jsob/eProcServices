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

package tj.otozvannye.zajavki.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.otozvannye.zajavki.service.http.otozvannye_zajavkiServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.otozvannye.zajavki.service.http.otozvannye_zajavkiServiceSoap
 * @generated
 */
@ProviderType
public class otozvannye_zajavkiSoap implements Serializable {
	public static otozvannye_zajavkiSoap toSoapModel(otozvannye_zajavki model) {
		otozvannye_zajavkiSoap soapModel = new otozvannye_zajavkiSoap();

		soapModel.setData_otzyva(model.getData_otzyva());
		soapModel.setItogo_za_tovar(model.getItogo_za_tovar());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setKolichestvo(model.getKolichestvo());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setOtozval(model.getOtozval());
		soapModel.setOtozvannye_zajavki_id(model.getOtozvannye_zajavki_id());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setSumma_za_edinicu_tovara(model.getSumma_za_edinicu_tovara());
		soapModel.setTovar_id(model.getTovar_id());

		return soapModel;
	}

	public static otozvannye_zajavkiSoap[] toSoapModels(
		otozvannye_zajavki[] models) {
		otozvannye_zajavkiSoap[] soapModels = new otozvannye_zajavkiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static otozvannye_zajavkiSoap[][] toSoapModels(
		otozvannye_zajavki[][] models) {
		otozvannye_zajavkiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new otozvannye_zajavkiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new otozvannye_zajavkiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static otozvannye_zajavkiSoap[] toSoapModels(
		List<otozvannye_zajavki> models) {
		List<otozvannye_zajavkiSoap> soapModels = new ArrayList<otozvannye_zajavkiSoap>(models.size());

		for (otozvannye_zajavki model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new otozvannye_zajavkiSoap[soapModels.size()]);
	}

	public otozvannye_zajavkiSoap() {
	}

	public long getPrimaryKey() {
		return _otozvannye_zajavki_id;
	}

	public void setPrimaryKey(long pk) {
		setOtozvannye_zajavki_id(pk);
	}

	public Date getData_otzyva() {
		return _data_otzyva;
	}

	public void setData_otzyva(Date data_otzyva) {
		_data_otzyva = data_otzyva;
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

	public int getKolichestvo() {
		return _kolichestvo;
	}

	public void setKolichestvo(int kolichestvo) {
		_kolichestvo = kolichestvo;
	}

	public long getLot_id() {
		return _lot_id;
	}

	public void setLot_id(long lot_id) {
		_lot_id = lot_id;
	}

	public long getOtozval() {
		return _otozval;
	}

	public void setOtozval(long otozval) {
		_otozval = otozval;
	}

	public long getOtozvannye_zajavki_id() {
		return _otozvannye_zajavki_id;
	}

	public void setOtozvannye_zajavki_id(long otozvannye_zajavki_id) {
		_otozvannye_zajavki_id = otozvannye_zajavki_id;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
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

	private Date _data_otzyva;
	private double _itogo_za_tovar;
	private long _izvewenie_id;
	private int _kolichestvo;
	private long _lot_id;
	private long _otozval;
	private long _otozvannye_zajavki_id;
	private long _postavwik_id;
	private double _summa_za_edinicu_tovara;
	private long _tovar_id;
}