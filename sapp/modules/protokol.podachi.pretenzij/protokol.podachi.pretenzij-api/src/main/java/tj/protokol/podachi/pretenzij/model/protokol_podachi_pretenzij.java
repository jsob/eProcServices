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

package tj.protokol.podachi.pretenzij.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the protokol_podachi_pretenzij service. Represents a row in the &quot;sapp.protokol_podachi_pretenzij&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_podachi_pretenzijModel
 * @see tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijImpl
 * @see tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijModelImpl
 * @generated
 */
@ImplementationClassName("tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijImpl")
@ProviderType
public interface protokol_podachi_pretenzij
	extends protokol_podachi_pretenzijModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<protokol_podachi_pretenzij, Long> PROTOKOL_PODACHI_PRETENZIJ_ID_ACCESSOR =
		new Accessor<protokol_podachi_pretenzij, Long>() {
			@Override
			public Long get(
				protokol_podachi_pretenzij protokol_podachi_pretenzij) {
				return protokol_podachi_pretenzij.getProtokol_podachi_pretenzij_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<protokol_podachi_pretenzij> getTypeClass() {
				return protokol_podachi_pretenzij.class;
			}
		};
}