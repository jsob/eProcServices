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

package tj.protokol.vskrytija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.protokol.vskrytija.model.protokol_vskrytija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing protokol_vskrytija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_vskrytija
 * @generated
 */
@ProviderType
public class protokol_vskrytijaCacheModel implements CacheModel<protokol_vskrytija>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof protokol_vskrytijaCacheModel)) {
			return false;
		}

		protokol_vskrytijaCacheModel protokol_vskrytijaCacheModel = (protokol_vskrytijaCacheModel)obj;

		if (protokol_vskrytija_id == protokol_vskrytijaCacheModel.protokol_vskrytija_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, protokol_vskrytija_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{data_vskrytija=");
		sb.append(data_vskrytija);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", protokol_vskrytija_id=");
		sb.append(protokol_vskrytija_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public protokol_vskrytija toEntityModel() {
		protokol_vskrytijaImpl protokol_vskrytijaImpl = new protokol_vskrytijaImpl();

		if (data_vskrytija == Long.MIN_VALUE) {
			protokol_vskrytijaImpl.setData_vskrytija(null);
		}
		else {
			protokol_vskrytijaImpl.setData_vskrytija(new Date(data_vskrytija));
		}

		protokol_vskrytijaImpl.setIzvewenie_id(izvewenie_id);
		protokol_vskrytijaImpl.setProtokol_vskrytija_id(protokol_vskrytija_id);

		protokol_vskrytijaImpl.resetOriginalValues();

		return protokol_vskrytijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_vskrytija = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		protokol_vskrytija_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_vskrytija);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(protokol_vskrytija_id);
	}

	public long data_vskrytija;
	public long izvewenie_id;
	public long protokol_vskrytija_id;
}