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

package tj.protokol.vskrytija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the protokol_vskrytija service. Represents a row in the &quot;sapp.protokol_vskrytija&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_vskrytijaModel
 * @see tj.protokol.vskrytija.model.impl.protokol_vskrytijaImpl
 * @see tj.protokol.vskrytija.model.impl.protokol_vskrytijaModelImpl
 * @generated
 */
@ImplementationClassName("tj.protokol.vskrytija.model.impl.protokol_vskrytijaImpl")
@ProviderType
public interface protokol_vskrytija extends protokol_vskrytijaModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.protokol.vskrytija.model.impl.protokol_vskrytijaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<protokol_vskrytija, Long> PROTOKOL_VSKRYTIJA_ID_ACCESSOR =
		new Accessor<protokol_vskrytija, Long>() {
			@Override
			public Long get(protokol_vskrytija protokol_vskrytija) {
				return protokol_vskrytija.getProtokol_vskrytija_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<protokol_vskrytija> getTypeClass() {
				return protokol_vskrytija.class;
			}
		};
}