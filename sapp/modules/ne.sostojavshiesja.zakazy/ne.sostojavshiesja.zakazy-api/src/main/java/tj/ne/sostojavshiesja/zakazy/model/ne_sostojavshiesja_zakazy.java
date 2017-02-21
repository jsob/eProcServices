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

package tj.ne.sostojavshiesja.zakazy.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ne_sostojavshiesja_zakazy service. Represents a row in the &quot;sapp.ne_sostojavshiesja_zakazy&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ne_sostojavshiesja_zakazyModel
 * @see tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyImpl
 * @see tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyModelImpl
 * @generated
 */
@ImplementationClassName("tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyImpl")
@ProviderType
public interface ne_sostojavshiesja_zakazy
	extends ne_sostojavshiesja_zakazyModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ne_sostojavshiesja_zakazy, Long> NE_SOSTOJAVSHIESJA_ZAKAZY_ID_ACCESSOR =
		new Accessor<ne_sostojavshiesja_zakazy, Long>() {
			@Override
			public Long get(ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy) {
				return ne_sostojavshiesja_zakazy.getNe_sostojavshiesja_zakazy_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ne_sostojavshiesja_zakazy> getTypeClass() {
				return ne_sostojavshiesja_zakazy.class;
			}
		};
}