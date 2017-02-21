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

package tj.dostup.po.podrazdelenijam.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link dostup_po_podrazdelenijamService}.
 *
 * @author Brian Wing Shun Chan
 * @see dostup_po_podrazdelenijamService
 * @generated
 */
@ProviderType
public class dostup_po_podrazdelenijamServiceWrapper
	implements dostup_po_podrazdelenijamService,
		ServiceWrapper<dostup_po_podrazdelenijamService> {
	public dostup_po_podrazdelenijamServiceWrapper(
		dostup_po_podrazdelenijamService dostup_po_podrazdelenijamService) {
		_dostup_po_podrazdelenijamService = dostup_po_podrazdelenijamService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _dostup_po_podrazdelenijamService.getOSGiServiceIdentifier();
	}

	@Override
	public dostup_po_podrazdelenijamService getWrappedService() {
		return _dostup_po_podrazdelenijamService;
	}

	@Override
	public void setWrappedService(
		dostup_po_podrazdelenijamService dostup_po_podrazdelenijamService) {
		_dostup_po_podrazdelenijamService = dostup_po_podrazdelenijamService;
	}

	private dostup_po_podrazdelenijamService _dostup_po_podrazdelenijamService;
}