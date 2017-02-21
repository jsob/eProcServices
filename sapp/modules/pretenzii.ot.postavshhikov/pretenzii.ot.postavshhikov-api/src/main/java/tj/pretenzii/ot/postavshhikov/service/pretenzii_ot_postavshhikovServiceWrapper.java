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

package tj.pretenzii.ot.postavshhikov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link pretenzii_ot_postavshhikovService}.
 *
 * @author Brian Wing Shun Chan
 * @see pretenzii_ot_postavshhikovService
 * @generated
 */
@ProviderType
public class pretenzii_ot_postavshhikovServiceWrapper
	implements pretenzii_ot_postavshhikovService,
		ServiceWrapper<pretenzii_ot_postavshhikovService> {
	public pretenzii_ot_postavshhikovServiceWrapper(
		pretenzii_ot_postavshhikovService pretenzii_ot_postavshhikovService) {
		_pretenzii_ot_postavshhikovService = pretenzii_ot_postavshhikovService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _pretenzii_ot_postavshhikovService.getOSGiServiceIdentifier();
	}

	@Override
	public pretenzii_ot_postavshhikovService getWrappedService() {
		return _pretenzii_ot_postavshhikovService;
	}

	@Override
	public void setWrappedService(
		pretenzii_ot_postavshhikovService pretenzii_ot_postavshhikovService) {
		_pretenzii_ot_postavshhikovService = pretenzii_ot_postavshhikovService;
	}

	private pretenzii_ot_postavshhikovService _pretenzii_ot_postavshhikovService;
}