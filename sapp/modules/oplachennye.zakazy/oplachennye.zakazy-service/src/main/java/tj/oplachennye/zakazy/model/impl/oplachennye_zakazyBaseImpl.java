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

package tj.oplachennye.zakazy.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.oplachennye.zakazy.model.oplachennye_zakazy;
import tj.oplachennye.zakazy.service.oplachennye_zakazyLocalServiceUtil;

/**
 * The extended model base implementation for the oplachennye_zakazy service. Represents a row in the &quot;sapp.oplachennye_zakazy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link oplachennye_zakazyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see oplachennye_zakazyImpl
 * @see oplachennye_zakazy
 * @generated
 */
@ProviderType
public abstract class oplachennye_zakazyBaseImpl
	extends oplachennye_zakazyModelImpl implements oplachennye_zakazy {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a oplachennye_zakazy model instance should use the {@link oplachennye_zakazy} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			oplachennye_zakazyLocalServiceUtil.addoplachennye_zakazy(this);
		}
		else {
			oplachennye_zakazyLocalServiceUtil.updateoplachennye_zakazy(this);
		}
	}
}