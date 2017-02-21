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

package tj.oblasti.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the oblasti service. Represents a row in the &quot;sapp.oblasti&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see oblastiModel
 * @see tj.oblasti.model.impl.oblastiImpl
 * @see tj.oblasti.model.impl.oblastiModelImpl
 * @generated
 */
@ImplementationClassName("tj.oblasti.model.impl.oblastiImpl")
@ProviderType
public interface oblasti extends oblastiModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.oblasti.model.impl.oblastiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<oblasti, Long> OBLASTI_ID_ACCESSOR = new Accessor<oblasti, Long>() {
			@Override
			public Long get(oblasti oblasti) {
				return oblasti.getOblasti_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<oblasti> getTypeClass() {
				return oblasti.class;
			}
		};
}