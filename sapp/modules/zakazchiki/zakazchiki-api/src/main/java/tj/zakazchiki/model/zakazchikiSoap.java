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

package tj.zakazchiki.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.zakazchiki.service.http.zakazchikiServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.zakazchiki.service.http.zakazchikiServiceSoap
 * @generated
 */
@ProviderType
public class zakazchikiSoap implements Serializable {
	public static zakazchikiSoap toSoapModel(zakazchiki model) {
		zakazchikiSoap soapModel = new zakazchikiSoap();

		soapModel.setAdres(model.getAdres());
		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setEin(model.getEin());
		soapModel.setFbk_id(model.getFbk_id());
		soapModel.setGorod(model.getGorod());
		soapModel.setInn(model.getInn());
		soapModel.setIstochnik_finansirovanija_id(model.getIstochnik_finansirovanija_id());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setJe_pochta(model.getJe_pochta());
		soapModel.setKontaktnyj_telefon(model.getKontaktnyj_telefon());
		soapModel.setKvalificirovannaja_organizacija(model.getKvalificirovannaja_organizacija());
		soapModel.setNaimenovanie(model.getNaimenovanie());
		soapModel.setOblast_id(model.getOblast_id());
		soapModel.setOtvetstvennoe_lico(model.getOtvetstvennoe_lico());
		soapModel.setRajon_id(model.getRajon_id());
		soapModel.setRukovoditel(model.getRukovoditel());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setVbk_id(model.getVbk_id());
		soapModel.setZakazchiki_id(model.getZakazchiki_id());

		return soapModel;
	}

	public static zakazchikiSoap[] toSoapModels(zakazchiki[] models) {
		zakazchikiSoap[] soapModels = new zakazchikiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static zakazchikiSoap[][] toSoapModels(zakazchiki[][] models) {
		zakazchikiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new zakazchikiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new zakazchikiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static zakazchikiSoap[] toSoapModels(List<zakazchiki> models) {
		List<zakazchikiSoap> soapModels = new ArrayList<zakazchikiSoap>(models.size());

		for (zakazchiki model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new zakazchikiSoap[soapModels.size()]);
	}

	public zakazchikiSoap() {
	}

	public long getPrimaryKey() {
		return _zakazchiki_id;
	}

	public void setPrimaryKey(long pk) {
		setZakazchiki_id(pk);
	}

	public String getAdres() {
		return _adres;
	}

	public void setAdres(String adres) {
		_adres = adres;
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

	public String getEin() {
		return _ein;
	}

	public void setEin(String ein) {
		_ein = ein;
	}

	public long getFbk_id() {
		return _fbk_id;
	}

	public void setFbk_id(long fbk_id) {
		_fbk_id = fbk_id;
	}

	public String getGorod() {
		return _gorod;
	}

	public void setGorod(String gorod) {
		_gorod = gorod;
	}

	public String getInn() {
		return _inn;
	}

	public void setInn(String inn) {
		_inn = inn;
	}

	public long getIstochnik_finansirovanija_id() {
		return _istochnik_finansirovanija_id;
	}

	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id) {
		_istochnik_finansirovanija_id = istochnik_finansirovanija_id;
	}

	public long getIzmenil() {
		return _izmenil;
	}

	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	public String getJe_pochta() {
		return _je_pochta;
	}

	public void setJe_pochta(String je_pochta) {
		_je_pochta = je_pochta;
	}

	public String getKontaktnyj_telefon() {
		return _kontaktnyj_telefon;
	}

	public void setKontaktnyj_telefon(String kontaktnyj_telefon) {
		_kontaktnyj_telefon = kontaktnyj_telefon;
	}

	public long getKvalificirovannaja_organizacija() {
		return _kvalificirovannaja_organizacija;
	}

	public void setKvalificirovannaja_organizacija(
		long kvalificirovannaja_organizacija) {
		_kvalificirovannaja_organizacija = kvalificirovannaja_organizacija;
	}

	public String getNaimenovanie() {
		return _naimenovanie;
	}

	public void setNaimenovanie(String naimenovanie) {
		_naimenovanie = naimenovanie;
	}

	public long getOblast_id() {
		return _oblast_id;
	}

	public void setOblast_id(long oblast_id) {
		_oblast_id = oblast_id;
	}

	public String getOtvetstvennoe_lico() {
		return _otvetstvennoe_lico;
	}

	public void setOtvetstvennoe_lico(String otvetstvennoe_lico) {
		_otvetstvennoe_lico = otvetstvennoe_lico;
	}

	public long getRajon_id() {
		return _rajon_id;
	}

	public void setRajon_id(long rajon_id) {
		_rajon_id = rajon_id;
	}

	public String getRukovoditel() {
		return _rukovoditel;
	}

	public void setRukovoditel(String rukovoditel) {
		_rukovoditel = rukovoditel;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	public long getVbk_id() {
		return _vbk_id;
	}

	public void setVbk_id(long vbk_id) {
		_vbk_id = vbk_id;
	}

	public long getZakazchiki_id() {
		return _zakazchiki_id;
	}

	public void setZakazchiki_id(long zakazchiki_id) {
		_zakazchiki_id = zakazchiki_id;
	}

	private String _adres;
	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private String _ein;
	private long _fbk_id;
	private String _gorod;
	private String _inn;
	private long _istochnik_finansirovanija_id;
	private long _izmenil;
	private String _je_pochta;
	private String _kontaktnyj_telefon;
	private long _kvalificirovannaja_organizacija;
	private String _naimenovanie;
	private long _oblast_id;
	private String _otvetstvennoe_lico;
	private long _rajon_id;
	private String _rukovoditel;
	private long _sozdal;
	private long _vbk_id;
	private long _zakazchiki_id;
}