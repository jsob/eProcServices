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

package tj.spisok.tovarov.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the spisok_tovarov service. Represents a row in the &quot;sapp.spisok_tovarov&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarovModel
 * @see tj.spisok.tovarov.model.impl.spisok_tovarovImpl
 * @see tj.spisok.tovarov.model.impl.spisok_tovarovModelImpl
 * @generated
 */
@ImplementationClassName("tj.spisok.tovarov.model.impl.spisok_tovarovImpl")
@ProviderType
public interface spisok_tovarov extends spisok_tovarovModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.spisok.tovarov.model.impl.spisok_tovarovImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<spisok_tovarov, Long> SPISOK_TOVAROV_ID_ACCESSOR =
		new Accessor<spisok_tovarov, Long>() {
			@Override
			public Long get(spisok_tovarov spisok_tovarov) {
				return spisok_tovarov.getSpisok_tovarov_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<spisok_tovarov> getTypeClass() {
				return spisok_tovarov.class;
			}
		};
}