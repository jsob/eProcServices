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

package tj.podtverzhdenie.nalichija.sredstv.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing podtverzhdenie_nalichija_sredstv in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_nalichija_sredstv
 * @generated
 */
@ProviderType
public class podtverzhdenie_nalichija_sredstvCacheModel implements CacheModel<podtverzhdenie_nalichija_sredstv>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof podtverzhdenie_nalichija_sredstvCacheModel)) {
			return false;
		}

		podtverzhdenie_nalichija_sredstvCacheModel podtverzhdenie_nalichija_sredstvCacheModel =
			(podtverzhdenie_nalichija_sredstvCacheModel)obj;

		if (podtverzhdenie_nalichija_sredstv_id == podtverzhdenie_nalichija_sredstvCacheModel.podtverzhdenie_nalichija_sredstv_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, podtverzhdenie_nalichija_sredstv_id);
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
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", nazvanie_dokumenta=");
		sb.append(nazvanie_dokumenta);
		sb.append(", podtverzhdenie_nalichija_sredstv_id=");
		sb.append(podtverzhdenie_nalichija_sredstv_id);
		sb.append(", zagruzil=");
		sb.append(zagruzil);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public podtverzhdenie_nalichija_sredstv toEntityModel() {
		podtverzhdenie_nalichija_sredstvImpl podtverzhdenie_nalichija_sredstvImpl =
			new podtverzhdenie_nalichija_sredstvImpl();

		if (data_zagruzki == Long.MIN_VALUE) {
			podtverzhdenie_nalichija_sredstvImpl.setData_zagruzki(null);
		}
		else {
			podtverzhdenie_nalichija_sredstvImpl.setData_zagruzki(new Date(
					data_zagruzki));
		}

		if (imja_fajla == null) {
			podtverzhdenie_nalichija_sredstvImpl.setImja_fajla(StringPool.BLANK);
		}
		else {
			podtverzhdenie_nalichija_sredstvImpl.setImja_fajla(imja_fajla);
		}

		podtverzhdenie_nalichija_sredstvImpl.setIzvewenie_id(izvewenie_id);
		podtverzhdenie_nalichija_sredstvImpl.setLot_id(lot_id);

		if (nazvanie_dokumenta == null) {
			podtverzhdenie_nalichija_sredstvImpl.setNazvanie_dokumenta(StringPool.BLANK);
		}
		else {
			podtverzhdenie_nalichija_sredstvImpl.setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		podtverzhdenie_nalichija_sredstvImpl.setPodtverzhdenie_nalichija_sredstv_id(podtverzhdenie_nalichija_sredstv_id);
		podtverzhdenie_nalichija_sredstvImpl.setZagruzil(zagruzil);

		podtverzhdenie_nalichija_sredstvImpl.resetOriginalValues();

		return podtverzhdenie_nalichija_sredstvImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_zagruzki = objectInput.readLong();
		imja_fajla = objectInput.readUTF();

		izvewenie_id = objectInput.readLong();

		lot_id = objectInput.readLong();
		nazvanie_dokumenta = objectInput.readUTF();

		podtverzhdenie_nalichija_sredstv_id = objectInput.readLong();

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

		objectOutput.writeLong(podtverzhdenie_nalichija_sredstv_id);

		objectOutput.writeLong(zagruzil);
	}

	public long data_zagruzki;
	public String imja_fajla;
	public long izvewenie_id;
	public long lot_id;
	public String nazvanie_dokumenta;
	public long podtverzhdenie_nalichija_sredstv_id;
	public long zagruzil;
}