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

package tj.godovoj.plan.zakupok.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link godovoj_plan_zakupokService}.
 *
 * @author Brian Wing Shun Chan
 * @see godovoj_plan_zakupokService
 * @generated
 */
@ProviderType
public class godovoj_plan_zakupokServiceWrapper
	implements godovoj_plan_zakupokService,
		ServiceWrapper<godovoj_plan_zakupokService> {
	public godovoj_plan_zakupokServiceWrapper(
		godovoj_plan_zakupokService godovoj_plan_zakupokService) {
		_godovoj_plan_zakupokService = godovoj_plan_zakupokService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _godovoj_plan_zakupokService.getOSGiServiceIdentifier();
	}

	@Override
	public godovoj_plan_zakupokService getWrappedService() {
		return _godovoj_plan_zakupokService;
	}

	@Override
	public void setWrappedService(
		godovoj_plan_zakupokService godovoj_plan_zakupokService) {
		_godovoj_plan_zakupokService = godovoj_plan_zakupokService;
	}

	private godovoj_plan_zakupokService _godovoj_plan_zakupokService;
}