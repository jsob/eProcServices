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

package tj.sostojanie.izvewenij.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the sostojanie_izvewenij service. Represents a row in the &quot;sapp.sostojanie_izvewenij&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see sostojanie_izvewenijModel
 * @see tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijImpl
 * @see tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijModelImpl
 * @generated
 */
@ImplementationClassName("tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijImpl")
@ProviderType
public interface sostojanie_izvewenij extends sostojanie_izvewenijModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<sostojanie_izvewenij, Long> SOSTOJANIE_IZVEWENIJ_ID_ACCESSOR =
		new Accessor<sostojanie_izvewenij, Long>() {
			@Override
			public Long get(sostojanie_izvewenij sostojanie_izvewenij) {
				return sostojanie_izvewenij.getSostojanie_izvewenij_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<sostojanie_izvewenij> getTypeClass() {
				return sostojanie_izvewenij.class;
			}
		};
}