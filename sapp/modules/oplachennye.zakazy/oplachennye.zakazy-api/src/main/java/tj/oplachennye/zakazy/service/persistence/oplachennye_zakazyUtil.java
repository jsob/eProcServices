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

package tj.oplachennye.zakazy.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.oplachennye.zakazy.model.oplachennye_zakazy;

import java.util.List;

/**
 * The persistence utility for the oplachennye_zakazy service. This utility wraps {@link tj.oplachennye.zakazy.service.persistence.impl.oplachennye_zakazyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see oplachennye_zakazyPersistence
 * @see tj.oplachennye.zakazy.service.persistence.impl.oplachennye_zakazyPersistenceImpl
 * @generated
 */
@ProviderType
public class oplachennye_zakazyUtil {
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
	public static void clearCache(oplachennye_zakazy oplachennye_zakazy) {
		getPersistence().clearCache(oplachennye_zakazy);
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
	public static List<oplachennye_zakazy> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<oplachennye_zakazy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<oplachennye_zakazy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<oplachennye_zakazy> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static oplachennye_zakazy update(
		oplachennye_zakazy oplachennye_zakazy) {
		return getPersistence().update(oplachennye_zakazy);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static oplachennye_zakazy update(
		oplachennye_zakazy oplachennye_zakazy, ServiceContext serviceContext) {
		return getPersistence().update(oplachennye_zakazy, serviceContext);
	}

	/**
	* Caches the oplachennye_zakazy in the entity cache if it is enabled.
	*
	* @param oplachennye_zakazy the oplachennye_zakazy
	*/
	public static void cacheResult(oplachennye_zakazy oplachennye_zakazy) {
		getPersistence().cacheResult(oplachennye_zakazy);
	}

	/**
	* Caches the oplachennye_zakazies in the entity cache if it is enabled.
	*
	* @param oplachennye_zakazies the oplachennye_zakazies
	*/
	public static void cacheResult(
		List<oplachennye_zakazy> oplachennye_zakazies) {
		getPersistence().cacheResult(oplachennye_zakazies);
	}

	/**
	* Creates a new oplachennye_zakazy with the primary key. Does not add the oplachennye_zakazy to the database.
	*
	* @param oplachennye_zakazy_id the primary key for the new oplachennye_zakazy
	* @return the new oplachennye_zakazy
	*/
	public static oplachennye_zakazy create(long oplachennye_zakazy_id) {
		return getPersistence().create(oplachennye_zakazy_id);
	}

	/**
	* Removes the oplachennye_zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye_zakazy
	* @return the oplachennye_zakazy that was removed
	* @throws NoSuchoplachennye_zakazyException if a oplachennye_zakazy with the primary key could not be found
	*/
	public static oplachennye_zakazy remove(long oplachennye_zakazy_id)
		throws tj.oplachennye.zakazy.exception.NoSuchoplachennye_zakazyException {
		return getPersistence().remove(oplachennye_zakazy_id);
	}

	public static oplachennye_zakazy updateImpl(
		oplachennye_zakazy oplachennye_zakazy) {
		return getPersistence().updateImpl(oplachennye_zakazy);
	}

	/**
	* Returns the oplachennye_zakazy with the primary key or throws a {@link NoSuchoplachennye_zakazyException} if it could not be found.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye_zakazy
	* @return the oplachennye_zakazy
	* @throws NoSuchoplachennye_zakazyException if a oplachennye_zakazy with the primary key could not be found
	*/
	public static oplachennye_zakazy findByPrimaryKey(
		long oplachennye_zakazy_id)
		throws tj.oplachennye.zakazy.exception.NoSuchoplachennye_zakazyException {
		return getPersistence().findByPrimaryKey(oplachennye_zakazy_id);
	}

	/**
	* Returns the oplachennye_zakazy with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye_zakazy
	* @return the oplachennye_zakazy, or <code>null</code> if a oplachennye_zakazy with the primary key could not be found
	*/
	public static oplachennye_zakazy fetchByPrimaryKey(
		long oplachennye_zakazy_id) {
		return getPersistence().fetchByPrimaryKey(oplachennye_zakazy_id);
	}

	public static java.util.Map<java.io.Serializable, oplachennye_zakazy> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the oplachennye_zakazies.
	*
	* @return the oplachennye_zakazies
	*/
	public static List<oplachennye_zakazy> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the oplachennye_zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oplachennye_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oplachennye_zakazies
	* @param end the upper bound of the range of oplachennye_zakazies (not inclusive)
	* @return the range of oplachennye_zakazies
	*/
	public static List<oplachennye_zakazy> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the oplachennye_zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oplachennye_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oplachennye_zakazies
	* @param end the upper bound of the range of oplachennye_zakazies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of oplachennye_zakazies
	*/
	public static List<oplachennye_zakazy> findAll(int start, int end,
		OrderByComparator<oplachennye_zakazy> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the oplachennye_zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oplachennye_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oplachennye_zakazies
	* @param end the upper bound of the range of oplachennye_zakazies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of oplachennye_zakazies
	*/
	public static List<oplachennye_zakazy> findAll(int start, int end,
		OrderByComparator<oplachennye_zakazy> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the oplachennye_zakazies from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of oplachennye_zakazies.
	*
	* @return the number of oplachennye_zakazies
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static oplachennye_zakazyPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<oplachennye_zakazyPersistence, oplachennye_zakazyPersistence> _serviceTracker =
		ServiceTrackerFactory.open(oplachennye_zakazyPersistence.class);
}