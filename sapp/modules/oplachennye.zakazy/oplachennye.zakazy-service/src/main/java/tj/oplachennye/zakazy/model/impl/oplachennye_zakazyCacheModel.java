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

package tj.oplachennye.zakazy.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.oplachennye.zakazy.model.oplachennye_zakazy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing oplachennye_zakazy in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see oplachennye_zakazy
 * @generated
 */
@ProviderType
public class oplachennye_zakazyCacheModel implements CacheModel<oplachennye_zakazy>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof oplachennye_zakazyCacheModel)) {
			return false;
		}

		oplachennye_zakazyCacheModel oplachennye_zakazyCacheModel = (oplachennye_zakazyCacheModel)obj;

		if (oplachennye_zakazy_id == oplachennye_zakazyCacheModel.oplachennye_zakazy_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, oplachennye_zakazy_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{data_oplaty=");
		sb.append(data_oplaty);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", oplachennye_zakazy_id=");
		sb.append(oplachennye_zakazy_id);
		sb.append(", oplatil=");
		sb.append(oplatil);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", summa=");
		sb.append(summa);
		sb.append(", tranzakcija=");
		sb.append(tranzakcija);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public oplachennye_zakazy toEntityModel() {
		oplachennye_zakazyImpl oplachennye_zakazyImpl = new oplachennye_zakazyImpl();

		if (data_oplaty == Long.MIN_VALUE) {
			oplachennye_zakazyImpl.setData_oplaty(null);
		}
		else {
			oplachennye_zakazyImpl.setData_oplaty(new Date(data_oplaty));
		}

		oplachennye_zakazyImpl.setIzvewenie_id(izvewenie_id);
		oplachennye_zakazyImpl.setOplachennye_zakazy_id(oplachennye_zakazy_id);
		oplachennye_zakazyImpl.setOplatil(oplatil);
		oplachennye_zakazyImpl.setPostavwik_id(postavwik_id);
		oplachennye_zakazyImpl.setSumma(summa);

		if (tranzakcija == null) {
			oplachennye_zakazyImpl.setTranzakcija(StringPool.BLANK);
		}
		else {
			oplachennye_zakazyImpl.setTranzakcija(tranzakcija);
		}

		oplachennye_zakazyImpl.resetOriginalValues();

		return oplachennye_zakazyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_oplaty = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		oplachennye_zakazy_id = objectInput.readLong();

		oplatil = objectInput.readLong();

		postavwik_id = objectInput.readLong();

		summa = objectInput.readDouble();
		tranzakcija = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_oplaty);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(oplachennye_zakazy_id);

		objectOutput.writeLong(oplatil);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeDouble(summa);

		if (tranzakcija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tranzakcija);
		}
	}

	public long data_oplaty;
	public long izvewenie_id;
	public long oplachennye_zakazy_id;
	public long oplatil;
	public long postavwik_id;
	public double summa;
	public String tranzakcija;
}