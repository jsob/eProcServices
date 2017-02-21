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

package tj.podtverzhdenie.na.uchastie.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link podtverzhdenie_na_uchastieService}.
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_na_uchastieService
 * @generated
 */
@ProviderType
public class podtverzhdenie_na_uchastieServiceWrapper
	implements podtverzhdenie_na_uchastieService,
		ServiceWrapper<podtverzhdenie_na_uchastieService> {
	public podtverzhdenie_na_uchastieServiceWrapper(
		podtverzhdenie_na_uchastieService podtverzhdenie_na_uchastieService) {
		_podtverzhdenie_na_uchastieService = podtverzhdenie_na_uchastieService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _podtverzhdenie_na_uchastieService.getOSGiServiceIdentifier();
	}

	@Override
	public podtverzhdenie_na_uchastieService getWrappedService() {
		return _podtverzhdenie_na_uchastieService;
	}

	@Override
	public void setWrappedService(
		podtverzhdenie_na_uchastieService podtverzhdenie_na_uchastieService) {
		_podtverzhdenie_na_uchastieService = podtverzhdenie_na_uchastieService;
	}

	private podtverzhdenie_na_uchastieService _podtverzhdenie_na_uchastieService;
}