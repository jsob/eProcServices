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

package tj.ocenka.uchastnikam.v.moment.vskrytija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

/**
 * Provides the remote service interface for ocenka_uchastnikam_v_moment_vskrytija. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ocenka_uchastnikam_v_moment_vskrytijaServiceUtil
 * @see tj.ocenka.uchastnikam.v.moment.vskrytija.service.base.ocenka_uchastnikam_v_moment_vskrytijaServiceBaseImpl
 * @see tj.ocenka.uchastnikam.v.moment.vskrytija.service.impl.ocenka_uchastnikam_v_moment_vskrytijaServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=ocenka_uchastnikam_v_moment_vskrytija", "json.web.service.context.path=ocenka_uchastnikam_v_moment_vskrytija"}, service = ocenka_uchastnikam_v_moment_vskrytijaService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ocenka_uchastnikam_v_moment_vskrytijaService
	extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ocenka_uchastnikam_v_moment_vskrytijaServiceUtil} to access the ocenka_uchastnikam_v_moment_vskrytija remote service. Add custom service methods to {@link tj.ocenka.uchastnikam.v.moment.vskrytija.service.impl.ocenka_uchastnikam_v_moment_vskrytijaServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();
}