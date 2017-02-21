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

package tj.prochaja.informacija.dlja.zajavki.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.prochaja.informacija.dlja.zajavki.model.prochaja_informacija_dlja_zajavki;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing prochaja_informacija_dlja_zajavki in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see prochaja_informacija_dlja_zajavki
 * @generated
 */
@ProviderType
public class prochaja_informacija_dlja_zajavkiCacheModel implements CacheModel<prochaja_informacija_dlja_zajavki>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof prochaja_informacija_dlja_zajavkiCacheModel)) {
			return false;
		}

		prochaja_informacija_dlja_zajavkiCacheModel prochaja_informacija_dlja_zajavkiCacheModel =
			(prochaja_informacija_dlja_zajavkiCacheModel)obj;

		if (prochaja_informacija_dlja_zajavki_id == prochaja_informacija_dlja_zajavkiCacheModel.prochaja_informacija_dlja_zajavki_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, prochaja_informacija_dlja_zajavki_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{cena_postavki=");
		sb.append(cena_postavki);
		sb.append(", cena_postavki_soglasno_zakazchiku=");
		sb.append(cena_postavki_soglasno_zakazchiku);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", mesto_postavki=");
		sb.append(mesto_postavki);
		sb.append(", mesto_postavki_soglasno_zakazchiku=");
		sb.append(mesto_postavki_soglasno_zakazchiku);
		sb.append(", oplata=");
		sb.append(oplata);
		sb.append(", oplata_soglasno_zakazchiku=");
		sb.append(oplata_soglasno_zakazchiku);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", prochaja_informacija_dlja_zajavki_id=");
		sb.append(prochaja_informacija_dlja_zajavki_id);
		sb.append(", soputstvujuwie_uslovija=");
		sb.append(soputstvujuwie_uslovija);
		sb.append(", soputstvujuwie_uslovija_soglasno_zakazchiku=");
		sb.append(soputstvujuwie_uslovija_soglasno_zakazchiku);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", srok_dejstvija=");
		sb.append(srok_dejstvija);
		sb.append(", srok_dejstvija_soglasno_zakazchiku=");
		sb.append(srok_dejstvija_soglasno_zakazchiku);
		sb.append(", srok_ispolnenija_zajavki=");
		sb.append(srok_ispolnenija_zajavki);
		sb.append(", srok_ispolnenija_zajavki_soglasno_zakazchiku=");
		sb.append(srok_ispolnenija_zajavki_soglasno_zakazchiku);
		sb.append(", srok_obespechenija_zajavki=");
		sb.append(srok_obespechenija_zajavki);
		sb.append(", srok_obespechenija_zajavki_soglasno_zakazchiku=");
		sb.append(srok_obespechenija_zajavki_soglasno_zakazchiku);
		sb.append(", srok_postavki=");
		sb.append(srok_postavki);
		sb.append(", srok_postavki_soglasno_zakazchiku=");
		sb.append(srok_postavki_soglasno_zakazchiku);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public prochaja_informacija_dlja_zajavki toEntityModel() {
		prochaja_informacija_dlja_zajavkiImpl prochaja_informacija_dlja_zajavkiImpl =
			new prochaja_informacija_dlja_zajavkiImpl();

		if (cena_postavki == null) {
			prochaja_informacija_dlja_zajavkiImpl.setCena_postavki(StringPool.BLANK);
		}
		else {
			prochaja_informacija_dlja_zajavkiImpl.setCena_postavki(cena_postavki);
		}

		prochaja_informacija_dlja_zajavkiImpl.setCena_postavki_soglasno_zakazchiku(cena_postavki_soglasno_zakazchiku);

		if (data_sozdanija == Long.MIN_VALUE) {
			prochaja_informacija_dlja_zajavkiImpl.setData_sozdanija(null);
		}
		else {
			prochaja_informacija_dlja_zajavkiImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		prochaja_informacija_dlja_zajavkiImpl.setIzvewenie_id(izvewenie_id);
		prochaja_informacija_dlja_zajavkiImpl.setLot_id(lot_id);

		if (mesto_postavki == null) {
			prochaja_informacija_dlja_zajavkiImpl.setMesto_postavki(StringPool.BLANK);
		}
		else {
			prochaja_informacija_dlja_zajavkiImpl.setMesto_postavki(mesto_postavki);
		}

		prochaja_informacija_dlja_zajavkiImpl.setMesto_postavki_soglasno_zakazchiku(mesto_postavki_soglasno_zakazchiku);

		if (oplata == null) {
			prochaja_informacija_dlja_zajavkiImpl.setOplata(StringPool.BLANK);
		}
		else {
			prochaja_informacija_dlja_zajavkiImpl.setOplata(oplata);
		}

		prochaja_informacija_dlja_zajavkiImpl.setOplata_soglasno_zakazchiku(oplata_soglasno_zakazchiku);
		prochaja_informacija_dlja_zajavkiImpl.setPostavwik_id(postavwik_id);
		prochaja_informacija_dlja_zajavkiImpl.setProchaja_informacija_dlja_zajavki_id(prochaja_informacija_dlja_zajavki_id);

		if (soputstvujuwie_uslovija == null) {
			prochaja_informacija_dlja_zajavkiImpl.setSoputstvujuwie_uslovija(StringPool.BLANK);
		}
		else {
			prochaja_informacija_dlja_zajavkiImpl.setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
		}

		prochaja_informacija_dlja_zajavkiImpl.setSoputstvujuwie_uslovija_soglasno_zakazchiku(soputstvujuwie_uslovija_soglasno_zakazchiku);
		prochaja_informacija_dlja_zajavkiImpl.setSozdal(sozdal);

		if (srok_dejstvija == null) {
			prochaja_informacija_dlja_zajavkiImpl.setSrok_dejstvija(StringPool.BLANK);
		}
		else {
			prochaja_informacija_dlja_zajavkiImpl.setSrok_dejstvija(srok_dejstvija);
		}

		prochaja_informacija_dlja_zajavkiImpl.setSrok_dejstvija_soglasno_zakazchiku(srok_dejstvija_soglasno_zakazchiku);

		if (srok_ispolnenija_zajavki == null) {
			prochaja_informacija_dlja_zajavkiImpl.setSrok_ispolnenija_zajavki(StringPool.BLANK);
		}
		else {
			prochaja_informacija_dlja_zajavkiImpl.setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
		}

		prochaja_informacija_dlja_zajavkiImpl.setSrok_ispolnenija_zajavki_soglasno_zakazchiku(srok_ispolnenija_zajavki_soglasno_zakazchiku);

		if (srok_obespechenija_zajavki == null) {
			prochaja_informacija_dlja_zajavkiImpl.setSrok_obespechenija_zajavki(StringPool.BLANK);
		}
		else {
			prochaja_informacija_dlja_zajavkiImpl.setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
		}

		prochaja_informacija_dlja_zajavkiImpl.setSrok_obespechenija_zajavki_soglasno_zakazchiku(srok_obespechenija_zajavki_soglasno_zakazchiku);

		if (srok_postavki == null) {
			prochaja_informacija_dlja_zajavkiImpl.setSrok_postavki(StringPool.BLANK);
		}
		else {
			prochaja_informacija_dlja_zajavkiImpl.setSrok_postavki(srok_postavki);
		}

		prochaja_informacija_dlja_zajavkiImpl.setSrok_postavki_soglasno_zakazchiku(srok_postavki_soglasno_zakazchiku);

		prochaja_informacija_dlja_zajavkiImpl.resetOriginalValues();

		return prochaja_informacija_dlja_zajavkiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cena_postavki = objectInput.readUTF();

		cena_postavki_soglasno_zakazchiku = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		lot_id = objectInput.readLong();
		mesto_postavki = objectInput.readUTF();

		mesto_postavki_soglasno_zakazchiku = objectInput.readLong();
		oplata = objectInput.readUTF();

		oplata_soglasno_zakazchiku = objectInput.readLong();

		postavwik_id = objectInput.readLong();

		prochaja_informacija_dlja_zajavki_id = objectInput.readLong();
		soputstvujuwie_uslovija = objectInput.readUTF();

		soputstvujuwie_uslovija_soglasno_zakazchiku = objectInput.readLong();

		sozdal = objectInput.readLong();
		srok_dejstvija = objectInput.readUTF();

		srok_dejstvija_soglasno_zakazchiku = objectInput.readLong();
		srok_ispolnenija_zajavki = objectInput.readUTF();

		srok_ispolnenija_zajavki_soglasno_zakazchiku = objectInput.readLong();
		srok_obespechenija_zajavki = objectInput.readUTF();

		srok_obespechenija_zajavki_soglasno_zakazchiku = objectInput.readLong();
		srok_postavki = objectInput.readUTF();

		srok_postavki_soglasno_zakazchiku = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (cena_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cena_postavki);
		}

		objectOutput.writeLong(cena_postavki_soglasno_zakazchiku);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(lot_id);

		if (mesto_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mesto_postavki);
		}

		objectOutput.writeLong(mesto_postavki_soglasno_zakazchiku);

		if (oplata == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oplata);
		}

		objectOutput.writeLong(oplata_soglasno_zakazchiku);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeLong(prochaja_informacija_dlja_zajavki_id);

		if (soputstvujuwie_uslovija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soputstvujuwie_uslovija);
		}

		objectOutput.writeLong(soputstvujuwie_uslovija_soglasno_zakazchiku);

		objectOutput.writeLong(sozdal);

		if (srok_dejstvija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_dejstvija);
		}

		objectOutput.writeLong(srok_dejstvija_soglasno_zakazchiku);

		if (srok_ispolnenija_zajavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_ispolnenija_zajavki);
		}

		objectOutput.writeLong(srok_ispolnenija_zajavki_soglasno_zakazchiku);

		if (srok_obespechenija_zajavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_obespechenija_zajavki);
		}

		objectOutput.writeLong(srok_obespechenija_zajavki_soglasno_zakazchiku);

		if (srok_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_postavki);
		}

		objectOutput.writeLong(srok_postavki_soglasno_zakazchiku);
	}

	public String cena_postavki;
	public long cena_postavki_soglasno_zakazchiku;
	public long data_sozdanija;
	public long izvewenie_id;
	public long lot_id;
	public String mesto_postavki;
	public long mesto_postavki_soglasno_zakazchiku;
	public String oplata;
	public long oplata_soglasno_zakazchiku;
	public long postavwik_id;
	public long prochaja_informacija_dlja_zajavki_id;
	public String soputstvujuwie_uslovija;
	public long soputstvujuwie_uslovija_soglasno_zakazchiku;
	public long sozdal;
	public String srok_dejstvija;
	public long srok_dejstvija_soglasno_zakazchiku;
	public String srok_ispolnenija_zajavki;
	public long srok_ispolnenija_zajavki_soglasno_zakazchiku;
	public String srok_obespechenija_zajavki;
	public long srok_obespechenija_zajavki_soglasno_zakazchiku;
	public String srok_postavki;
	public long srok_postavki_soglasno_zakazchiku;
}