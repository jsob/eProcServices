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

package tj.rezultat.rassmotrenija.pretenzii.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing rezultat_rassmotrenija_pretenzii in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_rassmotrenija_pretenzii
 * @generated
 */
@ProviderType
public class rezultat_rassmotrenija_pretenziiCacheModel implements CacheModel<rezultat_rassmotrenija_pretenzii>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof rezultat_rassmotrenija_pretenziiCacheModel)) {
			return false;
		}

		rezultat_rassmotrenija_pretenziiCacheModel rezultat_rassmotrenija_pretenziiCacheModel =
			(rezultat_rassmotrenija_pretenziiCacheModel)obj;

		if (rezultat_rassmotrenija_pretenzii_id == rezultat_rassmotrenija_pretenziiCacheModel.rezultat_rassmotrenija_pretenzii_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, rezultat_rassmotrenija_pretenzii_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{data_zagruzki=");
		sb.append(data_zagruzki);
		sb.append(", imja_fajla=");
		sb.append(imja_fajla);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", nazvanie_dokumenta=");
		sb.append(nazvanie_dokumenta);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", rezultat_rassmotrenija_pretenzii_id=");
		sb.append(rezultat_rassmotrenija_pretenzii_id);
		sb.append(", zagruzil=");
		sb.append(zagruzil);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public rezultat_rassmotrenija_pretenzii toEntityModel() {
		rezultat_rassmotrenija_pretenziiImpl rezultat_rassmotrenija_pretenziiImpl =
			new rezultat_rassmotrenija_pretenziiImpl();

		if (data_zagruzki == Long.MIN_VALUE) {
			rezultat_rassmotrenija_pretenziiImpl.setData_zagruzki(null);
		}
		else {
			rezultat_rassmotrenija_pretenziiImpl.setData_zagruzki(new Date(
					data_zagruzki));
		}

		if (imja_fajla == null) {
			rezultat_rassmotrenija_pretenziiImpl.setImja_fajla(StringPool.BLANK);
		}
		else {
			rezultat_rassmotrenija_pretenziiImpl.setImja_fajla(imja_fajla);
		}

		rezultat_rassmotrenija_pretenziiImpl.setIzvewenie_id(izvewenie_id);
		rezultat_rassmotrenija_pretenziiImpl.setLot_id(lot_id);

		if (nazvanie_dokumenta == null) {
			rezultat_rassmotrenija_pretenziiImpl.setNazvanie_dokumenta(StringPool.BLANK);
		}
		else {
			rezultat_rassmotrenija_pretenziiImpl.setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		rezultat_rassmotrenija_pretenziiImpl.setPostavwik_id(postavwik_id);
		rezultat_rassmotrenija_pretenziiImpl.setRezultat_rassmotrenija_pretenzii_id(rezultat_rassmotrenija_pretenzii_id);
		rezultat_rassmotrenija_pretenziiImpl.setZagruzil(zagruzil);

		rezultat_rassmotrenija_pretenziiImpl.resetOriginalValues();

		return rezultat_rassmotrenija_pretenziiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_zagruzki = objectInput.readLong();
		imja_fajla = objectInput.readUTF();

		izvewenie_id = objectInput.readLong();

		lot_id = objectInput.readLong();
		nazvanie_dokumenta = objectInput.readUTF();

		postavwik_id = objectInput.readLong();

		rezultat_rassmotrenija_pretenzii_id = objectInput.readLong();

		zagruzil = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_zagruzki);

		if (imja_fajla == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imja_fajla);
		}

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(lot_id);

		if (nazvanie_dokumenta == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_dokumenta);
		}

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeLong(rezultat_rassmotrenija_pretenzii_id);

		objectOutput.writeLong(zagruzil);
	}

	public long data_zagruzki;
	public String imja_fajla;
	public long izvewenie_id;
	public long lot_id;
	public String nazvanie_dokumenta;
	public long postavwik_id;
	public long rezultat_rassmotrenija_pretenzii_id;
	public long zagruzil;
}