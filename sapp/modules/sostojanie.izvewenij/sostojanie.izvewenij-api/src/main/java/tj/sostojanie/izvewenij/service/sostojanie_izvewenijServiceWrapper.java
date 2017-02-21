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

package tj.sostojanie.izvewenij.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link sostojanie_izvewenijService}.
 *
 * @author Brian Wing Shun Chan
 * @see sostojanie_izvewenijService
 * @generated
 */
@ProviderType
public class sostojanie_izvewenijServiceWrapper
	implements sostojanie_izvewenijService,
		ServiceWrapper<sostojanie_izvewenijService> {
	public sostojanie_izvewenijServiceWrapper(
		sostojanie_izvewenijService sostojanie_izvewenijService) {
		_sostojanie_izvewenijService = sostojanie_izvewenijService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _sostojanie_izvewenijService.getOSGiServiceIdentifier();
	}

	@Override
	public sostojanie_izvewenijService getWrappedService() {
		return _sostojanie_izvewenijService;
	}

	@Override
	public void setWrappedService(
		sostojanie_izvewenijService sostojanie_izvewenijService) {
		_sostojanie_izvewenijService = sostojanie_izvewenijService;
	}

	private sostojanie_izvewenijService _sostojanie_izvewenijService;
}