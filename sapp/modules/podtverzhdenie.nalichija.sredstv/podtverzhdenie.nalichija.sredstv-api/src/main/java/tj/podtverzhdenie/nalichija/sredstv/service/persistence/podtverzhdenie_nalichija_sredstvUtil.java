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

package tj.podtverzhdenie.nalichija.sredstv.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv;

import java.util.List;

/**
 * The persistence utility for the podtverzhdenie_nalichija_sredstv service. This utility wraps {@link tj.podtverzhdenie.nalichija.sredstv.service.persistence.impl.podtverzhdenie_nalichija_sredstvPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_nalichija_sredstvPersistence
 * @see tj.podtverzhdenie.nalichija.sredstv.service.persistence.impl.podtverzhdenie_nalichija_sredstvPersistenceImpl
 * @generated
 */
@ProviderType
public class podtverzhdenie_nalichija_sredstvUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		getPersistence().clearCache(podtverzhdenie_nalichija_sredstv);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<podtverzhdenie_nalichija_sredstv> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<podtverzhdenie_nalichija_sredstv> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<podtverzhdenie_nalichija_sredstv> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<podtverzhdenie_nalichija_sredstv> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static podtverzhdenie_nalichija_sredstv update(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		return getPersistence().update(podtverzhdenie_nalichija_sredstv);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static podtverzhdenie_nalichija_sredstv update(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(podtverzhdenie_nalichija_sredstv, serviceContext);
	}

	/**
	* Caches the podtverzhdenie_nalichija_sredstv in the entity cache if it is enabled.
	*
	* @param podtverzhdenie_nalichija_sredstv the podtverzhdenie_nalichija_sredstv
	*/
	public static void cacheResult(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		getPersistence().cacheResult(podtverzhdenie_nalichija_sredstv);
	}

	/**
	* Caches the podtverzhdenie_nalichija_sredstvs in the entity cache if it is enabled.
	*
	* @param podtverzhdenie_nalichija_sredstvs the podtverzhdenie_nalichija_sredstvs
	*/
	public static void cacheResult(
		List<podtverzhdenie_nalichija_sredstv> podtverzhdenie_nalichija_sredstvs) {
		getPersistence().cacheResult(podtverzhdenie_nalichija_sredstvs);
	}

	/**
	* Creates a new podtverzhdenie_nalichija_sredstv with the primary key. Does not add the podtverzhdenie_nalichija_sredstv to the database.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key for the new podtverzhdenie_nalichija_sredstv
	* @return the new podtverzhdenie_nalichija_sredstv
	*/
	public static podtverzhdenie_nalichija_sredstv create(
		long podtverzhdenie_nalichija_sredstv_id) {
		return getPersistence().create(podtverzhdenie_nalichija_sredstv_id);
	}

	/**
	* Removes the podtverzhdenie_nalichija_sredstv with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv that was removed
	* @throws NoSuchpodtverzhdenie_nalichija_sredstvException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	*/
	public static podtverzhdenie_nalichija_sredstv remove(
		long podtverzhdenie_nalichija_sredstv_id)
		throws tj.podtverzhdenie.nalichija.sredstv.exception.NoSuchpodtverzhdenie_nalichija_sredstvException {
		return getPersistence().remove(podtverzhdenie_nalichija_sredstv_id);
	}

	public static podtverzhdenie_nalichija_sredstv updateImpl(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		return getPersistence().updateImpl(podtverzhdenie_nalichija_sredstv);
	}

	/**
	* Returns the podtverzhdenie_nalichija_sredstv with the primary key or throws a {@link NoSuchpodtverzhdenie_nalichija_sredstvException} if it could not be found.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv
	* @throws NoSuchpodtverzhdenie_nalichija_sredstvException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	*/
	public static podtverzhdenie_nalichija_sredstv findByPrimaryKey(
		long podtverzhdenie_nalichija_sredstv_id)
		throws tj.podtverzhdenie.nalichija.sredstv.exception.NoSuchpodtverzhdenie_nalichija_sredstvException {
		return getPersistence()
				   .findByPrimaryKey(podtverzhdenie_nalichija_sredstv_id);
	}

	/**
	* Returns the podtverzhdenie_nalichija_sredstv with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv, or <code>null</code> if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	*/
	public static podtverzhdenie_nalichija_sredstv fetchByPrimaryKey(
		long podtverzhdenie_nalichija_sredstv_id) {
		return getPersistence()
				   .fetchByPrimaryKey(podtverzhdenie_nalichija_sredstv_id);
	}

	public static java.util.Map<java.io.Serializable, podtverzhdenie_nalichija_sredstv> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the podtverzhdenie_nalichija_sredstvs.
	*
	* @return the podtverzhdenie_nalichija_sredstvs
	*/
	public static List<podtverzhdenie_nalichija_sredstv> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the podtverzhdenie_nalichija_sredstvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_nalichija_sredstvs
	* @param end the upper bound of the range of podtverzhdenie_nalichija_sredstvs (not inclusive)
	* @return the range of podtverzhdenie_nalichija_sredstvs
	*/
	public static List<podtverzhdenie_nalichija_sredstv> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the podtverzhdenie_nalichija_sredstvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_nalichija_sredstvs
	* @param end the upper bound of the range of podtverzhdenie_nalichija_sredstvs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of podtverzhdenie_nalichija_sredstvs
	*/
	public static List<podtverzhdenie_nalichija_sredstv> findAll(int start,
		int end,
		OrderByComparator<podtverzhdenie_nalichija_sredstv> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the podtverzhdenie_nalichija_sredstvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_nalichija_sredstvs
	* @param end the upper bound of the range of podtverzhdenie_nalichija_sredstvs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of podtverzhdenie_nalichija_sredstvs
	*/
	public static List<podtverzhdenie_nalichija_sredstv> findAll(int start,
		int end,
		OrderByComparator<podtverzhdenie_nalichija_sredstv> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the podtverzhdenie_nalichija_sredstvs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of podtverzhdenie_nalichija_sredstvs.
	*
	* @return the number of podtverzhdenie_nalichija_sredstvs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static podtverzhdenie_nalichija_sredstvPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<podtverzhdenie_nalichija_sredstvPersistence, podtverzhdenie_nalichija_sredstvPersistence> _serviceTracker =
		ServiceTrackerFactory.open(podtverzhdenie_nalichija_sredstvPersistence.class);
}