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

package tj.podrazdelenija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link podrazdelenijaService}.
 *
 * @author Brian Wing Shun Chan
 * @see podrazdelenijaService
 * @generated
 */
@ProviderType
public class podrazdelenijaServiceWrapper implements podrazdelenijaService,
	ServiceWrapper<podrazdelenijaService> {
	public podrazdelenijaServiceWrapper(
		podrazdelenijaService podrazdelenijaService) {
		_podrazdelenijaService = podrazdelenijaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _podrazdelenijaService.getOSGiServiceIdentifier();
	}

	@Override
	public podrazdelenijaService getWrappedService() {
		return _podrazdelenijaService;
	}

	@Override
	public void setWrappedService(podrazdelenijaService podrazdelenijaService) {
		_podrazdelenijaService = podrazdelenijaService;
	}

	private podrazdelenijaService _podrazdelenijaService;
}