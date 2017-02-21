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

package tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ocenka_uchastnikam_v_moment_vskrytija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ocenka_uchastnikam_v_moment_vskrytija
 * @generated
 */
@ProviderType
public class ocenka_uchastnikam_v_moment_vskrytijaCacheModel
	implements CacheModel<ocenka_uchastnikam_v_moment_vskrytija>,
		Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ocenka_uchastnikam_v_moment_vskrytijaCacheModel)) {
			return false;
		}

		ocenka_uchastnikam_v_moment_vskrytijaCacheModel ocenka_uchastnikam_v_moment_vskrytijaCacheModel =
			(ocenka_uchastnikam_v_moment_vskrytijaCacheModel)obj;

		if (ocenka_uchastnikam_v_moment_vskrytija_id == ocenka_uchastnikam_v_moment_vskrytijaCacheModel.ocenka_uchastnikam_v_moment_vskrytija_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ocenka_uchastnikam_v_moment_vskrytija_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{data_otkaza=");
		sb.append(data_otkaza);
		sb.append(", data_vskrytija=");
		sb.append(data_vskrytija);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", ocenka_uchastnikam_v_moment_vskrytija_id=");
		sb.append(ocenka_uchastnikam_v_moment_vskrytija_id);
		sb.append(", otkazal=");
		sb.append(otkazal);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", prichina_otkaza=");
		sb.append(prichina_otkaza);
		sb.append(", protokol_vskrytija_id=");
		sb.append(protokol_vskrytija_id);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ocenka_uchastnikam_v_moment_vskrytija toEntityModel() {
		ocenka_uchastnikam_v_moment_vskrytijaImpl ocenka_uchastnikam_v_moment_vskrytijaImpl =
			new ocenka_uchastnikam_v_moment_vskrytijaImpl();

		if (data_otkaza == Long.MIN_VALUE) {
			ocenka_uchastnikam_v_moment_vskrytijaImpl.setData_otkaza(null);
		}
		else {
			ocenka_uchastnikam_v_moment_vskrytijaImpl.setData_otkaza(new Date(
					data_otkaza));
		}

		if (data_vskrytija == Long.MIN_VALUE) {
			ocenka_uchastnikam_v_moment_vskrytijaImpl.setData_vskrytija(null);
		}
		else {
			ocenka_uchastnikam_v_moment_vskrytijaImpl.setData_vskrytija(new Date(
					data_vskrytija));
		}

		ocenka_uchastnikam_v_moment_vskrytijaImpl.setIzvewenie_id(izvewenie_id);
		ocenka_uchastnikam_v_moment_vskrytijaImpl.setLot_id(lot_id);
		ocenka_uchastnikam_v_moment_vskrytijaImpl.setOcenka_uchastnikam_v_moment_vskrytija_id(ocenka_uchastnikam_v_moment_vskrytija_id);
		ocenka_uchastnikam_v_moment_vskrytijaImpl.setOtkazal(otkazal);
		ocenka_uchastnikam_v_moment_vskrytijaImpl.setPostavwik_id(postavwik_id);

		if (prichina_otkaza == null) {
			ocenka_uchastnikam_v_moment_vskrytijaImpl.setPrichina_otkaza(StringPool.BLANK);
		}
		else {
			ocenka_uchastnikam_v_moment_vskrytijaImpl.setPrichina_otkaza(prichina_otkaza);
		}

		ocenka_uchastnikam_v_moment_vskrytijaImpl.setProtokol_vskrytija_id(protokol_vskrytija_id);
		ocenka_uchastnikam_v_moment_vskrytijaImpl.setStatus(status);

		ocenka_uchastnikam_v_moment_vskrytijaImpl.resetOriginalValues();

		return ocenka_uchastnikam_v_moment_vskrytijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_otkaza = objectInput.readLong();
		data_vskrytija = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		lot_id = objectInput.readLong();

		ocenka_uchastnikam_v_moment_vskrytija_id = objectInput.readLong();

		otkazal = objectInput.readLong();

		postavwik_id = objectInput.readLong();
		prichina_otkaza = objectInput.readUTF();

		protokol_vskrytija_id = objectInput.readLong();

		status = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_otkaza);
		objectOutput.writeLong(data_vskrytija);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(lot_id);

		objectOutput.writeLong(ocenka_uchastnikam_v_moment_vskrytija_id);

		objectOutput.writeLong(otkazal);

		objectOutput.writeLong(postavwik_id);

		if (prichina_otkaza == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(prichina_otkaza);
		}

		objectOutput.writeLong(protokol_vskrytija_id);

		objectOutput.writeLong(status);
	}

	public long data_otkaza;
	public long data_vskrytija;
	public long izvewenie_id;
	public long lot_id;
	public long ocenka_uchastnikam_v_moment_vskrytija_id;
	public long otkazal;
	public long postavwik_id;
	public String prichina_otkaza;
	public long protokol_vskrytija_id;
	public long status;
}