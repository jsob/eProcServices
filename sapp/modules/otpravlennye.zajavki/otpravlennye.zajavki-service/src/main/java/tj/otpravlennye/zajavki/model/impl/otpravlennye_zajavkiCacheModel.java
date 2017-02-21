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

package tj.otpravlennye.zajavki.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.otpravlennye.zajavki.model.otpravlennye_zajavki;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing otpravlennye_zajavki in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see otpravlennye_zajavki
 * @generated
 */
@ProviderType
public class otpravlennye_zajavkiCacheModel implements CacheModel<otpravlennye_zajavki>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof otpravlennye_zajavkiCacheModel)) {
			return false;
		}

		otpravlennye_zajavkiCacheModel otpravlennye_zajavkiCacheModel = (otpravlennye_zajavkiCacheModel)obj;

		if (otpravlennye_zajavki_id == otpravlennye_zajavkiCacheModel.otpravlennye_zajavki_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, otpravlennye_zajavki_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_otpravki=");
		sb.append(data_otpravki);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", kolichestvo_otpravok=");
		sb.append(kolichestvo_otpravok);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", otpravil=");
		sb.append(otpravil);
		sb.append(", otpravlennye_zajavki_id=");
		sb.append(otpravlennye_zajavki_id);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public otpravlennye_zajavki toEntityModel() {
		otpravlennye_zajavkiImpl otpravlennye_zajavkiImpl = new otpravlennye_zajavkiImpl();

		if (data_izmenenija == Long.MIN_VALUE) {
			otpravlennye_zajavkiImpl.setData_izmenenija(null);
		}
		else {
			otpravlennye_zajavkiImpl.setData_izmenenija(new Date(
					data_izmenenija));
		}

		if (data_otpravki == Long.MIN_VALUE) {
			otpravlennye_zajavkiImpl.setData_otpravki(null);
		}
		else {
			otpravlennye_zajavkiImpl.setData_otpravki(new Date(data_otpravki));
		}

		otpravlennye_zajavkiImpl.setIzmenil(izmenil);
		otpravlennye_zajavkiImpl.setIzvewenie_id(izvewenie_id);
		otpravlennye_zajavkiImpl.setKolichestvo_otpravok(kolichestvo_otpravok);
		otpravlennye_zajavkiImpl.setLot_id(lot_id);
		otpravlennye_zajavkiImpl.setOtpravil(otpravil);
		otpravlennye_zajavkiImpl.setOtpravlennye_zajavki_id(otpravlennye_zajavki_id);
		otpravlennye_zajavkiImpl.setPostavwik_id(postavwik_id);
		otpravlennye_zajavkiImpl.setStatus(status);

		otpravlennye_zajavkiImpl.resetOriginalValues();

		return otpravlennye_zajavkiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_izmenenija = objectInput.readLong();
		data_otpravki = objectInput.readLong();

		izmenil = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		kolichestvo_otpravok = objectInput.readLong();

		lot_id = objectInput.readLong();

		otpravil = objectInput.readLong();

		otpravlennye_zajavki_id = objectInput.readLong();

		postavwik_id = objectInput.readLong();

		status = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_otpravki);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(kolichestvo_otpravok);

		objectOutput.writeLong(lot_id);

		objectOutput.writeLong(otpravil);

		objectOutput.writeLong(otpravlennye_zajavki_id);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeLong(status);
	}

	public long data_izmenenija;
	public long data_otpravki;
	public long izmenil;
	public long izvewenie_id;
	public long kolichestvo_otpravok;
	public long lot_id;
	public long otpravil;
	public long otpravlennye_zajavki_id;
	public long postavwik_id;
	public long status;
}