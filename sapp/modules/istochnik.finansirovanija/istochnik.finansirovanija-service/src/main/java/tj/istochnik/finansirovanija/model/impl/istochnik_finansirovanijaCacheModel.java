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

package tj.istochnik.finansirovanija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.istochnik.finansirovanija.model.istochnik_finansirovanija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing istochnik_finansirovanija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see istochnik_finansirovanija
 * @generated
 */
@ProviderType
public class istochnik_finansirovanijaCacheModel implements CacheModel<istochnik_finansirovanija>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof istochnik_finansirovanijaCacheModel)) {
			return false;
		}

		istochnik_finansirovanijaCacheModel istochnik_finansirovanijaCacheModel = (istochnik_finansirovanijaCacheModel)obj;

		if (istochnik_finansirovanija_id == istochnik_finansirovanijaCacheModel.istochnik_finansirovanija_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, istochnik_finansirovanija_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{istochnik_finansirovanija_id=");
		sb.append(istochnik_finansirovanija_id);
		sb.append(", naimenovanie=");
		sb.append(naimenovanie);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public istochnik_finansirovanija toEntityModel() {
		istochnik_finansirovanijaImpl istochnik_finansirovanijaImpl = new istochnik_finansirovanijaImpl();

		istochnik_finansirovanijaImpl.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);

		if (naimenovanie == null) {
			istochnik_finansirovanijaImpl.setNaimenovanie(StringPool.BLANK);
		}
		else {
			istochnik_finansirovanijaImpl.setNaimenovanie(naimenovanie);
		}

		istochnik_finansirovanijaImpl.resetOriginalValues();

		return istochnik_finansirovanijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		istochnik_finansirovanija_id = objectInput.readLong();
		naimenovanie = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(istochnik_finansirovanija_id);

		if (naimenovanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naimenovanie);
		}
	}

	public long istochnik_finansirovanija_id;
	public String naimenovanie;
}