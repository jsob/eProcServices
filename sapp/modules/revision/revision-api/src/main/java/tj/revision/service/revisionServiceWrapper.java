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

package tj.revision.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link revisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see revisionService
 * @generated
 */
@ProviderType
public class revisionServiceWrapper implements revisionService,
	ServiceWrapper<revisionService> {
	public revisionServiceWrapper(revisionService revisionService) {
		_revisionService = revisionService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _revisionService.getOSGiServiceIdentifier();
	}

	@Override
	public revisionService getWrappedService() {
		return _revisionService;
	}

	@Override
	public void setWrappedService(revisionService revisionService) {
		_revisionService = revisionService;
	}

	private revisionService _revisionService;
}