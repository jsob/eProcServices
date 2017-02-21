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

package tj.izvewenie.put.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the izvewenie_put service. Represents a row in the &quot;sapp.izvewenie_put&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see izvewenie_putModel
 * @see tj.izvewenie.put.model.impl.izvewenie_putImpl
 * @see tj.izvewenie.put.model.impl.izvewenie_putModelImpl
 * @generated
 */
@ImplementationClassName("tj.izvewenie.put.model.impl.izvewenie_putImpl")
@ProviderType
public interface izvewenie_put extends izvewenie_putModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.izvewenie.put.model.impl.izvewenie_putImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<izvewenie_put, Long> IZVEWENIE_PUT_ID_ACCESSOR = new Accessor<izvewenie_put, Long>() {
			@Override
			public Long get(izvewenie_put izvewenie_put) {
				return izvewenie_put.getIzvewenie_put_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<izvewenie_put> getTypeClass() {
				return izvewenie_put.class;
			}
		};
}