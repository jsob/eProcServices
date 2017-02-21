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

package tj.rezultat.rassmotrenija.pretenzii.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the rezultat_rassmotrenija_pretenzii service. Represents a row in the &quot;sapp.rezultat_rassmotrenija_pretenzii&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_rassmotrenija_pretenziiModel
 * @see tj.rezultat.rassmotrenija.pretenzii.model.impl.rezultat_rassmotrenija_pretenziiImpl
 * @see tj.rezultat.rassmotrenija.pretenzii.model.impl.rezultat_rassmotrenija_pretenziiModelImpl
 * @generated
 */
@ImplementationClassName("tj.rezultat.rassmotrenija.pretenzii.model.impl.rezultat_rassmotrenija_pretenziiImpl")
@ProviderType
public interface rezultat_rassmotrenija_pretenzii
	extends rezultat_rassmotrenija_pretenziiModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.rezultat.rassmotrenija.pretenzii.model.impl.rezultat_rassmotrenija_pretenziiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<rezultat_rassmotrenija_pretenzii, Long> REZULTAT_RASSMOTRENIJA_PRETENZII_ID_ACCESSOR =
		new Accessor<rezultat_rassmotrenija_pretenzii, Long>() {
			@Override
			public Long get(
				rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
				return rezultat_rassmotrenija_pretenzii.getRezultat_rassmotrenija_pretenzii_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<rezultat_rassmotrenija_pretenzii> getTypeClass() {
				return rezultat_rassmotrenija_pretenzii.class;
			}
		};
}