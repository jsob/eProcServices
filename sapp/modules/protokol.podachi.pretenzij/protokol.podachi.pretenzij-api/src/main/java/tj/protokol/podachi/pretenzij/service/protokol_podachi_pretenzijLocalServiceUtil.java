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

package tj.protokol.podachi.pretenzij.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for protokol_podachi_pretenzij. This utility wraps
 * {@link tj.protokol.podachi.pretenzij.service.impl.protokol_podachi_pretenzijLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_podachi_pretenzijLocalService
 * @see tj.protokol.podachi.pretenzij.service.base.protokol_podachi_pretenzijLocalServiceBaseImpl
 * @see tj.protokol.podachi.pretenzij.service.impl.protokol_podachi_pretenzijLocalServiceImpl
 * @generated
 */
@ProviderType
public class protokol_podachi_pretenzijLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.protokol.podachi.pretenzij.service.impl.protokol_podachi_pretenzijLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of protokol_podachi_pretenzijs.
	*
	* @return the number of protokol_podachi_pretenzijs
	*/
	public static int getprotokol_podachi_pretenzijsCount() {
		return getService().getprotokol_podachi_pretenzijsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the protokol_podachi_pretenzijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_podachi_pretenzijs
	* @param end the upper bound of the range of protokol_podachi_pretenzijs (not inclusive)
	* @return the range of protokol_podachi_pretenzijs
	*/
	public static java.util.List<tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij> getprotokol_podachi_pretenzijs(
		int start, int end) {
		return getService().getprotokol_podachi_pretenzijs(start, end);
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
	* Adds the protokol_podachi_pretenzij to the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_podachi_pretenzij the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij that was added
	*/
	public static tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij addprotokol_podachi_pretenzij(
		tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		return getService()
				   .addprotokol_podachi_pretenzij(protokol_podachi_pretenzij);
	}

	/**
	* Creates a new protokol_podachi_pretenzij with the primary key. Does not add the protokol_podachi_pretenzij to the database.
	*
	* @param protokol_podachi_pretenzij_id the primary key for the new protokol_podachi_pretenzij
	* @return the new protokol_podachi_pretenzij
	*/
	public static tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij createprotokol_podachi_pretenzij(
		long protokol_podachi_pretenzij_id) {
		return getService()
				   .createprotokol_podachi_pretenzij(protokol_podachi_pretenzij_id);
	}

	/**
	* Deletes the protokol_podachi_pretenzij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_podachi_pretenzij_id the primary key of the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij that was removed
	* @throws PortalException if a protokol_podachi_pretenzij with the primary key could not be found
	*/
	public static tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij deleteprotokol_podachi_pretenzij(
		long protokol_podachi_pretenzij_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleteprotokol_podachi_pretenzij(protokol_podachi_pretenzij_id);
	}

	/**
	* Deletes the protokol_podachi_pretenzij from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_podachi_pretenzij the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij that was removed
	*/
	public static tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij deleteprotokol_podachi_pretenzij(
		tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		return getService()
				   .deleteprotokol_podachi_pretenzij(protokol_podachi_pretenzij);
	}

	public static tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij fetchprotokol_podachi_pretenzij(
		long protokol_podachi_pretenzij_id) {
		return getService()
				   .fetchprotokol_podachi_pretenzij(protokol_podachi_pretenzij_id);
	}

	/**
	* Returns the protokol_podachi_pretenzij with the primary key.
	*
	* @param protokol_podachi_pretenzij_id the primary key of the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij
	* @throws PortalException if a protokol_podachi_pretenzij with the primary key could not be found
	*/
	public static tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij getprotokol_podachi_pretenzij(
		long protokol_podachi_pretenzij_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getprotokol_podachi_pretenzij(protokol_podachi_pretenzij_id);
	}

	/**
	* Updates the protokol_podachi_pretenzij in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param protokol_podachi_pretenzij the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij that was updated
	*/
	public static tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij updateprotokol_podachi_pretenzij(
		tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		return getService()
				   .updateprotokol_podachi_pretenzij(protokol_podachi_pretenzij);
	}

	public static protokol_podachi_pretenzijLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<protokol_podachi_pretenzijLocalService, protokol_podachi_pretenzijLocalService> _serviceTracker =
		ServiceTrackerFactory.open(protokol_podachi_pretenzijLocalService.class);
}