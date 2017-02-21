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

package tj.konkursnaja.dokumentacija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing konkursnaja_dokumentacija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see konkursnaja_dokumentacija
 * @generated
 */
@ProviderType
public class konkursnaja_dokumentacijaCacheModel implements CacheModel<konkursnaja_dokumentacija>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof konkursnaja_dokumentacijaCacheModel)) {
			return false;
		}

		konkursnaja_dokumentacijaCacheModel konkursnaja_dokumentacijaCacheModel = (konkursnaja_dokumentacijaCacheModel)obj;

		if (konkursnaja_dokumentacija_id == konkursnaja_dokumentacijaCacheModel.konkursnaja_dokumentacija_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, konkursnaja_dokumentacija_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{data_zagruzki=");
		sb.append(data_zagruzki);
		sb.append(", imja_fajla=");
		sb.append(imja_fajla);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", konkursnaja_dokumentacija_id=");
		sb.append(konkursnaja_dokumentacija_id);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", nazvanie_dokumenta=");
		sb.append(nazvanie_dokumenta);
		sb.append(", zagruzil=");
		sb.append(zagruzil);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public konkursnaja_dokumentacija toEntityModel() {
		konkursnaja_dokumentacijaImpl konkursnaja_dokumentacijaImpl = new konkursnaja_dokumentacijaImpl();

		if (data_zagruzki == Long.MIN_VALUE) {
			konkursnaja_dokumentacijaImpl.setData_zagruzki(null);
		}
		else {
			konkursnaja_dokumentacijaImpl.setData_zagruzki(new Date(
					data_zagruzki));
		}

		if (imja_fajla == null) {
			konkursnaja_dokumentacijaImpl.setImja_fajla(StringPool.BLANK);
		}
		else {
			konkursnaja_dokumentacijaImpl.setImja_fajla(imja_fajla);
		}

		konkursnaja_dokumentacijaImpl.setIzvewenie_id(izvewenie_id);
		konkursnaja_dokumentacijaImpl.setKonkursnaja_dokumentacija_id(konkursnaja_dokumentacija_id);
		konkursnaja_dokumentacijaImpl.setLot_id(lot_id);

		if (nazvanie_dokumenta == null) {
			konkursnaja_dokumentacijaImpl.setNazvanie_dokumenta(StringPool.BLANK);
		}
		else {
			konkursnaja_dokumentacijaImpl.setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		konkursnaja_dokumentacijaImpl.setZagruzil(zagruzil);

		konkursnaja_dokumentacijaImpl.resetOriginalValues();

		return konkursnaja_dokumentacijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_zagruzki = objectInput.readLong();
		imja_fajla = objectInput.readUTF();

		izvewenie_id = objectInput.readLong();

		konkursnaja_dokumentacija_id = objectInput.readLong();

		lot_id = objectInput.readLong();
		nazvanie_dokumenta = objectInput.readUTF();

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

		objectOutput.writeLong(konkursnaja_dokumentacija_id);

		objectOutput.writeLong(lot_id);

		if (nazvanie_dokumenta == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_dokumenta);
		}

		objectOutput.writeLong(zagruzil);
	}

	public long data_zagruzki;
	public String imja_fajla;
	public long izvewenie_id;
	public long konkursnaja_dokumentacija_id;
	public long lot_id;
	public String nazvanie_dokumenta;
	public long zagruzil;
}