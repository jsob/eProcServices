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

package tj.reestr.kontraktov.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the reestr_kontraktov service. Represents a row in the &quot;sapp.reestr_kontraktov&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see reestr_kontraktovModel
 * @see tj.reestr.kontraktov.model.impl.reestr_kontraktovImpl
 * @see tj.reestr.kontraktov.model.impl.reestr_kontraktovModelImpl
 * @generated
 */
@ImplementationClassName("tj.reestr.kontraktov.model.impl.reestr_kontraktovImpl")
@ProviderType
public interface reestr_kontraktov extends reestr_kontraktovModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.reestr.kontraktov.model.impl.reestr_kontraktovImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<reestr_kontraktov, String> REESTR_KONTRAKTOV_ID_ACCESSOR =
		new Accessor<reestr_kontraktov, String>() {
			@Override
			public String get(reestr_kontraktov reestr_kontraktov) {
				return reestr_kontraktov.getReestr_kontraktov_id();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<reestr_kontraktov> getTypeClass() {
				return reestr_kontraktov.class;
			}
		};
}