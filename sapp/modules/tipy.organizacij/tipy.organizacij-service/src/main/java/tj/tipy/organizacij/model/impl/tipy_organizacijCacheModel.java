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

package tj.tipy.organizacij.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.tipy.organizacij.model.tipy_organizacij;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing tipy_organizacij in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see tipy_organizacij
 * @generated
 */
@ProviderType
public class tipy_organizacijCacheModel implements CacheModel<tipy_organizacij>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof tipy_organizacijCacheModel)) {
			return false;
		}

		tipy_organizacijCacheModel tipy_organizacijCacheModel = (tipy_organizacijCacheModel)obj;

		if (tipy_organizacij_id == tipy_organizacijCacheModel.tipy_organizacij_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tipy_organizacij_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{tipy_organizacij_id=");
		sb.append(tipy_organizacij_id);
		sb.append(", nazvanie=");
		sb.append(nazvanie);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public tipy_organizacij toEntityModel() {
		tipy_organizacijImpl tipy_organizacijImpl = new tipy_organizacijImpl();

		tipy_organizacijImpl.setTipy_organizacij_id(tipy_organizacij_id);

		if (nazvanie == null) {
			tipy_organizacijImpl.setNazvanie(StringPool.BLANK);
		}
		else {
			tipy_organizacijImpl.setNazvanie(nazvanie);
		}

		tipy_organizacijImpl.resetOriginalValues();

		return tipy_organizacijImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tipy_organizacij_id = objectInput.readLong();
		nazvanie = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(tipy_organizacij_id);

		if (nazvanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie);
		}
	}

	public long tipy_organizacij_id;
	public String nazvanie;
}