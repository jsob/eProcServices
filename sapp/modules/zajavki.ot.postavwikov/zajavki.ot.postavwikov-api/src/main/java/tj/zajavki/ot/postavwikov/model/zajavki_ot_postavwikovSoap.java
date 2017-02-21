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

package tj.zajavki.ot.postavwikov.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.zajavki.ot.postavwikov.service.http.zajavki_ot_postavwikovServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.zajavki.ot.postavwikov.service.http.zajavki_ot_postavwikovServiceSoap
 * @generated
 */
@ProviderType
public class zajavki_ot_postavwikovSoap implements Serializable {
	public static zajavki_ot_postavwikovSoap toSoapModel(
		zajavki_ot_postavwikov model) {
		zajavki_ot_postavwikovSoap soapModel = new zajavki_ot_postavwikovSoap();

		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setItogo_za_tovar(model.getItogo_za_tovar());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setKod_po_obshhemu_klassifikatoru(model.getKod_po_obshhemu_klassifikatoru());
		soapModel.setKod_strany_proizvoditelja(model.getKod_strany_proizvoditelja());
		soapModel.setKolichestvo(model.getKolichestvo());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setOpisanie_tovara(model.getOpisanie_tovara());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setPredlozhenie_postavwika(model.getPredlozhenie_postavwika());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setSumma_za_edinicu_tovara(model.getSumma_za_edinicu_tovara());
		soapModel.setTovar_id(model.getTovar_id());
		soapModel.setZajavki_ot_postavwikov_id(model.getZajavki_ot_postavwikov_id());

		return soapModel;
	}

	public static zajavki_ot_postavwikovSoap[] toSoapModels(
		zajavki_ot_postavwikov[] models) {
		zajavki_ot_postavwikovSoap[] soapModels = new zajavki_ot_postavwikovSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static zajavki_ot_postavwikovSoap[][] toSoapModels(
		zajavki_ot_postavwikov[][] models) {
		zajavki_ot_postavwikovSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new zajavki_ot_postavwikovSoap[models.length][models[0].length];
		}
		else {
			soapModels = new zajavki_ot_postavwikovSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static zajavki_ot_postavwikovSoap[] toSoapModels(
		List<zajavki_ot_postavwikov> models) {
		List<zajavki_ot_postavwikovSoap> soapModels = new ArrayList<zajavki_ot_postavwikovSoap>(models.size());

		for (zajavki_ot_postavwikov model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new zajavki_ot_postavwikovSoap[soapModels.size()]);
	}

	public zajavki_ot_postavwikovSoap() {
	}

	public long getPrimaryKey() {
		return _zajavki_ot_postavwikov_id;
	}

	public void setPrimaryKey(long pk) {
		setZajavki_ot_postavwikov_id(pk);
	}

	public Date getData_izmenenija() {
		return _data_izmenenija;
	}

	public void setData_izmenenija(Date data_izmenenija) {
		_data_izmenenija = data_izmenenija;
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

	public long getIzmenil() {
		return _izmenil;
	}

	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public long getKod_po_obshhemu_klassifikatoru() {
		return _kod_po_obshhemu_klassifikatoru;
	}

	public void setKod_po_obshhemu_klassifikatoru(
		long kod_po_obshhemu_klassifikatoru) {
		_kod_po_obshhemu_klassifikatoru = kod_po_obshhemu_klassifikatoru;
	}

	public long getKod_strany_proizvoditelja() {
		return _kod_strany_proizvoditelja;
	}

	public void setKod_strany_proizvoditelja(long kod_strany_proizvoditelja) {
		_kod_strany_proizvoditelja = kod_strany_proizvoditelja;
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

	public String getOpisanie_tovara() {
		return _opisanie_tovara;
	}

	public void setOpisanie_tovara(String opisanie_tovara) {
		_opisanie_tovara = opisanie_tovara;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public String getPredlozhenie_postavwika() {
		return _predlozhenie_postavwika;
	}

	public void setPredlozhenie_postavwika(String predlozhenie_postavwika) {
		_predlozhenie_postavwika = predlozhenie_postavwika;
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

	public long getZajavki_ot_postavwikov_id() {
		return _zajavki_ot_postavwikov_id;
	}

	public void setZajavki_ot_postavwikov_id(long zajavki_ot_postavwikov_id) {
		_zajavki_ot_postavwikov_id = zajavki_ot_postavwikov_id;
	}

	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private double _itogo_za_tovar;
	private long _izmenil;
	private long _izvewenie_id;
	private long _kod_po_obshhemu_klassifikatoru;
	private long _kod_strany_proizvoditelja;
	private long _kolichestvo;
	private long _lot_id;
	private String _opisanie_tovara;
	private long _postavwik_id;
	private String _predlozhenie_postavwika;
	private long _sozdal;
	private double _summa_za_edinicu_tovara;
	private long _tovar_id;
	private long _zajavki_ot_postavwikov_id;
}