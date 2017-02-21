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

package tj.obwaja.informacija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.obwaja.informacija.model.obwaja_informacija;

import java.util.List;

/**
 * The persistence utility for the obwaja_informacija service. This utility wraps {@link tj.obwaja.informacija.service.persistence.impl.obwaja_informacijaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see obwaja_informacijaPersistence
 * @see tj.obwaja.informacija.service.persistence.impl.obwaja_informacijaPersistenceImpl
 * @generated
 */
@ProviderType
public class obwaja_informacijaUtil {
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
	public static void clearCache(obwaja_informacija obwaja_informacija) {
		getPersistence().clearCache(obwaja_informacija);
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
	public static List<obwaja_informacija> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<obwaja_informacija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<obwaja_informacija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<obwaja_informacija> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static obwaja_informacija update(
		obwaja_informacija obwaja_informacija) {
		return getPersistence().update(obwaja_informacija);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static obwaja_informacija update(
		obwaja_informacija obwaja_informacija, ServiceContext serviceContext) {
		return getPersistence().update(obwaja_informacija, serviceContext);
	}

	/**
	* Caches the obwaja_informacija in the entity cache if it is enabled.
	*
	* @param obwaja_informacija the obwaja_informacija
	*/
	public static void cacheResult(obwaja_informacija obwaja_informacija) {
		getPersistence().cacheResult(obwaja_informacija);
	}

	/**
	* Caches the obwaja_informacijas in the entity cache if it is enabled.
	*
	* @param obwaja_informacijas the obwaja_informacijas
	*/
	public static void cacheResult(List<obwaja_informacija> obwaja_informacijas) {
		getPersistence().cacheResult(obwaja_informacijas);
	}

	/**
	* Creates a new obwaja_informacija with the primary key. Does not add the obwaja_informacija to the database.
	*
	* @param obwaja_informacija_id the primary key for the new obwaja_informacija
	* @return the new obwaja_informacija
	*/
	public static obwaja_informacija create(long obwaja_informacija_id) {
		return getPersistence().create(obwaja_informacija_id);
	}

	/**
	* Removes the obwaja_informacija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param obwaja_informacija_id the primary key of the obwaja_informacija
	* @return the obwaja_informacija that was removed
	* @throws NoSuchobwaja_informacijaException if a obwaja_informacija with the primary key could not be found
	*/
	public static obwaja_informacija remove(long obwaja_informacija_id)
		throws tj.obwaja.informacija.exception.NoSuchobwaja_informacijaException {
		return getPersistence().remove(obwaja_informacija_id);
	}

	public static obwaja_informacija updateImpl(
		obwaja_informacija obwaja_informacija) {
		return getPersistence().updateImpl(obwaja_informacija);
	}

	/**
	* Returns the obwaja_informacija with the primary key or throws a {@link NoSuchobwaja_informacijaException} if it could not be found.
	*
	* @param obwaja_informacija_id the primary key of the obwaja_informacija
	* @return the obwaja_informacija
	* @throws NoSuchobwaja_informacijaException if a obwaja_informacija with the primary key could not be found
	*/
	public static obwaja_informacija findByPrimaryKey(
		long obwaja_informacija_id)
		throws tj.obwaja.informacija.exception.NoSuchobwaja_informacijaException {
		return getPersistence().findByPrimaryKey(obwaja_informacija_id);
	}

	/**
	* Returns the obwaja_informacija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param obwaja_informacija_id the primary key of the obwaja_informacija
	* @return the obwaja_informacija, or <code>null</code> if a obwaja_informacija with the primary key could not be found
	*/
	public static obwaja_informacija fetchByPrimaryKey(
		long obwaja_informacija_id) {
		return getPersistence().fetchByPrimaryKey(obwaja_informacija_id);
	}

	public static java.util.Map<java.io.Serializable, obwaja_informacija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the obwaja_informacijas.
	*
	* @return the obwaja_informacijas
	*/
	public static List<obwaja_informacija> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the obwaja_informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja_informacijas
	* @param end the upper bound of the range of obwaja_informacijas (not inclusive)
	* @return the range of obwaja_informacijas
	*/
	public static List<obwaja_informacija> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the obwaja_informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja_informacijas
	* @param end the upper bound of the range of obwaja_informacijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of obwaja_informacijas
	*/
	public static List<obwaja_informacija> findAll(int start, int end,
		OrderByComparator<obwaja_informacija> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the obwaja_informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja_informacijas
	* @param end the upper bound of the range of obwaja_informacijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of obwaja_informacijas
	*/
	public static List<obwaja_informacija> findAll(int start, int end,
		OrderByComparator<obwaja_informacija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the obwaja_informacijas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of obwaja_informacijas.
	*
	* @return the number of obwaja_informacijas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static obwaja_informacijaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<obwaja_informacijaPersistence, obwaja_informacijaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(obwaja_informacijaPersistence.class);
}