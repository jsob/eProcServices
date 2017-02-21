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

package tj.porjadok.raboty.komissii.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for porjadok_raboty_komissii. This utility wraps
 * {@link tj.porjadok.raboty.komissii.service.impl.porjadok_raboty_komissiiLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see porjadok_raboty_komissiiLocalService
 * @see tj.porjadok.raboty.komissii.service.base.porjadok_raboty_komissiiLocalServiceBaseImpl
 * @see tj.porjadok.raboty.komissii.service.impl.porjadok_raboty_komissiiLocalServiceImpl
 * @generated
 */
@ProviderType
public class porjadok_raboty_komissiiLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.porjadok.raboty.komissii.service.impl.porjadok_raboty_komissiiLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of porjadok_raboty_komissiis.
	*
	* @return the number of porjadok_raboty_komissiis
	*/
	public static int getporjadok_raboty_komissiisCount() {
		return getService().getporjadok_raboty_komissiisCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.porjadok.raboty.komissii.model.impl.porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.porjadok.raboty.komissii.model.impl.porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the porjadok_raboty_komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.porjadok.raboty.komissii.model.impl.porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok_raboty_komissiis
	* @param end the upper bound of the range of porjadok_raboty_komissiis (not inclusive)
	* @return the range of porjadok_raboty_komissiis
	*/
	public static java.util.List<tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii> getporjadok_raboty_komissiis(
		int start, int end) {
		return getService().getporjadok_raboty_komissiis(start, end);
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
	* Adds the porjadok_raboty_komissii to the database. Also notifies the appropriate model listeners.
	*
	* @param porjadok_raboty_komissii the porjadok_raboty_komissii
	* @return the porjadok_raboty_komissii that was added
	*/
	public static tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii addporjadok_raboty_komissii(
		tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii porjadok_raboty_komissii) {
		return getService().addporjadok_raboty_komissii(porjadok_raboty_komissii);
	}

	/**
	* Creates a new porjadok_raboty_komissii with the primary key. Does not add the porjadok_raboty_komissii to the database.
	*
	* @param porjadok_raboty_komissii_id the primary key for the new porjadok_raboty_komissii
	* @return the new porjadok_raboty_komissii
	*/
	public static tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii createporjadok_raboty_komissii(
		long porjadok_raboty_komissii_id) {
		return getService()
				   .createporjadok_raboty_komissii(porjadok_raboty_komissii_id);
	}

	/**
	* Deletes the porjadok_raboty_komissii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok_raboty_komissii
	* @return the porjadok_raboty_komissii that was removed
	* @throws PortalException if a porjadok_raboty_komissii with the primary key could not be found
	*/
	public static tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii deleteporjadok_raboty_komissii(
		long porjadok_raboty_komissii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleteporjadok_raboty_komissii(porjadok_raboty_komissii_id);
	}

	/**
	* Deletes the porjadok_raboty_komissii from the database. Also notifies the appropriate model listeners.
	*
	* @param porjadok_raboty_komissii the porjadok_raboty_komissii
	* @return the porjadok_raboty_komissii that was removed
	*/
	public static tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii deleteporjadok_raboty_komissii(
		tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii porjadok_raboty_komissii) {
		return getService()
				   .deleteporjadok_raboty_komissii(porjadok_raboty_komissii);
	}

	public static tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii fetchporjadok_raboty_komissii(
		long porjadok_raboty_komissii_id) {
		return getService()
				   .fetchporjadok_raboty_komissii(porjadok_raboty_komissii_id);
	}

	/**
	* Returns the porjadok_raboty_komissii with the primary key.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok_raboty_komissii
	* @return the porjadok_raboty_komissii
	* @throws PortalException if a porjadok_raboty_komissii with the primary key could not be found
	*/
	public static tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii getporjadok_raboty_komissii(
		long porjadok_raboty_komissii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getporjadok_raboty_komissii(porjadok_raboty_komissii_id);
	}

	/**
	* Updates the porjadok_raboty_komissii in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param porjadok_raboty_komissii the porjadok_raboty_komissii
	* @return the porjadok_raboty_komissii that was updated
	*/
	public static tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii updateporjadok_raboty_komissii(
		tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii porjadok_raboty_komissii) {
		return getService()
				   .updateporjadok_raboty_komissii(porjadok_raboty_komissii);
	}

	public static porjadok_raboty_komissiiLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<porjadok_raboty_komissiiLocalService, porjadok_raboty_komissiiLocalService> _serviceTracker =
		ServiceTrackerFactory.open(porjadok_raboty_komissiiLocalService.class);
}