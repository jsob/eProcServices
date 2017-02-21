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

package tj.tipy.dokumentov.postavwika.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the tipy_dokumentov_postavwika service. Represents a row in the &quot;sapp.tipy_dokumentov_postavwika&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see tipy_dokumentov_postavwikaModel
 * @see tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaImpl
 * @see tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaModelImpl
 * @generated
 */
@ImplementationClassName("tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaImpl")
@ProviderType
public interface tipy_dokumentov_postavwika
	extends tipy_dokumentov_postavwikaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<tipy_dokumentov_postavwika, Long> TIPY_DOKUMENTOV_POSTAVWIKA_ID_ACCESSOR =
		new Accessor<tipy_dokumentov_postavwika, Long>() {
			@Override
			public Long get(
				tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
				return tipy_dokumentov_postavwika.getTipy_dokumentov_postavwika_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<tipy_dokumentov_postavwika> getTypeClass() {
				return tipy_dokumentov_postavwika.class;
			}
		};
}