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

package tj.bjudzhetnoe.polnomochie.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie;

import java.util.List;

/**
 * The persistence utility for the bjudzhetnoe_polnomochie service. This utility wraps {@link tj.bjudzhetnoe.polnomochie.service.persistence.impl.bjudzhetnoe_polnomochiePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bjudzhetnoe_polnomochiePersistence
 * @see tj.bjudzhetnoe.polnomochie.service.persistence.impl.bjudzhetnoe_polnomochiePersistenceImpl
 * @generated
 */
@ProviderType
public class bjudzhetnoe_polnomochieUtil {
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
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		getPersistence().clearCache(bjudzhetnoe_polnomochie);
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
	public static List<bjudzhetnoe_polnomochie> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<bjudzhetnoe_polnomochie> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<bjudzhetnoe_polnomochie> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<bjudzhetnoe_polnomochie> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static bjudzhetnoe_polnomochie update(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		return getPersistence().update(bjudzhetnoe_polnomochie);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static bjudzhetnoe_polnomochie update(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie,
		ServiceContext serviceContext) {
		return getPersistence().update(bjudzhetnoe_polnomochie, serviceContext);
	}

	/**
	* Caches the bjudzhetnoe_polnomochie in the entity cache if it is enabled.
	*
	* @param bjudzhetnoe_polnomochie the bjudzhetnoe_polnomochie
	*/
	public static void cacheResult(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		getPersistence().cacheResult(bjudzhetnoe_polnomochie);
	}

	/**
	* Caches the bjudzhetnoe_polnomochies in the entity cache if it is enabled.
	*
	* @param bjudzhetnoe_polnomochies the bjudzhetnoe_polnomochies
	*/
	public static void cacheResult(
		List<bjudzhetnoe_polnomochie> bjudzhetnoe_polnomochies) {
		getPersistence().cacheResult(bjudzhetnoe_polnomochies);
	}

	/**
	* Creates a new bjudzhetnoe_polnomochie with the primary key. Does not add the bjudzhetnoe_polnomochie to the database.
	*
	* @param bjudzhetnoe_polnomochie_id the primary key for the new bjudzhetnoe_polnomochie
	* @return the new bjudzhetnoe_polnomochie
	*/
	public static bjudzhetnoe_polnomochie create(
		long bjudzhetnoe_polnomochie_id) {
		return getPersistence().create(bjudzhetnoe_polnomochie_id);
	}

	/**
	* Removes the bjudzhetnoe_polnomochie with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie that was removed
	* @throws NoSuchbjudzhetnoe_polnomochieException if a bjudzhetnoe_polnomochie with the primary key could not be found
	*/
	public static bjudzhetnoe_polnomochie remove(
		long bjudzhetnoe_polnomochie_id)
		throws tj.bjudzhetnoe.polnomochie.exception.NoSuchbjudzhetnoe_polnomochieException {
		return getPersistence().remove(bjudzhetnoe_polnomochie_id);
	}

	public static bjudzhetnoe_polnomochie updateImpl(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		return getPersistence().updateImpl(bjudzhetnoe_polnomochie);
	}

	/**
	* Returns the bjudzhetnoe_polnomochie with the primary key or throws a {@link NoSuchbjudzhetnoe_polnomochieException} if it could not be found.
	*
	* @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie
	* @throws NoSuchbjudzhetnoe_polnomochieException if a bjudzhetnoe_polnomochie with the primary key could not be found
	*/
	public static bjudzhetnoe_polnomochie findByPrimaryKey(
		long bjudzhetnoe_polnomochie_id)
		throws tj.bjudzhetnoe.polnomochie.exception.NoSuchbjudzhetnoe_polnomochieException {
		return getPersistence().findByPrimaryKey(bjudzhetnoe_polnomochie_id);
	}

	/**
	* Returns the bjudzhetnoe_polnomochie with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie, or <code>null</code> if a bjudzhetnoe_polnomochie with the primary key could not be found
	*/
	public static bjudzhetnoe_polnomochie fetchByPrimaryKey(
		long bjudzhetnoe_polnomochie_id) {
		return getPersistence().fetchByPrimaryKey(bjudzhetnoe_polnomochie_id);
	}

	public static java.util.Map<java.io.Serializable, bjudzhetnoe_polnomochie> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the bjudzhetnoe_polnomochies.
	*
	* @return the bjudzhetnoe_polnomochies
	*/
	public static List<bjudzhetnoe_polnomochie> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bjudzhetnoe_polnomochies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bjudzhetnoe_polnomochies
	* @param end the upper bound of the range of bjudzhetnoe_polnomochies (not inclusive)
	* @return the range of bjudzhetnoe_polnomochies
	*/
	public static List<bjudzhetnoe_polnomochie> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bjudzhetnoe_polnomochies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bjudzhetnoe_polnomochies
	* @param end the upper bound of the range of bjudzhetnoe_polnomochies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bjudzhetnoe_polnomochies
	*/
	public static List<bjudzhetnoe_polnomochie> findAll(int start, int end,
		OrderByComparator<bjudzhetnoe_polnomochie> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bjudzhetnoe_polnomochies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bjudzhetnoe_polnomochies
	* @param end the upper bound of the range of bjudzhetnoe_polnomochies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bjudzhetnoe_polnomochies
	*/
	public static List<bjudzhetnoe_polnomochie> findAll(int start, int end,
		OrderByComparator<bjudzhetnoe_polnomochie> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the bjudzhetnoe_polnomochies from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bjudzhetnoe_polnomochies.
	*
	* @return the number of bjudzhetnoe_polnomochies
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static bjudzhetnoe_polnomochiePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<bjudzhetnoe_polnomochiePersistence, bjudzhetnoe_polnomochiePersistence> _serviceTracker =
		ServiceTrackerFactory.open(bjudzhetnoe_polnomochiePersistence.class);
}