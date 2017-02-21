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

package tj.spisok.tovarov.vremenno.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing spisok_tovarov_vremenno in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarov_vremenno
 * @generated
 */
@ProviderType
public class spisok_tovarov_vremennoCacheModel implements CacheModel<spisok_tovarov_vremenno>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof spisok_tovarov_vremennoCacheModel)) {
			return false;
		}

		spisok_tovarov_vremennoCacheModel spisok_tovarov_vremennoCacheModel = (spisok_tovarov_vremennoCacheModel)obj;

		if (spisok_tovarov_vremenno_id == spisok_tovarov_vremennoCacheModel.spisok_tovarov_vremenno_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, spisok_tovarov_vremenno_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", edinica_izmerenija_id=");
		sb.append(edinica_izmerenija_id);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", klassifikacija_po_okdp=");
		sb.append(klassifikacija_po_okdp);
		sb.append(", kod_po_okdp=");
		sb.append(kod_po_okdp);
		sb.append(", kod_po_spravochniku_naimenovanij=");
		sb.append(kod_po_spravochniku_naimenovanij);
		sb.append(", kod_strany_proizvoditelja=");
		sb.append(kod_strany_proizvoditelja);
		sb.append(", kolichestvo=");
		sb.append(kolichestvo);
		sb.append(", naimenovanie_tovara=");
		sb.append(naimenovanie_tovara);
		sb.append(", nomer_lota=");
		sb.append(nomer_lota);
		sb.append(", opisanie_tovara=");
		sb.append(opisanie_tovara);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", spisok_tovarov_vremenno_id=");
		sb.append(spisok_tovarov_vremenno_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public spisok_tovarov_vremenno toEntityModel() {
		spisok_tovarov_vremennoImpl spisok_tovarov_vremennoImpl = new spisok_tovarov_vremennoImpl();

		if (data_sozdanija == Long.MIN_VALUE) {
			spisok_tovarov_vremennoImpl.setData_sozdanija(null);
		}
		else {
			spisok_tovarov_vremennoImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		spisok_tovarov_vremennoImpl.setEdinica_izmerenija_id(edinica_izmerenija_id);
		spisok_tovarov_vremennoImpl.setIzvewenie_id(izvewenie_id);

		if (klassifikacija_po_okdp == null) {
			spisok_tovarov_vremennoImpl.setKlassifikacija_po_okdp(StringPool.BLANK);
		}
		else {
			spisok_tovarov_vremennoImpl.setKlassifikacija_po_okdp(klassifikacija_po_okdp);
		}

		if (kod_po_okdp == null) {
			spisok_tovarov_vremennoImpl.setKod_po_okdp(StringPool.BLANK);
		}
		else {
			spisok_tovarov_vremennoImpl.setKod_po_okdp(kod_po_okdp);
		}

		spisok_tovarov_vremennoImpl.setKod_po_spravochniku_naimenovanij(kod_po_spravochniku_naimenovanij);
		spisok_tovarov_vremennoImpl.setKod_strany_proizvoditelja(kod_strany_proizvoditelja);
		spisok_tovarov_vremennoImpl.setKolichestvo(kolichestvo);

		if (naimenovanie_tovara == null) {
			spisok_tovarov_vremennoImpl.setNaimenovanie_tovara(StringPool.BLANK);
		}
		else {
			spisok_tovarov_vremennoImpl.setNaimenovanie_tovara(naimenovanie_tovara);
		}

		spisok_tovarov_vremennoImpl.setNomer_lota(nomer_lota);

		if (opisanie_tovara == null) {
			spisok_tovarov_vremennoImpl.setOpisanie_tovara(StringPool.BLANK);
		}
		else {
			spisok_tovarov_vremennoImpl.setOpisanie_tovara(opisanie_tovara);
		}

		spisok_tovarov_vremennoImpl.setSozdal(sozdal);
		spisok_tovarov_vremennoImpl.setSpisok_tovarov_vremenno_id(spisok_tovarov_vremenno_id);

		spisok_tovarov_vremennoImpl.resetOriginalValues();

		return spisok_tovarov_vremennoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_sozdanija = objectInput.readLong();

		edinica_izmerenija_id = objectInput.readLong();

		izvewenie_id = objectInput.readLong();
		klassifikacija_po_okdp = objectInput.readUTF();
		kod_po_okdp = objectInput.readUTF();

		kod_po_spravochniku_naimenovanij = objectInput.readLong();

		kod_strany_proizvoditelja = objectInput.readLong();

		kolichestvo = objectInput.readLong();
		naimenovanie_tovara = objectInput.readUTF();

		nomer_lota = objectInput.readLong();
		opisanie_tovara = objectInput.readUTF();

		sozdal = objectInput.readLong();

		spisok_tovarov_vremenno_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(edinica_izmerenija_id);

		objectOutput.writeLong(izvewenie_id);

		if (klassifikacija_po_okdp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(klassifikacija_po_okdp);
		}

		if (kod_po_okdp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kod_po_okdp);
		}

		objectOutput.writeLong(kod_po_spravochniku_naimenovanij);

		objectOutput.writeLong(kod_strany_proizvoditelja);

		objectOutput.writeLong(kolichestvo);

		if (naimenovanie_tovara == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naimenovanie_tovara);
		}

		objectOutput.writeLong(nomer_lota);

		if (opisanie_tovara == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(opisanie_tovara);
		}

		objectOutput.writeLong(sozdal);

		objectOutput.writeLong(spisok_tovarov_vremenno_id);
	}

	public long data_sozdanija;
	public long edinica_izmerenija_id;
	public long izvewenie_id;
	public String klassifikacija_po_okdp;
	public String kod_po_okdp;
	public long kod_po_spravochniku_naimenovanij;
	public long kod_strany_proizvoditelja;
	public long kolichestvo;
	public String naimenovanie_tovara;
	public long nomer_lota;
	public String opisanie_tovara;
	public long sozdal;
	public long spisok_tovarov_vremenno_id;
}