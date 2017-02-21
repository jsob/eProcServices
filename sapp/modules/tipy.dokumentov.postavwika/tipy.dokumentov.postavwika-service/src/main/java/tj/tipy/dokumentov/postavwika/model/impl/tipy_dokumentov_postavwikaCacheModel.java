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

package tj.tipy.dokumentov.postavwika.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing tipy_dokumentov_postavwika in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see tipy_dokumentov_postavwika
 * @generated
 */
@ProviderType
public class tipy_dokumentov_postavwikaCacheModel implements CacheModel<tipy_dokumentov_postavwika>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof tipy_dokumentov_postavwikaCacheModel)) {
			return false;
		}

		tipy_dokumentov_postavwikaCacheModel tipy_dokumentov_postavwikaCacheModel =
			(tipy_dokumentov_postavwikaCacheModel)obj;

		if (tipy_dokumentov_postavwika_id == tipy_dokumentov_postavwikaCacheModel.tipy_dokumentov_postavwika_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tipy_dokumentov_postavwika_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{tip=");
		sb.append(tip);
		sb.append(", tipy_dokumentov_postavwika_id=");
		sb.append(tipy_dokumentov_postavwika_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public tipy_dokumentov_postavwika toEntityModel() {
		tipy_dokumentov_postavwikaImpl tipy_dokumentov_postavwikaImpl = new tipy_dokumentov_postavwikaImpl();

		if (tip == null) {
			tipy_dokumentov_postavwikaImpl.setTip(StringPool.BLANK);
		}
		else {
			tipy_dokumentov_postavwikaImpl.setTip(tip);
		}

		tipy_dokumentov_postavwikaImpl.setTipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika_id);

		tipy_dokumentov_postavwikaImpl.resetOriginalValues();

		return tipy_dokumentov_postavwikaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tip = objectInput.readUTF();

		tipy_dokumentov_postavwika_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (tip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tip);
		}

		objectOutput.writeLong(tipy_dokumentov_postavwika_id);
	}

	public String tip;
	public long tipy_dokumentov_postavwika_id;
}