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

package tj.izvewenie.put.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.izvewenie.put.model.izvewenie_put;

import java.util.List;

/**
 * The persistence utility for the izvewenie_put service. This utility wraps {@link tj.izvewenie.put.service.persistence.impl.izvewenie_putPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see izvewenie_putPersistence
 * @see tj.izvewenie.put.service.persistence.impl.izvewenie_putPersistenceImpl
 * @generated
 */
@ProviderType
public class izvewenie_putUtil {
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
	public static void clearCache(izvewenie_put izvewenie_put) {
		getPersistence().clearCache(izvewenie_put);
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
	public static List<izvewenie_put> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<izvewenie_put> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<izvewenie_put> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<izvewenie_put> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static izvewenie_put update(izvewenie_put izvewenie_put) {
		return getPersistence().update(izvewenie_put);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static izvewenie_put update(izvewenie_put izvewenie_put,
		ServiceContext serviceContext) {
		return getPersistence().update(izvewenie_put, serviceContext);
	}

	/**
	* Caches the izvewenie_put in the entity cache if it is enabled.
	*
	* @param izvewenie_put the izvewenie_put
	*/
	public static void cacheResult(izvewenie_put izvewenie_put) {
		getPersistence().cacheResult(izvewenie_put);
	}

	/**
	* Caches the izvewenie_puts in the entity cache if it is enabled.
	*
	* @param izvewenie_puts the izvewenie_puts
	*/
	public static void cacheResult(List<izvewenie_put> izvewenie_puts) {
		getPersistence().cacheResult(izvewenie_puts);
	}

	/**
	* Creates a new izvewenie_put with the primary key. Does not add the izvewenie_put to the database.
	*
	* @param izvewenie_put_id the primary key for the new izvewenie_put
	* @return the new izvewenie_put
	*/
	public static izvewenie_put create(long izvewenie_put_id) {
		return getPersistence().create(izvewenie_put_id);
	}

	/**
	* Removes the izvewenie_put with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenie_put_id the primary key of the izvewenie_put
	* @return the izvewenie_put that was removed
	* @throws NoSuchizvewenie_putException if a izvewenie_put with the primary key could not be found
	*/
	public static izvewenie_put remove(long izvewenie_put_id)
		throws tj.izvewenie.put.exception.NoSuchizvewenie_putException {
		return getPersistence().remove(izvewenie_put_id);
	}

	public static izvewenie_put updateImpl(izvewenie_put izvewenie_put) {
		return getPersistence().updateImpl(izvewenie_put);
	}

	/**
	* Returns the izvewenie_put with the primary key or throws a {@link NoSuchizvewenie_putException} if it could not be found.
	*
	* @param izvewenie_put_id the primary key of the izvewenie_put
	* @return the izvewenie_put
	* @throws NoSuchizvewenie_putException if a izvewenie_put with the primary key could not be found
	*/
	public static izvewenie_put findByPrimaryKey(long izvewenie_put_id)
		throws tj.izvewenie.put.exception.NoSuchizvewenie_putException {
		return getPersistence().findByPrimaryKey(izvewenie_put_id);
	}

	/**
	* Returns the izvewenie_put with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param izvewenie_put_id the primary key of the izvewenie_put
	* @return the izvewenie_put, or <code>null</code> if a izvewenie_put with the primary key could not be found
	*/
	public static izvewenie_put fetchByPrimaryKey(long izvewenie_put_id) {
		return getPersistence().fetchByPrimaryKey(izvewenie_put_id);
	}

	public static java.util.Map<java.io.Serializable, izvewenie_put> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the izvewenie_puts.
	*
	* @return the izvewenie_puts
	*/
	public static List<izvewenie_put> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the izvewenie_puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie_puts
	* @param end the upper bound of the range of izvewenie_puts (not inclusive)
	* @return the range of izvewenie_puts
	*/
	public static List<izvewenie_put> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the izvewenie_puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie_puts
	* @param end the upper bound of the range of izvewenie_puts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of izvewenie_puts
	*/
	public static List<izvewenie_put> findAll(int start, int end,
		OrderByComparator<izvewenie_put> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the izvewenie_puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie_puts
	* @param end the upper bound of the range of izvewenie_puts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of izvewenie_puts
	*/
	public static List<izvewenie_put> findAll(int start, int end,
		OrderByComparator<izvewenie_put> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the izvewenie_puts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of izvewenie_puts.
	*
	* @return the number of izvewenie_puts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static izvewenie_putPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<izvewenie_putPersistence, izvewenie_putPersistence> _serviceTracker =
		ServiceTrackerFactory.open(izvewenie_putPersistence.class);
}