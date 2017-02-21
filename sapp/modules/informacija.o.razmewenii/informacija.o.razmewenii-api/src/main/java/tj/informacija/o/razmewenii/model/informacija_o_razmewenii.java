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

package tj.informacija.o.razmewenii.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the informacija_o_razmewenii service. Represents a row in the &quot;sapp.informacija_o_razmewenii&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see informacija_o_razmeweniiModel
 * @see tj.informacija.o.razmewenii.model.impl.informacija_o_razmeweniiImpl
 * @see tj.informacija.o.razmewenii.model.impl.informacija_o_razmeweniiModelImpl
 * @generated
 */
@ImplementationClassName("tj.informacija.o.razmewenii.model.impl.informacija_o_razmeweniiImpl")
@ProviderType
public interface informacija_o_razmewenii extends informacija_o_razmeweniiModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.informacija.o.razmewenii.model.impl.informacija_o_razmeweniiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<informacija_o_razmewenii, Long> INFORMACIJA_O_RAZMEWENII_ID_ACCESSOR =
		new Accessor<informacija_o_razmewenii, Long>() {
			@Override
			public Long get(informacija_o_razmewenii informacija_o_razmewenii) {
				return informacija_o_razmewenii.getInformacija_o_razmewenii_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<informacija_o_razmewenii> getTypeClass() {
				return informacija_o_razmewenii.class;
			}
		};
}