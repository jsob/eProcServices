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

package tj.rezultat.opredelenija.sootvetstvija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for rezultat_opredelenija_sootvetstvija. This utility wraps
 * {@link tj.rezultat.opredelenija.sootvetstvija.service.impl.rezultat_opredelenija_sootvetstvijaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_opredelenija_sootvetstvijaLocalService
 * @see tj.rezultat.opredelenija.sootvetstvija.service.base.rezultat_opredelenija_sootvetstvijaLocalServiceBaseImpl
 * @see tj.rezultat.opredelenija.sootvetstvija.service.impl.rezultat_opredelenija_sootvetstvijaLocalServiceImpl
 * @generated
 */
@ProviderType
public class rezultat_opredelenija_sootvetstvijaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.rezultat.opredelenija.sootvetstvija.service.impl.rezultat_opredelenija_sootvetstvijaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of rezultat_opredelenija_sootvetstvijas.
	*
	* @return the number of rezultat_opredelenija_sootvetstvijas
	*/
	public static int getrezultat_opredelenija_sootvetstvijasCount() {
		return getService().getrezultat_opredelenija_sootvetstvijasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.rezultat.opredelenija.sootvetstvija.model.impl.rezultat_opredelenija_sootvetstvijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.rezultat.opredelenija.sootvetstvija.model.impl.rezultat_opredelenija_sootvetstvijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the rezultat_opredelenija_sootvetstvijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.rezultat.opredelenija.sootvetstvija.model.impl.rezultat_opredelenija_sootvetstvijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rezultat_opredelenija_sootvetstvijas
	* @param end the upper bound of the range of rezultat_opredelenija_sootvetstvijas (not inclusive)
	* @return the range of rezultat_opredelenija_sootvetstvijas
	*/
	public static java.util.List<tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija> getrezultat_opredelenija_sootvetstvijas(
		int start, int end) {
		return getService().getrezultat_opredelenija_sootvetstvijas(start, end);
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
	* Adds the rezultat_opredelenija_sootvetstvija to the database. Also notifies the appropriate model listeners.
	*
	* @param rezultat_opredelenija_sootvetstvija the rezultat_opredelenija_sootvetstvija
	* @return the rezultat_opredelenija_sootvetstvija that was added
	*/
	public static tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija addrezultat_opredelenija_sootvetstvija(
		tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija rezultat_opredelenija_sootvetstvija) {
		return getService()
				   .addrezultat_opredelenija_sootvetstvija(rezultat_opredelenija_sootvetstvija);
	}

	/**
	* Creates a new rezultat_opredelenija_sootvetstvija with the primary key. Does not add the rezultat_opredelenija_sootvetstvija to the database.
	*
	* @param rezultat_opredelenija_sootvetstvija_id the primary key for the new rezultat_opredelenija_sootvetstvija
	* @return the new rezultat_opredelenija_sootvetstvija
	*/
	public static tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija createrezultat_opredelenija_sootvetstvija(
		long rezultat_opredelenija_sootvetstvija_id) {
		return getService()
				   .createrezultat_opredelenija_sootvetstvija(rezultat_opredelenija_sootvetstvija_id);
	}

	/**
	* Deletes the rezultat_opredelenija_sootvetstvija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rezultat_opredelenija_sootvetstvija_id the primary key of the rezultat_opredelenija_sootvetstvija
	* @return the rezultat_opredelenija_sootvetstvija that was removed
	* @throws PortalException if a rezultat_opredelenija_sootvetstvija with the primary key could not be found
	*/
	public static tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija deleterezultat_opredelenija_sootvetstvija(
		long rezultat_opredelenija_sootvetstvija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleterezultat_opredelenija_sootvetstvija(rezultat_opredelenija_sootvetstvija_id);
	}

	/**
	* Deletes the rezultat_opredelenija_sootvetstvija from the database. Also notifies the appropriate model listeners.
	*
	* @param rezultat_opredelenija_sootvetstvija the rezultat_opredelenija_sootvetstvija
	* @return the rezultat_opredelenija_sootvetstvija that was removed
	*/
	public static tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija deleterezultat_opredelenija_sootvetstvija(
		tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija rezultat_opredelenija_sootvetstvija) {
		return getService()
				   .deleterezultat_opredelenija_sootvetstvija(rezultat_opredelenija_sootvetstvija);
	}

	public static tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija fetchrezultat_opredelenija_sootvetstvija(
		long rezultat_opredelenija_sootvetstvija_id) {
		return getService()
				   .fetchrezultat_opredelenija_sootvetstvija(rezultat_opredelenija_sootvetstvija_id);
	}

	/**
	* Returns the rezultat_opredelenija_sootvetstvija with the primary key.
	*
	* @param rezultat_opredelenija_sootvetstvija_id the primary key of the rezultat_opredelenija_sootvetstvija
	* @return the rezultat_opredelenija_sootvetstvija
	* @throws PortalException if a rezultat_opredelenija_sootvetstvija with the primary key could not be found
	*/
	public static tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija getrezultat_opredelenija_sootvetstvija(
		long rezultat_opredelenija_sootvetstvija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getrezultat_opredelenija_sootvetstvija(rezultat_opredelenija_sootvetstvija_id);
	}

	/**
	* Updates the rezultat_opredelenija_sootvetstvija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rezultat_opredelenija_sootvetstvija the rezultat_opredelenija_sootvetstvija
	* @return the rezultat_opredelenija_sootvetstvija that was updated
	*/
	public static tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija updaterezultat_opredelenija_sootvetstvija(
		tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija rezultat_opredelenija_sootvetstvija) {
		return getService()
				   .updaterezultat_opredelenija_sootvetstvija(rezultat_opredelenija_sootvetstvija);
	}

	public static rezultat_opredelenija_sootvetstvijaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<rezultat_opredelenija_sootvetstvijaLocalService, rezultat_opredelenija_sootvetstvijaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(rezultat_opredelenija_sootvetstvijaLocalService.class);
}