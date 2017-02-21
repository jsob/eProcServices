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

package tj.informacija.o.razmewenii.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.informacija.o.razmewenii.model.informacija_o_razmewenii;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing informacija_o_razmewenii in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see informacija_o_razmewenii
 * @generated
 */
@ProviderType
public class informacija_o_razmeweniiCacheModel implements CacheModel<informacija_o_razmewenii>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof informacija_o_razmeweniiCacheModel)) {
			return false;
		}

		informacija_o_razmeweniiCacheModel informacija_o_razmeweniiCacheModel = (informacija_o_razmeweniiCacheModel)obj;

		if (informacija_o_razmewenii_id == informacija_o_razmeweniiCacheModel.informacija_o_razmewenii_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, informacija_o_razmewenii_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{cena_postavki=");
		sb.append(cena_postavki);
		sb.append(", cena_postavki_dlja_zakaza=");
		sb.append(cena_postavki_dlja_zakaza);
		sb.append(", data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", informacija_o_razmewenii_id=");
		sb.append(informacija_o_razmewenii_id);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", mesto_postavki=");
		sb.append(mesto_postavki);
		sb.append(", mesto_postavki_dlja_zakaza=");
		sb.append(mesto_postavki_dlja_zakaza);
		sb.append(", obespechenie_ispolnenija=");
		sb.append(obespechenie_ispolnenija);
		sb.append(", obespechenie_ispolnenija_dlja_zakaza=");
		sb.append(obespechenie_ispolnenija_dlja_zakaza);
		sb.append(", obespechenie_ispolnenija_v_procentah=");
		sb.append(obespechenie_ispolnenija_v_procentah);
		sb.append(", obespechenie_v_procentah=");
		sb.append(obespechenie_v_procentah);
		sb.append(", obespechenie_zajavki=");
		sb.append(obespechenie_zajavki);
		sb.append(", obespechenie_zajavki_dlja_zakaza=");
		sb.append(obespechenie_zajavki_dlja_zakaza);
		sb.append(", oplata=");
		sb.append(oplata);
		sb.append(", oplata_dlja_zakaza=");
		sb.append(oplata_dlja_zakaza);
		sb.append(", soputstvujuwie_uslovija=");
		sb.append(soputstvujuwie_uslovija);
		sb.append(", soputstvujuwie_uslovija_dlja_zakaza=");
		sb.append(soputstvujuwie_uslovija_dlja_zakaza);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", srok_dejstvija=");
		sb.append(srok_dejstvija);
		sb.append(", srok_dejstvija_dlja_zakaza=");
		sb.append(srok_dejstvija_dlja_zakaza);
		sb.append(", srok_ispolnenija_zajavki=");
		sb.append(srok_ispolnenija_zajavki);
		sb.append(", srok_obespechenija_zajavki=");
		sb.append(srok_obespechenija_zajavki);
		sb.append(", srok_postavki=");
		sb.append(srok_postavki);
		sb.append(", srok_postavki_dlja_zakaza=");
		sb.append(srok_postavki_dlja_zakaza);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public informacija_o_razmewenii toEntityModel() {
		informacija_o_razmeweniiImpl informacija_o_razmeweniiImpl = new informacija_o_razmeweniiImpl();

		if (cena_postavki == null) {
			informacija_o_razmeweniiImpl.setCena_postavki(StringPool.BLANK);
		}
		else {
			informacija_o_razmeweniiImpl.setCena_postavki(cena_postavki);
		}

		informacija_o_razmeweniiImpl.setCena_postavki_dlja_zakaza(cena_postavki_dlja_zakaza);

		if (data_izmenenija == Long.MIN_VALUE) {
			informacija_o_razmeweniiImpl.setData_izmenenija(null);
		}
		else {
			informacija_o_razmeweniiImpl.setData_izmenenija(new Date(
					data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			informacija_o_razmeweniiImpl.setData_sozdanija(null);
		}
		else {
			informacija_o_razmeweniiImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		informacija_o_razmeweniiImpl.setInformacija_o_razmewenii_id(informacija_o_razmewenii_id);
		informacija_o_razmeweniiImpl.setIzmenil(izmenil);
		informacija_o_razmeweniiImpl.setIzvewenie_id(izvewenie_id);

		if (mesto_postavki == null) {
			informacija_o_razmeweniiImpl.setMesto_postavki(StringPool.BLANK);
		}
		else {
			informacija_o_razmeweniiImpl.setMesto_postavki(mesto_postavki);
		}

		informacija_o_razmeweniiImpl.setMesto_postavki_dlja_zakaza(mesto_postavki_dlja_zakaza);
		informacija_o_razmeweniiImpl.setObespechenie_ispolnenija(obespechenie_ispolnenija);
		informacija_o_razmeweniiImpl.setObespechenie_ispolnenija_dlja_zakaza(obespechenie_ispolnenija_dlja_zakaza);
		informacija_o_razmeweniiImpl.setObespechenie_ispolnenija_v_procentah(obespechenie_ispolnenija_v_procentah);
		informacija_o_razmeweniiImpl.setObespechenie_v_procentah(obespechenie_v_procentah);
		informacija_o_razmeweniiImpl.setObespechenie_zajavki(obespechenie_zajavki);
		informacija_o_razmeweniiImpl.setObespechenie_zajavki_dlja_zakaza(obespechenie_zajavki_dlja_zakaza);

		if (oplata == null) {
			informacija_o_razmeweniiImpl.setOplata(StringPool.BLANK);
		}
		else {
			informacija_o_razmeweniiImpl.setOplata(oplata);
		}

		informacija_o_razmeweniiImpl.setOplata_dlja_zakaza(oplata_dlja_zakaza);

		if (soputstvujuwie_uslovija == null) {
			informacija_o_razmeweniiImpl.setSoputstvujuwie_uslovija(StringPool.BLANK);
		}
		else {
			informacija_o_razmeweniiImpl.setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
		}

		informacija_o_razmeweniiImpl.setSoputstvujuwie_uslovija_dlja_zakaza(soputstvujuwie_uslovija_dlja_zakaza);
		informacija_o_razmeweniiImpl.setSozdal(sozdal);

		if (srok_dejstvija == null) {
			informacija_o_razmeweniiImpl.setSrok_dejstvija(StringPool.BLANK);
		}
		else {
			informacija_o_razmeweniiImpl.setSrok_dejstvija(srok_dejstvija);
		}

		informacija_o_razmeweniiImpl.setSrok_dejstvija_dlja_zakaza(srok_dejstvija_dlja_zakaza);

		if (srok_ispolnenija_zajavki == null) {
			informacija_o_razmeweniiImpl.setSrok_ispolnenija_zajavki(StringPool.BLANK);
		}
		else {
			informacija_o_razmeweniiImpl.setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
		}

		if (srok_obespechenija_zajavki == null) {
			informacija_o_razmeweniiImpl.setSrok_obespechenija_zajavki(StringPool.BLANK);
		}
		else {
			informacija_o_razmeweniiImpl.setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
		}

		if (srok_postavki == null) {
			informacija_o_razmeweniiImpl.setSrok_postavki(StringPool.BLANK);
		}
		else {
			informacija_o_razmeweniiImpl.setSrok_postavki(srok_postavki);
		}

		informacija_o_razmeweniiImpl.setSrok_postavki_dlja_zakaza(srok_postavki_dlja_zakaza);

		informacija_o_razmeweniiImpl.resetOriginalValues();

		return informacija_o_razmeweniiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cena_postavki = objectInput.readUTF();

		cena_postavki_dlja_zakaza = objectInput.readDouble();
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		informacija_o_razmewenii_id = objectInput.readLong();

		izmenil = objectInput.readLong();

		izvewenie_id = objectInput.readLong();
		mesto_postavki = objectInput.readUTF();

		mesto_postavki_dlja_zakaza = objectInput.readLong();

		obespechenie_ispolnenija = objectInput.readLong();

		obespechenie_ispolnenija_dlja_zakaza = objectInput.readLong();

		obespechenie_ispolnenija_v_procentah = objectInput.readDouble();

		obespechenie_v_procentah = objectInput.readDouble();

		obespechenie_zajavki = objectInput.readLong();

		obespechenie_zajavki_dlja_zakaza = objectInput.readLong();
		oplata = objectInput.readUTF();

		oplata_dlja_zakaza = objectInput.readLong();
		soputstvujuwie_uslovija = objectInput.readUTF();

		soputstvujuwie_uslovija_dlja_zakaza = objectInput.readLong();

		sozdal = objectInput.readLong();
		srok_dejstvija = objectInput.readUTF();

		srok_dejstvija_dlja_zakaza = objectInput.readLong();
		srok_ispolnenija_zajavki = objectInput.readUTF();
		srok_obespechenija_zajavki = objectInput.readUTF();
		srok_postavki = objectInput.readUTF();

		srok_postavki_dlja_zakaza = objectInput.readLong();
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

		objectOutput.writeDouble(cena_postavki_dlja_zakaza);
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(informacija_o_razmewenii_id);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(izvewenie_id);

		if (mesto_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mesto_postavki);
		}

		objectOutput.writeLong(mesto_postavki_dlja_zakaza);

		objectOutput.writeLong(obespechenie_ispolnenija);

		objectOutput.writeLong(obespechenie_ispolnenija_dlja_zakaza);

		objectOutput.writeDouble(obespechenie_ispolnenija_v_procentah);

		objectOutput.writeDouble(obespechenie_v_procentah);

		objectOutput.writeLong(obespechenie_zajavki);

		objectOutput.writeLong(obespechenie_zajavki_dlja_zakaza);

		if (oplata == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oplata);
		}

		objectOutput.writeLong(oplata_dlja_zakaza);

		if (soputstvujuwie_uslovija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soputstvujuwie_uslovija);
		}

		objectOutput.writeLong(soputstvujuwie_uslovija_dlja_zakaza);

		objectOutput.writeLong(sozdal);

		if (srok_dejstvija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_dejstvija);
		}

		objectOutput.writeLong(srok_dejstvija_dlja_zakaza);

		if (srok_ispolnenija_zajavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_ispolnenija_zajavki);
		}

		if (srok_obespechenija_zajavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_obespechenija_zajavki);
		}

		if (srok_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_postavki);
		}

		objectOutput.writeLong(srok_postavki_dlja_zakaza);
	}

	public String cena_postavki;
	public double cena_postavki_dlja_zakaza;
	public long data_izmenenija;
	public long data_sozdanija;
	public long informacija_o_razmewenii_id;
	public long izmenil;
	public long izvewenie_id;
	public String mesto_postavki;
	public long mesto_postavki_dlja_zakaza;
	public long obespechenie_ispolnenija;
	public long obespechenie_ispolnenija_dlja_zakaza;
	public double obespechenie_ispolnenija_v_procentah;
	public double obespechenie_v_procentah;
	public long obespechenie_zajavki;
	public long obespechenie_zajavki_dlja_zakaza;
	public String oplata;
	public long oplata_dlja_zakaza;
	public String soputstvujuwie_uslovija;
	public long soputstvujuwie_uslovija_dlja_zakaza;
	public long sozdal;
	public String srok_dejstvija;
	public long srok_dejstvija_dlja_zakaza;
	public String srok_ispolnenija_zajavki;
	public String srok_obespechenija_zajavki;
	public String srok_postavki;
	public long srok_postavki_dlja_zakaza;
}