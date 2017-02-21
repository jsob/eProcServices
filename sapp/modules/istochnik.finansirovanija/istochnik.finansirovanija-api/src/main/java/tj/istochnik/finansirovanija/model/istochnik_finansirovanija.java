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

package tj.istochnik.finansirovanija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the istochnik_finansirovanija service. Represents a row in the &quot;sapp.istochnik_finansirovanija&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see istochnik_finansirovanijaModel
 * @see tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaImpl
 * @see tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaModelImpl
 * @generated
 */
@ImplementationClassName("tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaImpl")
@ProviderType
public interface istochnik_finansirovanija
	extends istochnik_finansirovanijaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<istochnik_finansirovanija, Long> ISTOCHNIK_FINANSIROVANIJA_ID_ACCESSOR =
		new Accessor<istochnik_finansirovanija, Long>() {
			@Override
			public Long get(istochnik_finansirovanija istochnik_finansirovanija) {
				return istochnik_finansirovanija.getIstochnik_finansirovanija_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<istochnik_finansirovanija> getTypeClass() {
				return istochnik_finansirovanija.class;
			}
		};
}