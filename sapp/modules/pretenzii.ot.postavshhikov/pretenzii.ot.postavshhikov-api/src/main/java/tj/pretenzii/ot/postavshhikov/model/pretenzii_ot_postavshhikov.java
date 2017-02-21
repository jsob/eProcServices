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

package tj.pretenzii.ot.postavshhikov.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the pretenzii_ot_postavshhikov service. Represents a row in the &quot;pretenzii_ot_postavshhikov_pretenzii_ot_postavshhikov&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see pretenzii_ot_postavshhikovModel
 * @see tj.pretenzii.ot.postavshhikov.model.impl.pretenzii_ot_postavshhikovImpl
 * @see tj.pretenzii.ot.postavshhikov.model.impl.pretenzii_ot_postavshhikovModelImpl
 * @generated
 */
@ImplementationClassName("tj.pretenzii.ot.postavshhikov.model.impl.pretenzii_ot_postavshhikovImpl")
@ProviderType
public interface pretenzii_ot_postavshhikov
	extends pretenzii_ot_postavshhikovModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.pretenzii.ot.postavshhikov.model.impl.pretenzii_ot_postavshhikovImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<pretenzii_ot_postavshhikov, Long> PRETENZII_OT_POSTAVSHHIKOV_ID_ACCESSOR =
		new Accessor<pretenzii_ot_postavshhikov, Long>() {
			@Override
			public Long get(
				pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
				return pretenzii_ot_postavshhikov.getPretenzii_ot_postavshhikov_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<pretenzii_ot_postavshhikov> getTypeClass() {
				return pretenzii_ot_postavshhikov.class;
			}
		};
}