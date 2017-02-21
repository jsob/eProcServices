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

package tj.prichiny.otmeny.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.prichiny.otmeny.model.prichiny_otmeny;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing prichiny_otmeny in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see prichiny_otmeny
 * @generated
 */
@ProviderType
public class prichiny_otmenyCacheModel implements CacheModel<prichiny_otmeny>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof prichiny_otmenyCacheModel)) {
			return false;
		}

		prichiny_otmenyCacheModel prichiny_otmenyCacheModel = (prichiny_otmenyCacheModel)obj;

		if (prichiny_otmeny_id == prichiny_otmenyCacheModel.prichiny_otmeny_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, prichiny_otmeny_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", prichina=");
		sb.append(prichina);
		sb.append(", prichiny_otmeny_id=");
		sb.append(prichiny_otmeny_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public prichiny_otmeny toEntityModel() {
		prichiny_otmenyImpl prichiny_otmenyImpl = new prichiny_otmenyImpl();

		if (data_izmenenija == Long.MIN_VALUE) {
			prichiny_otmenyImpl.setData_izmenenija(null);
		}
		else {
			prichiny_otmenyImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			prichiny_otmenyImpl.setData_sozdanija(null);
		}
		else {
			prichiny_otmenyImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		prichiny_otmenyImpl.setIzmenil(izmenil);
		prichiny_otmenyImpl.setIzvewenie_id(izvewenie_id);

		if (prichina == null) {
			prichiny_otmenyImpl.setPrichina(StringPool.BLANK);
		}
		else {
			prichiny_otmenyImpl.setPrichina(prichina);
		}

		prichiny_otmenyImpl.setPrichiny_otmeny_id(prichiny_otmeny_id);
		prichiny_otmenyImpl.setSozdal(sozdal);

		prichiny_otmenyImpl.resetOriginalValues();

		return prichiny_otmenyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		izmenil = objectInput.readLong();

		izvewenie_id = objectInput.readLong();
		prichina = objectInput.readUTF();

		prichiny_otmeny_id = objectInput.readLong();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(izvewenie_id);

		if (prichina == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(prichina);
		}

		objectOutput.writeLong(prichiny_otmeny_id);

		objectOutput.writeLong(sozdal);
	}

	public long data_izmenenija;
	public long data_sozdanija;
	public long izmenil;
	public long izvewenie_id;
	public String prichina;
	public long prichiny_otmeny_id;
	public long sozdal;
}