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

package tj.istochnik.finansirovanija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link istochnik_finansirovanijaService}.
 *
 * @author Brian Wing Shun Chan
 * @see istochnik_finansirovanijaService
 * @generated
 */
@ProviderType
public class istochnik_finansirovanijaServiceWrapper
	implements istochnik_finansirovanijaService,
		ServiceWrapper<istochnik_finansirovanijaService> {
	public istochnik_finansirovanijaServiceWrapper(
		istochnik_finansirovanijaService istochnik_finansirovanijaService) {
		_istochnik_finansirovanijaService = istochnik_finansirovanijaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _istochnik_finansirovanijaService.getOSGiServiceIdentifier();
	}

	@Override
	public istochnik_finansirovanijaService getWrappedService() {
		return _istochnik_finansirovanijaService;
	}

	@Override
	public void setWrappedService(
		istochnik_finansirovanijaService istochnik_finansirovanijaService) {
		_istochnik_finansirovanijaService = istochnik_finansirovanijaService;
	}

	private istochnik_finansirovanijaService _istochnik_finansirovanijaService;
}