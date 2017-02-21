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

package tj.tipy.organizacij.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the tipy_organizacij service. Represents a row in the &quot;sapp.tipy_organizacij&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see tipy_organizacijModel
 * @see tj.tipy.organizacij.model.impl.tipy_organizacijImpl
 * @see tj.tipy.organizacij.model.impl.tipy_organizacijModelImpl
 * @generated
 */
@ImplementationClassName("tj.tipy.organizacij.model.impl.tipy_organizacijImpl")
@ProviderType
public interface tipy_organizacij extends tipy_organizacijModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.tipy.organizacij.model.impl.tipy_organizacijImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<tipy_organizacij, Long> TIPY_ORGANIZACIJ_ID_ACCESSOR =
		new Accessor<tipy_organizacij, Long>() {
			@Override
			public Long get(tipy_organizacij tipy_organizacij) {
				return tipy_organizacij.getTipy_organizacij_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<tipy_organizacij> getTypeClass() {
				return tipy_organizacij.class;
			}
		};
}