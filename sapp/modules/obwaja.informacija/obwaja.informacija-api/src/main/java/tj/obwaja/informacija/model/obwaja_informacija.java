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

package tj.obwaja.informacija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the obwaja_informacija service. Represents a row in the &quot;sapp.obwaja_informacija&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see obwaja_informacijaModel
 * @see tj.obwaja.informacija.model.impl.obwaja_informacijaImpl
 * @see tj.obwaja.informacija.model.impl.obwaja_informacijaModelImpl
 * @generated
 */
@ImplementationClassName("tj.obwaja.informacija.model.impl.obwaja_informacijaImpl")
@ProviderType
public interface obwaja_informacija extends obwaja_informacijaModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.obwaja.informacija.model.impl.obwaja_informacijaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<obwaja_informacija, Long> OBWAJA_INFORMACIJA_ID_ACCESSOR =
		new Accessor<obwaja_informacija, Long>() {
			@Override
			public Long get(obwaja_informacija obwaja_informacija) {
				return obwaja_informacija.getObwaja_informacija_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<obwaja_informacija> getTypeClass() {
				return obwaja_informacija.class;
			}
		};
}