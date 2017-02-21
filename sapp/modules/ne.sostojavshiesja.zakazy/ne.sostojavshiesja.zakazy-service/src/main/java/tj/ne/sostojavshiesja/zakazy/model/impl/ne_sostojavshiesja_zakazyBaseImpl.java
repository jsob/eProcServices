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

package tj.ne.sostojavshiesja.zakazy.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy;
import tj.ne.sostojavshiesja.zakazy.service.ne_sostojavshiesja_zakazyLocalServiceUtil;

/**
 * The extended model base implementation for the ne_sostojavshiesja_zakazy service. Represents a row in the &quot;sapp.ne_sostojavshiesja_zakazy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ne_sostojavshiesja_zakazyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ne_sostojavshiesja_zakazyImpl
 * @see ne_sostojavshiesja_zakazy
 * @generated
 */
@ProviderType
public abstract class ne_sostojavshiesja_zakazyBaseImpl
	extends ne_sostojavshiesja_zakazyModelImpl
	implements ne_sostojavshiesja_zakazy {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ne_sostojavshiesja_zakazy model instance should use the {@link ne_sostojavshiesja_zakazy} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			ne_sostojavshiesja_zakazyLocalServiceUtil.addne_sostojavshiesja_zakazy(this);
		}
		else {
			ne_sostojavshiesja_zakazyLocalServiceUtil.updatene_sostojavshiesja_zakazy(this);
		}
	}
}