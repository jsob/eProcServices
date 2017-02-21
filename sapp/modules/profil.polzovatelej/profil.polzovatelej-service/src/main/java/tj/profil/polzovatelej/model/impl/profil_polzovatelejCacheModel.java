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

package tj.profil.polzovatelej.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.profil.polzovatelej.model.profil_polzovatelej;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing profil_polzovatelej in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see profil_polzovatelej
 * @generated
 */
@ProviderType
public class profil_polzovatelejCacheModel implements CacheModel<profil_polzovatelej>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof profil_polzovatelejCacheModel)) {
			return false;
		}

		profil_polzovatelejCacheModel profil_polzovatelejCacheModel = (profil_polzovatelejCacheModel)obj;

		if (profil_polzovatelej_id == profil_polzovatelejCacheModel.profil_polzovatelej_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, profil_polzovatelej_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", inicialy=");
		sb.append(inicialy);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", je_pochta=");
		sb.append(je_pochta);
		sb.append(", kontaktnyj_telefon=");
		sb.append(kontaktnyj_telefon);
		sb.append(", polzovatel_id=");
		sb.append(polzovatel_id);
		sb.append(", profil_polzovatelej_id=");
		sb.append(profil_polzovatelej_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public profil_polzovatelej toEntityModel() {
		profil_polzovatelejImpl profil_polzovatelejImpl = new profil_polzovatelejImpl();

		if (data_izmenenija == Long.MIN_VALUE) {
			profil_polzovatelejImpl.setData_izmenenija(null);
		}
		else {
			profil_polzovatelejImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			profil_polzovatelejImpl.setData_sozdanija(null);
		}
		else {
			profil_polzovatelejImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		if (inicialy == null) {
			profil_polzovatelejImpl.setInicialy(StringPool.BLANK);
		}
		else {
			profil_polzovatelejImpl.setInicialy(inicialy);
		}

		profil_polzovatelejImpl.setIzmenil(izmenil);

		if (je_pochta == null) {
			profil_polzovatelejImpl.setJe_pochta(StringPool.BLANK);
		}
		else {
			profil_polzovatelejImpl.setJe_pochta(je_pochta);
		}

		if (kontaktnyj_telefon == null) {
			profil_polzovatelejImpl.setKontaktnyj_telefon(StringPool.BLANK);
		}
		else {
			profil_polzovatelejImpl.setKontaktnyj_telefon(kontaktnyj_telefon);
		}

		profil_polzovatelejImpl.setPolzovatel_id(polzovatel_id);
		profil_polzovatelejImpl.setProfil_polzovatelej_id(profil_polzovatelej_id);
		profil_polzovatelejImpl.setSozdal(sozdal);

		profil_polzovatelejImpl.resetOriginalValues();

		return profil_polzovatelejImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();
		inicialy = objectInput.readUTF();

		izmenil = objectInput.readLong();
		je_pochta = objectInput.readUTF();
		kontaktnyj_telefon = objectInput.readUTF();

		polzovatel_id = objectInput.readLong();

		profil_polzovatelej_id = objectInput.readLong();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		if (inicialy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inicialy);
		}

		objectOutput.writeLong(izmenil);

		if (je_pochta == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(je_pochta);
		}

		if (kontaktnyj_telefon == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kontaktnyj_telefon);
		}

		objectOutput.writeLong(polzovatel_id);

		objectOutput.writeLong(profil_polzovatelej_id);

		objectOutput.writeLong(sozdal);
	}

	public long data_izmenenija;
	public long data_sozdanija;
	public String inicialy;
	public long izmenil;
	public String je_pochta;
	public String kontaktnyj_telefon;
	public long polzovatel_id;
	public long profil_polzovatelej_id;
	public long sozdal;
}