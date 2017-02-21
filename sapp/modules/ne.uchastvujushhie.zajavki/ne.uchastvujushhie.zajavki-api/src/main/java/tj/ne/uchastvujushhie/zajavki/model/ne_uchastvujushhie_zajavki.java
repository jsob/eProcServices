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

package tj.ne.uchastvujushhie.zajavki.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ne_uchastvujushhie_zajavki service. Represents a row in the &quot;ne_uchastvujushhie_zajavki_ne_uchastvujushhie_zajavki&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ne_uchastvujushhie_zajavkiModel
 * @see tj.ne.uchastvujushhie.zajavki.model.impl.ne_uchastvujushhie_zajavkiImpl
 * @see tj.ne.uchastvujushhie.zajavki.model.impl.ne_uchastvujushhie_zajavkiModelImpl
 * @generated
 */
@ImplementationClassName("tj.ne.uchastvujushhie.zajavki.model.impl.ne_uchastvujushhie_zajavkiImpl")
@ProviderType
public interface ne_uchastvujushhie_zajavki
	extends ne_uchastvujushhie_zajavkiModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.ne.uchastvujushhie.zajavki.model.impl.ne_uchastvujushhie_zajavkiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ne_uchastvujushhie_zajavki, Long> NE_UCHASTVUJUSHHIE_ZAJAVKI_ID_ACCESSOR =
		new Accessor<ne_uchastvujushhie_zajavki, Long>() {
			@Override
			public Long get(
				ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
				return ne_uchastvujushhie_zajavki.getNe_uchastvujushhie_zajavki_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ne_uchastvujushhie_zajavki> getTypeClass() {
				return ne_uchastvujushhie_zajavki.class;
			}
		};
}