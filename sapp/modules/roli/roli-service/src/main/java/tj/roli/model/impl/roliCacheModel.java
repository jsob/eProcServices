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

package tj.roli.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.roli.model.roli;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing roli in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see roli
 * @generated
 */
@ProviderType
public class roliCacheModel implements CacheModel<roli>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof roliCacheModel)) {
			return false;
		}

		roliCacheModel roliCacheModel = (roliCacheModel)obj;

		if (roli_id == roliCacheModel.roli_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, roli_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{rol=");
		sb.append(rol);
		sb.append(", roli_id=");
		sb.append(roli_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public roli toEntityModel() {
		roliImpl roliImpl = new roliImpl();

		if (rol == null) {
			roliImpl.setRol(StringPool.BLANK);
		}
		else {
			roliImpl.setRol(rol);
		}

		roliImpl.setRoli_id(roli_id);

		roliImpl.resetOriginalValues();

		return roliImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		rol = objectInput.readUTF();

		roli_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (rol == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rol);
		}

		objectOutput.writeLong(roli_id);
	}

	public String rol;
	public long roli_id;
}