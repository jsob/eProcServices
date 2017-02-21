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

package tj.godovoj.plan.zakupok.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.godovoj.plan.zakupok.service.http.godovoj_plan_zakupokServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.godovoj.plan.zakupok.service.http.godovoj_plan_zakupokServiceSoap
 * @generated
 */
@ProviderType
public class godovoj_plan_zakupokSoap implements Serializable {
	public static godovoj_plan_zakupokSoap toSoapModel(
		godovoj_plan_zakupok model) {
		godovoj_plan_zakupokSoap soapModel = new godovoj_plan_zakupokSoap();

		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setGodovoj_plan_zakupok_id(model.getGodovoj_plan_zakupok_id());
		soapModel.setIstochnik_finansirovanija_id(model.getIstochnik_finansirovanija_id());
		soapModel.setNaimenovanie_predmeta_zakupki(model.getNaimenovanie_predmeta_zakupki());
		soapModel.setPlaniruemyj_metod_zakupki_id(model.getPlaniruemyj_metod_zakupki_id());
		soapModel.setPredpolagaemaja_summa(model.getPredpolagaemaja_summa());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setSroki_provedenija_zakupki(model.getSroki_provedenija_zakupki());
		soapModel.setSumma_finansirovanija(model.getSumma_finansirovanija());
		soapModel.setVbk_id(model.getVbk_id());

		return soapModel;
	}

	public static godovoj_plan_zakupokSoap[] toSoapModels(
		godovoj_plan_zakupok[] models) {
		godovoj_plan_zakupokSoap[] soapModels = new godovoj_plan_zakupokSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static godovoj_plan_zakupokSoap[][] toSoapModels(
		godovoj_plan_zakupok[][] models) {
		godovoj_plan_zakupokSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new godovoj_plan_zakupokSoap[models.length][models[0].length];
		}
		else {
			soapModels = new godovoj_plan_zakupokSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static godovoj_plan_zakupokSoap[] toSoapModels(
		List<godovoj_plan_zakupok> models) {
		List<godovoj_plan_zakupokSoap> soapModels = new ArrayList<godovoj_plan_zakupokSoap>(models.size());

		for (godovoj_plan_zakupok model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new godovoj_plan_zakupokSoap[soapModels.size()]);
	}

	public godovoj_plan_zakupokSoap() {
	}

	public long getPrimaryKey() {
		return _godovoj_plan_zakupok_id;
	}

	public void setPrimaryKey(long pk) {
		setGodovoj_plan_zakupok_id(pk);
	}

	public Date getData_sozdanija() {
		return _data_sozdanija;
	}

	public void setData_sozdanija(Date data_sozdanija) {
		_data_sozdanija = data_sozdanija;
	}

	public long getGodovoj_plan_zakupok_id() {
		return _godovoj_plan_zakupok_id;
	}

	public void setGodovoj_plan_zakupok_id(long godovoj_plan_zakupok_id) {
		_godovoj_plan_zakupok_id = godovoj_plan_zakupok_id;
	}

	public long getIstochnik_finansirovanija_id() {
		return _istochnik_finansirovanija_id;
	}

	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id) {
		_istochnik_finansirovanija_id = istochnik_finansirovanija_id;
	}

	public String getNaimenovanie_predmeta_zakupki() {
		return _naimenovanie_predmeta_zakupki;
	}

	public void setNaimenovanie_predmeta_zakupki(
		String naimenovanie_predmeta_zakupki) {
		_naimenovanie_predmeta_zakupki = naimenovanie_predmeta_zakupki;
	}

	public long getPlaniruemyj_metod_zakupki_id() {
		return _planiruemyj_metod_zakupki_id;
	}

	public void setPlaniruemyj_metod_zakupki_id(
		long planiruemyj_metod_zakupki_id) {
		_planiruemyj_metod_zakupki_id = planiruemyj_metod_zakupki_id;
	}

	public double getPredpolagaemaja_summa() {
		return _predpolagaemaja_summa;
	}

	public void setPredpolagaemaja_summa(double predpolagaemaja_summa) {
		_predpolagaemaja_summa = predpolagaemaja_summa;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	public String getSroki_provedenija_zakupki() {
		return _sroki_provedenija_zakupki;
	}

	public void setSroki_provedenija_zakupki(String sroki_provedenija_zakupki) {
		_sroki_provedenija_zakupki = sroki_provedenija_zakupki;
	}

	public double getSumma_finansirovanija() {
		return _summa_finansirovanija;
	}

	public void setSumma_finansirovanija(double summa_finansirovanija) {
		_summa_finansirovanija = summa_finansirovanija;
	}

	public long getVbk_id() {
		return _vbk_id;
	}

	public void setVbk_id(long vbk_id) {
		_vbk_id = vbk_id;
	}

	private Date _data_sozdanija;
	private long _godovoj_plan_zakupok_id;
	private long _istochnik_finansirovanija_id;
	private String _naimenovanie_predmeta_zakupki;
	private long _planiruemyj_metod_zakupki_id;
	private double _predpolagaemaja_summa;
	private long _sozdal;
	private String _sroki_provedenija_zakupki;
	private double _summa_finansirovanija;
	private long _vbk_id;
}