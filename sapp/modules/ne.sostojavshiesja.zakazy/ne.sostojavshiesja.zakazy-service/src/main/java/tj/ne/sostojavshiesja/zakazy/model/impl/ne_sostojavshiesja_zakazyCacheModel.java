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

package tj.ne.sostojavshiesja.zakazy.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ne_sostojavshiesja_zakazy in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ne_sostojavshiesja_zakazy
 * @generated
 */
@ProviderType
public class ne_sostojavshiesja_zakazyCacheModel implements CacheModel<ne_sostojavshiesja_zakazy>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ne_sostojavshiesja_zakazyCacheModel)) {
			return false;
		}

		ne_sostojavshiesja_zakazyCacheModel ne_sostojavshiesja_zakazyCacheModel = (ne_sostojavshiesja_zakazyCacheModel)obj;

		if (ne_sostojavshiesja_zakazy_id == ne_sostojavshiesja_zakazyCacheModel.ne_sostojavshiesja_zakazy_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ne_sostojavshiesja_zakazy_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", ne_sostojavshiesja_zakazy_id=");
		sb.append(ne_sostojavshiesja_zakazy_id);
		sb.append(", prichina=");
		sb.append(prichina);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ne_sostojavshiesja_zakazy toEntityModel() {
		ne_sostojavshiesja_zakazyImpl ne_sostojavshiesja_zakazyImpl = new ne_sostojavshiesja_zakazyImpl();

		if (data_sozdanija == Long.MIN_VALUE) {
			ne_sostojavshiesja_zakazyImpl.setData_sozdanija(null);
		}
		else {
			ne_sostojavshiesja_zakazyImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		ne_sostojavshiesja_zakazyImpl.setIzvewenie_id(izvewenie_id);
		ne_sostojavshiesja_zakazyImpl.setNe_sostojavshiesja_zakazy_id(ne_sostojavshiesja_zakazy_id);

		if (prichina == null) {
			ne_sostojavshiesja_zakazyImpl.setPrichina(StringPool.BLANK);
		}
		else {
			ne_sostojavshiesja_zakazyImpl.setPrichina(prichina);
		}

		ne_sostojavshiesja_zakazyImpl.setSozdal(sozdal);

		ne_sostojavshiesja_zakazyImpl.resetOriginalValues();

		return ne_sostojavshiesja_zakazyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_sozdanija = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		ne_sostojavshiesja_zakazy_id = objectInput.readLong();
		prichina = objectInput.readUTF();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(ne_sostojavshiesja_zakazy_id);

		if (prichina == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(prichina);
		}

		objectOutput.writeLong(sozdal);
	}

	public long data_sozdanija;
	public long izvewenie_id;
	public long ne_sostojavshiesja_zakazy_id;
	public String prichina;
	public long sozdal;
}