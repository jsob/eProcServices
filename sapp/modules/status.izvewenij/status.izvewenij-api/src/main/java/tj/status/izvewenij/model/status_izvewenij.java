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

package tj.status.izvewenij.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the status_izvewenij service. Represents a row in the &quot;sapp.status_izvewenij&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see status_izvewenijModel
 * @see tj.status.izvewenij.model.impl.status_izvewenijImpl
 * @see tj.status.izvewenij.model.impl.status_izvewenijModelImpl
 * @generated
 */
@ImplementationClassName("tj.status.izvewenij.model.impl.status_izvewenijImpl")
@ProviderType
public interface status_izvewenij extends status_izvewenijModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.status.izvewenij.model.impl.status_izvewenijImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<status_izvewenij, Long> STATUS_IZVEWENIJ_ID_ACCESSOR =
		new Accessor<status_izvewenij, Long>() {
			@Override
			public Long get(status_izvewenij status_izvewenij) {
				return status_izvewenij.getStatus_izvewenij_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<status_izvewenij> getTypeClass() {
				return status_izvewenij.class;
			}
		};
}