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

package tj.sostojanie.izvewenij.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.sostojanie.izvewenij.model.sostojanie_izvewenij;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing sostojanie_izvewenij in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see sostojanie_izvewenij
 * @generated
 */
@ProviderType
public class sostojanie_izvewenijCacheModel implements CacheModel<sostojanie_izvewenij>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof sostojanie_izvewenijCacheModel)) {
			return false;
		}

		sostojanie_izvewenijCacheModel sostojanie_izvewenijCacheModel = (sostojanie_izvewenijCacheModel)obj;

		if (sostojanie_izvewenij_id == sostojanie_izvewenijCacheModel.sostojanie_izvewenij_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sostojanie_izvewenij_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{sostojanie=");
		sb.append(sostojanie);
		sb.append(", sostojanie_izvewenij_id=");
		sb.append(sostojanie_izvewenij_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public sostojanie_izvewenij toEntityModel() {
		sostojanie_izvewenijImpl sostojanie_izvewenijImpl = new sostojanie_izvewenijImpl();

		if (sostojanie == null) {
			sostojanie_izvewenijImpl.setSostojanie(StringPool.BLANK);
		}
		else {
			sostojanie_izvewenijImpl.setSostojanie(sostojanie);
		}

		sostojanie_izvewenijImpl.setSostojanie_izvewenij_id(sostojanie_izvewenij_id);

		sostojanie_izvewenijImpl.resetOriginalValues();

		return sostojanie_izvewenijImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sostojanie = objectInput.readUTF();

		sostojanie_izvewenij_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (sostojanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sostojanie);
		}

		objectOutput.writeLong(sostojanie_izvewenij_id);
	}

	public String sostojanie;
	public long sostojanie_izvewenij_id;
}