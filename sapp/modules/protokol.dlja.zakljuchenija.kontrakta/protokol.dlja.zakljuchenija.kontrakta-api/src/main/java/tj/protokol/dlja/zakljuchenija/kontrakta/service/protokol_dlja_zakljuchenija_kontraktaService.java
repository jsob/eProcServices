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

package tj.protokol.dlja.zakljuchenija.kontrakta.service;

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
 * Provides the remote service interface for protokol_dlja_zakljuchenija_kontrakta. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_dlja_zakljuchenija_kontraktaServiceUtil
 * @see tj.protokol.dlja.zakljuchenija.kontrakta.service.base.protokol_dlja_zakljuchenija_kontraktaServiceBaseImpl
 * @see tj.protokol.dlja.zakljuchenija.kontrakta.service.impl.protokol_dlja_zakljuchenija_kontraktaServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=protokol_dlja_zakljuchenija_kontrakta", "json.web.service.context.path=protokol_dlja_zakljuchenija_kontrakta"}, service = protokol_dlja_zakljuchenija_kontraktaService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface protokol_dlja_zakljuchenija_kontraktaService
	extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link protokol_dlja_zakljuchenija_kontraktaServiceUtil} to access the protokol_dlja_zakljuchenija_kontrakta remote service. Add custom service methods to {@link tj.protokol.dlja.zakljuchenija.kontrakta.service.impl.protokol_dlja_zakljuchenija_kontraktaServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();
}