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

package tj.porjadok.raboty.komissii.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the porjadok_raboty_komissii service. Represents a row in the &quot;sapp.porjadok_raboty_komissii&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see porjadok_raboty_komissiiModel
 * @see tj.porjadok.raboty.komissii.model.impl.porjadok_raboty_komissiiImpl
 * @see tj.porjadok.raboty.komissii.model.impl.porjadok_raboty_komissiiModelImpl
 * @generated
 */
@ImplementationClassName("tj.porjadok.raboty.komissii.model.impl.porjadok_raboty_komissiiImpl")
@ProviderType
public interface porjadok_raboty_komissii extends porjadok_raboty_komissiiModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.porjadok.raboty.komissii.model.impl.porjadok_raboty_komissiiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<porjadok_raboty_komissii, Long> PORJADOK_RABOTY_KOMISSII_ID_ACCESSOR =
		new Accessor<porjadok_raboty_komissii, Long>() {
			@Override
			public Long get(porjadok_raboty_komissii porjadok_raboty_komissii) {
				return porjadok_raboty_komissii.getPorjadok_raboty_komissii_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<porjadok_raboty_komissii> getTypeClass() {
				return porjadok_raboty_komissii.class;
			}
		};
}