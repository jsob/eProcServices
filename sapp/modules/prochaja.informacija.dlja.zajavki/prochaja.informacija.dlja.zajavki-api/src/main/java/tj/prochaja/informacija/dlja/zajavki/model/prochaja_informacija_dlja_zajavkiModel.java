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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the prochaja_informacija_dlja_zajavki service. Represents a row in the &quot;sapp.prochaja_informacija_dlja_zajavki&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.prochaja.informacija.dlja.zajavki.model.impl.prochaja_informacija_dlja_zajavkiModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.prochaja.informacija.dlja.zajavki.model.impl.prochaja_informacija_dlja_zajavkiImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prochaja_informacija_dlja_zajavki
 * @see tj.prochaja.informacija.dlja.zajavki.model.impl.prochaja_informacija_dlja_zajavkiImpl
 * @see tj.prochaja.informacija.dlja.zajavki.model.impl.prochaja_informacija_dlja_zajavkiModelImpl
 * @generated
 */
@ProviderType
public interface prochaja_informacija_dlja_zajavkiModel extends BaseModel<prochaja_informacija_dlja_zajavki> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a prochaja_informacija_dlja_zajavki model instance should use the {@link prochaja_informacija_dlja_zajavki} interface instead.
	 */

	/**
	 * Returns the primary key of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the primary key of this prochaja_informacija_dlja_zajavki
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param primaryKey the primary key of this prochaja_informacija_dlja_zajavki
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cena_postavki of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the cena_postavki of this prochaja_informacija_dlja_zajavki
	 */
	@AutoEscape
	public String getCena_postavki();

	/**
	 * Sets the cena_postavki of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param cena_postavki the cena_postavki of this prochaja_informacija_dlja_zajavki
	 */
	public void setCena_postavki(String cena_postavki);

	/**
	 * Returns the cena_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the cena_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public long getCena_postavki_soglasno_zakazchiku();

	/**
	 * Sets the cena_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param cena_postavki_soglasno_zakazchiku the cena_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public void setCena_postavki_soglasno_zakazchiku(
		long cena_postavki_soglasno_zakazchiku);

	/**
	 * Returns the data_sozdanija of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the data_sozdanija of this prochaja_informacija_dlja_zajavki
	 */
	public Date getData_sozdanija();

	/**
	 * Sets the data_sozdanija of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param data_sozdanija the data_sozdanija of this prochaja_informacija_dlja_zajavki
	 */
	public void setData_sozdanija(Date data_sozdanija);

	/**
	 * Returns the izvewenie_id of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the izvewenie_id of this prochaja_informacija_dlja_zajavki
	 */
	public long getIzvewenie_id();

	/**
	 * Sets the izvewenie_id of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param izvewenie_id the izvewenie_id of this prochaja_informacija_dlja_zajavki
	 */
	public void setIzvewenie_id(long izvewenie_id);

	/**
	 * Returns the lot_id of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the lot_id of this prochaja_informacija_dlja_zajavki
	 */
	public long getLot_id();

	/**
	 * Sets the lot_id of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param lot_id the lot_id of this prochaja_informacija_dlja_zajavki
	 */
	public void setLot_id(long lot_id);

	/**
	 * Returns the mesto_postavki of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the mesto_postavki of this prochaja_informacija_dlja_zajavki
	 */
	@AutoEscape
	public String getMesto_postavki();

	/**
	 * Sets the mesto_postavki of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param mesto_postavki the mesto_postavki of this prochaja_informacija_dlja_zajavki
	 */
	public void setMesto_postavki(String mesto_postavki);

	/**
	 * Returns the mesto_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the mesto_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public long getMesto_postavki_soglasno_zakazchiku();

	/**
	 * Sets the mesto_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param mesto_postavki_soglasno_zakazchiku the mesto_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public void setMesto_postavki_soglasno_zakazchiku(
		long mesto_postavki_soglasno_zakazchiku);

	/**
	 * Returns the oplata of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the oplata of this prochaja_informacija_dlja_zajavki
	 */
	@AutoEscape
	public String getOplata();

	/**
	 * Sets the oplata of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param oplata the oplata of this prochaja_informacija_dlja_zajavki
	 */
	public void setOplata(String oplata);

	/**
	 * Returns the oplata_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the oplata_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public long getOplata_soglasno_zakazchiku();

	/**
	 * Sets the oplata_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param oplata_soglasno_zakazchiku the oplata_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public void setOplata_soglasno_zakazchiku(long oplata_soglasno_zakazchiku);

	/**
	 * Returns the postavwik_id of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the postavwik_id of this prochaja_informacija_dlja_zajavki
	 */
	public long getPostavwik_id();

	/**
	 * Sets the postavwik_id of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param postavwik_id the postavwik_id of this prochaja_informacija_dlja_zajavki
	 */
	public void setPostavwik_id(long postavwik_id);

	/**
	 * Returns the prochaja_informacija_dlja_zajavki_id of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the prochaja_informacija_dlja_zajavki_id of this prochaja_informacija_dlja_zajavki
	 */
	public long getProchaja_informacija_dlja_zajavki_id();

	/**
	 * Sets the prochaja_informacija_dlja_zajavki_id of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param prochaja_informacija_dlja_zajavki_id the prochaja_informacija_dlja_zajavki_id of this prochaja_informacija_dlja_zajavki
	 */
	public void setProchaja_informacija_dlja_zajavki_id(
		long prochaja_informacija_dlja_zajavki_id);

	/**
	 * Returns the soputstvujuwie_uslovija of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the soputstvujuwie_uslovija of this prochaja_informacija_dlja_zajavki
	 */
	@AutoEscape
	public String getSoputstvujuwie_uslovija();

	/**
	 * Sets the soputstvujuwie_uslovija of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param soputstvujuwie_uslovija the soputstvujuwie_uslovija of this prochaja_informacija_dlja_zajavki
	 */
	public void setSoputstvujuwie_uslovija(String soputstvujuwie_uslovija);

	/**
	 * Returns the soputstvujuwie_uslovija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the soputstvujuwie_uslovija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public long getSoputstvujuwie_uslovija_soglasno_zakazchiku();

	/**
	 * Sets the soputstvujuwie_uslovija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param soputstvujuwie_uslovija_soglasno_zakazchiku the soputstvujuwie_uslovija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public void setSoputstvujuwie_uslovija_soglasno_zakazchiku(
		long soputstvujuwie_uslovija_soglasno_zakazchiku);

	/**
	 * Returns the sozdal of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the sozdal of this prochaja_informacija_dlja_zajavki
	 */
	public long getSozdal();

	/**
	 * Sets the sozdal of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param sozdal the sozdal of this prochaja_informacija_dlja_zajavki
	 */
	public void setSozdal(long sozdal);

	/**
	 * Returns the srok_dejstvija of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the srok_dejstvija of this prochaja_informacija_dlja_zajavki
	 */
	@AutoEscape
	public String getSrok_dejstvija();

	/**
	 * Sets the srok_dejstvija of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param srok_dejstvija the srok_dejstvija of this prochaja_informacija_dlja_zajavki
	 */
	public void setSrok_dejstvija(String srok_dejstvija);

	/**
	 * Returns the srok_dejstvija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the srok_dejstvija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public long getSrok_dejstvija_soglasno_zakazchiku();

	/**
	 * Sets the srok_dejstvija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param srok_dejstvija_soglasno_zakazchiku the srok_dejstvija_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public void setSrok_dejstvija_soglasno_zakazchiku(
		long srok_dejstvija_soglasno_zakazchiku);

	/**
	 * Returns the srok_ispolnenija_zajavki of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the srok_ispolnenija_zajavki of this prochaja_informacija_dlja_zajavki
	 */
	@AutoEscape
	public String getSrok_ispolnenija_zajavki();

	/**
	 * Sets the srok_ispolnenija_zajavki of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param srok_ispolnenija_zajavki the srok_ispolnenija_zajavki of this prochaja_informacija_dlja_zajavki
	 */
	public void setSrok_ispolnenija_zajavki(String srok_ispolnenija_zajavki);

	/**
	 * Returns the srok_ispolnenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the srok_ispolnenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public long getSrok_ispolnenija_zajavki_soglasno_zakazchiku();

	/**
	 * Sets the srok_ispolnenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param srok_ispolnenija_zajavki_soglasno_zakazchiku the srok_ispolnenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public void setSrok_ispolnenija_zajavki_soglasno_zakazchiku(
		long srok_ispolnenija_zajavki_soglasno_zakazchiku);

	/**
	 * Returns the srok_obespechenija_zajavki of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the srok_obespechenija_zajavki of this prochaja_informacija_dlja_zajavki
	 */
	@AutoEscape
	public String getSrok_obespechenija_zajavki();

	/**
	 * Sets the srok_obespechenija_zajavki of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param srok_obespechenija_zajavki the srok_obespechenija_zajavki of this prochaja_informacija_dlja_zajavki
	 */
	public void setSrok_obespechenija_zajavki(String srok_obespechenija_zajavki);

	/**
	 * Returns the srok_obespechenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the srok_obespechenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public long getSrok_obespechenija_zajavki_soglasno_zakazchiku();

	/**
	 * Sets the srok_obespechenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param srok_obespechenija_zajavki_soglasno_zakazchiku the srok_obespechenija_zajavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public void setSrok_obespechenija_zajavki_soglasno_zakazchiku(
		long srok_obespechenija_zajavki_soglasno_zakazchiku);

	/**
	 * Returns the srok_postavki of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the srok_postavki of this prochaja_informacija_dlja_zajavki
	 */
	@AutoEscape
	public String getSrok_postavki();

	/**
	 * Sets the srok_postavki of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param srok_postavki the srok_postavki of this prochaja_informacija_dlja_zajavki
	 */
	public void setSrok_postavki(String srok_postavki);

	/**
	 * Returns the srok_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @return the srok_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public long getSrok_postavki_soglasno_zakazchiku();

	/**
	 * Sets the srok_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki.
	 *
	 * @param srok_postavki_soglasno_zakazchiku the srok_postavki_soglasno_zakazchiku of this prochaja_informacija_dlja_zajavki
	 */
	public void setSrok_postavki_soglasno_zakazchiku(
		long srok_postavki_soglasno_zakazchiku);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		tj.prochaja.informacija.dlja.zajavki.model.prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.prochaja.informacija.dlja.zajavki.model.prochaja_informacija_dlja_zajavki> toCacheModel();

	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.prochaja_informacija_dlja_zajavki toEscapedModel();

	@Override
	public tj.prochaja.informacija.dlja.zajavki.model.prochaja_informacija_dlja_zajavki toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}