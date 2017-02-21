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

package tj.pretenzii.ot.postavshhikov.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.pretenzii.ot.postavshhikov.model.pretenzii_ot_postavshhikov;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing pretenzii_ot_postavshhikov in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see pretenzii_ot_postavshhikov
 * @generated
 */
@ProviderType
public class pretenzii_ot_postavshhikovCacheModel implements CacheModel<pretenzii_ot_postavshhikov>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof pretenzii_ot_postavshhikovCacheModel)) {
			return false;
		}

		pretenzii_ot_postavshhikovCacheModel pretenzii_ot_postavshhikovCacheModel =
			(pretenzii_ot_postavshhikovCacheModel)obj;

		if (pretenzii_ot_postavshhikov_id == pretenzii_ot_postavshhikovCacheModel.pretenzii_ot_postavshhikov_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pretenzii_ot_postavshhikov_id);
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
		sb.append(", postavshik_id=");
		sb.append(postavshik_id);
		sb.append(", pretenzii_ot_postavshhikov_id=");
		sb.append(pretenzii_ot_postavshhikov_id);
		sb.append(", zagruzil=");
		sb.append(zagruzil);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public pretenzii_ot_postavshhikov toEntityModel() {
		pretenzii_ot_postavshhikovImpl pretenzii_ot_postavshhikovImpl = new pretenzii_ot_postavshhikovImpl();

		if (data_zagruzki == Long.MIN_VALUE) {
			pretenzii_ot_postavshhikovImpl.setData_zagruzki(null);
		}
		else {
			pretenzii_ot_postavshhikovImpl.setData_zagruzki(new Date(
					data_zagruzki));
		}

		if (imja_fajla == null) {
			pretenzii_ot_postavshhikovImpl.setImja_fajla(StringPool.BLANK);
		}
		else {
			pretenzii_ot_postavshhikovImpl.setImja_fajla(imja_fajla);
		}

		pretenzii_ot_postavshhikovImpl.setIzvewenie_id(izvewenie_id);
		pretenzii_ot_postavshhikovImpl.setLot_id(lot_id);

		if (nazvanie_dokumenta == null) {
			pretenzii_ot_postavshhikovImpl.setNazvanie_dokumenta(StringPool.BLANK);
		}
		else {
			pretenzii_ot_postavshhikovImpl.setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		pretenzii_ot_postavshhikovImpl.setPostavshik_id(postavshik_id);
		pretenzii_ot_postavshhikovImpl.setPretenzii_ot_postavshhikov_id(pretenzii_ot_postavshhikov_id);
		pretenzii_ot_postavshhikovImpl.setZagruzil(zagruzil);

		pretenzii_ot_postavshhikovImpl.resetOriginalValues();

		return pretenzii_ot_postavshhikovImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_zagruzki = objectInput.readLong();
		imja_fajla = objectInput.readUTF();

		izvewenie_id = objectInput.readLong();

		lot_id = objectInput.readLong();
		nazvanie_dokumenta = objectInput.readUTF();

		postavshik_id = objectInput.readLong();

		pretenzii_ot_postavshhikov_id = objectInput.readLong();

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

		objectOutput.writeLong(postavshik_id);

		objectOutput.writeLong(pretenzii_ot_postavshhikov_id);

		objectOutput.writeLong(zagruzil);
	}

	public long data_zagruzki;
	public String imja_fajla;
	public long izvewenie_id;
	public long lot_id;
	public String nazvanie_dokumenta;
	public long postavshik_id;
	public long pretenzii_ot_postavshhikov_id;
	public long zagruzil;
}