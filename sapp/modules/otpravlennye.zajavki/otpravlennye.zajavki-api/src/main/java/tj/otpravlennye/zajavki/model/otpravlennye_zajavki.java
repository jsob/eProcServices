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

package tj.otpravlennye.zajavki.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the otpravlennye_zajavki service. Represents a row in the &quot;sapp.otpravlennye_zajavki&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see otpravlennye_zajavkiModel
 * @see tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiImpl
 * @see tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiModelImpl
 * @generated
 */
@ImplementationClassName("tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiImpl")
@ProviderType
public interface otpravlennye_zajavki extends otpravlennye_zajavkiModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<otpravlennye_zajavki, Long> OTPRAVLENNYE_ZAJAVKI_ID_ACCESSOR =
		new Accessor<otpravlennye_zajavki, Long>() {
			@Override
			public Long get(otpravlennye_zajavki otpravlennye_zajavki) {
				return otpravlennye_zajavki.getOtpravlennye_zajavki_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<otpravlennye_zajavki> getTypeClass() {
				return otpravlennye_zajavki.class;
			}
		};
}