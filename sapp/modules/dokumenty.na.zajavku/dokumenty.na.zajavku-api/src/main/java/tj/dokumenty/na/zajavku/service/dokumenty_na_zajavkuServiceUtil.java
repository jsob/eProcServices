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

package tj.dokumenty.na.zajavku.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for dokumenty_na_zajavku. This utility wraps
 * {@link tj.dokumenty.na.zajavku.service.impl.dokumenty_na_zajavkuServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_na_zajavkuService
 * @see tj.dokumenty.na.zajavku.service.base.dokumenty_na_zajavkuServiceBaseImpl
 * @see tj.dokumenty.na.zajavku.service.impl.dokumenty_na_zajavkuServiceImpl
 * @generated
 */
@ProviderType
public class dokumenty_na_zajavkuServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.dokumenty.na.zajavku.service.impl.dokumenty_na_zajavkuServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static dokumenty_na_zajavkuService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<dokumenty_na_zajavkuService, dokumenty_na_zajavkuService> _serviceTracker =
		ServiceTrackerFactory.open(dokumenty_na_zajavkuService.class);
}