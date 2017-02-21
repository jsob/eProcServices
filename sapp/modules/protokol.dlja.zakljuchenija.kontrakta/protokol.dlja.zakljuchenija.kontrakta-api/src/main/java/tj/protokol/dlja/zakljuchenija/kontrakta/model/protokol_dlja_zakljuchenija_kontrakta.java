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

package tj.protokol.dlja.zakljuchenija.kontrakta.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the protokol_dlja_zakljuchenija_kontrakta service. Represents a row in the &quot;sapp.protokol_dlja_zakljuchenija_kontrakta&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_dlja_zakljuchenija_kontraktaModel
 * @see tj.protokol.dlja.zakljuchenija.kontrakta.model.impl.protokol_dlja_zakljuchenija_kontraktaImpl
 * @see tj.protokol.dlja.zakljuchenija.kontrakta.model.impl.protokol_dlja_zakljuchenija_kontraktaModelImpl
 * @generated
 */
@ImplementationClassName("tj.protokol.dlja.zakljuchenija.kontrakta.model.impl.protokol_dlja_zakljuchenija_kontraktaImpl")
@ProviderType
public interface protokol_dlja_zakljuchenija_kontrakta
	extends protokol_dlja_zakljuchenija_kontraktaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.protokol.dlja.zakljuchenija.kontrakta.model.impl.protokol_dlja_zakljuchenija_kontraktaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<protokol_dlja_zakljuchenija_kontrakta, Long> PROTOKOL_DLJA_ZAKLJUCHENIJA_KONTRAKTA_ID_ACCESSOR =
		new Accessor<protokol_dlja_zakljuchenija_kontrakta, Long>() {
			@Override
			public Long get(
				protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
				return protokol_dlja_zakljuchenija_kontrakta.getProtokol_dlja_zakljuchenija_kontrakta_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<protokol_dlja_zakljuchenija_kontrakta> getTypeClass() {
				return protokol_dlja_zakljuchenija_kontrakta.class;
			}
		};
}