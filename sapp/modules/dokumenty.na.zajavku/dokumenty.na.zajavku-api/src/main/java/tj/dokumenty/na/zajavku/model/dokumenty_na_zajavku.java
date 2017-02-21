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

package tj.dokumenty.na.zajavku.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the dokumenty_na_zajavku service. Represents a row in the &quot;sapp.dokumenty_na_zajavku&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_na_zajavkuModel
 * @see tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuImpl
 * @see tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuModelImpl
 * @generated
 */
@ImplementationClassName("tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuImpl")
@ProviderType
public interface dokumenty_na_zajavku extends dokumenty_na_zajavkuModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<dokumenty_na_zajavku, Long> DOKUMENTY_NA_ZAJAVKU_ID_ACCESSOR =
		new Accessor<dokumenty_na_zajavku, Long>() {
			@Override
			public Long get(dokumenty_na_zajavku dokumenty_na_zajavku) {
				return dokumenty_na_zajavku.getDokumenty_na_zajavku_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<dokumenty_na_zajavku> getTypeClass() {
				return dokumenty_na_zajavku.class;
			}
		};
}