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

package tj.rajony.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.rajony.model.rajony;

import tj.rajony.service.rajonyLocalServiceUtil;

/**
 * The extended model base implementation for the rajony service. Represents a row in the &quot;sapp.rajony&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link rajonyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rajonyImpl
 * @see rajony
 * @generated
 */
@ProviderType
public abstract class rajonyBaseImpl extends rajonyModelImpl implements rajony {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a rajony model instance should use the {@link rajony} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			rajonyLocalServiceUtil.addrajony(this);
		}
		else {
			rajonyLocalServiceUtil.updaterajony(this);
		}
	}
}