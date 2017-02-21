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

package tj.prochaja.informacija.dlja.zajavki.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for prochaja_informacija_dlja_zajavki. This utility wraps
 * {@link tj.prochaja.informacija.dlja.zajavki.service.impl.prochaja_informacija_dlja_zajavkiServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see prochaja_informacija_dlja_zajavkiService
 * @see tj.prochaja.informacija.dlja.zajavki.service.base.prochaja_informacija_dlja_zajavkiServiceBaseImpl
 * @see tj.prochaja.informacija.dlja.zajavki.service.impl.prochaja_informacija_dlja_zajavkiServiceImpl
 * @generated
 */
@ProviderType
public class prochaja_informacija_dlja_zajavkiServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.prochaja.informacija.dlja.zajavki.service.impl.prochaja_informacija_dlja_zajavkiServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static prochaja_informacija_dlja_zajavkiService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<prochaja_informacija_dlja_zajavkiService, prochaja_informacija_dlja_zajavkiService> _serviceTracker =
		ServiceTrackerFactory.open(prochaja_informacija_dlja_zajavkiService.class);
}