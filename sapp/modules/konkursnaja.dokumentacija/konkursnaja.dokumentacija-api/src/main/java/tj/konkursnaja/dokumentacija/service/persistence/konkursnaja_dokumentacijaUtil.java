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

package tj.konkursnaja.dokumentacija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija;

import java.util.List;

/**
 * The persistence utility for the konkursnaja_dokumentacija service. This utility wraps {@link tj.konkursnaja.dokumentacija.service.persistence.impl.konkursnaja_dokumentacijaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see konkursnaja_dokumentacijaPersistence
 * @see tj.konkursnaja.dokumentacija.service.persistence.impl.konkursnaja_dokumentacijaPersistenceImpl
 * @generated
 */
@ProviderType
public class konkursnaja_dokumentacijaUtil {
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
		konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		getPersistence().clearCache(konkursnaja_dokumentacija);
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
	public static List<konkursnaja_dokumentacija> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<konkursnaja_dokumentacija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<konkursnaja_dokumentacija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<konkursnaja_dokumentacija> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static konkursnaja_dokumentacija update(
		konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		return getPersistence().update(konkursnaja_dokumentacija);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static konkursnaja_dokumentacija update(
		konkursnaja_dokumentacija konkursnaja_dokumentacija,
		ServiceContext serviceContext) {
		return getPersistence().update(konkursnaja_dokumentacija, serviceContext);
	}

	/**
	* Caches the konkursnaja_dokumentacija in the entity cache if it is enabled.
	*
	* @param konkursnaja_dokumentacija the konkursnaja_dokumentacija
	*/
	public static void cacheResult(
		konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		getPersistence().cacheResult(konkursnaja_dokumentacija);
	}

	/**
	* Caches the konkursnaja_dokumentacijas in the entity cache if it is enabled.
	*
	* @param konkursnaja_dokumentacijas the konkursnaja_dokumentacijas
	*/
	public static void cacheResult(
		List<konkursnaja_dokumentacija> konkursnaja_dokumentacijas) {
		getPersistence().cacheResult(konkursnaja_dokumentacijas);
	}

	/**
	* Creates a new konkursnaja_dokumentacija with the primary key. Does not add the konkursnaja_dokumentacija to the database.
	*
	* @param konkursnaja_dokumentacija_id the primary key for the new konkursnaja_dokumentacija
	* @return the new konkursnaja_dokumentacija
	*/
	public static konkursnaja_dokumentacija create(
		long konkursnaja_dokumentacija_id) {
		return getPersistence().create(konkursnaja_dokumentacija_id);
	}

	/**
	* Removes the konkursnaja_dokumentacija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param konkursnaja_dokumentacija_id the primary key of the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija that was removed
	* @throws NoSuchkonkursnaja_dokumentacijaException if a konkursnaja_dokumentacija with the primary key could not be found
	*/
	public static konkursnaja_dokumentacija remove(
		long konkursnaja_dokumentacija_id)
		throws tj.konkursnaja.dokumentacija.exception.NoSuchkonkursnaja_dokumentacijaException {
		return getPersistence().remove(konkursnaja_dokumentacija_id);
	}

	public static konkursnaja_dokumentacija updateImpl(
		konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		return getPersistence().updateImpl(konkursnaja_dokumentacija);
	}

	/**
	* Returns the konkursnaja_dokumentacija with the primary key or throws a {@link NoSuchkonkursnaja_dokumentacijaException} if it could not be found.
	*
	* @param konkursnaja_dokumentacija_id the primary key of the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija
	* @throws NoSuchkonkursnaja_dokumentacijaException if a konkursnaja_dokumentacija with the primary key could not be found
	*/
	public static konkursnaja_dokumentacija findByPrimaryKey(
		long konkursnaja_dokumentacija_id)
		throws tj.konkursnaja.dokumentacija.exception.NoSuchkonkursnaja_dokumentacijaException {
		return getPersistence().findByPrimaryKey(konkursnaja_dokumentacija_id);
	}

	/**
	* Returns the konkursnaja_dokumentacija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param konkursnaja_dokumentacija_id the primary key of the konkursnaja_dokumentacija
	* @return the konkursnaja_dokumentacija, or <code>null</code> if a konkursnaja_dokumentacija with the primary key could not be found
	*/
	public static konkursnaja_dokumentacija fetchByPrimaryKey(
		long konkursnaja_dokumentacija_id) {
		return getPersistence().fetchByPrimaryKey(konkursnaja_dokumentacija_id);
	}

	public static java.util.Map<java.io.Serializable, konkursnaja_dokumentacija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the konkursnaja_dokumentacijas.
	*
	* @return the konkursnaja_dokumentacijas
	*/
	public static List<konkursnaja_dokumentacija> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the konkursnaja_dokumentacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of konkursnaja_dokumentacijas
	* @param end the upper bound of the range of konkursnaja_dokumentacijas (not inclusive)
	* @return the range of konkursnaja_dokumentacijas
	*/
	public static List<konkursnaja_dokumentacija> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the konkursnaja_dokumentacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of konkursnaja_dokumentacijas
	* @param end the upper bound of the range of konkursnaja_dokumentacijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of konkursnaja_dokumentacijas
	*/
	public static List<konkursnaja_dokumentacija> findAll(int start, int end,
		OrderByComparator<konkursnaja_dokumentacija> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the konkursnaja_dokumentacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of konkursnaja_dokumentacijas
	* @param end the upper bound of the range of konkursnaja_dokumentacijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of konkursnaja_dokumentacijas
	*/
	public static List<konkursnaja_dokumentacija> findAll(int start, int end,
		OrderByComparator<konkursnaja_dokumentacija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the konkursnaja_dokumentacijas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of konkursnaja_dokumentacijas.
	*
	* @return the number of konkursnaja_dokumentacijas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static konkursnaja_dokumentacijaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<konkursnaja_dokumentacijaPersistence, konkursnaja_dokumentacijaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(konkursnaja_dokumentacijaPersistence.class);
}