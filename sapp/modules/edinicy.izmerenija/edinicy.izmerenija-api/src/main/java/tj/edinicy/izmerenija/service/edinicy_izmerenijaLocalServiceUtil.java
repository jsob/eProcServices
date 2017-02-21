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

package tj.edinicy.izmerenija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for edinicy_izmerenija. This utility wraps
 * {@link tj.edinicy.izmerenija.service.impl.edinicy_izmerenijaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see edinicy_izmerenijaLocalService
 * @see tj.edinicy.izmerenija.service.base.edinicy_izmerenijaLocalServiceBaseImpl
 * @see tj.edinicy.izmerenija.service.impl.edinicy_izmerenijaLocalServiceImpl
 * @generated
 */
@ProviderType
public class edinicy_izmerenijaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.edinicy.izmerenija.service.impl.edinicy_izmerenijaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of edinicy_izmerenijas.
	*
	* @return the number of edinicy_izmerenijas
	*/
	public static int getedinicy_izmerenijasCount() {
		return getService().getedinicy_izmerenijasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.edinicy.izmerenija.model.impl.edinicy_izmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.edinicy.izmerenija.model.impl.edinicy_izmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the edinicy_izmerenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.edinicy.izmerenija.model.impl.edinicy_izmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of edinicy_izmerenijas
	* @param end the upper bound of the range of edinicy_izmerenijas (not inclusive)
	* @return the range of edinicy_izmerenijas
	*/
	public static java.util.List<tj.edinicy.izmerenija.model.edinicy_izmerenija> getedinicy_izmerenijas(
		int start, int end) {
		return getService().getedinicy_izmerenijas(start, end);
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
	* Adds the edinicy_izmerenija to the database. Also notifies the appropriate model listeners.
	*
	* @param edinicy_izmerenija the edinicy_izmerenija
	* @return the edinicy_izmerenija that was added
	*/
	public static tj.edinicy.izmerenija.model.edinicy_izmerenija addedinicy_izmerenija(
		tj.edinicy.izmerenija.model.edinicy_izmerenija edinicy_izmerenija) {
		return getService().addedinicy_izmerenija(edinicy_izmerenija);
	}

	/**
	* Creates a new edinicy_izmerenija with the primary key. Does not add the edinicy_izmerenija to the database.
	*
	* @param edinicy_izmerenija_id the primary key for the new edinicy_izmerenija
	* @return the new edinicy_izmerenija
	*/
	public static tj.edinicy.izmerenija.model.edinicy_izmerenija createedinicy_izmerenija(
		long edinicy_izmerenija_id) {
		return getService().createedinicy_izmerenija(edinicy_izmerenija_id);
	}

	/**
	* Deletes the edinicy_izmerenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param edinicy_izmerenija_id the primary key of the edinicy_izmerenija
	* @return the edinicy_izmerenija that was removed
	* @throws PortalException if a edinicy_izmerenija with the primary key could not be found
	*/
	public static tj.edinicy.izmerenija.model.edinicy_izmerenija deleteedinicy_izmerenija(
		long edinicy_izmerenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteedinicy_izmerenija(edinicy_izmerenija_id);
	}

	/**
	* Deletes the edinicy_izmerenija from the database. Also notifies the appropriate model listeners.
	*
	* @param edinicy_izmerenija the edinicy_izmerenija
	* @return the edinicy_izmerenija that was removed
	*/
	public static tj.edinicy.izmerenija.model.edinicy_izmerenija deleteedinicy_izmerenija(
		tj.edinicy.izmerenija.model.edinicy_izmerenija edinicy_izmerenija) {
		return getService().deleteedinicy_izmerenija(edinicy_izmerenija);
	}

	public static tj.edinicy.izmerenija.model.edinicy_izmerenija fetchedinicy_izmerenija(
		long edinicy_izmerenija_id) {
		return getService().fetchedinicy_izmerenija(edinicy_izmerenija_id);
	}

	/**
	* Returns the edinicy_izmerenija with the primary key.
	*
	* @param edinicy_izmerenija_id the primary key of the edinicy_izmerenija
	* @return the edinicy_izmerenija
	* @throws PortalException if a edinicy_izmerenija with the primary key could not be found
	*/
	public static tj.edinicy.izmerenija.model.edinicy_izmerenija getedinicy_izmerenija(
		long edinicy_izmerenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getedinicy_izmerenija(edinicy_izmerenija_id);
	}

	/**
	* Updates the edinicy_izmerenija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param edinicy_izmerenija the edinicy_izmerenija
	* @return the edinicy_izmerenija that was updated
	*/
	public static tj.edinicy.izmerenija.model.edinicy_izmerenija updateedinicy_izmerenija(
		tj.edinicy.izmerenija.model.edinicy_izmerenija edinicy_izmerenija) {
		return getService().updateedinicy_izmerenija(edinicy_izmerenija);
	}

	public static edinicy_izmerenijaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<edinicy_izmerenijaLocalService, edinicy_izmerenijaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(edinicy_izmerenijaLocalService.class);
}