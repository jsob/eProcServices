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

package tj.bjudzhetnoe.polnomochie.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the bjudzhetnoe_polnomochie service. Represents a row in the &quot;sapp.bjudzhetnoe_polnomochie&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see bjudzhetnoe_polnomochieModel
 * @see tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieImpl
 * @see tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieModelImpl
 * @generated
 */
@ImplementationClassName("tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieImpl")
@ProviderType
public interface bjudzhetnoe_polnomochie extends bjudzhetnoe_polnomochieModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<bjudzhetnoe_polnomochie, Long> BJUDZHETNOE_POLNOMOCHIE_ID_ACCESSOR =
		new Accessor<bjudzhetnoe_polnomochie, Long>() {
			@Override
			public Long get(bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
				return bjudzhetnoe_polnomochie.getBjudzhetnoe_polnomochie_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<bjudzhetnoe_polnomochie> getTypeClass() {
				return bjudzhetnoe_polnomochie.class;
			}
		};
}