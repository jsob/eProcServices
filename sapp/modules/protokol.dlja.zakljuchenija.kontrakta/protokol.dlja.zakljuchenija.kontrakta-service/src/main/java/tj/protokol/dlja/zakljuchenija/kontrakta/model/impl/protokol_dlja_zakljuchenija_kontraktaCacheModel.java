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

package tj.protokol.dlja.zakljuchenija.kontrakta.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing protokol_dlja_zakljuchenija_kontrakta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_dlja_zakljuchenija_kontrakta
 * @generated
 */
@ProviderType
public class protokol_dlja_zakljuchenija_kontraktaCacheModel
	implements CacheModel<protokol_dlja_zakljuchenija_kontrakta>,
		Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof protokol_dlja_zakljuchenija_kontraktaCacheModel)) {
			return false;
		}

		protokol_dlja_zakljuchenija_kontraktaCacheModel protokol_dlja_zakljuchenija_kontraktaCacheModel =
			(protokol_dlja_zakljuchenija_kontraktaCacheModel)obj;

		if (protokol_dlja_zakljuchenija_kontrakta_id == protokol_dlja_zakljuchenija_kontraktaCacheModel.protokol_dlja_zakljuchenija_kontrakta_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, protokol_dlja_zakljuchenija_kontrakta_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{data_generacii=");
		sb.append(data_generacii);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", protokol_dlja_zakljuchenija_kontrakta_id=");
		sb.append(protokol_dlja_zakljuchenija_kontrakta_id);
		sb.append(", sgeneriroval=");
		sb.append(sgeneriroval);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public protokol_dlja_zakljuchenija_kontrakta toEntityModel() {
		protokol_dlja_zakljuchenija_kontraktaImpl protokol_dlja_zakljuchenija_kontraktaImpl =
			new protokol_dlja_zakljuchenija_kontraktaImpl();

		if (data_generacii == Long.MIN_VALUE) {
			protokol_dlja_zakljuchenija_kontraktaImpl.setData_generacii(null);
		}
		else {
			protokol_dlja_zakljuchenija_kontraktaImpl.setData_generacii(new Date(
					data_generacii));
		}

		protokol_dlja_zakljuchenija_kontraktaImpl.setIzvewenie_id(izvewenie_id);
		protokol_dlja_zakljuchenija_kontraktaImpl.setProtokol_dlja_zakljuchenija_kontrakta_id(protokol_dlja_zakljuchenija_kontrakta_id);
		protokol_dlja_zakljuchenija_kontraktaImpl.setSgeneriroval(sgeneriroval);

		protokol_dlja_zakljuchenija_kontraktaImpl.resetOriginalValues();

		return protokol_dlja_zakljuchenija_kontraktaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_generacii = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		protokol_dlja_zakljuchenija_kontrakta_id = objectInput.readLong();

		sgeneriroval = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_generacii);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(protokol_dlja_zakljuchenija_kontrakta_id);

		objectOutput.writeLong(sgeneriroval);
	}

	public long data_generacii;
	public long izvewenie_id;
	public long protokol_dlja_zakljuchenija_kontrakta_id;
	public long sgeneriroval;
}