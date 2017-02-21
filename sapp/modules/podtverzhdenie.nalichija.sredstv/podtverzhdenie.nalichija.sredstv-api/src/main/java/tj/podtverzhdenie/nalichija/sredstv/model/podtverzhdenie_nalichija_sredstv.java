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

package tj.podtverzhdenie.nalichija.sredstv.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the podtverzhdenie_nalichija_sredstv service. Represents a row in the &quot;sapp.podtverzhdenie_nalichija_sredstv&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_nalichija_sredstvModel
 * @see tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvImpl
 * @see tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvModelImpl
 * @generated
 */
@ImplementationClassName("tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvImpl")
@ProviderType
public interface podtverzhdenie_nalichija_sredstv
	extends podtverzhdenie_nalichija_sredstvModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<podtverzhdenie_nalichija_sredstv, Long> PODTVERZHDENIE_NALICHIJA_SREDSTV_ID_ACCESSOR =
		new Accessor<podtverzhdenie_nalichija_sredstv, Long>() {
			@Override
			public Long get(
				podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
				return podtverzhdenie_nalichija_sredstv.getPodtverzhdenie_nalichija_sredstv_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<podtverzhdenie_nalichija_sredstv> getTypeClass() {
				return podtverzhdenie_nalichija_sredstv.class;
			}
		};
}