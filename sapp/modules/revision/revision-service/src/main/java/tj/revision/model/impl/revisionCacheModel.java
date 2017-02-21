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

package tj.revision.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.revision.model.revision;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing revision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see revision
 * @generated
 */
@ProviderType
public class revisionCacheModel implements CacheModel<revision>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof revisionCacheModel)) {
			return false;
		}

		revisionCacheModel revisionCacheModel = (revisionCacheModel)obj;

		if (revision_id == revisionCacheModel.revision_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, revision_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{date=");
		sb.append(date);
		sb.append(", revision_id=");
		sb.append(revision_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public revision toEntityModel() {
		revisionImpl revisionImpl = new revisionImpl();

		if (date == Long.MIN_VALUE) {
			revisionImpl.setDate(null);
		}
		else {
			revisionImpl.setDate(new Date(date));
		}

		revisionImpl.setRevision_id(revision_id);

		revisionImpl.resetOriginalValues();

		return revisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		date = objectInput.readLong();

		revision_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(date);

		objectOutput.writeLong(revision_id);
	}

	public long date;
	public long revision_id;
}