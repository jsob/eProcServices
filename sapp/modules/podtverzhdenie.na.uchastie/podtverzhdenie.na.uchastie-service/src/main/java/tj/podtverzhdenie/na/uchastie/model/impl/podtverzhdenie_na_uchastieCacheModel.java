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

package tj.podtverzhdenie.na.uchastie.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing podtverzhdenie_na_uchastie in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_na_uchastie
 * @generated
 */
@ProviderType
public class podtverzhdenie_na_uchastieCacheModel implements CacheModel<podtverzhdenie_na_uchastie>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof podtverzhdenie_na_uchastieCacheModel)) {
			return false;
		}

		podtverzhdenie_na_uchastieCacheModel podtverzhdenie_na_uchastieCacheModel =
			(podtverzhdenie_na_uchastieCacheModel)obj;

		if (podtverzhdenie_na_uchastie_id == podtverzhdenie_na_uchastieCacheModel.podtverzhdenie_na_uchastie_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, podtverzhdenie_na_uchastie_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", podtverzhdenie_na_uchastie_id=");
		sb.append(podtverzhdenie_na_uchastie_id);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public podtverzhdenie_na_uchastie toEntityModel() {
		podtverzhdenie_na_uchastieImpl podtverzhdenie_na_uchastieImpl = new podtverzhdenie_na_uchastieImpl();

		if (data_sozdanija == Long.MIN_VALUE) {
			podtverzhdenie_na_uchastieImpl.setData_sozdanija(null);
		}
		else {
			podtverzhdenie_na_uchastieImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		podtverzhdenie_na_uchastieImpl.setIzvewenie_id(izvewenie_id);
		podtverzhdenie_na_uchastieImpl.setLot_id(lot_id);
		podtverzhdenie_na_uchastieImpl.setPodtverzhdenie_na_uchastie_id(podtverzhdenie_na_uchastie_id);
		podtverzhdenie_na_uchastieImpl.setPostavwik_id(postavwik_id);
		podtverzhdenie_na_uchastieImpl.setSozdal(sozdal);

		podtverzhdenie_na_uchastieImpl.resetOriginalValues();

		return podtverzhdenie_na_uchastieImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_sozdanija = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		lot_id = objectInput.readLong();

		podtverzhdenie_na_uchastie_id = objectInput.readLong();

		postavwik_id = objectInput.readLong();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(lot_id);

		objectOutput.writeLong(podtverzhdenie_na_uchastie_id);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeLong(sozdal);
	}

	public long data_sozdanija;
	public long izvewenie_id;
	public long lot_id;
	public long podtverzhdenie_na_uchastie_id;
	public long postavwik_id;
	public long sozdal;
}