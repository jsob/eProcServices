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

package tj.prochaja.informacija.dlja.zajavki.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the prochaja_informacija_dlja_zajavki service. Represents a row in the &quot;sapp.prochaja_informacija_dlja_zajavki&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see prochaja_informacija_dlja_zajavkiModel
 * @see tj.prochaja.informacija.dlja.zajavki.model.impl.prochaja_informacija_dlja_zajavkiImpl
 * @see tj.prochaja.informacija.dlja.zajavki.model.impl.prochaja_informacija_dlja_zajavkiModelImpl
 * @generated
 */
@ImplementationClassName("tj.prochaja.informacija.dlja.zajavki.model.impl.prochaja_informacija_dlja_zajavkiImpl")
@ProviderType
public interface prochaja_informacija_dlja_zajavki
	extends prochaja_informacija_dlja_zajavkiModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.prochaja.informacija.dlja.zajavki.model.impl.prochaja_informacija_dlja_zajavkiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<prochaja_informacija_dlja_zajavki, Long> PROCHAJA_INFORMACIJA_DLJA_ZAJAVKI_ID_ACCESSOR =
		new Accessor<prochaja_informacija_dlja_zajavki, Long>() {
			@Override
			public Long get(
				prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki) {
				return prochaja_informacija_dlja_zajavki.getProchaja_informacija_dlja_zajavki_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<prochaja_informacija_dlja_zajavki> getTypeClass() {
				return prochaja_informacija_dlja_zajavki.class;
			}
		};
}