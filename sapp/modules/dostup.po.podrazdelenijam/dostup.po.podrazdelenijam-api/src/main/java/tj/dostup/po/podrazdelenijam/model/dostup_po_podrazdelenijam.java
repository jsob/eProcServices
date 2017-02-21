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

package tj.dostup.po.podrazdelenijam.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the dostup_po_podrazdelenijam service. Represents a row in the &quot;sapp.dostup_po_podrazdelenijam&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see dostup_po_podrazdelenijamModel
 * @see tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamImpl
 * @see tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamModelImpl
 * @generated
 */
@ImplementationClassName("tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamImpl")
@ProviderType
public interface dostup_po_podrazdelenijam
	extends dostup_po_podrazdelenijamModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<dostup_po_podrazdelenijam, Long> DOSTUP_PO_PODRAZDELENIJAM_ID_ACCESSOR =
		new Accessor<dostup_po_podrazdelenijam, Long>() {
			@Override
			public Long get(dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
				return dostup_po_podrazdelenijam.getDostup_po_podrazdelenijam_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<dostup_po_podrazdelenijam> getTypeClass() {
				return dostup_po_podrazdelenijam.class;
			}
		};
}