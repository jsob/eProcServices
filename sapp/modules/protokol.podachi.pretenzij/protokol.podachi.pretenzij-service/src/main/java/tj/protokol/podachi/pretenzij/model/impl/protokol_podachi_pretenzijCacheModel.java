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

package tj.protokol.podachi.pretenzij.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing protokol_podachi_pretenzij in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_podachi_pretenzij
 * @generated
 */
@ProviderType
public class protokol_podachi_pretenzijCacheModel implements CacheModel<protokol_podachi_pretenzij>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof protokol_podachi_pretenzijCacheModel)) {
			return false;
		}

		protokol_podachi_pretenzijCacheModel protokol_podachi_pretenzijCacheModel =
			(protokol_podachi_pretenzijCacheModel)obj;

		if (protokol_podachi_pretenzij_id == protokol_podachi_pretenzijCacheModel.protokol_podachi_pretenzij_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, protokol_podachi_pretenzij_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{data_generacii=");
		sb.append(data_generacii);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", protokol_podachi_pretenzij_id=");
		sb.append(protokol_podachi_pretenzij_id);
		sb.append(", sgeneriroval=");
		sb.append(sgeneriroval);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public protokol_podachi_pretenzij toEntityModel() {
		protokol_podachi_pretenzijImpl protokol_podachi_pretenzijImpl = new protokol_podachi_pretenzijImpl();

		if (data_generacii == Long.MIN_VALUE) {
			protokol_podachi_pretenzijImpl.setData_generacii(null);
		}
		else {
			protokol_podachi_pretenzijImpl.setData_generacii(new Date(
					data_generacii));
		}

		protokol_podachi_pretenzijImpl.setIzvewenie_id(izvewenie_id);
		protokol_podachi_pretenzijImpl.setProtokol_podachi_pretenzij_id(protokol_podachi_pretenzij_id);
		protokol_podachi_pretenzijImpl.setSgeneriroval(sgeneriroval);

		protokol_podachi_pretenzijImpl.resetOriginalValues();

		return protokol_podachi_pretenzijImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_generacii = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		protokol_podachi_pretenzij_id = objectInput.readLong();

		sgeneriroval = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_generacii);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(protokol_podachi_pretenzij_id);

		objectOutput.writeLong(sgeneriroval);
	}

	public long data_generacii;
	public long izvewenie_id;
	public long protokol_podachi_pretenzij_id;
	public long sgeneriroval;
}