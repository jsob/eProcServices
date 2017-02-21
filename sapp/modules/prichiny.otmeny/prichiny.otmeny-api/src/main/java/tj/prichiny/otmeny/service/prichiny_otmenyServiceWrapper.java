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

package tj.prichiny.otmeny.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link prichiny_otmenyService}.
 *
 * @author Brian Wing Shun Chan
 * @see prichiny_otmenyService
 * @generated
 */
@ProviderType
public class prichiny_otmenyServiceWrapper implements prichiny_otmenyService,
	ServiceWrapper<prichiny_otmenyService> {
	public prichiny_otmenyServiceWrapper(
		prichiny_otmenyService prichiny_otmenyService) {
		_prichiny_otmenyService = prichiny_otmenyService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _prichiny_otmenyService.getOSGiServiceIdentifier();
	}

	@Override
	public prichiny_otmenyService getWrappedService() {
		return _prichiny_otmenyService;
	}

	@Override
	public void setWrappedService(prichiny_otmenyService prichiny_otmenyService) {
		_prichiny_otmenyService = prichiny_otmenyService;
	}

	private prichiny_otmenyService _prichiny_otmenyService;
}