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

package tj.status.izvewenij.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.status.izvewenij.model.status_izvewenij;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing status_izvewenij in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see status_izvewenij
 * @generated
 */
@ProviderType
public class status_izvewenijCacheModel implements CacheModel<status_izvewenij>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof status_izvewenijCacheModel)) {
			return false;
		}

		status_izvewenijCacheModel status_izvewenijCacheModel = (status_izvewenijCacheModel)obj;

		if (status_izvewenij_id == status_izvewenijCacheModel.status_izvewenij_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, status_izvewenij_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{status=");
		sb.append(status);
		sb.append(", status_izvewenij_id=");
		sb.append(status_izvewenij_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public status_izvewenij toEntityModel() {
		status_izvewenijImpl status_izvewenijImpl = new status_izvewenijImpl();

		if (status == null) {
			status_izvewenijImpl.setStatus(StringPool.BLANK);
		}
		else {
			status_izvewenijImpl.setStatus(status);
		}

		status_izvewenijImpl.setStatus_izvewenij_id(status_izvewenij_id);

		status_izvewenijImpl.resetOriginalValues();

		return status_izvewenijImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		status = objectInput.readUTF();

		status_izvewenij_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(status_izvewenij_id);
	}

	public String status;
	public long status_izvewenij_id;
}