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

package tj.zakazchiki.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.zakazchiki.model.zakazchiki;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing zakazchiki in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see zakazchiki
 * @generated
 */
@ProviderType
public class zakazchikiCacheModel implements CacheModel<zakazchiki>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof zakazchikiCacheModel)) {
			return false;
		}

		zakazchikiCacheModel zakazchikiCacheModel = (zakazchikiCacheModel)obj;

		if (zakazchiki_id == zakazchikiCacheModel.zakazchiki_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, zakazchiki_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{adres=");
		sb.append(adres);
		sb.append(", data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", ein=");
		sb.append(ein);
		sb.append(", fbk_id=");
		sb.append(fbk_id);
		sb.append(", gorod=");
		sb.append(gorod);
		sb.append(", inn=");
		sb.append(inn);
		sb.append(", istochnik_finansirovanija_id=");
		sb.append(istochnik_finansirovanija_id);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", je_pochta=");
		sb.append(je_pochta);
		sb.append(", kontaktnyj_telefon=");
		sb.append(kontaktnyj_telefon);
		sb.append(", kvalificirovannaja_organizacija=");
		sb.append(kvalificirovannaja_organizacija);
		sb.append(", naimenovanie=");
		sb.append(naimenovanie);
		sb.append(", oblast_id=");
		sb.append(oblast_id);
		sb.append(", otvetstvennoe_lico=");
		sb.append(otvetstvennoe_lico);
		sb.append(", rajon_id=");
		sb.append(rajon_id);
		sb.append(", rukovoditel=");
		sb.append(rukovoditel);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", vbk_id=");
		sb.append(vbk_id);
		sb.append(", zakazchiki_id=");
		sb.append(zakazchiki_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public zakazchiki toEntityModel() {
		zakazchikiImpl zakazchikiImpl = new zakazchikiImpl();

		if (adres == null) {
			zakazchikiImpl.setAdres(StringPool.BLANK);
		}
		else {
			zakazchikiImpl.setAdres(adres);
		}

		if (data_izmenenija == Long.MIN_VALUE) {
			zakazchikiImpl.setData_izmenenija(null);
		}
		else {
			zakazchikiImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			zakazchikiImpl.setData_sozdanija(null);
		}
		else {
			zakazchikiImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		if (ein == null) {
			zakazchikiImpl.setEin(StringPool.BLANK);
		}
		else {
			zakazchikiImpl.setEin(ein);
		}

		zakazchikiImpl.setFbk_id(fbk_id);

		if (gorod == null) {
			zakazchikiImpl.setGorod(StringPool.BLANK);
		}
		else {
			zakazchikiImpl.setGorod(gorod);
		}

		if (inn == null) {
			zakazchikiImpl.setInn(StringPool.BLANK);
		}
		else {
			zakazchikiImpl.setInn(inn);
		}

		zakazchikiImpl.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
		zakazchikiImpl.setIzmenil(izmenil);

		if (je_pochta == null) {
			zakazchikiImpl.setJe_pochta(StringPool.BLANK);
		}
		else {
			zakazchikiImpl.setJe_pochta(je_pochta);
		}

		if (kontaktnyj_telefon == null) {
			zakazchikiImpl.setKontaktnyj_telefon(StringPool.BLANK);
		}
		else {
			zakazchikiImpl.setKontaktnyj_telefon(kontaktnyj_telefon);
		}

		zakazchikiImpl.setKvalificirovannaja_organizacija(kvalificirovannaja_organizacija);

		if (naimenovanie == null) {
			zakazchikiImpl.setNaimenovanie(StringPool.BLANK);
		}
		else {
			zakazchikiImpl.setNaimenovanie(naimenovanie);
		}

		zakazchikiImpl.setOblast_id(oblast_id);

		if (otvetstvennoe_lico == null) {
			zakazchikiImpl.setOtvetstvennoe_lico(StringPool.BLANK);
		}
		else {
			zakazchikiImpl.setOtvetstvennoe_lico(otvetstvennoe_lico);
		}

		zakazchikiImpl.setRajon_id(rajon_id);

		if (rukovoditel == null) {
			zakazchikiImpl.setRukovoditel(StringPool.BLANK);
		}
		else {
			zakazchikiImpl.setRukovoditel(rukovoditel);
		}

		zakazchikiImpl.setSozdal(sozdal);
		zakazchikiImpl.setVbk_id(vbk_id);
		zakazchikiImpl.setZakazchiki_id(zakazchiki_id);

		zakazchikiImpl.resetOriginalValues();

		return zakazchikiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		adres = objectInput.readUTF();
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();
		ein = objectInput.readUTF();

		fbk_id = objectInput.readLong();
		gorod = objectInput.readUTF();
		inn = objectInput.readUTF();

		istochnik_finansirovanija_id = objectInput.readLong();

		izmenil = objectInput.readLong();
		je_pochta = objectInput.readUTF();
		kontaktnyj_telefon = objectInput.readUTF();

		kvalificirovannaja_organizacija = objectInput.readLong();
		naimenovanie = objectInput.readUTF();

		oblast_id = objectInput.readLong();
		otvetstvennoe_lico = objectInput.readUTF();

		rajon_id = objectInput.readLong();
		rukovoditel = objectInput.readUTF();

		sozdal = objectInput.readLong();

		vbk_id = objectInput.readLong();

		zakazchiki_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (adres == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(adres);
		}

		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		if (ein == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ein);
		}

		objectOutput.writeLong(fbk_id);

		if (gorod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gorod);
		}

		if (inn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inn);
		}

		objectOutput.writeLong(istochnik_finansirovanija_id);

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

		objectOutput.writeLong(kvalificirovannaja_organizacija);

		if (naimenovanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naimenovanie);
		}

		objectOutput.writeLong(oblast_id);

		if (otvetstvennoe_lico == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(otvetstvennoe_lico);
		}

		objectOutput.writeLong(rajon_id);

		if (rukovoditel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rukovoditel);
		}

		objectOutput.writeLong(sozdal);

		objectOutput.writeLong(vbk_id);

		objectOutput.writeLong(zakazchiki_id);
	}

	public String adres;
	public long data_izmenenija;
	public long data_sozdanija;
	public String ein;
	public long fbk_id;
	public String gorod;
	public String inn;
	public long istochnik_finansirovanija_id;
	public long izmenil;
	public String je_pochta;
	public String kontaktnyj_telefon;
	public long kvalificirovannaja_organizacija;
	public String naimenovanie;
	public long oblast_id;
	public String otvetstvennoe_lico;
	public long rajon_id;
	public String rukovoditel;
	public long sozdal;
	public long vbk_id;
	public long zakazchiki_id;
}