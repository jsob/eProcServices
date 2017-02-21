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

package tj.podrazdelenija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for podrazdelenija. This utility wraps
 * {@link tj.podrazdelenija.service.impl.podrazdelenijaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see podrazdelenijaLocalService
 * @see tj.podrazdelenija.service.base.podrazdelenijaLocalServiceBaseImpl
 * @see tj.podrazdelenija.service.impl.podrazdelenijaLocalServiceImpl
 * @generated
 */
@ProviderType
public class podrazdelenijaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.podrazdelenija.service.impl.podrazdelenijaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of podrazdelenijas.
	*
	* @return the number of podrazdelenijas
	*/
	public static int getpodrazdelenijasCount() {
		return getService().getpodrazdelenijasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podrazdelenija.model.impl.podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podrazdelenija.model.impl.podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the podrazdelenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podrazdelenija.model.impl.podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podrazdelenijas
	* @param end the upper bound of the range of podrazdelenijas (not inclusive)
	* @return the range of podrazdelenijas
	*/
	public static java.util.List<tj.podrazdelenija.model.podrazdelenija> getpodrazdelenijas(
		int start, int end) {
		return getService().getpodrazdelenijas(start, end);
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
	* Adds the podrazdelenija to the database. Also notifies the appropriate model listeners.
	*
	* @param podrazdelenija the podrazdelenija
	* @return the podrazdelenija that was added
	*/
	public static tj.podrazdelenija.model.podrazdelenija addpodrazdelenija(
		tj.podrazdelenija.model.podrazdelenija podrazdelenija) {
		return getService().addpodrazdelenija(podrazdelenija);
	}

	/**
	* Creates a new podrazdelenija with the primary key. Does not add the podrazdelenija to the database.
	*
	* @param podrazdelenija_id the primary key for the new podrazdelenija
	* @return the new podrazdelenija
	*/
	public static tj.podrazdelenija.model.podrazdelenija createpodrazdelenija(
		long podrazdelenija_id) {
		return getService().createpodrazdelenija(podrazdelenija_id);
	}

	/**
	* Deletes the podrazdelenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param podrazdelenija_id the primary key of the podrazdelenija
	* @return the podrazdelenija that was removed
	* @throws PortalException if a podrazdelenija with the primary key could not be found
	*/
	public static tj.podrazdelenija.model.podrazdelenija deletepodrazdelenija(
		long podrazdelenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletepodrazdelenija(podrazdelenija_id);
	}

	/**
	* Deletes the podrazdelenija from the database. Also notifies the appropriate model listeners.
	*
	* @param podrazdelenija the podrazdelenija
	* @return the podrazdelenija that was removed
	*/
	public static tj.podrazdelenija.model.podrazdelenija deletepodrazdelenija(
		tj.podrazdelenija.model.podrazdelenija podrazdelenija) {
		return getService().deletepodrazdelenija(podrazdelenija);
	}

	public static tj.podrazdelenija.model.podrazdelenija fetchpodrazdelenija(
		long podrazdelenija_id) {
		return getService().fetchpodrazdelenija(podrazdelenija_id);
	}

	/**
	* Returns the podrazdelenija with the primary key.
	*
	* @param podrazdelenija_id the primary key of the podrazdelenija
	* @return the podrazdelenija
	* @throws PortalException if a podrazdelenija with the primary key could not be found
	*/
	public static tj.podrazdelenija.model.podrazdelenija getpodrazdelenija(
		long podrazdelenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getpodrazdelenija(podrazdelenija_id);
	}

	/**
	* Updates the podrazdelenija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param podrazdelenija the podrazdelenija
	* @return the podrazdelenija that was updated
	*/
	public static tj.podrazdelenija.model.podrazdelenija updatepodrazdelenija(
		tj.podrazdelenija.model.podrazdelenija podrazdelenija) {
		return getService().updatepodrazdelenija(podrazdelenija);
	}

	public static podrazdelenijaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<podrazdelenijaLocalService, podrazdelenijaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(podrazdelenijaLocalService.class);
}