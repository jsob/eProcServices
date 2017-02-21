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

package tj.konkursnaja.dokumentacija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the konkursnaja_dokumentacija service. Represents a row in the &quot;sapp.konkursnaja_dokumentacija&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see konkursnaja_dokumentacijaModel
 * @see tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaImpl
 * @see tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaModelImpl
 * @generated
 */
@ImplementationClassName("tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaImpl")
@ProviderType
public interface konkursnaja_dokumentacija
	extends konkursnaja_dokumentacijaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<konkursnaja_dokumentacija, Long> KONKURSNAJA_DOKUMENTACIJA_ID_ACCESSOR =
		new Accessor<konkursnaja_dokumentacija, Long>() {
			@Override
			public Long get(konkursnaja_dokumentacija konkursnaja_dokumentacija) {
				return konkursnaja_dokumentacija.getKonkursnaja_dokumentacija_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<konkursnaja_dokumentacija> getTypeClass() {
				return konkursnaja_dokumentacija.class;
			}
		};
}