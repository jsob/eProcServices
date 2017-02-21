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

package tj.dostup.po.podrazdelenijam.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam;
import tj.dostup.po.podrazdelenijam.service.dostup_po_podrazdelenijamLocalServiceUtil;

/**
 * The extended model base implementation for the dostup_po_podrazdelenijam service. Represents a row in the &quot;sapp.dostup_po_podrazdelenijam&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link dostup_po_podrazdelenijamImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dostup_po_podrazdelenijamImpl
 * @see dostup_po_podrazdelenijam
 * @generated
 */
@ProviderType
public abstract class dostup_po_podrazdelenijamBaseImpl
	extends dostup_po_podrazdelenijamModelImpl
	implements dostup_po_podrazdelenijam {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dostup_po_podrazdelenijam model instance should use the {@link dostup_po_podrazdelenijam} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			dostup_po_podrazdelenijamLocalServiceUtil.adddostup_po_podrazdelenijam(this);
		}
		else {
			dostup_po_podrazdelenijamLocalServiceUtil.updatedostup_po_podrazdelenijam(this);
		}
	}
}