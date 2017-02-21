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

package naruwenija.v.izvewenii.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the naruwenija_v_izvewenii service. Represents a row in the &quot;sapp.naruwenija_v_izvewenii&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see naruwenija_v_izveweniiModel
 * @see naruwenija.v.izvewenii.model.impl.naruwenija_v_izveweniiImpl
 * @see naruwenija.v.izvewenii.model.impl.naruwenija_v_izveweniiModelImpl
 * @generated
 */
@ImplementationClassName("naruwenija.v.izvewenii.model.impl.naruwenija_v_izveweniiImpl")
@ProviderType
public interface naruwenija_v_izvewenii extends naruwenija_v_izveweniiModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link naruwenija.v.izvewenii.model.impl.naruwenija_v_izveweniiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<naruwenija_v_izvewenii, Long> NARUWENIJA_V_IZVEWENII_ID_ACCESSOR =
		new Accessor<naruwenija_v_izvewenii, Long>() {
			@Override
			public Long get(naruwenija_v_izvewenii naruwenija_v_izvewenii) {
				return naruwenija_v_izvewenii.getNaruwenija_v_izvewenii_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<naruwenija_v_izvewenii> getTypeClass() {
				return naruwenija_v_izvewenii.class;
			}
		};
}