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

package tj.profil.polzovatelej.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link profil_polzovatelejService}.
 *
 * @author Brian Wing Shun Chan
 * @see profil_polzovatelejService
 * @generated
 */
@ProviderType
public class profil_polzovatelejServiceWrapper
	implements profil_polzovatelejService,
		ServiceWrapper<profil_polzovatelejService> {
	public profil_polzovatelejServiceWrapper(
		profil_polzovatelejService profil_polzovatelejService) {
		_profil_polzovatelejService = profil_polzovatelejService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _profil_polzovatelejService.getOSGiServiceIdentifier();
	}

	@Override
	public profil_polzovatelejService getWrappedService() {
		return _profil_polzovatelejService;
	}

	@Override
	public void setWrappedService(
		profil_polzovatelejService profil_polzovatelejService) {
		_profil_polzovatelejService = profil_polzovatelejService;
	}

	private profil_polzovatelejService _profil_polzovatelejService;
}