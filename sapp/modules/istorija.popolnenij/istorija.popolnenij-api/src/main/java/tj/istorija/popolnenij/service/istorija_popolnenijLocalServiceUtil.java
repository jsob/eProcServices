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

package tj.istorija.popolnenij.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for istorija_popolnenij. This utility wraps
 * {@link tj.istorija.popolnenij.service.impl.istorija_popolnenijLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see istorija_popolnenijLocalService
 * @see tj.istorija.popolnenij.service.base.istorija_popolnenijLocalServiceBaseImpl
 * @see tj.istorija.popolnenij.service.impl.istorija_popolnenijLocalServiceImpl
 * @generated
 */
@ProviderType
public class istorija_popolnenijLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.istorija.popolnenij.service.impl.istorija_popolnenijLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of istorija_popolnenijs.
	*
	* @return the number of istorija_popolnenijs
	*/
	public static int getistorija_popolnenijsCount() {
		return getService().getistorija_popolnenijsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istorija.popolnenij.model.impl.istorija_popolnenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istorija.popolnenij.model.impl.istorija_popolnenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the istorija_popolnenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istorija.popolnenij.model.impl.istorija_popolnenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istorija_popolnenijs
	* @param end the upper bound of the range of istorija_popolnenijs (not inclusive)
	* @return the range of istorija_popolnenijs
	*/
	public static java.util.List<tj.istorija.popolnenij.model.istorija_popolnenij> getistorija_popolnenijs(
		int start, int end) {
		return getService().getistorija_popolnenijs(start, end);
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
	* Adds the istorija_popolnenij to the database. Also notifies the appropriate model listeners.
	*
	* @param istorija_popolnenij the istorija_popolnenij
	* @return the istorija_popolnenij that was added
	*/
	public static tj.istorija.popolnenij.model.istorija_popolnenij addistorija_popolnenij(
		tj.istorija.popolnenij.model.istorija_popolnenij istorija_popolnenij) {
		return getService().addistorija_popolnenij(istorija_popolnenij);
	}

	/**
	* Creates a new istorija_popolnenij with the primary key. Does not add the istorija_popolnenij to the database.
	*
	* @param istorija_popolnenij_id the primary key for the new istorija_popolnenij
	* @return the new istorija_popolnenij
	*/
	public static tj.istorija.popolnenij.model.istorija_popolnenij createistorija_popolnenij(
		long istorija_popolnenij_id) {
		return getService().createistorija_popolnenij(istorija_popolnenij_id);
	}

	/**
	* Deletes the istorija_popolnenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param istorija_popolnenij_id the primary key of the istorija_popolnenij
	* @return the istorija_popolnenij that was removed
	* @throws PortalException if a istorija_popolnenij with the primary key could not be found
	*/
	public static tj.istorija.popolnenij.model.istorija_popolnenij deleteistorija_popolnenij(
		long istorija_popolnenij_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteistorija_popolnenij(istorija_popolnenij_id);
	}

	/**
	* Deletes the istorija_popolnenij from the database. Also notifies the appropriate model listeners.
	*
	* @param istorija_popolnenij the istorija_popolnenij
	* @return the istorija_popolnenij that was removed
	*/
	public static tj.istorija.popolnenij.model.istorija_popolnenij deleteistorija_popolnenij(
		tj.istorija.popolnenij.model.istorija_popolnenij istorija_popolnenij) {
		return getService().deleteistorija_popolnenij(istorija_popolnenij);
	}

	public static tj.istorija.popolnenij.model.istorija_popolnenij fetchistorija_popolnenij(
		long istorija_popolnenij_id) {
		return getService().fetchistorija_popolnenij(istorija_popolnenij_id);
	}

	/**
	* Returns the istorija_popolnenij with the primary key.
	*
	* @param istorija_popolnenij_id the primary key of the istorija_popolnenij
	* @return the istorija_popolnenij
	* @throws PortalException if a istorija_popolnenij with the primary key could not be found
	*/
	public static tj.istorija.popolnenij.model.istorija_popolnenij getistorija_popolnenij(
		long istorija_popolnenij_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getistorija_popolnenij(istorija_popolnenij_id);
	}

	/**
	* Updates the istorija_popolnenij in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param istorija_popolnenij the istorija_popolnenij
	* @return the istorija_popolnenij that was updated
	*/
	public static tj.istorija.popolnenij.model.istorija_popolnenij updateistorija_popolnenij(
		tj.istorija.popolnenij.model.istorija_popolnenij istorija_popolnenij) {
		return getService().updateistorija_popolnenij(istorija_popolnenij);
	}

	public static istorija_popolnenijLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<istorija_popolnenijLocalService, istorija_popolnenijLocalService> _serviceTracker =
		ServiceTrackerFactory.open(istorija_popolnenijLocalService.class);
}