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

package tj.dostup.po.podrazdelenijam.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing dostup_po_podrazdelenijam in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see dostup_po_podrazdelenijam
 * @generated
 */
@ProviderType
public class dostup_po_podrazdelenijamCacheModel implements CacheModel<dostup_po_podrazdelenijam>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof dostup_po_podrazdelenijamCacheModel)) {
			return false;
		}

		dostup_po_podrazdelenijamCacheModel dostup_po_podrazdelenijamCacheModel = (dostup_po_podrazdelenijamCacheModel)obj;

		if (dostup_po_podrazdelenijam_id == dostup_po_podrazdelenijamCacheModel.dostup_po_podrazdelenijam_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dostup_po_podrazdelenijam_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", dostup_po_podrazdelenijam_id=");
		sb.append(dostup_po_podrazdelenijam_id);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", podrazdelenija_id=");
		sb.append(podrazdelenija_id);
		sb.append(", polzovateli_id=");
		sb.append(polzovateli_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public dostup_po_podrazdelenijam toEntityModel() {
		dostup_po_podrazdelenijamImpl dostup_po_podrazdelenijamImpl = new dostup_po_podrazdelenijamImpl();

		if (data_izmenenija == Long.MIN_VALUE) {
			dostup_po_podrazdelenijamImpl.setData_izmenenija(null);
		}
		else {
			dostup_po_podrazdelenijamImpl.setData_izmenenija(new Date(
					data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			dostup_po_podrazdelenijamImpl.setData_sozdanija(null);
		}
		else {
			dostup_po_podrazdelenijamImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		dostup_po_podrazdelenijamImpl.setDostup_po_podrazdelenijam_id(dostup_po_podrazdelenijam_id);
		dostup_po_podrazdelenijamImpl.setIzmenil(izmenil);
		dostup_po_podrazdelenijamImpl.setPodrazdelenija_id(podrazdelenija_id);
		dostup_po_podrazdelenijamImpl.setPolzovateli_id(polzovateli_id);
		dostup_po_podrazdelenijamImpl.setSozdal(sozdal);

		dostup_po_podrazdelenijamImpl.resetOriginalValues();

		return dostup_po_podrazdelenijamImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		dostup_po_podrazdelenijam_id = objectInput.readLong();

		izmenil = objectInput.readLong();

		podrazdelenija_id = objectInput.readLong();

		polzovateli_id = objectInput.readLong();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(dostup_po_podrazdelenijam_id);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(podrazdelenija_id);

		objectOutput.writeLong(polzovateli_id);

		objectOutput.writeLong(sozdal);
	}

	public long data_izmenenija;
	public long data_sozdanija;
	public long dostup_po_podrazdelenijam_id;
	public long izmenil;
	public long podrazdelenija_id;
	public long polzovateli_id;
	public long sozdal;
}