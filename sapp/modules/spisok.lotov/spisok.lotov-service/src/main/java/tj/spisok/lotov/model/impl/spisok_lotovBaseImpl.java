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

package tj.spisok.lotov.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.spisok.lotov.model.spisok_lotov;
import tj.spisok.lotov.service.spisok_lotovLocalServiceUtil;

/**
 * The extended model base implementation for the spisok_lotov service. Represents a row in the &quot;sapp.spisok_lotov&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link spisok_lotovImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see spisok_lotovImpl
 * @see spisok_lotov
 * @generated
 */
@ProviderType
public abstract class spisok_lotovBaseImpl extends spisok_lotovModelImpl
	implements spisok_lotov {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a spisok_lotov model instance should use the {@link spisok_lotov} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			spisok_lotovLocalServiceUtil.addspisok_lotov(this);
		}
		else {
			spisok_lotovLocalServiceUtil.updatespisok_lotov(this);
		}
	}
}