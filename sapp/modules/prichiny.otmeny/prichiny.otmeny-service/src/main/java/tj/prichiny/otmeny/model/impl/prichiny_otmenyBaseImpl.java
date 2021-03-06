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

import tj.prichiny.otmeny.model.prichiny_otmeny;
import tj.prichiny.otmeny.service.prichiny_otmenyLocalServiceUtil;

/**
 * The extended model base implementation for the prichiny_otmeny service. Represents a row in the &quot;sapp.prichiny_otmeny&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link prichiny_otmenyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prichiny_otmenyImpl
 * @see prichiny_otmeny
 * @generated
 */
@ProviderType
public abstract class prichiny_otmenyBaseImpl extends prichiny_otmenyModelImpl
	implements prichiny_otmeny {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a prichiny_otmeny model instance should use the {@link prichiny_otmeny} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			prichiny_otmenyLocalServiceUtil.addprichiny_otmeny(this);
		}
		else {
			prichiny_otmenyLocalServiceUtil.updateprichiny_otmeny(this);
		}
	}
}