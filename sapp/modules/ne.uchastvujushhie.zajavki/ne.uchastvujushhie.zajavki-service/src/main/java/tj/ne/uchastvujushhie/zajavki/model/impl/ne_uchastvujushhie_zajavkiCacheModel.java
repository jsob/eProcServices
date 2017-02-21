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

package tj.ne.uchastvujushhie.zajavki.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ne_uchastvujushhie_zajavki in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ne_uchastvujushhie_zajavki
 * @generated
 */
@ProviderType
public class ne_uchastvujushhie_zajavkiCacheModel implements CacheModel<ne_uchastvujushhie_zajavki>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ne_uchastvujushhie_zajavkiCacheModel)) {
			return false;
		}

		ne_uchastvujushhie_zajavkiCacheModel ne_uchastvujushhie_zajavkiCacheModel =
			(ne_uchastvujushhie_zajavkiCacheModel)obj;

		if (ne_uchastvujushhie_zajavki_id == ne_uchastvujushhie_zajavkiCacheModel.ne_uchastvujushhie_zajavki_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ne_uchastvujushhie_zajavki_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", itogo_za_tovar=");
		sb.append(itogo_za_tovar);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", kolichestvo=");
		sb.append(kolichestvo);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", ne_uchastvujushhie_zajavki_id=");
		sb.append(ne_uchastvujushhie_zajavki_id);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", summa_za_edinicu_tovara=");
		sb.append(summa_za_edinicu_tovara);
		sb.append(", tovar_id=");
		sb.append(tovar_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ne_uchastvujushhie_zajavki toEntityModel() {
		ne_uchastvujushhie_zajavkiImpl ne_uchastvujushhie_zajavkiImpl = new ne_uchastvujushhie_zajavkiImpl();

		if (data_sozdanija == Long.MIN_VALUE) {
			ne_uchastvujushhie_zajavkiImpl.setData_sozdanija(null);
		}
		else {
			ne_uchastvujushhie_zajavkiImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		ne_uchastvujushhie_zajavkiImpl.setItogo_za_tovar(itogo_za_tovar);
		ne_uchastvujushhie_zajavkiImpl.setIzvewenie_id(izvewenie_id);
		ne_uchastvujushhie_zajavkiImpl.setKolichestvo(kolichestvo);
		ne_uchastvujushhie_zajavkiImpl.setLot_id(lot_id);
		ne_uchastvujushhie_zajavkiImpl.setNe_uchastvujushhie_zajavki_id(ne_uchastvujushhie_zajavki_id);
		ne_uchastvujushhie_zajavkiImpl.setPostavwik_id(postavwik_id);
		ne_uchastvujushhie_zajavkiImpl.setSozdal(sozdal);
		ne_uchastvujushhie_zajavkiImpl.setSumma_za_edinicu_tovara(summa_za_edinicu_tovara);
		ne_uchastvujushhie_zajavkiImpl.setTovar_id(tovar_id);

		ne_uchastvujushhie_zajavkiImpl.resetOriginalValues();

		return ne_uchastvujushhie_zajavkiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_sozdanija = objectInput.readLong();

		itogo_za_tovar = objectInput.readDouble();

		izvewenie_id = objectInput.readLong();

		kolichestvo = objectInput.readLong();

		lot_id = objectInput.readLong();

		ne_uchastvujushhie_zajavki_id = objectInput.readLong();

		postavwik_id = objectInput.readLong();

		sozdal = objectInput.readLong();

		summa_za_edinicu_tovara = objectInput.readDouble();

		tovar_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeDouble(itogo_za_tovar);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(kolichestvo);

		objectOutput.writeLong(lot_id);

		objectOutput.writeLong(ne_uchastvujushhie_zajavki_id);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeLong(sozdal);

		objectOutput.writeDouble(summa_za_edinicu_tovara);

		objectOutput.writeLong(tovar_id);
	}

	public long data_sozdanija;
	public double itogo_za_tovar;
	public long izvewenie_id;
	public long kolichestvo;
	public long lot_id;
	public long ne_uchastvujushhie_zajavki_id;
	public long postavwik_id;
	public long sozdal;
	public double summa_za_edinicu_tovara;
	public long tovar_id;
}