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

package tj.tipy.dokumentov.postavwika.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link tipy_dokumentov_postavwikaService}.
 *
 * @author Brian Wing Shun Chan
 * @see tipy_dokumentov_postavwikaService
 * @generated
 */
@ProviderType
public class tipy_dokumentov_postavwikaServiceWrapper
	implements tipy_dokumentov_postavwikaService,
		ServiceWrapper<tipy_dokumentov_postavwikaService> {
	public tipy_dokumentov_postavwikaServiceWrapper(
		tipy_dokumentov_postavwikaService tipy_dokumentov_postavwikaService) {
		_tipy_dokumentov_postavwikaService = tipy_dokumentov_postavwikaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tipy_dokumentov_postavwikaService.getOSGiServiceIdentifier();
	}

	@Override
	public tipy_dokumentov_postavwikaService getWrappedService() {
		return _tipy_dokumentov_postavwikaService;
	}

	@Override
	public void setWrappedService(
		tipy_dokumentov_postavwikaService tipy_dokumentov_postavwikaService) {
		_tipy_dokumentov_postavwikaService = tipy_dokumentov_postavwikaService;
	}

	private tipy_dokumentov_postavwikaService _tipy_dokumentov_postavwikaService;
}