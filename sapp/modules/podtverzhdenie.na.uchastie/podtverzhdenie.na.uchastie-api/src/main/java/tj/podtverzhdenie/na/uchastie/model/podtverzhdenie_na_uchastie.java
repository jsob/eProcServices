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

package tj.podtverzhdenie.na.uchastie.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the podtverzhdenie_na_uchastie service. Represents a row in the &quot;sapp.podtverzhdenie_na_uchastie&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_na_uchastieModel
 * @see tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieImpl
 * @see tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieModelImpl
 * @generated
 */
@ImplementationClassName("tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieImpl")
@ProviderType
public interface podtverzhdenie_na_uchastie
	extends podtverzhdenie_na_uchastieModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<podtverzhdenie_na_uchastie, Long> PODTVERZHDENIE_NA_UCHASTIE_ID_ACCESSOR =
		new Accessor<podtverzhdenie_na_uchastie, Long>() {
			@Override
			public Long get(
				podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
				return podtverzhdenie_na_uchastie.getPodtverzhdenie_na_uchastie_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<podtverzhdenie_na_uchastie> getTypeClass() {
				return podtverzhdenie_na_uchastie.class;
			}
		};
}