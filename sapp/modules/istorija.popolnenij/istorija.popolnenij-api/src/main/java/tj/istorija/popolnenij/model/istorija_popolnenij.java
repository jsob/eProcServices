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

package tj.istorija.popolnenij.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the istorija_popolnenij service. Represents a row in the &quot;sapp.istorija_popolnenij&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see istorija_popolnenijModel
 * @see tj.istorija.popolnenij.model.impl.istorija_popolnenijImpl
 * @see tj.istorija.popolnenij.model.impl.istorija_popolnenijModelImpl
 * @generated
 */
@ImplementationClassName("tj.istorija.popolnenij.model.impl.istorija_popolnenijImpl")
@ProviderType
public interface istorija_popolnenij extends istorija_popolnenijModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.istorija.popolnenij.model.impl.istorija_popolnenijImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<istorija_popolnenij, Long> ISTORIJA_POPOLNENIJ_ID_ACCESSOR =
		new Accessor<istorija_popolnenij, Long>() {
			@Override
			public Long get(istorija_popolnenij istorija_popolnenij) {
				return istorija_popolnenij.getIstorija_popolnenij_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<istorija_popolnenij> getTypeClass() {
				return istorija_popolnenij.class;
			}
		};
}