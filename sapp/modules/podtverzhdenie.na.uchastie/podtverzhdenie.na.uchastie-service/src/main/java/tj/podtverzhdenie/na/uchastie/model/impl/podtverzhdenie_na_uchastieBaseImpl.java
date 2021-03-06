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

package tj.podtverzhdenie.na.uchastie.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie;
import tj.podtverzhdenie.na.uchastie.service.podtverzhdenie_na_uchastieLocalServiceUtil;

/**
 * The extended model base implementation for the podtverzhdenie_na_uchastie service. Represents a row in the &quot;sapp.podtverzhdenie_na_uchastie&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link podtverzhdenie_na_uchastieImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_na_uchastieImpl
 * @see podtverzhdenie_na_uchastie
 * @generated
 */
@ProviderType
public abstract class podtverzhdenie_na_uchastieBaseImpl
	extends podtverzhdenie_na_uchastieModelImpl
	implements podtverzhdenie_na_uchastie {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a podtverzhdenie_na_uchastie model instance should use the {@link podtverzhdenie_na_uchastie} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			podtverzhdenie_na_uchastieLocalServiceUtil.addpodtverzhdenie_na_uchastie(this);
		}
		else {
			podtverzhdenie_na_uchastieLocalServiceUtil.updatepodtverzhdenie_na_uchastie(this);
		}
	}
}