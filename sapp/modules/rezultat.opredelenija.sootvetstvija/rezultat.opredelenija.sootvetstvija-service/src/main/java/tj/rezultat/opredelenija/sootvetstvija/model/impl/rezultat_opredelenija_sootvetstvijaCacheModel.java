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

package tj.rezultat.opredelenija.sootvetstvija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing rezultat_opredelenija_sootvetstvija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_opredelenija_sootvetstvija
 * @generated
 */
@ProviderType
public class rezultat_opredelenija_sootvetstvijaCacheModel implements CacheModel<rezultat_opredelenija_sootvetstvija>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof rezultat_opredelenija_sootvetstvijaCacheModel)) {
			return false;
		}

		rezultat_opredelenija_sootvetstvijaCacheModel rezultat_opredelenija_sootvetstvijaCacheModel =
			(rezultat_opredelenija_sootvetstvijaCacheModel)obj;

		if (rezultat_opredelenija_sootvetstvija_id == rezultat_opredelenija_sootvetstvijaCacheModel.rezultat_opredelenija_sootvetstvija_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, rezultat_opredelenija_sootvetstvija_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", rezultat_opredelenija_sootvetstvija_id=");
		sb.append(rezultat_opredelenija_sootvetstvija_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public rezultat_opredelenija_sootvetstvija toEntityModel() {
		rezultat_opredelenija_sootvetstvijaImpl rezultat_opredelenija_sootvetstvijaImpl =
			new rezultat_opredelenija_sootvetstvijaImpl();

		if (data_sozdanija == Long.MIN_VALUE) {
			rezultat_opredelenija_sootvetstvijaImpl.setData_sozdanija(null);
		}
		else {
			rezultat_opredelenija_sootvetstvijaImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		rezultat_opredelenija_sootvetstvijaImpl.setIzvewenie_id(izvewenie_id);
		rezultat_opredelenija_sootvetstvijaImpl.setRezultat_opredelenija_sootvetstvija_id(rezultat_opredelenija_sootvetstvija_id);
		rezultat_opredelenija_sootvetstvijaImpl.setSozdal(sozdal);

		rezultat_opredelenija_sootvetstvijaImpl.resetOriginalValues();

		return rezultat_opredelenija_sootvetstvijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_sozdanija = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		rezultat_opredelenija_sootvetstvija_id = objectInput.readLong();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(rezultat_opredelenija_sootvetstvija_id);

		objectOutput.writeLong(sozdal);
	}

	public long data_sozdanija;
	public long izvewenie_id;
	public long rezultat_opredelenija_sootvetstvija_id;
	public long sozdal;
}