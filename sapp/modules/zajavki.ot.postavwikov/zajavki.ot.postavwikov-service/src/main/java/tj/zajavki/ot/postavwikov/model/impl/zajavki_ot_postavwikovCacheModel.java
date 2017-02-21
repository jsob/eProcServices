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

package tj.zajavki.ot.postavwikov.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing zajavki_ot_postavwikov in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see zajavki_ot_postavwikov
 * @generated
 */
@ProviderType
public class zajavki_ot_postavwikovCacheModel implements CacheModel<zajavki_ot_postavwikov>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof zajavki_ot_postavwikovCacheModel)) {
			return false;
		}

		zajavki_ot_postavwikovCacheModel zajavki_ot_postavwikovCacheModel = (zajavki_ot_postavwikovCacheModel)obj;

		if (zajavki_ot_postavwikov_id == zajavki_ot_postavwikovCacheModel.zajavki_ot_postavwikov_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, zajavki_ot_postavwikov_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", itogo_za_tovar=");
		sb.append(itogo_za_tovar);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", kod_po_obshhemu_klassifikatoru=");
		sb.append(kod_po_obshhemu_klassifikatoru);
		sb.append(", kod_strany_proizvoditelja=");
		sb.append(kod_strany_proizvoditelja);
		sb.append(", kolichestvo=");
		sb.append(kolichestvo);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", opisanie_tovara=");
		sb.append(opisanie_tovara);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", predlozhenie_postavwika=");
		sb.append(predlozhenie_postavwika);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", summa_za_edinicu_tovara=");
		sb.append(summa_za_edinicu_tovara);
		sb.append(", tovar_id=");
		sb.append(tovar_id);
		sb.append(", zajavki_ot_postavwikov_id=");
		sb.append(zajavki_ot_postavwikov_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public zajavki_ot_postavwikov toEntityModel() {
		zajavki_ot_postavwikovImpl zajavki_ot_postavwikovImpl = new zajavki_ot_postavwikovImpl();

		if (data_izmenenija == Long.MIN_VALUE) {
			zajavki_ot_postavwikovImpl.setData_izmenenija(null);
		}
		else {
			zajavki_ot_postavwikovImpl.setData_izmenenija(new Date(
					data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			zajavki_ot_postavwikovImpl.setData_sozdanija(null);
		}
		else {
			zajavki_ot_postavwikovImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		zajavki_ot_postavwikovImpl.setItogo_za_tovar(itogo_za_tovar);
		zajavki_ot_postavwikovImpl.setIzmenil(izmenil);
		zajavki_ot_postavwikovImpl.setIzvewenie_id(izvewenie_id);
		zajavki_ot_postavwikovImpl.setKod_po_obshhemu_klassifikatoru(kod_po_obshhemu_klassifikatoru);
		zajavki_ot_postavwikovImpl.setKod_strany_proizvoditelja(kod_strany_proizvoditelja);
		zajavki_ot_postavwikovImpl.setKolichestvo(kolichestvo);
		zajavki_ot_postavwikovImpl.setLot_id(lot_id);

		if (opisanie_tovara == null) {
			zajavki_ot_postavwikovImpl.setOpisanie_tovara(StringPool.BLANK);
		}
		else {
			zajavki_ot_postavwikovImpl.setOpisanie_tovara(opisanie_tovara);
		}

		zajavki_ot_postavwikovImpl.setPostavwik_id(postavwik_id);

		if (predlozhenie_postavwika == null) {
			zajavki_ot_postavwikovImpl.setPredlozhenie_postavwika(StringPool.BLANK);
		}
		else {
			zajavki_ot_postavwikovImpl.setPredlozhenie_postavwika(predlozhenie_postavwika);
		}

		zajavki_ot_postavwikovImpl.setSozdal(sozdal);
		zajavki_ot_postavwikovImpl.setSumma_za_edinicu_tovara(summa_za_edinicu_tovara);
		zajavki_ot_postavwikovImpl.setTovar_id(tovar_id);
		zajavki_ot_postavwikovImpl.setZajavki_ot_postavwikov_id(zajavki_ot_postavwikov_id);

		zajavki_ot_postavwikovImpl.resetOriginalValues();

		return zajavki_ot_postavwikovImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		itogo_za_tovar = objectInput.readDouble();

		izmenil = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		kod_po_obshhemu_klassifikatoru = objectInput.readLong();

		kod_strany_proizvoditelja = objectInput.readLong();

		kolichestvo = objectInput.readLong();

		lot_id = objectInput.readLong();
		opisanie_tovara = objectInput.readUTF();

		postavwik_id = objectInput.readLong();
		predlozhenie_postavwika = objectInput.readUTF();

		sozdal = objectInput.readLong();

		summa_za_edinicu_tovara = objectInput.readDouble();

		tovar_id = objectInput.readLong();

		zajavki_ot_postavwikov_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeDouble(itogo_za_tovar);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(kod_po_obshhemu_klassifikatoru);

		objectOutput.writeLong(kod_strany_proizvoditelja);

		objectOutput.writeLong(kolichestvo);

		objectOutput.writeLong(lot_id);

		if (opisanie_tovara == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(opisanie_tovara);
		}

		objectOutput.writeLong(postavwik_id);

		if (predlozhenie_postavwika == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(predlozhenie_postavwika);
		}

		objectOutput.writeLong(sozdal);

		objectOutput.writeDouble(summa_za_edinicu_tovara);

		objectOutput.writeLong(tovar_id);

		objectOutput.writeLong(zajavki_ot_postavwikov_id);
	}

	public long data_izmenenija;
	public long data_sozdanija;
	public double itogo_za_tovar;
	public long izmenil;
	public long izvewenie_id;
	public long kod_po_obshhemu_klassifikatoru;
	public long kod_strany_proizvoditelja;
	public long kolichestvo;
	public long lot_id;
	public String opisanie_tovara;
	public long postavwik_id;
	public String predlozhenie_postavwika;
	public long sozdal;
	public double summa_za_edinicu_tovara;
	public long tovar_id;
	public long zajavki_ot_postavwikov_id;
}