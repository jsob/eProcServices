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

package tj.rezultat.opredelenija.sootvetstvija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the rezultat_opredelenija_sootvetstvija service. Represents a row in the &quot;rezultat_opredelenija_sootvetstvija_rezultat_opredelenija_sootvetstvija&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_opredelenija_sootvetstvijaModel
 * @see tj.rezultat.opredelenija.sootvetstvija.model.impl.rezultat_opredelenija_sootvetstvijaImpl
 * @see tj.rezultat.opredelenija.sootvetstvija.model.impl.rezultat_opredelenija_sootvetstvijaModelImpl
 * @generated
 */
@ImplementationClassName("tj.rezultat.opredelenija.sootvetstvija.model.impl.rezultat_opredelenija_sootvetstvijaImpl")
@ProviderType
public interface rezultat_opredelenija_sootvetstvija
	extends rezultat_opredelenija_sootvetstvijaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.rezultat.opredelenija.sootvetstvija.model.impl.rezultat_opredelenija_sootvetstvijaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<rezultat_opredelenija_sootvetstvija, Long> REZULTAT_OPREDELENIJA_SOOTVETSTVIJA_ID_ACCESSOR =
		new Accessor<rezultat_opredelenija_sootvetstvija, Long>() {
			@Override
			public Long get(
				rezultat_opredelenija_sootvetstvija rezultat_opredelenija_sootvetstvija) {
				return rezultat_opredelenija_sootvetstvija.getRezultat_opredelenija_sootvetstvija_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<rezultat_opredelenija_sootvetstvija> getTypeClass() {
				return rezultat_opredelenija_sootvetstvija.class;
			}
		};
}