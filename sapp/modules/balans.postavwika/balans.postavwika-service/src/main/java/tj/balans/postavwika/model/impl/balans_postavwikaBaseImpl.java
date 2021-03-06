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

package tj.balans.postavwika.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.balans.postavwika.model.balans_postavwika;
import tj.balans.postavwika.service.balans_postavwikaLocalServiceUtil;

/**
 * The extended model base implementation for the balans_postavwika service. Represents a row in the &quot;sapp.balans_postavwika&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link balans_postavwikaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see balans_postavwikaImpl
 * @see balans_postavwika
 * @generated
 */
@ProviderType
public abstract class balans_postavwikaBaseImpl
	extends balans_postavwikaModelImpl implements balans_postavwika {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a balans_postavwika model instance should use the {@link balans_postavwika} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			balans_postavwikaLocalServiceUtil.addbalans_postavwika(this);
		}
		else {
			balans_postavwikaLocalServiceUtil.updatebalans_postavwika(this);
		}
	}
}