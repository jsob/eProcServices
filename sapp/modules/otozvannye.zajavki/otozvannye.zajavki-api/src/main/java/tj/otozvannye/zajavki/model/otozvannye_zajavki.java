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

package tj.otozvannye.zajavki.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the otozvannye_zajavki service. Represents a row in the &quot;sapp.otozvannye_zajavki&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see otozvannye_zajavkiModel
 * @see tj.otozvannye.zajavki.model.impl.otozvannye_zajavkiImpl
 * @see tj.otozvannye.zajavki.model.impl.otozvannye_zajavkiModelImpl
 * @generated
 */
@ImplementationClassName("tj.otozvannye.zajavki.model.impl.otozvannye_zajavkiImpl")
@ProviderType
public interface otozvannye_zajavki extends otozvannye_zajavkiModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.otozvannye.zajavki.model.impl.otozvannye_zajavkiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<otozvannye_zajavki, Long> OTOZVANNYE_ZAJAVKI_ID_ACCESSOR =
		new Accessor<otozvannye_zajavki, Long>() {
			@Override
			public Long get(otozvannye_zajavki otozvannye_zajavki) {
				return otozvannye_zajavki.getOtozvannye_zajavki_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<otozvannye_zajavki> getTypeClass() {
				return otozvannye_zajavki.class;
			}
		};
}