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

package naruwenija.v.izvewenii.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import naruwenija.v.izvewenii.model.naruwenija_v_izvewenii;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing naruwenija_v_izvewenii in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see naruwenija_v_izvewenii
 * @generated
 */
@ProviderType
public class naruwenija_v_izveweniiCacheModel implements CacheModel<naruwenija_v_izvewenii>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof naruwenija_v_izveweniiCacheModel)) {
			return false;
		}

		naruwenija_v_izveweniiCacheModel naruwenija_v_izveweniiCacheModel = (naruwenija_v_izveweniiCacheModel)obj;

		if (naruwenija_v_izvewenii_id == naruwenija_v_izveweniiCacheModel.naruwenija_v_izvewenii_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, naruwenija_v_izvewenii_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", naruwenie=");
		sb.append(naruwenie);
		sb.append(", naruwenija_v_izvewenii_id=");
		sb.append(naruwenija_v_izvewenii_id);
		sb.append(", nomer_razdela=");
		sb.append(nomer_razdela);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public naruwenija_v_izvewenii toEntityModel() {
		naruwenija_v_izveweniiImpl naruwenija_v_izveweniiImpl = new naruwenija_v_izveweniiImpl();

		if (data_sozdanija == Long.MIN_VALUE) {
			naruwenija_v_izveweniiImpl.setData_sozdanija(null);
		}
		else {
			naruwenija_v_izveweniiImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		naruwenija_v_izveweniiImpl.setIzvewenie_id(izvewenie_id);

		if (naruwenie == null) {
			naruwenija_v_izveweniiImpl.setNaruwenie(StringPool.BLANK);
		}
		else {
			naruwenija_v_izveweniiImpl.setNaruwenie(naruwenie);
		}

		naruwenija_v_izveweniiImpl.setNaruwenija_v_izvewenii_id(naruwenija_v_izvewenii_id);
		naruwenija_v_izveweniiImpl.setNomer_razdela(nomer_razdela);
		naruwenija_v_izveweniiImpl.setSozdal(sozdal);

		naruwenija_v_izveweniiImpl.resetOriginalValues();

		return naruwenija_v_izveweniiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_sozdanija = objectInput.readLong();

		izvewenie_id = objectInput.readLong();
		naruwenie = objectInput.readUTF();

		naruwenija_v_izvewenii_id = objectInput.readLong();

		nomer_razdela = objectInput.readLong();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izvewenie_id);

		if (naruwenie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naruwenie);
		}

		objectOutput.writeLong(naruwenija_v_izvewenii_id);

		objectOutput.writeLong(nomer_razdela);

		objectOutput.writeLong(sozdal);
	}

	public long data_sozdanija;
	public long izvewenie_id;
	public String naruwenie;
	public long naruwenija_v_izvewenii_id;
	public long nomer_razdela;
	public long sozdal;
}