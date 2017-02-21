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

package tj.spisok.tovarov.vremenno.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the spisok_tovarov_vremenno service. Represents a row in the &quot;sapp.spisok_tovarov_vremenno&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarov_vremennoModel
 * @see tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoImpl
 * @see tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoModelImpl
 * @generated
 */
@ImplementationClassName("tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoImpl")
@ProviderType
public interface spisok_tovarov_vremenno extends spisok_tovarov_vremennoModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<spisok_tovarov_vremenno, Long> SPISOK_TOVAROV_VREMENNO_ID_ACCESSOR =
		new Accessor<spisok_tovarov_vremenno, Long>() {
			@Override
			public Long get(spisok_tovarov_vremenno spisok_tovarov_vremenno) {
				return spisok_tovarov_vremenno.getSpisok_tovarov_vremenno_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<spisok_tovarov_vremenno> getTypeClass() {
				return spisok_tovarov_vremenno.class;
			}
		};
}