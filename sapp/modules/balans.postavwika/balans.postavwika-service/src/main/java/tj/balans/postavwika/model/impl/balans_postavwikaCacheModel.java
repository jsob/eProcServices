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

package tj.balans.postavwika.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.balans.postavwika.model.balans_postavwika;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing balans_postavwika in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see balans_postavwika
 * @generated
 */
@ProviderType
public class balans_postavwikaCacheModel implements CacheModel<balans_postavwika>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof balans_postavwikaCacheModel)) {
			return false;
		}

		balans_postavwikaCacheModel balans_postavwikaCacheModel = (balans_postavwikaCacheModel)obj;

		if (balans_postavwika_id == balans_postavwikaCacheModel.balans_postavwika_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, balans_postavwika_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{balans_postavwika_id=");
		sb.append(balans_postavwika_id);
		sb.append(", balans=");
		sb.append(balans);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public balans_postavwika toEntityModel() {
		balans_postavwikaImpl balans_postavwikaImpl = new balans_postavwikaImpl();

		balans_postavwikaImpl.setBalans_postavwika_id(balans_postavwika_id);
		balans_postavwikaImpl.setBalans(balans);
		balans_postavwikaImpl.setPostavwik_id(postavwik_id);

		balans_postavwikaImpl.resetOriginalValues();

		return balans_postavwikaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		balans_postavwika_id = objectInput.readLong();

		balans = objectInput.readDouble();

		postavwik_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(balans_postavwika_id);

		objectOutput.writeDouble(balans);

		objectOutput.writeLong(postavwik_id);
	}

	public long balans_postavwika_id;
	public double balans;
	public long postavwik_id;
}