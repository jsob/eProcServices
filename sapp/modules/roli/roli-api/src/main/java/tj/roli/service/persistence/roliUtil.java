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

package tj.roli.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.roli.model.roli;

import java.util.List;

/**
 * The persistence utility for the roli service. This utility wraps {@link tj.roli.service.persistence.impl.roliPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see roliPersistence
 * @see tj.roli.service.persistence.impl.roliPersistenceImpl
 * @generated
 */
@ProviderType
public class roliUtil {
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
	public static void clearCache(roli roli) {
		getPersistence().clearCache(roli);
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
	public static List<roli> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<roli> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<roli> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<roli> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static roli update(roli roli) {
		return getPersistence().update(roli);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static roli update(roli roli, ServiceContext serviceContext) {
		return getPersistence().update(roli, serviceContext);
	}

	/**
	* Caches the roli in the entity cache if it is enabled.
	*
	* @param roli the roli
	*/
	public static void cacheResult(roli roli) {
		getPersistence().cacheResult(roli);
	}

	/**
	* Caches the rolis in the entity cache if it is enabled.
	*
	* @param rolis the rolis
	*/
	public static void cacheResult(List<roli> rolis) {
		getPersistence().cacheResult(rolis);
	}

	/**
	* Creates a new roli with the primary key. Does not add the roli to the database.
	*
	* @param roli_id the primary key for the new roli
	* @return the new roli
	*/
	public static roli create(long roli_id) {
		return getPersistence().create(roli_id);
	}

	/**
	* Removes the roli with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roli_id the primary key of the roli
	* @return the roli that was removed
	* @throws NoSuchroliException if a roli with the primary key could not be found
	*/
	public static roli remove(long roli_id)
		throws tj.roli.exception.NoSuchroliException {
		return getPersistence().remove(roli_id);
	}

	public static roli updateImpl(roli roli) {
		return getPersistence().updateImpl(roli);
	}

	/**
	* Returns the roli with the primary key or throws a {@link NoSuchroliException} if it could not be found.
	*
	* @param roli_id the primary key of the roli
	* @return the roli
	* @throws NoSuchroliException if a roli with the primary key could not be found
	*/
	public static roli findByPrimaryKey(long roli_id)
		throws tj.roli.exception.NoSuchroliException {
		return getPersistence().findByPrimaryKey(roli_id);
	}

	/**
	* Returns the roli with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param roli_id the primary key of the roli
	* @return the roli, or <code>null</code> if a roli with the primary key could not be found
	*/
	public static roli fetchByPrimaryKey(long roli_id) {
		return getPersistence().fetchByPrimaryKey(roli_id);
	}

	public static java.util.Map<java.io.Serializable, roli> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the rolis.
	*
	* @return the rolis
	*/
	public static List<roli> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the rolis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link roliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rolis
	* @param end the upper bound of the range of rolis (not inclusive)
	* @return the range of rolis
	*/
	public static List<roli> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the rolis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link roliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rolis
	* @param end the upper bound of the range of rolis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rolis
	*/
	public static List<roli> findAll(int start, int end,
		OrderByComparator<roli> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the rolis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link roliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rolis
	* @param end the upper bound of the range of rolis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of rolis
	*/
	public static List<roli> findAll(int start, int end,
		OrderByComparator<roli> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the rolis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of rolis.
	*
	* @return the number of rolis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static roliPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<roliPersistence, roliPersistence> _serviceTracker =
		ServiceTrackerFactory.open(roliPersistence.class);
}