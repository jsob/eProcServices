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

package tj.rajony.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.rajony.model.rajony;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing rajony in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see rajony
 * @generated
 */
@ProviderType
public class rajonyCacheModel implements CacheModel<rajony>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof rajonyCacheModel)) {
			return false;
		}

		rajonyCacheModel rajonyCacheModel = (rajonyCacheModel)obj;

		if (rajony_id == rajonyCacheModel.rajony_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, rajony_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{kod_vbk=");
		sb.append(kod_vbk);
		sb.append(", nazvanie=");
		sb.append(nazvanie);
		sb.append(", oblast_id=");
		sb.append(oblast_id);
		sb.append(", rajony_id=");
		sb.append(rajony_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public rajony toEntityModel() {
		rajonyImpl rajonyImpl = new rajonyImpl();

		rajonyImpl.setKod_vbk(kod_vbk);

		if (nazvanie == null) {
			rajonyImpl.setNazvanie(StringPool.BLANK);
		}
		else {
			rajonyImpl.setNazvanie(nazvanie);
		}

		rajonyImpl.setOblast_id(oblast_id);
		rajonyImpl.setRajony_id(rajony_id);

		rajonyImpl.resetOriginalValues();

		return rajonyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		kod_vbk = objectInput.readLong();
		nazvanie = objectInput.readUTF();

		oblast_id = objectInput.readLong();

		rajony_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(kod_vbk);

		if (nazvanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie);
		}

		objectOutput.writeLong(oblast_id);

		objectOutput.writeLong(rajony_id);
	}

	public long kod_vbk;
	public String nazvanie;
	public long oblast_id;
	public long rajony_id;
}