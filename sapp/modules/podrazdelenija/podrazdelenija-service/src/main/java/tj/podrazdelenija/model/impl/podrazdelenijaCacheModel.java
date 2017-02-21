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

package tj.podrazdelenija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.podrazdelenija.model.podrazdelenija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing podrazdelenija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see podrazdelenija
 * @generated
 */
@ProviderType
public class podrazdelenijaCacheModel implements CacheModel<podrazdelenija>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof podrazdelenijaCacheModel)) {
			return false;
		}

		podrazdelenijaCacheModel podrazdelenijaCacheModel = (podrazdelenijaCacheModel)obj;

		if (podrazdelenija_id == podrazdelenijaCacheModel.podrazdelenija_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, podrazdelenija_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", organizacija_id=");
		sb.append(organizacija_id);
		sb.append(", podrazdelenie=");
		sb.append(podrazdelenie);
		sb.append(", podrazdelenija_id=");
		sb.append(podrazdelenija_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public podrazdelenija toEntityModel() {
		podrazdelenijaImpl podrazdelenijaImpl = new podrazdelenijaImpl();

		if (data_izmenenija == Long.MIN_VALUE) {
			podrazdelenijaImpl.setData_izmenenija(null);
		}
		else {
			podrazdelenijaImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			podrazdelenijaImpl.setData_sozdanija(null);
		}
		else {
			podrazdelenijaImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		podrazdelenijaImpl.setIzmenil(izmenil);
		podrazdelenijaImpl.setOrganizacija_id(organizacija_id);

		if (podrazdelenie == null) {
			podrazdelenijaImpl.setPodrazdelenie(StringPool.BLANK);
		}
		else {
			podrazdelenijaImpl.setPodrazdelenie(podrazdelenie);
		}

		podrazdelenijaImpl.setPodrazdelenija_id(podrazdelenija_id);
		podrazdelenijaImpl.setSozdal(sozdal);

		podrazdelenijaImpl.resetOriginalValues();

		return podrazdelenijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		izmenil = objectInput.readLong();

		organizacija_id = objectInput.readLong();
		podrazdelenie = objectInput.readUTF();

		podrazdelenija_id = objectInput.readLong();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(organizacija_id);

		if (podrazdelenie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(podrazdelenie);
		}

		objectOutput.writeLong(podrazdelenija_id);

		objectOutput.writeLong(sozdal);
	}

	public long data_izmenenija;
	public long data_sozdanija;
	public long izmenil;
	public long organizacija_id;
	public String podrazdelenie;
	public long podrazdelenija_id;
	public long sozdal;
}