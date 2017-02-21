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

package tj.polzovateli.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.polzovateli.model.polzovateli;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing polzovateli in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see polzovateli
 * @generated
 */
@ProviderType
public class polzovateliCacheModel implements CacheModel<polzovateli>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof polzovateliCacheModel)) {
			return false;
		}

		polzovateliCacheModel polzovateliCacheModel = (polzovateliCacheModel)obj;

		if (polzovateli_id == polzovateliCacheModel.polzovateli_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, polzovateli_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{aktivnost=");
		sb.append(aktivnost);
		sb.append(", data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", imja_polzovatelja=");
		sb.append(imja_polzovatelja);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", organizacija_id=");
		sb.append(organizacija_id);
		sb.append(", parol=");
		sb.append(parol);
		sb.append(", podrazdelenije_id=");
		sb.append(podrazdelenije_id);
		sb.append(", polzovateli_id=");
		sb.append(polzovateli_id);
		sb.append(", rol_id=");
		sb.append(rol_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", tip_organizacii_id=");
		sb.append(tip_organizacii_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public polzovateli toEntityModel() {
		polzovateliImpl polzovateliImpl = new polzovateliImpl();

		polzovateliImpl.setAktivnost(aktivnost);

		if (data_izmenenija == Long.MIN_VALUE) {
			polzovateliImpl.setData_izmenenija(null);
		}
		else {
			polzovateliImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			polzovateliImpl.setData_sozdanija(null);
		}
		else {
			polzovateliImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		if (imja_polzovatelja == null) {
			polzovateliImpl.setImja_polzovatelja(StringPool.BLANK);
		}
		else {
			polzovateliImpl.setImja_polzovatelja(imja_polzovatelja);
		}

		polzovateliImpl.setIzmenil(izmenil);
		polzovateliImpl.setOrganizacija_id(organizacija_id);

		if (parol == null) {
			polzovateliImpl.setParol(StringPool.BLANK);
		}
		else {
			polzovateliImpl.setParol(parol);
		}

		polzovateliImpl.setPodrazdelenije_id(podrazdelenije_id);
		polzovateliImpl.setPolzovateli_id(polzovateli_id);
		polzovateliImpl.setRol_id(rol_id);
		polzovateliImpl.setSozdal(sozdal);
		polzovateliImpl.setTip_organizacii_id(tip_organizacii_id);

		polzovateliImpl.resetOriginalValues();

		return polzovateliImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		aktivnost = objectInput.readLong();
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();
		imja_polzovatelja = objectInput.readUTF();

		izmenil = objectInput.readLong();

		organizacija_id = objectInput.readLong();
		parol = objectInput.readUTF();

		podrazdelenije_id = objectInput.readLong();

		polzovateli_id = objectInput.readLong();

		rol_id = objectInput.readLong();

		sozdal = objectInput.readLong();

		tip_organizacii_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(aktivnost);
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		if (imja_polzovatelja == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imja_polzovatelja);
		}

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(organizacija_id);

		if (parol == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parol);
		}

		objectOutput.writeLong(podrazdelenije_id);

		objectOutput.writeLong(polzovateli_id);

		objectOutput.writeLong(rol_id);

		objectOutput.writeLong(sozdal);

		objectOutput.writeLong(tip_organizacii_id);
	}

	public long aktivnost;
	public long data_izmenenija;
	public long data_sozdanija;
	public String imja_polzovatelja;
	public long izmenil;
	public long organizacija_id;
	public String parol;
	public long podrazdelenije_id;
	public long polzovateli_id;
	public long rol_id;
	public long sozdal;
	public long tip_organizacii_id;
}