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

package tj.prochaja.informacija.dlja.zajavki.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link prochaja_informacija_dlja_zajavki}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prochaja_informacija_dlja_zajavki
 * @generated
 */
@ProviderType
public class prochaja_informacija_dlja_zajavkiWrapper
	implements prochaja_informacija_dlja_zajavki,
		ModelWrapper<prochaja_informacija_dlja_zajavki> {
	public prochaja_informacija_dlja_zajavkiWrapper(
		prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki) {
		_prochaja_informacija_dlja_zajavki = prochaja_informacija_dlja_zajavki;
	}

	@Override
	public Class<?> getModelClass() {
		return prochaja_informacija_dlja_zajavki.class;
	}

	@Override
	public String getModelClassName() {
		return prochaja_informacija_dlja_zajavki.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cena_postavki", getCena_postavki());
		attributes.put("cena_postavki_soglasno_zakazchiku",
			getCena_postavki_soglasno_zakazchiku());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("lot_id", getLot_id());
		attributes.put("mesto_postavki", getMesto_postavki());
		attributes.put("mesto_postavki_soglasno_zakazchiku",
			getMesto_postavki_soglasno_zakazchiku());
		attributes.put("oplata", getOplata());
		attributes.put("oplata_soglasno_zakazchiku",
			getOplata_soglasno_zakazchiku());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("prochaja_informacija_dlja_zajavki_id",
			getProchaja_informacija_dlja_zajavki_id());
		attributes.put("soputstvujuwie_uslovija", getSoputstvujuwie_uslovija());
		attributes.put("soputstvujuwie_uslovija_soglasno_zakazchiku",
			getSoputstvujuwie_uslovija_soglasno_zakazchiku());
		attributes.put("sozdal", getSozdal());
		attributes.put("srok_dejstvija", getSrok_dejstvija());
		attributes.put("srok_dejstvija_soglasno_zakazchiku",
			getSrok_dejstvija_soglasno_zakazchiku());
		attributes.put("srok_ispolnenija_zajavki", getSrok_ispolnenija_zajavki());
		attributes.put("srok_ispolnenija_zajavki_soglasno_zakazchiku",
			getSrok_ispolnenija_zajavki_soglasno_zakazchiku());
		attributes.put("srok_obespechenija_zajavki",
			getSrok_obespechenija_zajavki());
		attributes.put("srok_obespechenija_zajavki_soglasno_zakazchiku",
			getSrok_obespechenija_zajavki_soglasno_zakazchiku());
		attributes.put("srok_postavki", getSrok_postavki());
		attributes.put("srok_postavki_soglasno_zakazchiku",
			getSrok_postavki_soglasno_zakazchiku());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String cena_postavki = (String)attributes.get("cena_postavki");

		if (cena_postavki != null) {
			setCena_postavki(cena_postavki);
		}

		Long cena_postavki_soglasno_zakazchiku = (Long)attributes.get(
				"cena_postavki_soglasno_zakazchiku");

		if (cena_postavki_soglasno_zakazchiku != null) {
			setCena_postavki_soglasno_zakazchiku(cena_postavki_soglasno_zakazchiku);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		String mesto_postavki = (String)attributes.get("mesto_postavki");

		if (mesto_postavki != null) {
			setMesto_postavki(mesto_postavki);
		}

		Long mesto_postavki_soglasno_zakazchiku = (Long)attributes.get(
				"mesto_postavki_soglasno_zakazchiku");

		if (mesto_postavki_soglasno_zakazchiku != null) {
			setMesto_postavki_soglasno_zakazchiku(mesto_postavki_soglasno_zakazchiku);
		}

		String oplata = (String)attributes.get("oplata");

		if (oplata != null) {
			setOplata(oplata);
		}

		Long oplata_soglasno_zakazchiku = (Long)attributes.get(
				"oplata_soglasno_zakazchiku");

		if (oplata_soglasno_zakazchiku != null) {
			setOplata_soglasno_zakazchiku(oplata_soglasno_zakazchiku);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Long prochaja_informacija_dlja_zajavki_id = (Long)attributes.get(
				"prochaja_informacija_dlja_zajavki_id");

		if (prochaja_informacija_dlja_zajavki_id != null) {
			setProchaja_informacija_dlja_zajavki_id(prochaja_informacija_dlja_zajavki_id);
		}

		String soputstvujuwie_uslovija = (String)attributes.get(
				"soputstvujuwie_uslovija");

		if (soputstvujuwie_uslovija != null) {
			setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
		}

		Long soputstvujuwie_uslovija_soglasno_zakazchiku = (Long)attributes.get(
				"soputstvujuwie_uslovija_soglasno_zakazchiku");

		if (soputstvujuwie_uslovija_soglasno_zakazchiku != null) {
			setSoputstvujuwie_uslovija_soglasno_zakazchiku(soputstvujuwie_uslovija_soglasno_zakazchiku);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		String srok_dejstvija = (String)attributes.get("srok_dejstvija");

		if (srok_dejstvija != null) {
			setSrok_dejstvija(srok_dejstvija);
		}

		Long srok_dejstvija_soglasno_zakazchiku = (Long)attributes.get(
				"srok_dejstvija_soglasno_zakazchiku");

		if (srok_dejstvija_soglasno_zakazchiku != null) {
			setSrok_dejstvija_soglasno_zakazchiku(srok_dejstvija_soglasno_zakazchiku);
		}

		String srok_ispolnenija_zajavki = (String)attributes.get(
				"srok_ispolnenija_zajavki");

		if (srok_ispolnenija_zajavki != null) {
			setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
		}

		Long srok_ispolnenija_zajavki_soglasno_zakazchiku = (Long)attributes.get(
				"srok_ispolnenija_zajavki_soglasno_zakazchiku");

		if (srok_ispolnenija_zajavki_soglasno_zakazchiku != null) {
			setSrok_ispolnenija_zajavki_soglasno_zakazchiku(srok_ispolnenija_zajavki_soglasno_zakazchiku);
		}

		String srok_obespechenija_zajavki = (String)attributes.get(
				"srok_obespechenija_zajavki");

		if (srok_obespechenija_zajavki != null) {
			setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
		}

		Long srok_obespechenija_zajavki_soglasno_zakazchiku = (Long)attributes.get(
				"srok_obespechenija_zajavki_soglasno_zakazchiku");

		if (srok_obespechenija_zajavki_soglasno_zakazchiku != null) {
			setSrok_obespechenija_zajavki_soglasno_zakazchiku(srok_obespechenija_zajavki_soglasno_zakazchiku);
		}

		String srok_postavki = (String)attributes.get("srok_postavki");

		if (srok_postavki != null) {
			setSrok_postavki(srok_postavki);
		}

		Long srok_postavki_soglasno_zakazchiku = (Long)attributes.get(
				"srok_postavki_soglasno_zakazchiku");

		if (srok_postavki_soglasno_zakazchiku != null) {
			setSrok_postavki_soglasno_zakazchiku(srok_postavki_soglasno_zakazchiku);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _prochaja_informacija_dlja_zajavki.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _prochaja_informacija_dlja_zajavki.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _prochaja_informacija_dlja_zajavki.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _prochaja_informacija_dlja_zajavki.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.prochaja.informacija.dlja.zajavki.model.prochaja_informacija_dlja_zajavki> toCacheModel() {
		return _prochaja_informacija_dlja_zajavki.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.prochaja.informacija.dlja.zajavki.model.prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki) {
		return _prochaja_informacija_dlja_zajavki.compareTo(prochaja_informacija_dlja_zajavki);
	}

	@Override
	public int hashCode() {
		return _prochaja_informacija_dlja_zajavki.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _prochaja_informacija_dlja_zajavki.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new prochaja_informacija_dlja_zajavkiWrapper((prochaja_informacija_dlja_zajavki)_prochaja_informacija_dlja_zajavki.clone());
	}

	/**
	* Returns the cena_postavki of this prochaja_informacija_dlja_zajavki.
	*
	* @return the cena_postavki of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public java.lang.String getCena_postavki() {
		return _prochaja_informacija_dlja_zajavki.getCena_postavki();
	}

	/**
	* Returns the mesto_postavki of this prochaja_informacija_dlja_zajavki.
	*
	* @return the mesto_postavki of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public java.lang.String getMesto_postavki() {
		return _prochaja_informacija_dlja_zajavki.getMesto_postavki();
	}

	/**
	* Returns the oplata of this prochaja_informacija_dlja_zajavki.
	*
	* @return the oplata of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public java.lang.String getOplata() {
		return _prochaja_informacija_dlja_zajavki.getOplata();
	}

	/**
	* Returns the soputstvujuwie_uslovija of this prochaja_informacija_dlja_zajavki.
	*
	* @return the soputstvujuwie_uslovija of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public java.lang.String getSoputstvujuwie_uslovija() {
		return _prochaja_informacija_dlja_zajavki.getSoputstvujuwie_uslovija();
	}

	/**
	* Returns the srok_dejstvija of this prochaja_informacija_dlja_zajavki.
	*
	* @return the srok_dejstvija of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public java.lang.String getSrok_dejstvija() {
		return _prochaja_informacija_dlja_zajavki.getSrok_dejstvija();
	}

	/**
	* Returns the srok_ispolnenija_zajavki of this prochaja_informacija_dlja_zajavki.
	*
	* @return the srok_ispolnenija_zajavki of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public java.lang.String getSrok_ispolnenija_zajavki() {
		return _prochaja_informacija_dlja_zajavki.getSrok_ispolnenija_zajavki();
	}

	/**
	* Returns the srok_obespechenija_zajavki of this prochaja_informacija_dlja_zajavki.
	*
	* @return the srok_obespechenija_zajavki of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public java.lang.String getSrok_obespechenija_zajavki() {
		return _prochaja_informacija_dlja_zajavki.getSrok_obespechenija_zajavki();
	}

	/**
	* Returns the srok_postavki of this prochaja_informacija_dlja_zajavki.
	*
	* @return the srok_postavki of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public java.lang.String getSrok_postavki() {
		return _prochaja_informacija_dlja_zajavki.getSrok_postavki();
	}

	@Override
	public java.lang.String toString() {
		return _prochaja_informacija_dlja_zajavki.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _prochaja_informacija_dlja_zajavki.toXmlString();
	}

	/**
	* Returns the data_sozdanija of this prochaja_informacija_dlja_zajavki.
	*
	* @return the data_sozdanija of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public Date getData_sozdanija() {
		return _prochaja_informacija_dlja_zajavki.getData_sozdanija();
	}

	/**
	* Returns the cena_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @return the cena_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getCena_postavki_soglasno_zakazchiku() {
		return _prochaja_informacija_dlja_zajavki.getCena_postavki_soglasno_zakazchiku();
	}

	/**
	* Returns the izvewenie_id of this prochaja_informacija_dlja_zajavki.
	*
	* @return the izvewenie_id of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getIzvewenie_id() {
		return _prochaja_informacija_dlja_zajavki.getIzvewenie_id();
	}

	/**
	* Returns the lot_id of this prochaja_informacija_dlja_zajavki.
	*
	* @return the lot_id of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getLot_id() {
		return _prochaja_informacija_dlja_zajavki.getLot_id();
	}

	/**
	* Returns the mesto_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @return the mesto_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getMesto_postavki_soglasno_zakazchiku() {
		return _prochaja_informacija_dlja_zajavki.getMesto_postavki_soglasno_zakazchiku();
	}

	/**
	* Returns the oplata_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @return the oplata_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getOplata_soglasno_zakazchiku() {
		return _prochaja_informacija_dlja_zajavki.getOplata_soglasno_zakazchiku();
	}

	/**
	* Returns the postavwik_id of this prochaja_informacija_dlja_zajavki.
	*
	* @return the postavwik_id of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getPostavwik_id() {
		return _prochaja_informacija_dlja_zajavki.getPostavwik_id();
	}

	/**
	* Returns the primary key of this prochaja_informacija_dlja_zajavki.
	*
	* @return the primary key of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getPrimaryKey() {
		return _prochaja_informacija_dlja_zajavki.getPrimaryKey();
	}

	/**
	* Returns the prochaja_informacija_dlja_zajavki_id of this prochaja_informacija_dlja_zajavki.
	*
	* @return the prochaja_informacija_dlja_zajavki_id of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getProchaja_informacija_dlja_zajavki_id() {
		return _prochaja_informacija_dlja_zajavki.getProchaja_informacija_dlja_zajavki_id();
	}

	/**
	* Returns the soputstvujuwie_uslovija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @return the soputstvujuwie_uslovija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getSoputstvujuwie_uslovija_soglasno_zakazchiku() {
		return _prochaja_informacija_dlja_zajavki.getSoputstvujuwie_uslovija_soglasno_zakazchiku();
	}

	/**
	* Returns the sozdal of this prochaja_informacija_dlja_zajavki.
	*
	* @return the sozdal of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getSozdal() {
		return _prochaja_informacija_dlja_zajavki.getSozdal();
	}

	/**
	* Returns the srok_dejstvija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @return the srok_dejstvija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getSrok_dejstvija_soglasno_zakazchiku() {
		return _prochaja_informacija_dlja_zajavki.getSrok_dejstvija_soglasno_zakazchiku();
	}

	/**
	* Returns the srok_ispolnenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @return the srok_ispolnenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getSrok_ispolnenija_zajavki_soglasno_zakazchiku() {
		return _prochaja_informacija_dlja_zajavki.getSrok_ispolnenija_zajavki_soglasno_zakazchiku();
	}

	/**
	* Returns the srok_obespechenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @return the srok_obespechenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getSrok_obespechenija_zajavki_soglasno_zakazchiku() {
		return _prochaja_informacija_dlja_zajavki.getSrok_obespechenija_zajavki_soglasno_zakazchiku();
	}

	/**
	* Returns the srok_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @return the srok_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public long getSrok_postavki_soglasno_zakazchiku() {
		return _prochaja_informacija_dlja_zajavki.getSrok_postavki_soglasno_zakazchiku();
	}

	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.prochaja_informacija_dlja_zajavki toEscapedModel() {
		return new prochaja_informacija_dlja_zajavkiWrapper(_prochaja_informacija_dlja_zajavki.toEscapedModel());
	}

	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.prochaja_informacija_dlja_zajavki toUnescapedModel() {
		return new prochaja_informacija_dlja_zajavkiWrapper(_prochaja_informacija_dlja_zajavki.toUnescapedModel());
	}

	@Override
	public void persist() {
		_prochaja_informacija_dlja_zajavki.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_prochaja_informacija_dlja_zajavki.setCachedModel(cachedModel);
	}

	/**
	* Sets the cena_postavki of this prochaja_informacija_dlja_zajavki.
	*
	* @param cena_postavki the cena_postavki of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setCena_postavki(java.lang.String cena_postavki) {
		_prochaja_informacija_dlja_zajavki.setCena_postavki(cena_postavki);
	}

	/**
	* Sets the cena_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @param cena_postavki_soglasno_zakazchiku the cena_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setCena_postavki_soglasno_zakazchiku(
		long cena_postavki_soglasno_zakazchiku) {
		_prochaja_informacija_dlja_zajavki.setCena_postavki_soglasno_zakazchiku(cena_postavki_soglasno_zakazchiku);
	}

	/**
	* Sets the data_sozdanija of this prochaja_informacija_dlja_zajavki.
	*
	* @param data_sozdanija the data_sozdanija of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_prochaja_informacija_dlja_zajavki.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_prochaja_informacija_dlja_zajavki.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_prochaja_informacija_dlja_zajavki.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_prochaja_informacija_dlja_zajavki.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this prochaja_informacija_dlja_zajavki.
	*
	* @param izvewenie_id the izvewenie_id of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_prochaja_informacija_dlja_zajavki.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the lot_id of this prochaja_informacija_dlja_zajavki.
	*
	* @param lot_id the lot_id of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setLot_id(long lot_id) {
		_prochaja_informacija_dlja_zajavki.setLot_id(lot_id);
	}

	/**
	* Sets the mesto_postavki of this prochaja_informacija_dlja_zajavki.
	*
	* @param mesto_postavki the mesto_postavki of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setMesto_postavki(java.lang.String mesto_postavki) {
		_prochaja_informacija_dlja_zajavki.setMesto_postavki(mesto_postavki);
	}

	/**
	* Sets the mesto_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @param mesto_postavki_soglasno_zakazchiku the mesto_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setMesto_postavki_soglasno_zakazchiku(
		long mesto_postavki_soglasno_zakazchiku) {
		_prochaja_informacija_dlja_zajavki.setMesto_postavki_soglasno_zakazchiku(mesto_postavki_soglasno_zakazchiku);
	}

	@Override
	public void setNew(boolean n) {
		_prochaja_informacija_dlja_zajavki.setNew(n);
	}

	/**
	* Sets the oplata of this prochaja_informacija_dlja_zajavki.
	*
	* @param oplata the oplata of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setOplata(java.lang.String oplata) {
		_prochaja_informacija_dlja_zajavki.setOplata(oplata);
	}

	/**
	* Sets the oplata_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @param oplata_soglasno_zakazchiku the oplata_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setOplata_soglasno_zakazchiku(long oplata_soglasno_zakazchiku) {
		_prochaja_informacija_dlja_zajavki.setOplata_soglasno_zakazchiku(oplata_soglasno_zakazchiku);
	}

	/**
	* Sets the postavwik_id of this prochaja_informacija_dlja_zajavki.
	*
	* @param postavwik_id the postavwik_id of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_prochaja_informacija_dlja_zajavki.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this prochaja_informacija_dlja_zajavki.
	*
	* @param primaryKey the primary key of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_prochaja_informacija_dlja_zajavki.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_prochaja_informacija_dlja_zajavki.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the prochaja_informacija_dlja_zajavki_id of this prochaja_informacija_dlja_zajavki.
	*
	* @param prochaja_informacija_dlja_zajavki_id the prochaja_informacija_dlja_zajavki_id of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setProchaja_informacija_dlja_zajavki_id(
		long prochaja_informacija_dlja_zajavki_id) {
		_prochaja_informacija_dlja_zajavki.setProchaja_informacija_dlja_zajavki_id(prochaja_informacija_dlja_zajavki_id);
	}

	/**
	* Sets the soputstvujuwie_uslovija of this prochaja_informacija_dlja_zajavki.
	*
	* @param soputstvujuwie_uslovija the soputstvujuwie_uslovija of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setSoputstvujuwie_uslovija(
		java.lang.String soputstvujuwie_uslovija) {
		_prochaja_informacija_dlja_zajavki.setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
	}

	/**
	* Sets the soputstvujuwie_uslovija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @param soputstvujuwie_uslovija_soglasno_zakazchiku the soputstvujuwie_uslovija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setSoputstvujuwie_uslovija_soglasno_zakazchiku(
		long soputstvujuwie_uslovija_soglasno_zakazchiku) {
		_prochaja_informacija_dlja_zajavki.setSoputstvujuwie_uslovija_soglasno_zakazchiku(soputstvujuwie_uslovija_soglasno_zakazchiku);
	}

	/**
	* Sets the sozdal of this prochaja_informacija_dlja_zajavki.
	*
	* @param sozdal the sozdal of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setSozdal(long sozdal) {
		_prochaja_informacija_dlja_zajavki.setSozdal(sozdal);
	}

	/**
	* Sets the srok_dejstvija of this prochaja_informacija_dlja_zajavki.
	*
	* @param srok_dejstvija the srok_dejstvija of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setSrok_dejstvija(java.lang.String srok_dejstvija) {
		_prochaja_informacija_dlja_zajavki.setSrok_dejstvija(srok_dejstvija);
	}

	/**
	* Sets the srok_dejstvija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @param srok_dejstvija_soglasno_zakazchiku the srok_dejstvija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setSrok_dejstvija_soglasno_zakazchiku(
		long srok_dejstvija_soglasno_zakazchiku) {
		_prochaja_informacija_dlja_zajavki.setSrok_dejstvija_soglasno_zakazchiku(srok_dejstvija_soglasno_zakazchiku);
	}

	/**
	* Sets the srok_ispolnenija_zajavki of this prochaja_informacija_dlja_zajavki.
	*
	* @param srok_ispolnenija_zajavki the srok_ispolnenija_zajavki of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setSrok_ispolnenija_zajavki(
		java.lang.String srok_ispolnenija_zajavki) {
		_prochaja_informacija_dlja_zajavki.setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
	}

	/**
	* Sets the srok_ispolnenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @param srok_ispolnenija_zajavki_soglasno_zakazchiku the srok_ispolnenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setSrok_ispolnenija_zajavki_soglasno_zakazchiku(
		long srok_ispolnenija_zajavki_soglasno_zakazchiku) {
		_prochaja_informacija_dlja_zajavki.setSrok_ispolnenija_zajavki_soglasno_zakazchiku(srok_ispolnenija_zajavki_soglasno_zakazchiku);
	}

	/**
	* Sets the srok_obespechenija_zajavki of this prochaja_informacija_dlja_zajavki.
	*
	* @param srok_obespechenija_zajavki the srok_obespechenija_zajavki of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setSrok_obespechenija_zajavki(
		java.lang.String srok_obespechenija_zajavki) {
		_prochaja_informacija_dlja_zajavki.setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
	}

	/**
	* Sets the srok_obespechenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @param srok_obespechenija_zajavki_soglasno_zakazchiku the srok_obespechenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setSrok_obespechenija_zajavki_soglasno_zakazchiku(
		long srok_obespechenija_zajavki_soglasno_zakazchiku) {
		_prochaja_informacija_dlja_zajavki.setSrok_obespechenija_zajavki_soglasno_zakazchiku(srok_obespechenija_zajavki_soglasno_zakazchiku);
	}

	/**
	* Sets the srok_postavki of this prochaja_informacija_dlja_zajavki.
	*
	* @param srok_postavki the srok_postavki of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setSrok_postavki(java.lang.String srok_postavki) {
		_prochaja_informacija_dlja_zajavki.setSrok_postavki(srok_postavki);
	}

	/**
	* Sets the srok_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	*
	* @param srok_postavki_soglasno_zakazchiku the srok_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	*/
	@Override
	public void setSrok_postavki_soglasno_zakazchiku(
		long srok_postavki_soglasno_zakazchiku) {
		_prochaja_informacija_dlja_zajavki.setSrok_postavki_soglasno_zakazchiku(srok_postavki_soglasno_zakazchiku);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof prochaja_informacija_dlja_zajavkiWrapper)) {
			return false;
		}

		prochaja_informacija_dlja_zajavkiWrapper prochaja_informacija_dlja_zajavkiWrapper =
			(prochaja_informacija_dlja_zajavkiWrapper)obj;

		if (Objects.equals(_prochaja_informacija_dlja_zajavki,
					prochaja_informacija_dlja_zajavkiWrapper._prochaja_informacija_dlja_zajavki)) {
			return true;
		}

		return false;
	}

	@Override
	public prochaja_informacija_dlja_zajavki getWrappedModel() {
		return _prochaja_informacija_dlja_zajavki;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _prochaja_informacija_dlja_zajavki.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _prochaja_informacija_dlja_zajavki.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_prochaja_informacija_dlja_zajavki.resetOriginalValues();
	}

	private final prochaja_informacija_dlja_zajavki _prochaja_informacija_dlja_zajavki;
}