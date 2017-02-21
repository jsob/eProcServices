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

package tj.istochnik.finansirovanija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for istochnik_finansirovanija. This utility wraps
 * {@link tj.istochnik.finansirovanija.service.impl.istochnik_finansirovanijaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see istochnik_finansirovanijaLocalService
 * @see tj.istochnik.finansirovanija.service.base.istochnik_finansirovanijaLocalServiceBaseImpl
 * @see tj.istochnik.finansirovanija.service.impl.istochnik_finansirovanijaLocalServiceImpl
 * @generated
 */
@ProviderType
public class istochnik_finansirovanijaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.istochnik.finansirovanija.service.impl.istochnik_finansirovanijaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of istochnik_finansirovanijas.
	*
	* @return the number of istochnik_finansirovanijas
	*/
	public static int getistochnik_finansirovanijasCount() {
		return getService().getistochnik_finansirovanijasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the istochnik_finansirovanijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istochnik_finansirovanijas
	* @param end the upper bound of the range of istochnik_finansirovanijas (not inclusive)
	* @return the range of istochnik_finansirovanijas
	*/
	public static java.util.List<tj.istochnik.finansirovanija.model.istochnik_finansirovanija> getistochnik_finansirovanijas(
		int start, int end) {
		return getService().getistochnik_finansirovanijas(start, end);
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
	* Adds the istochnik_finansirovanija to the database. Also notifies the appropriate model listeners.
	*
	* @param istochnik_finansirovanija the istochnik_finansirovanija
	* @return the istochnik_finansirovanija that was added
	*/
	public static tj.istochnik.finansirovanija.model.istochnik_finansirovanija addistochnik_finansirovanija(
		tj.istochnik.finansirovanija.model.istochnik_finansirovanija istochnik_finansirovanija) {
		return getService()
				   .addistochnik_finansirovanija(istochnik_finansirovanija);
	}

	/**
	* Creates a new istochnik_finansirovanija with the primary key. Does not add the istochnik_finansirovanija to the database.
	*
	* @param istochnik_finansirovanija_id the primary key for the new istochnik_finansirovanija
	* @return the new istochnik_finansirovanija
	*/
	public static tj.istochnik.finansirovanija.model.istochnik_finansirovanija createistochnik_finansirovanija(
		long istochnik_finansirovanija_id) {
		return getService()
				   .createistochnik_finansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Deletes the istochnik_finansirovanija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik_finansirovanija
	* @return the istochnik_finansirovanija that was removed
	* @throws PortalException if a istochnik_finansirovanija with the primary key could not be found
	*/
	public static tj.istochnik.finansirovanija.model.istochnik_finansirovanija deleteistochnik_finansirovanija(
		long istochnik_finansirovanija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleteistochnik_finansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Deletes the istochnik_finansirovanija from the database. Also notifies the appropriate model listeners.
	*
	* @param istochnik_finansirovanija the istochnik_finansirovanija
	* @return the istochnik_finansirovanija that was removed
	*/
	public static tj.istochnik.finansirovanija.model.istochnik_finansirovanija deleteistochnik_finansirovanija(
		tj.istochnik.finansirovanija.model.istochnik_finansirovanija istochnik_finansirovanija) {
		return getService()
				   .deleteistochnik_finansirovanija(istochnik_finansirovanija);
	}

	public static tj.istochnik.finansirovanija.model.istochnik_finansirovanija fetchistochnik_finansirovanija(
		long istochnik_finansirovanija_id) {
		return getService()
				   .fetchistochnik_finansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Returns the istochnik_finansirovanija with the primary key.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik_finansirovanija
	* @return the istochnik_finansirovanija
	* @throws PortalException if a istochnik_finansirovanija with the primary key could not be found
	*/
	public static tj.istochnik.finansirovanija.model.istochnik_finansirovanija getistochnik_finansirovanija(
		long istochnik_finansirovanija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getistochnik_finansirovanija(istochnik_finansirovanija_id);
	}

	/**
	* Updates the istochnik_finansirovanija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param istochnik_finansirovanija the istochnik_finansirovanija
	* @return the istochnik_finansirovanija that was updated
	*/
	public static tj.istochnik.finansirovanija.model.istochnik_finansirovanija updateistochnik_finansirovanija(
		tj.istochnik.finansirovanija.model.istochnik_finansirovanija istochnik_finansirovanija) {
		return getService()
				   .updateistochnik_finansirovanija(istochnik_finansirovanija);
	}

	public static istochnik_finansirovanijaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<istochnik_finansirovanijaLocalService, istochnik_finansirovanijaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(istochnik_finansirovanijaLocalService.class);
}