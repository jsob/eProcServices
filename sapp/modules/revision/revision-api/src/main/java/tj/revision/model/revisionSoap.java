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

package tj.revision.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.revision.service.http.revisionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.revision.service.http.revisionServiceSoap
 * @generated
 */
@ProviderType
public class revisionSoap implements Serializable {
	public static revisionSoap toSoapModel(revision model) {
		revisionSoap soapModel = new revisionSoap();

		soapModel.setDate(model.getDate());
		soapModel.setRevision_id(model.getRevision_id());

		return soapModel;
	}

	public static revisionSoap[] toSoapModels(revision[] models) {
		revisionSoap[] soapModels = new revisionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static revisionSoap[][] toSoapModels(revision[][] models) {
		revisionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new revisionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new revisionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static revisionSoap[] toSoapModels(List<revision> models) {
		List<revisionSoap> soapModels = new ArrayList<revisionSoap>(models.size());

		for (revision model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new revisionSoap[soapModels.size()]);
	}

	public revisionSoap() {
	}

	public long getPrimaryKey() {
		return _revision_id;
	}

	public void setPrimaryKey(long pk) {
		setRevision_id(pk);
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	public long getRevision_id() {
		return _revision_id;
	}

	public void setRevision_id(long revision_id) {
		_revision_id = revision_id;
	}

	private Date _date;
	private long _revision_id;
}