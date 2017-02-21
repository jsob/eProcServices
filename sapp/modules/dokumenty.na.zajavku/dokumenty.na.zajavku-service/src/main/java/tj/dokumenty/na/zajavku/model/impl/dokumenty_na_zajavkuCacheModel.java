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

package tj.dokumenty.na.zajavku.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing dokumenty_na_zajavku in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_na_zajavku
 * @generated
 */
@ProviderType
public class dokumenty_na_zajavkuCacheModel implements CacheModel<dokumenty_na_zajavku>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof dokumenty_na_zajavkuCacheModel)) {
			return false;
		}

		dokumenty_na_zajavkuCacheModel dokumenty_na_zajavkuCacheModel = (dokumenty_na_zajavkuCacheModel)obj;

		if (dokumenty_na_zajavku_id == dokumenty_na_zajavkuCacheModel.dokumenty_na_zajavku_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dokumenty_na_zajavku_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{dokumenty_na_zajavku_id=");
		sb.append(dokumenty_na_zajavku_id);
		sb.append(", data_zagruzki=");
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
		sb.append(", zagruzil=");
		sb.append(zagruzil);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public dokumenty_na_zajavku toEntityModel() {
		dokumenty_na_zajavkuImpl dokumenty_na_zajavkuImpl = new dokumenty_na_zajavkuImpl();

		dokumenty_na_zajavkuImpl.setDokumenty_na_zajavku_id(dokumenty_na_zajavku_id);

		if (data_zagruzki == Long.MIN_VALUE) {
			dokumenty_na_zajavkuImpl.setData_zagruzki(null);
		}
		else {
			dokumenty_na_zajavkuImpl.setData_zagruzki(new Date(data_zagruzki));
		}

		if (imja_fajla == null) {
			dokumenty_na_zajavkuImpl.setImja_fajla(StringPool.BLANK);
		}
		else {
			dokumenty_na_zajavkuImpl.setImja_fajla(imja_fajla);
		}

		dokumenty_na_zajavkuImpl.setIzvewenie_id(izvewenie_id);
		dokumenty_na_zajavkuImpl.setLot_id(lot_id);

		if (nazvanie_dokumenta == null) {
			dokumenty_na_zajavkuImpl.setNazvanie_dokumenta(StringPool.BLANK);
		}
		else {
			dokumenty_na_zajavkuImpl.setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		dokumenty_na_zajavkuImpl.setPostavwik_id(postavwik_id);
		dokumenty_na_zajavkuImpl.setZagruzil(zagruzil);

		dokumenty_na_zajavkuImpl.resetOriginalValues();

		return dokumenty_na_zajavkuImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dokumenty_na_zajavku_id = objectInput.readLong();
		data_zagruzki = objectInput.readLong();
		imja_fajla = objectInput.readUTF();

		izvewenie_id = objectInput.readLong();

		lot_id = objectInput.readLong();
		nazvanie_dokumenta = objectInput.readUTF();

		postavwik_id = objectInput.readLong();

		zagruzil = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dokumenty_na_zajavku_id);
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

		objectOutput.writeLong(zagruzil);
	}

	public long dokumenty_na_zajavku_id;
	public long data_zagruzki;
	public String imja_fajla;
	public long izvewenie_id;
	public long lot_id;
	public String nazvanie_dokumenta;
	public long postavwik_id;
	public long zagruzil;
}