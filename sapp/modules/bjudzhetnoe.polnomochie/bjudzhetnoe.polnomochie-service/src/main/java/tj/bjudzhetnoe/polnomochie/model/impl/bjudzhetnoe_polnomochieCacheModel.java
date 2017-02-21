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

package tj.bjudzhetnoe.polnomochie.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing bjudzhetnoe_polnomochie in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see bjudzhetnoe_polnomochie
 * @generated
 */
@ProviderType
public class bjudzhetnoe_polnomochieCacheModel implements CacheModel<bjudzhetnoe_polnomochie>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bjudzhetnoe_polnomochieCacheModel)) {
			return false;
		}

		bjudzhetnoe_polnomochieCacheModel bjudzhetnoe_polnomochieCacheModel = (bjudzhetnoe_polnomochieCacheModel)obj;

		if (bjudzhetnoe_polnomochie_id == bjudzhetnoe_polnomochieCacheModel.bjudzhetnoe_polnomochie_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bjudzhetnoe_polnomochie_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{bjudzhetnoe_polnomochie_id=");
		sb.append(bjudzhetnoe_polnomochie_id);
		sb.append(", naimenovanie=");
		sb.append(naimenovanie);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public bjudzhetnoe_polnomochie toEntityModel() {
		bjudzhetnoe_polnomochieImpl bjudzhetnoe_polnomochieImpl = new bjudzhetnoe_polnomochieImpl();

		bjudzhetnoe_polnomochieImpl.setBjudzhetnoe_polnomochie_id(bjudzhetnoe_polnomochie_id);

		if (naimenovanie == null) {
			bjudzhetnoe_polnomochieImpl.setNaimenovanie(StringPool.BLANK);
		}
		else {
			bjudzhetnoe_polnomochieImpl.setNaimenovanie(naimenovanie);
		}

		bjudzhetnoe_polnomochieImpl.resetOriginalValues();

		return bjudzhetnoe_polnomochieImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bjudzhetnoe_polnomochie_id = objectInput.readLong();
		naimenovanie = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(bjudzhetnoe_polnomochie_id);

		if (naimenovanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naimenovanie);
		}
	}

	public long bjudzhetnoe_polnomochie_id;
	public String naimenovanie;
}