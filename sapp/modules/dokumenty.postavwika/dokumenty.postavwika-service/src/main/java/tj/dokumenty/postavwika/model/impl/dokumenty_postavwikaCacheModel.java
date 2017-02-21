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

package tj.dokumenty.postavwika.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.dokumenty.postavwika.model.dokumenty_postavwika;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing dokumenty_postavwika in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_postavwika
 * @generated
 */
@ProviderType
public class dokumenty_postavwikaCacheModel implements CacheModel<dokumenty_postavwika>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof dokumenty_postavwikaCacheModel)) {
			return false;
		}

		dokumenty_postavwikaCacheModel dokumenty_postavwikaCacheModel = (dokumenty_postavwikaCacheModel)obj;

		if (dokumenty_postavwika_id == dokumenty_postavwikaCacheModel.dokumenty_postavwika_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dokumenty_postavwika_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{data_zagruzki=");
		sb.append(data_zagruzki);
		sb.append(", dokumenty_postavwika_id=");
		sb.append(dokumenty_postavwika_id);
		sb.append(", imja_fajla=");
		sb.append(imja_fajla);
		sb.append(", nazvanie_dokumenta=");
		sb.append(nazvanie_dokumenta);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", tip_dokumenta=");
		sb.append(tip_dokumenta);
		sb.append(", zagruzil=");
		sb.append(zagruzil);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public dokumenty_postavwika toEntityModel() {
		dokumenty_postavwikaImpl dokumenty_postavwikaImpl = new dokumenty_postavwikaImpl();

		if (data_zagruzki == Long.MIN_VALUE) {
			dokumenty_postavwikaImpl.setData_zagruzki(null);
		}
		else {
			dokumenty_postavwikaImpl.setData_zagruzki(new Date(data_zagruzki));
		}

		dokumenty_postavwikaImpl.setDokumenty_postavwika_id(dokumenty_postavwika_id);

		if (imja_fajla == null) {
			dokumenty_postavwikaImpl.setImja_fajla(StringPool.BLANK);
		}
		else {
			dokumenty_postavwikaImpl.setImja_fajla(imja_fajla);
		}

		if (nazvanie_dokumenta == null) {
			dokumenty_postavwikaImpl.setNazvanie_dokumenta(StringPool.BLANK);
		}
		else {
			dokumenty_postavwikaImpl.setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		dokumenty_postavwikaImpl.setPostavwik_id(postavwik_id);
		dokumenty_postavwikaImpl.setTip_dokumenta(tip_dokumenta);
		dokumenty_postavwikaImpl.setZagruzil(zagruzil);

		dokumenty_postavwikaImpl.resetOriginalValues();

		return dokumenty_postavwikaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_zagruzki = objectInput.readLong();

		dokumenty_postavwika_id = objectInput.readLong();
		imja_fajla = objectInput.readUTF();
		nazvanie_dokumenta = objectInput.readUTF();

		postavwik_id = objectInput.readLong();

		tip_dokumenta = objectInput.readInt();

		zagruzil = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_zagruzki);

		objectOutput.writeLong(dokumenty_postavwika_id);

		if (imja_fajla == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imja_fajla);
		}

		if (nazvanie_dokumenta == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_dokumenta);
		}

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeInt(tip_dokumenta);

		objectOutput.writeLong(zagruzil);
	}

	public long data_zagruzki;
	public long dokumenty_postavwika_id;
	public String imja_fajla;
	public String nazvanie_dokumenta;
	public long postavwik_id;
	public int tip_dokumenta;
	public long zagruzil;
}