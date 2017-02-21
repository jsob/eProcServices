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

package tj.godovoj.plan.zakupok.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.godovoj.plan.zakupok.model.godovoj_plan_zakupok;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing godovoj_plan_zakupok in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see godovoj_plan_zakupok
 * @generated
 */
@ProviderType
public class godovoj_plan_zakupokCacheModel implements CacheModel<godovoj_plan_zakupok>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof godovoj_plan_zakupokCacheModel)) {
			return false;
		}

		godovoj_plan_zakupokCacheModel godovoj_plan_zakupokCacheModel = (godovoj_plan_zakupokCacheModel)obj;

		if (godovoj_plan_zakupok_id == godovoj_plan_zakupokCacheModel.godovoj_plan_zakupok_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, godovoj_plan_zakupok_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", godovoj_plan_zakupok_id=");
		sb.append(godovoj_plan_zakupok_id);
		sb.append(", istochnik_finansirovanija_id=");
		sb.append(istochnik_finansirovanija_id);
		sb.append(", naimenovanie_predmeta_zakupki=");
		sb.append(naimenovanie_predmeta_zakupki);
		sb.append(", planiruemyj_metod_zakupki_id=");
		sb.append(planiruemyj_metod_zakupki_id);
		sb.append(", predpolagaemaja_summa=");
		sb.append(predpolagaemaja_summa);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", sroki_provedenija_zakupki=");
		sb.append(sroki_provedenija_zakupki);
		sb.append(", summa_finansirovanija=");
		sb.append(summa_finansirovanija);
		sb.append(", vbk_id=");
		sb.append(vbk_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public godovoj_plan_zakupok toEntityModel() {
		godovoj_plan_zakupokImpl godovoj_plan_zakupokImpl = new godovoj_plan_zakupokImpl();

		if (data_sozdanija == Long.MIN_VALUE) {
			godovoj_plan_zakupokImpl.setData_sozdanija(null);
		}
		else {
			godovoj_plan_zakupokImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		godovoj_plan_zakupokImpl.setGodovoj_plan_zakupok_id(godovoj_plan_zakupok_id);
		godovoj_plan_zakupokImpl.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);

		if (naimenovanie_predmeta_zakupki == null) {
			godovoj_plan_zakupokImpl.setNaimenovanie_predmeta_zakupki(StringPool.BLANK);
		}
		else {
			godovoj_plan_zakupokImpl.setNaimenovanie_predmeta_zakupki(naimenovanie_predmeta_zakupki);
		}

		godovoj_plan_zakupokImpl.setPlaniruemyj_metod_zakupki_id(planiruemyj_metod_zakupki_id);
		godovoj_plan_zakupokImpl.setPredpolagaemaja_summa(predpolagaemaja_summa);
		godovoj_plan_zakupokImpl.setSozdal(sozdal);

		if (sroki_provedenija_zakupki == null) {
			godovoj_plan_zakupokImpl.setSroki_provedenija_zakupki(StringPool.BLANK);
		}
		else {
			godovoj_plan_zakupokImpl.setSroki_provedenija_zakupki(sroki_provedenija_zakupki);
		}

		godovoj_plan_zakupokImpl.setSumma_finansirovanija(summa_finansirovanija);
		godovoj_plan_zakupokImpl.setVbk_id(vbk_id);

		godovoj_plan_zakupokImpl.resetOriginalValues();

		return godovoj_plan_zakupokImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_sozdanija = objectInput.readLong();

		godovoj_plan_zakupok_id = objectInput.readLong();

		istochnik_finansirovanija_id = objectInput.readLong();
		naimenovanie_predmeta_zakupki = objectInput.readUTF();

		planiruemyj_metod_zakupki_id = objectInput.readLong();

		predpolagaemaja_summa = objectInput.readDouble();

		sozdal = objectInput.readLong();
		sroki_provedenija_zakupki = objectInput.readUTF();

		summa_finansirovanija = objectInput.readDouble();

		vbk_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(godovoj_plan_zakupok_id);

		objectOutput.writeLong(istochnik_finansirovanija_id);

		if (naimenovanie_predmeta_zakupki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naimenovanie_predmeta_zakupki);
		}

		objectOutput.writeLong(planiruemyj_metod_zakupki_id);

		objectOutput.writeDouble(predpolagaemaja_summa);

		objectOutput.writeLong(sozdal);

		if (sroki_provedenija_zakupki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sroki_provedenija_zakupki);
		}

		objectOutput.writeDouble(summa_finansirovanija);

		objectOutput.writeLong(vbk_id);
	}

	public long data_sozdanija;
	public long godovoj_plan_zakupok_id;
	public long istochnik_finansirovanija_id;
	public String naimenovanie_predmeta_zakupki;
	public long planiruemyj_metod_zakupki_id;
	public double predpolagaemaja_summa;
	public long sozdal;
	public String sroki_provedenija_zakupki;
	public double summa_finansirovanija;
	public long vbk_id;
}