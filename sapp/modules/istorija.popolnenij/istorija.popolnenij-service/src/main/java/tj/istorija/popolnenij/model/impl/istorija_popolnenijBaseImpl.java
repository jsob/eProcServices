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

package tj.istorija.popolnenij.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.istorija.popolnenij.model.istorija_popolnenij;
import tj.istorija.popolnenij.service.istorija_popolnenijLocalServiceUtil;

/**
 * The extended model base implementation for the istorija_popolnenij service. Represents a row in the &quot;sapp.istorija_popolnenij&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link istorija_popolnenijImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istorija_popolnenijImpl
 * @see istorija_popolnenij
 * @generated
 */
@ProviderType
public abstract class istorija_popolnenijBaseImpl
	extends istorija_popolnenijModelImpl implements istorija_popolnenij {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a istorija_popolnenij model instance should use the {@link istorija_popolnenij} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			istorija_popolnenijLocalServiceUtil.addistorija_popolnenij(this);
		}
		else {
			istorija_popolnenijLocalServiceUtil.updateistorija_popolnenij(this);
		}
	}
}