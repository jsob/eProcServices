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

package tj.konkursnaja.dokumentacija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for konkursnaja_dokumentacija. This utility wraps
 * {@link tj.konkursnaja.dokumentacija.service.impl.konkursnaja_dokumentacijaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see konkursnaja_dokumentacijaLocalService
 * @see tj.konkursnaja.dokumentacija.service.base.konkursnaja_dokumentacijaLocalServiceBaseImpl
 * @see tj.konkursnaja.dokumentacija.service.impl.konkursnaja_dokumentacijaLocalServiceImpl
 * @generated
 */
@ProviderType
public class konkursnaja_dokumentacijaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.konkursnaja.dokumentacija.service.impl.konkursnaja_dokumentacijaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of konkursnaja_dokumentacijas.
	*
	* @return the number of konkursnaja_dokumentacijas
	*/
	public static int getkonkursnaja_dokumentacijasCount() {
		return getService().getkonkursnaja_dokumentacijasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the konkursnaja_dokumentacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of konkursnaja_dokumentacijas
	* @param end the upper bound of the range of konkursnaja_dokumentacijas (not inclusive)
	* @return the range of konkursnaja_dokumentacijas
	*/
	public static java.util.List<tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija> getkonkursnaja_dokumentacijas(
		int start, int end) {
		return getService().getkonkursnaja_dokumentacijas(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the konkursnaja_dokumentacija to the database. Also notifies the appropriate model listeners.
	*
	* @param konkursnaja_dokumentacija the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija that was added
	*/
	public static tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija addkonkursnaja_dokumentacija(
		tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		return getService()
				   .addkonkursnaja_dokumentacija(konkursnaja_dokumentacija);
	}

	/**
	* Creates a new konkursnaja_dokumentacija with the primary key. Does not add the konkursnaja_dokumentacija to the database.
	*
	* @param konkursnaja_dokumentacija_id the primary key for the new konkursnaja_dokumentacija
	* @return the new konkursnaja_dokumentacija
	*/
	public static tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija createkonkursnaja_dokumentacija(
		long konkursnaja_dokumentacija_id) {
		return getService()
				   .createkonkursnaja_dokumentacija(konkursnaja_dokumentacija_id);
	}

	/**
	* Deletes the konkursnaja_dokumentacija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param konkursnaja_dokumentacija_id the primary key of the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija that was removed
	* @throws PortalException if a konkursnaja_dokumentacija with the primary key could not be found
	*/
	public static tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija deletekonkursnaja_dokumentacija(
		long konkursnaja_dokumentacija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deletekonkursnaja_dokumentacija(konkursnaja_dokumentacija_id);
	}

	/**
	* Deletes the konkursnaja_dokumentacija from the database. Also notifies the appropriate model listeners.
	*
	* @param konkursnaja_dokumentacija the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija that was removed
	*/
	public static tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija deletekonkursnaja_dokumentacija(
		tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		return getService()
				   .deletekonkursnaja_dokumentacija(konkursnaja_dokumentacija);
	}

	public static tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija fetchkonkursnaja_dokumentacija(
		long konkursnaja_dokumentacija_id) {
		return getService()
				   .fetchkonkursnaja_dokumentacija(konkursnaja_dokumentacija_id);
	}

	/**
	* Returns the konkursnaja_dokumentacija with the primary key.
	*
	* @param konkursnaja_dokumentacija_id the primary key of the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija
	* @throws PortalException if a konkursnaja_dokumentacija with the primary key could not be found
	*/
	public static tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija getkonkursnaja_dokumentacija(
		long konkursnaja_dokumentacija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getkonkursnaja_dokumentacija(konkursnaja_dokumentacija_id);
	}

	/**
	* Updates the konkursnaja_dokumentacija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param konkursnaja_dokumentacija the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija that was updated
	*/
	public static tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija updatekonkursnaja_dokumentacija(
		tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		return getService()
				   .updatekonkursnaja_dokumentacija(konkursnaja_dokumentacija);
	}

	public static konkursnaja_dokumentacijaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<konkursnaja_dokumentacijaLocalService, konkursnaja_dokumentacijaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(konkursnaja_dokumentacijaLocalService.class);
}