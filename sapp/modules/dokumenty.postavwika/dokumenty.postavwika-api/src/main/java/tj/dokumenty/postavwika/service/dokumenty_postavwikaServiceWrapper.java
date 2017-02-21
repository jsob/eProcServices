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

package tj.dokumenty.postavwika.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link dokumenty_postavwikaService}.
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_postavwikaService
 * @generated
 */
@ProviderType
public class dokumenty_postavwikaServiceWrapper
	implements dokumenty_postavwikaService,
		ServiceWrapper<dokumenty_postavwikaService> {
	public dokumenty_postavwikaServiceWrapper(
		dokumenty_postavwikaService dokumenty_postavwikaService) {
		_dokumenty_postavwikaService = dokumenty_postavwikaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _dokumenty_postavwikaService.getOSGiServiceIdentifier();
	}

	@Override
	public dokumenty_postavwikaService getWrappedService() {
		return _dokumenty_postavwikaService;
	}

	@Override
	public void setWrappedService(
		dokumenty_postavwikaService dokumenty_postavwikaService) {
		_dokumenty_postavwikaService = dokumenty_postavwikaService;
	}

	private dokumenty_postavwikaService _dokumenty_postavwikaService;
}