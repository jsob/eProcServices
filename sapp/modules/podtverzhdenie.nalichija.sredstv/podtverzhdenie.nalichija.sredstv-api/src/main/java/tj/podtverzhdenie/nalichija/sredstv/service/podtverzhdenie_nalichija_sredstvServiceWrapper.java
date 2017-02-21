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

package tj.podtverzhdenie.nalichija.sredstv.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link podtverzhdenie_nalichija_sredstvService}.
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_nalichija_sredstvService
 * @generated
 */
@ProviderType
public class podtverzhdenie_nalichija_sredstvServiceWrapper
	implements podtverzhdenie_nalichija_sredstvService,
		ServiceWrapper<podtverzhdenie_nalichija_sredstvService> {
	public podtverzhdenie_nalichija_sredstvServiceWrapper(
		podtverzhdenie_nalichija_sredstvService podtverzhdenie_nalichija_sredstvService) {
		_podtverzhdenie_nalichija_sredstvService = podtverzhdenie_nalichija_sredstvService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _podtverzhdenie_nalichija_sredstvService.getOSGiServiceIdentifier();
	}

	@Override
	public podtverzhdenie_nalichija_sredstvService getWrappedService() {
		return _podtverzhdenie_nalichija_sredstvService;
	}

	@Override
	public void setWrappedService(
		podtverzhdenie_nalichija_sredstvService podtverzhdenie_nalichija_sredstvService) {
		_podtverzhdenie_nalichija_sredstvService = podtverzhdenie_nalichija_sredstvService;
	}

	private podtverzhdenie_nalichija_sredstvService _podtverzhdenie_nalichija_sredstvService;
}