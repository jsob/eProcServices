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

package tj.prichiny.otmeny.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the prichiny_otmeny service. Represents a row in the &quot;sapp.prichiny_otmeny&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see prichiny_otmenyModel
 * @see tj.prichiny.otmeny.model.impl.prichiny_otmenyImpl
 * @see tj.prichiny.otmeny.model.impl.prichiny_otmenyModelImpl
 * @generated
 */
@ImplementationClassName("tj.prichiny.otmeny.model.impl.prichiny_otmenyImpl")
@ProviderType
public interface prichiny_otmeny extends prichiny_otmenyModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.prichiny.otmeny.model.impl.prichiny_otmenyImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<prichiny_otmeny, Long> PRICHINY_OTMENY_ID_ACCESSOR =
		new Accessor<prichiny_otmeny, Long>() {
			@Override
			public Long get(prichiny_otmeny prichiny_otmeny) {
				return prichiny_otmeny.getPrichiny_otmeny_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<prichiny_otmeny> getTypeClass() {
				return prichiny_otmeny.class;
			}
		};
}