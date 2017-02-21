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

package tj.dokumenty.postavwika.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the dokumenty_postavwika service. Represents a row in the &quot;sapp.dokumenty_postavwika&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_postavwikaModel
 * @see tj.dokumenty.postavwika.model.impl.dokumenty_postavwikaImpl
 * @see tj.dokumenty.postavwika.model.impl.dokumenty_postavwikaModelImpl
 * @generated
 */
@ImplementationClassName("tj.dokumenty.postavwika.model.impl.dokumenty_postavwikaImpl")
@ProviderType
public interface dokumenty_postavwika extends dokumenty_postavwikaModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.dokumenty.postavwika.model.impl.dokumenty_postavwikaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<dokumenty_postavwika, Long> DOKUMENTY_POSTAVWIKA_ID_ACCESSOR =
		new Accessor<dokumenty_postavwika, Long>() {
			@Override
			public Long get(dokumenty_postavwika dokumenty_postavwika) {
				return dokumenty_postavwika.getDokumenty_postavwika_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<dokumenty_postavwika> getTypeClass() {
				return dokumenty_postavwika.class;
			}
		};
}