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

package tj.edinicy.izmerenija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.edinicy.izmerenija.model.edinicy_izmerenija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing edinicy_izmerenija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see edinicy_izmerenija
 * @generated
 */
@ProviderType
public class edinicy_izmerenijaCacheModel implements CacheModel<edinicy_izmerenija>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof edinicy_izmerenijaCacheModel)) {
			return false;
		}

		edinicy_izmerenijaCacheModel edinicy_izmerenijaCacheModel = (edinicy_izmerenijaCacheModel)obj;

		if (edinicy_izmerenija_id == edinicy_izmerenijaCacheModel.edinicy_izmerenija_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, edinicy_izmerenija_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{edinicy_izmerenija_id=");
		sb.append(edinicy_izmerenija_id);
		sb.append(", nazvanie=");
		sb.append(nazvanie);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public edinicy_izmerenija toEntityModel() {
		edinicy_izmerenijaImpl edinicy_izmerenijaImpl = new edinicy_izmerenijaImpl();

		edinicy_izmerenijaImpl.setEdinicy_izmerenija_id(edinicy_izmerenija_id);

		if (nazvanie == null) {
			edinicy_izmerenijaImpl.setNazvanie(StringPool.BLANK);
		}
		else {
			edinicy_izmerenijaImpl.setNazvanie(nazvanie);
		}

		edinicy_izmerenijaImpl.resetOriginalValues();

		return edinicy_izmerenijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		edinicy_izmerenija_id = objectInput.readLong();
		nazvanie = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(edinicy_izmerenija_id);

		if (nazvanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie);
		}
	}

	public long edinicy_izmerenija_id;
	public String nazvanie;
}