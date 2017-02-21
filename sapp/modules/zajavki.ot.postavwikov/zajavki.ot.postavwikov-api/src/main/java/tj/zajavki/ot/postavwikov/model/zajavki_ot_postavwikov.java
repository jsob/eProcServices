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

package tj.zajavki.ot.postavwikov.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the zajavki_ot_postavwikov service. Represents a row in the &quot;sapp.zajavki_ot_postavwikov&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see zajavki_ot_postavwikovModel
 * @see tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovImpl
 * @see tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovModelImpl
 * @generated
 */
@ImplementationClassName("tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovImpl")
@ProviderType
public interface zajavki_ot_postavwikov extends zajavki_ot_postavwikovModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<zajavki_ot_postavwikov, Long> ZAJAVKI_OT_POSTAVWIKOV_ID_ACCESSOR =
		new Accessor<zajavki_ot_postavwikov, Long>() {
			@Override
			public Long get(zajavki_ot_postavwikov zajavki_ot_postavwikov) {
				return zajavki_ot_postavwikov.getZajavki_ot_postavwikov_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<zajavki_ot_postavwikov> getTypeClass() {
				return zajavki_ot_postavwikov.class;
			}
		};
}