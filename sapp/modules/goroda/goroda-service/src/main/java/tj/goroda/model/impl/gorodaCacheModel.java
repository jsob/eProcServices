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

package tj.goroda.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.goroda.model.goroda;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing goroda in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see goroda
 * @generated
 */
@ProviderType
public class gorodaCacheModel implements CacheModel<goroda>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof gorodaCacheModel)) {
			return false;
		}

		gorodaCacheModel gorodaCacheModel = (gorodaCacheModel)obj;

		if (goroda_id == gorodaCacheModel.goroda_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, goroda_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{goroda_id=");
		sb.append(goroda_id);
		sb.append(", nazvanie=");
		sb.append(nazvanie);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public goroda toEntityModel() {
		gorodaImpl gorodaImpl = new gorodaImpl();

		gorodaImpl.setGoroda_id(goroda_id);

		if (nazvanie == null) {
			gorodaImpl.setNazvanie(StringPool.BLANK);
		}
		else {
			gorodaImpl.setNazvanie(nazvanie);
		}

		gorodaImpl.resetOriginalValues();

		return gorodaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		goroda_id = objectInput.readLong();
		nazvanie = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(goroda_id);

		if (nazvanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie);
		}
	}

	public long goroda_id;
	public String nazvanie;
}