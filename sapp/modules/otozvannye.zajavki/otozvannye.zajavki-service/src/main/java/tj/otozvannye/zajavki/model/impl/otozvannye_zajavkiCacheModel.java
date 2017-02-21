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

package tj.otozvannye.zajavki.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.otozvannye.zajavki.model.otozvannye_zajavki;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing otozvannye_zajavki in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see otozvannye_zajavki
 * @generated
 */
@ProviderType
public class otozvannye_zajavkiCacheModel implements CacheModel<otozvannye_zajavki>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof otozvannye_zajavkiCacheModel)) {
			return false;
		}

		otozvannye_zajavkiCacheModel otozvannye_zajavkiCacheModel = (otozvannye_zajavkiCacheModel)obj;

		if (otozvannye_zajavki_id == otozvannye_zajavkiCacheModel.otozvannye_zajavki_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, otozvannye_zajavki_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{data_otzyva=");
		sb.append(data_otzyva);
		sb.append(", itogo_za_tovar=");
		sb.append(itogo_za_tovar);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", kolichestvo=");
		sb.append(kolichestvo);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", otozval=");
		sb.append(otozval);
		sb.append(", otozvannye_zajavki_id=");
		sb.append(otozvannye_zajavki_id);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", summa_za_edinicu_tovara=");
		sb.append(summa_za_edinicu_tovara);
		sb.append(", tovar_id=");
		sb.append(tovar_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public otozvannye_zajavki toEntityModel() {
		otozvannye_zajavkiImpl otozvannye_zajavkiImpl = new otozvannye_zajavkiImpl();

		if (data_otzyva == Long.MIN_VALUE) {
			otozvannye_zajavkiImpl.setData_otzyva(null);
		}
		else {
			otozvannye_zajavkiImpl.setData_otzyva(new Date(data_otzyva));
		}

		otozvannye_zajavkiImpl.setItogo_za_tovar(itogo_za_tovar);
		otozvannye_zajavkiImpl.setIzvewenie_id(izvewenie_id);
		otozvannye_zajavkiImpl.setKolichestvo(kolichestvo);
		otozvannye_zajavkiImpl.setLot_id(lot_id);
		otozvannye_zajavkiImpl.setOtozval(otozval);
		otozvannye_zajavkiImpl.setOtozvannye_zajavki_id(otozvannye_zajavki_id);
		otozvannye_zajavkiImpl.setPostavwik_id(postavwik_id);
		otozvannye_zajavkiImpl.setSumma_za_edinicu_tovara(summa_za_edinicu_tovara);
		otozvannye_zajavkiImpl.setTovar_id(tovar_id);

		otozvannye_zajavkiImpl.resetOriginalValues();

		return otozvannye_zajavkiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_otzyva = objectInput.readLong();

		itogo_za_tovar = objectInput.readDouble();

		izvewenie_id = objectInput.readLong();

		kolichestvo = objectInput.readInt();

		lot_id = objectInput.readLong();

		otozval = objectInput.readLong();

		otozvannye_zajavki_id = objectInput.readLong();

		postavwik_id = objectInput.readLong();

		summa_za_edinicu_tovara = objectInput.readDouble();

		tovar_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_otzyva);

		objectOutput.writeDouble(itogo_za_tovar);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeInt(kolichestvo);

		objectOutput.writeLong(lot_id);

		objectOutput.writeLong(otozval);

		objectOutput.writeLong(otozvannye_zajavki_id);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeDouble(summa_za_edinicu_tovara);

		objectOutput.writeLong(tovar_id);
	}

	public long data_otzyva;
	public double itogo_za_tovar;
	public long izvewenie_id;
	public int kolichestvo;
	public long lot_id;
	public long otozval;
	public long otozvannye_zajavki_id;
	public long postavwik_id;
	public double summa_za_edinicu_tovara;
	public long tovar_id;
}