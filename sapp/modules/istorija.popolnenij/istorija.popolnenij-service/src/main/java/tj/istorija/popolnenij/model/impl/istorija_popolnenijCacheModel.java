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

package tj.istorija.popolnenij.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.istorija.popolnenij.model.istorija_popolnenij;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing istorija_popolnenij in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see istorija_popolnenij
 * @generated
 */
@ProviderType
public class istorija_popolnenijCacheModel implements CacheModel<istorija_popolnenij>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof istorija_popolnenijCacheModel)) {
			return false;
		}

		istorija_popolnenijCacheModel istorija_popolnenijCacheModel = (istorija_popolnenijCacheModel)obj;

		if (istorija_popolnenij_id == istorija_popolnenijCacheModel.istorija_popolnenij_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, istorija_popolnenij_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{data_zachislenija=");
		sb.append(data_zachislenija);
		sb.append(", istorija_popolnenij_id=");
		sb.append(istorija_popolnenij_id);
		sb.append(", nomer=");
		sb.append(nomer);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", put=");
		sb.append(put);
		sb.append(", summa=");
		sb.append(summa);
		sb.append(", tip=");
		sb.append(tip);
		sb.append(", tranzakcija=");
		sb.append(tranzakcija);
		sb.append(", zachislil=");
		sb.append(zachislil);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public istorija_popolnenij toEntityModel() {
		istorija_popolnenijImpl istorija_popolnenijImpl = new istorija_popolnenijImpl();

		if (data_zachislenija == Long.MIN_VALUE) {
			istorija_popolnenijImpl.setData_zachislenija(null);
		}
		else {
			istorija_popolnenijImpl.setData_zachislenija(new Date(
					data_zachislenija));
		}

		istorija_popolnenijImpl.setIstorija_popolnenij_id(istorija_popolnenij_id);

		if (nomer == null) {
			istorija_popolnenijImpl.setNomer(StringPool.BLANK);
		}
		else {
			istorija_popolnenijImpl.setNomer(nomer);
		}

		istorija_popolnenijImpl.setPostavwik_id(postavwik_id);

		if (put == null) {
			istorija_popolnenijImpl.setPut(StringPool.BLANK);
		}
		else {
			istorija_popolnenijImpl.setPut(put);
		}

		istorija_popolnenijImpl.setSumma(summa);

		if (tip == null) {
			istorija_popolnenijImpl.setTip(StringPool.BLANK);
		}
		else {
			istorija_popolnenijImpl.setTip(tip);
		}

		if (tranzakcija == null) {
			istorija_popolnenijImpl.setTranzakcija(StringPool.BLANK);
		}
		else {
			istorija_popolnenijImpl.setTranzakcija(tranzakcija);
		}

		istorija_popolnenijImpl.setZachislil(zachislil);

		istorija_popolnenijImpl.resetOriginalValues();

		return istorija_popolnenijImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_zachislenija = objectInput.readLong();

		istorija_popolnenij_id = objectInput.readLong();
		nomer = objectInput.readUTF();

		postavwik_id = objectInput.readLong();
		put = objectInput.readUTF();

		summa = objectInput.readDouble();
		tip = objectInput.readUTF();
		tranzakcija = objectInput.readUTF();

		zachislil = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_zachislenija);

		objectOutput.writeLong(istorija_popolnenij_id);

		if (nomer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nomer);
		}

		objectOutput.writeLong(postavwik_id);

		if (put == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(put);
		}

		objectOutput.writeDouble(summa);

		if (tip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tip);
		}

		if (tranzakcija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tranzakcija);
		}

		objectOutput.writeLong(zachislil);
	}

	public long data_zachislenija;
	public long istorija_popolnenij_id;
	public String nomer;
	public long postavwik_id;
	public String put;
	public double summa;
	public String tip;
	public String tranzakcija;
	public long zachislil;
}