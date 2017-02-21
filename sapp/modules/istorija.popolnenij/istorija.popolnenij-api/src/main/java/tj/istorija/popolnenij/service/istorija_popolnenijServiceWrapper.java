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

package tj.istorija.popolnenij.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link istorija_popolnenijService}.
 *
 * @author Brian Wing Shun Chan
 * @see istorija_popolnenijService
 * @generated
 */
@ProviderType
public class istorija_popolnenijServiceWrapper
	implements istorija_popolnenijService,
		ServiceWrapper<istorija_popolnenijService> {
	public istorija_popolnenijServiceWrapper(
		istorija_popolnenijService istorija_popolnenijService) {
		_istorija_popolnenijService = istorija_popolnenijService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _istorija_popolnenijService.getOSGiServiceIdentifier();
	}

	@Override
	public istorija_popolnenijService getWrappedService() {
		return _istorija_popolnenijService;
	}

	@Override
	public void setWrappedService(
		istorija_popolnenijService istorija_popolnenijService) {
		_istorija_popolnenijService = istorija_popolnenijService;
	}

	private istorija_popolnenijService _istorija_popolnenijService;
}