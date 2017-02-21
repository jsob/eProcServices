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

package tj.dokumenty.postavwika.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.dokumenty.postavwika.model.dokumenty_postavwika;
import tj.dokumenty.postavwika.service.dokumenty_postavwikaLocalServiceUtil;

/**
 * The extended model base implementation for the dokumenty_postavwika service. Represents a row in the &quot;sapp.dokumenty_postavwika&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link dokumenty_postavwikaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_postavwikaImpl
 * @see dokumenty_postavwika
 * @generated
 */
@ProviderType
public abstract class dokumenty_postavwikaBaseImpl
	extends dokumenty_postavwikaModelImpl implements dokumenty_postavwika {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dokumenty_postavwika model instance should use the {@link dokumenty_postavwika} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			dokumenty_postavwikaLocalServiceUtil.adddokumenty_postavwika(this);
		}
		else {
			dokumenty_postavwikaLocalServiceUtil.updatedokumenty_postavwika(this);
		}
	}
}