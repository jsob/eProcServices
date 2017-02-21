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

package tj.reestr.kontraktov.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.reestr.kontraktov.model.reestr_kontraktov;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing reestr_kontraktov in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see reestr_kontraktov
 * @generated
 */
@ProviderType
public class reestr_kontraktovCacheModel implements CacheModel<reestr_kontraktov>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof reestr_kontraktovCacheModel)) {
			return false;
		}

		reestr_kontraktovCacheModel reestr_kontraktovCacheModel = (reestr_kontraktovCacheModel)obj;

		if (reestr_kontraktov_id.equals(
					reestr_kontraktovCacheModel.reestr_kontraktov_id)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, reestr_kontraktov_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{data_kontrakta=");
		sb.append(data_kontrakta);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", reestr_kontraktov_id=");
		sb.append(reestr_kontraktov_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public reestr_kontraktov toEntityModel() {
		reestr_kontraktovImpl reestr_kontraktovImpl = new reestr_kontraktovImpl();

		if (data_kontrakta == Long.MIN_VALUE) {
			reestr_kontraktovImpl.setData_kontrakta(null);
		}
		else {
			reestr_kontraktovImpl.setData_kontrakta(new Date(data_kontrakta));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			reestr_kontraktovImpl.setData_sozdanija(null);
		}
		else {
			reestr_kontraktovImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		reestr_kontraktovImpl.setIzvewenie_id(izvewenie_id);
		reestr_kontraktovImpl.setLot_id(lot_id);
		reestr_kontraktovImpl.setPostavwik_id(postavwik_id);

		if (reestr_kontraktov_id == null) {
			reestr_kontraktovImpl.setReestr_kontraktov_id(StringPool.BLANK);
		}
		else {
			reestr_kontraktovImpl.setReestr_kontraktov_id(reestr_kontraktov_id);
		}

		reestr_kontraktovImpl.setSozdal(sozdal);

		reestr_kontraktovImpl.resetOriginalValues();

		return reestr_kontraktovImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_kontrakta = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		lot_id = objectInput.readLong();

		postavwik_id = objectInput.readLong();
		reestr_kontraktov_id = objectInput.readUTF();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_kontrakta);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(lot_id);

		objectOutput.writeLong(postavwik_id);

		if (reestr_kontraktov_id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reestr_kontraktov_id);
		}

		objectOutput.writeLong(sozdal);
	}

	public long data_kontrakta;
	public long data_sozdanija;
	public long izvewenie_id;
	public long lot_id;
	public long postavwik_id;
	public String reestr_kontraktov_id;
	public long sozdal;
}